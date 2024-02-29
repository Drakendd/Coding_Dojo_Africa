from flask_app import app
from flask import render_template,request,redirect,session
from flask_app.models.bd import User


#to get all the information from the database
@app.route('/')
def index():
    users=User.get_all()
    return render_template('show.html',users=users)

#to show the user page where you can add your users to your database
@app.route('/user')
def show_created():
    return render_template("users.html")


#this function will create the users and then return to the main page
@app.route('/user/new',methods=["POST"])
def create():
    data={
        **request.form
    }
    User.create(data)
    return redirect('/')


@app.route("/user/show/<int:id>")
def one_user(id):
    data = {"id": id}
    user = User.get_one_by_id(data)
    return render_template("show_user.html", user=user)
@app.route('/update')
def edit():
    data={
        **request.form
    }
    User.update(data)
    return redirect('/')

@app.route('/user/<int:id>/edit')
def update(id):
    data={"id":id}
    user = User.get_one_by_id(data)
    return render_template('edit.html',user=user)

@app.route('/user/<int:id>/destroy')
def delete(id):
    User.delete({"id":id})
    return redirect('/')