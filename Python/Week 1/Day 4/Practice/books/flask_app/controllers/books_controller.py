from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.dojo_model import Dojo
from flask_app.models.ninja_model import Ninjas

@app.route('/')
def index():
    return render_template("index.html", allDojos = author.getall())

@app.route('/create/authors', methods =['POST'])
def create_dojos():
    data = {
        "name" : request.form['name']
    }
    Dojo.save(data)
    return redirect('/')

@app.route('/authors/<int:id>')
def details(id):
    data= {
        "id":id
    }
    return render_template('author.html',author=author.get_one_by_id(data),books=books.get_by_author_id(data))