from flask import Flask

app=Flask(__name__)
app.secret_key="shhhh"
database="users_db"