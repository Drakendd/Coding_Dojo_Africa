from flask import flash
from flask_app import database
from flask_app.config.mysqlconnection import connectToMySQL
import re
EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')

class Email:
    def __init__(self,data):
        self.id=data['id']
        self.email=data['email']
    @classmethod
    def create(cls,data):
        query="""INSERT INTO email (email) VALUES (%(email)s);"""
        return connectToMySQL(database).query_db(query,data)
    
    @classmethod
    def get_all(cls):
        query="""SELECT * FROM email;"""
        db_result=connectToMySQL(database).query_db(query)
        emails=[]
        for row in db_result:
            emails.append(cls(row))
        return emails
    
    @classmethod
    def delete(cls,data):
        query="""DELETE FROM email WHERE email=%(email)s;"""
        return connectToMySQL(database).query_db(query,data)
    
    @staticmethod
    def validate(data):
        is_valid=True
        query="""SELECT * FROM email;"""
        if not EMAIL_REGEX.match(data['email']):
            flash('Invalid email Address !',"valid")
            is_valid=False
        db_result=connectToMySQL(database).query_db(query)
        ok=False
        for row in db_result:
            if(data['email']==row['email']):
                flash('this email is already in Use',"valid")
                ok=False
            else:
                ok=True
        if ok:
            flash("THE EMAIL address you entered is valid email address Thank you"
                ,"email")
        return is_valid