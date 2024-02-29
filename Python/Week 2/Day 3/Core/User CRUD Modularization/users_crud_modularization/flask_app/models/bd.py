from flask_app.config.mysqlconnection import connectToMySQL
from flask_app import database

class User:
    def __init__(self,data_dict):
        self.id=data_dict["id"]
        self.first_name=data_dict["first_name"]
        self.last_name=data_dict["last_name"]
        self.email=data_dict['email']
        self.created_at=data_dict['created_at']
        self.updated_at=data_dict['updated_at']
    @classmethod
    def create(cls,data_dict):
        query = """INSERT INTO user (first_name,last_name,email)VALUES (%(first_name)s, %(last_name)s, %(email)s);"""
        db_result = connectToMySQL(database).query_db(query,data_dict)
        print(db_result,"******")
        return db_result
    @classmethod
    def get_all(cls):
        query="SELECT * FROM user;"
        db_result=connectToMySQL(database).query_db(query)
        all_users=[]
        for user in db_result:
            users=cls(user)
            all_users.append(users)
        return all_users
    @classmethod
    def destroy(cls,user_id):
        query="DELETE FROM user WHERE id=%(id)s;"
        data={"id":user_id}
        return connectToMySQL(database).query_db(query,data)
    @classmethod
    def update(cls, data):
        query = """
            UPDATE user SET 
            first_name = %(first_name)s,
            last_name = %(last_name)s,
            email = %(email)s
            WHERE id = %(id)s;
        """
        db_result=connectToMySQL(database).query_db(query, data)
        print(db_result)
        return db_result

    @classmethod
    def get_one_by_id(cls, data):
        query = """ SELECT * FROM user WHERE id=%(id)s; """
        db_result = connectToMySQL(database).query_db(query, data)
        print("🔥🔥🔥🔥🔥🔥🔥🔥🔥", db_result, "🔥🔥🔥🔥🔥🔥🔥🔥🔥")
        user = User(db_result[0])
        return user
    @classmethod
    def delete(cls, data):
        query = """ DELETE FROM user WHERE id= %(id)s;"""
        return connectToMySQL(database).query_db(query, data)