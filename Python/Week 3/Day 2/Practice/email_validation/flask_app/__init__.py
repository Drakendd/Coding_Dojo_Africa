from flask import Flask

app=Flask(__name__)
app.secret_key="SHH"
database="email_validation_db"