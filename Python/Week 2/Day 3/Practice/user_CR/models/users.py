from flask_app.config.user import connectToMySQL
from flask_app import database


class User:
    def __init__(self, data_dict):
        self.id = data_dict["id"]
        self.first_name = data_dict["first_name"]
        self.last_name = data_dict["last_name"]
        self.email = data_dict["email"]
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM users;"
        db_result = connectToMySQL(database).query_db(query)
        print(db_result)
        all_users = []
        for row in db_result:
            user = cls(row)  # 1 -
            all_users.append(user)  # 2 -
        # return the list of instances
        return all_users
    @classmethod
    def create(cls, data_dict):
        query = "INSERT INTO users (first_name, last_name, email) VALUES (%(first_name)s, %(last_name)s, %(email)s)"
        db_result = connectToMySQL(database).query_db(query, data_dict)
        return db_result

    
