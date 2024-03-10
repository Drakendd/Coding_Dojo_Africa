from flask_app import app
from flask import render_template, request, redirect, session, flash
from flask_app.models.user import User
from flask_app.models.recipe import Recipe

@app.route("/recipe/new")
def create_recipe():
    if 'user_id' not in session:
        return redirect('/')
    
    return render_template('recipe.html')

@app.route("/recipe/new/create",methods=['post'])
def submit_create():
    if 'user_id' not in session:
        return redirect('/')
    data={**request.form}
    if not Recipe.validate_recipe(data):
        return redirect('/recipe/new')
    
    Recipe.save(data)
    print(data)
    return redirect('/dashboard')

@app.route("/show/recipe/<int:id>")
def show_recipe(id):
    if 'user_id' not in session:
        return redirect('/')
    print(Recipe.get_one_recipe_by_id({'id':id}))
    recipe=Recipe.get_one_recipe_by_id({'id':id})
    print(recipe.user_id)
    return render_template('show_recipe.html',recipe=recipe,user_create_recipe=User.get_by_id({'id':recipe.user_id}),user_login=User.get_by_id({'id':int(session['user_id'])}))


@app.route("/recipe/<int:id>/edit")
def edit_recipe(id):
    if 'user_id' not in session:
        return redirect('/')
    return render_template("recipe_edit.html",recipe=Recipe.get_one_recipe_by_id({'id':id}))

@app.route("/recipe/<int:id>/update", methods=['post'])
def update_recipe(id):
    data={**request.form,'id':id}
    if 'user_id' not in session:
        return redirect('/')
    if not Recipe.validate_recipe(data):
        return redirect(f"/recipe/{id}/edit")
    Recipe.update(data)
    return redirect('/dashboard')

@app.route("/recipe/<int:id>/destroy")
def destroy_recipe(id):
    data={'id':id}
    if 'user_id' not in session:
        return redirect('/')
    Recipe.destroy_recipe(data)
    return redirect('/dashboard')