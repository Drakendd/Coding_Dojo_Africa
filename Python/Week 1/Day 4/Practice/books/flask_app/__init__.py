

from flask import Flask

app = Flask (__name__)
app.secret_key = "keep it safe"
DATABASE = "books_schema"