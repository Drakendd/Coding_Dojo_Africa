from flask_app import app
from flask import render_template,redirect,request
from flask_app.models.dojo_model import Dojo
from flask_app.models.ninja_model import Ninjas

@app.route('/new_ninja')
def ninjas():
    return render_template("new_ninja.html", allDojos=Dojo.getall())

@app.route('/create/ninja', methods=['POST'])
def create_ninja():
    data = {
        "first_name": request.form['fname'],
        "last_name": request.form['lname'],
        "age": request.form['age'],
        "dojo_id": request.form.get('dojo_id')  # Add the selected dojo ID to the data
    }
    Ninjas.save(data)
    return redirect('/dojo')