from flask_app import app
from flask import Flask,render_template,request,redirect,session

from flask_app.models.users import User


@app.route('/')
def create():
    users=User.get_all()
    return render_template("show.html",users=users)

@app.route('/users',methods=["POST"])
def show():
    data={
        'first_name':request.form['first_name'],
        'last_name':request.form['last_name'],
        'email':request.form['email']
    }
    User.create(data)
    return redirect('/')


@app.route('/users/new')
def index():
    return render_template("User.html")

