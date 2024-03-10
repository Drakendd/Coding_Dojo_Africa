from flask_app import app
from flask import render_template, request, redirect, session, flash
from flask_app.models.user import User #import user class
from flask_app.models.recipe import Recipe #import recipe class

from flask_bcrypt import Bcrypt

bcrypt = Bcrypt(app)

@app.route('/')
def index():
    return render_template("index.html")

# @app.route('/dashboard')
# def dashboard():
#     if not 'user_id' in session:
#         return redirect('/')
#     logged_user = User.get_by_id({'id':session['user_id']})
#     # print(Recipe.get_all_recipes_by_user_id({'id':int(session['user_id'])}))
#     recipe=Recipe.get_all_recipes_with_poster()
#     print(recipe)
    
#     return render_template("dashboard.html", user = logged_user,all_recipes=Recipe.get_all_recipes_with_poster())

@app.route('/dashboard')
def dashboard():
    if 'user_id' not in session:
        return redirect('/')
    logged_user = User.get_by_id({'id': session['user_id']})
    all_recipes = Recipe.get_all_recipes_with_poster()  # Corrected line
    return render_template("dashboard.html", user=logged_user, all_recipes=all_recipes)


@app.route('/users/create', methods=['POST'])
def register():
    
    if User.validate_register(request.form):
        pw_hash = bcrypt.generate_password_hash(request.form['password'])
        
        data_dict = {
            **request.form,
            'password':pw_hash
        }
        
        user_id = User.create(data_dict)
        session['user_id'] = user_id
        return redirect('/dashboard')
    return redirect('/')

@app.route('/login', methods =['POST'])
def login():

    user_from_db = User.get_by_email({'email':request.form['email']})
    print(user_from_db)
    if user_from_db:
        if not bcrypt.check_password_hash(user_from_db.password, request.form['password']):
            flash("Wrong Password try again !!!","login")
            return redirect('/')
        session['user_id'] = user_from_db.id
        return redirect('/dashboard')
    flash("Wrong email try again !!!!","login")
    return redirect('/')

@app.route('/logout', methods=['POST'])
def logout():
    session.clear()
    flash("You have been logged out successfully", "logout")  
    return redirect('/')