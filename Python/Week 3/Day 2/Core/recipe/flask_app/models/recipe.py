from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import DATABASE
from flask import flash


class Recipe:
    def __init__(self,data_dict) :
        self.id=data_dict['id']
        self.user_id=data_dict['user_id']
        self.name=data_dict['name']
        self.description=data_dict['description']
        self.instructions=data_dict['instructions']
        self.date=data_dict['date']
        self.under=data_dict['under']
        self.created_at=data_dict['created_at']
        self.updated_at=data_dict['updated_at']
        self.poster=""


#    create a recipe
    @classmethod 
    def save(cls,data):
        query=''' INSERT INTO recipes (user_id,name,description,instructions,date,under)
                VALUES (%(user_id)s,%(name)s,%(description)s,%(instructions)s,%(date)s,%(under)s)'''
        return connectToMySQL(DATABASE).query_db(query,data)

#   select all recipes 
    @classmethod
    def get_all_recipes(cls):
        query= '''SELECT * FROM recipes '''
        results=connectToMySQL(DATABASE).query_db(query)
        recipes=[]
        for row in results :
            recipes.append(cls(row))
        return recipes
    @classmethod
    def get_one_recipe_by_id(cls,data):
        query= '''SELECT * FROM recipes WHERE id=%(id)s'''
        results=connectToMySQL(DATABASE).query_db(query,data)
        return cls(results[0])
    #get recipe with poster join
    @classmethod
    def get_all_recipes_with_poster(cls):
        query= '''select recipes.*,first_name,last_name from users join recipes on users.id=recipes.user_id ; '''
        results=connectToMySQL(DATABASE).query_db(query)
        recipes=[]
        for row in results :
            recipe=(cls(row))
            recipe.poster= row['first_name']+ " " +row["last_name"]
            recipes.append(recipe)
        return recipes
    @classmethod
    def destroy_recipe(cls,data):
        query='''DELETE FROM recipes WHERE id=%(id)s'''
        return connectToMySQL(DATABASE).query_db(query,data)
    
    @classmethod 
    def update(cls,data):
        query='''UPDATE recipes 
                SET name=%(name)s,description=%(description)s,instructions=%(instructions)s,date=%(date)s,under=%(under)s
                WHERE id=%(id)s '''
        return connectToMySQL(DATABASE).query_db(query,data)

    
#   validation de recipe
    @staticmethod
    def validate_recipe(data):
        is_valid= True
        if len(data['name'])<2:
            is_valid =False
            flash("name must be at least 3 characters", "recipe")
        if len(data['description'])<2:
            is_valid =False
            flash("description must be at least 3 characters", "recipe")
        if len(data['instructions'])<2:
            is_valid =False
            flash("instructions must be at least 3 characters", "recipe")
        if data['date']=='' :
            flash("check the date please", "recipe")
        return is_valid

        