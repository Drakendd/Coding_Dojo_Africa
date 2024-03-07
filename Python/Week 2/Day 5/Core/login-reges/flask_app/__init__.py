from flask import Flask

app = Flask(__name__)
DATABASE = "garden1"
app.secret_key = "deydey"