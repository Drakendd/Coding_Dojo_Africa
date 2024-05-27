from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.author import Author
from flask_app.models.book import Book

@app.route('/books')
def ninjas():
    return render_template("books.html", allDojos=Dojo.getall())

@app.route('/create/books', methods=['POST'])
def create_ninja():
    data = {
        "first_name": request.form['fname'],
        "last_name": request.form['lname'],
        "age": request.form['age'],
        "author_id": request.form.get('author_id')  # Add the selected dojo ID to the data
    }
    books.save(data)
    return redirect('/author')