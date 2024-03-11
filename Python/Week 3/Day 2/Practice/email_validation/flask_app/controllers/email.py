from flask_app import app
from flask_app.models.emails import Email
from flask import flash,render_template,redirect,request


@app.route('/')
def index():
    return render_template('index.html')
@app.route('/valid',methods=['POST'])
def validate():
    data={
        **request.form
    }
    if Email.validate(data):
        Email.create(data)
        return redirect('/show')
    return redirect('/')

@app.route('/show')
def show():
    return render_template('show.html',emails=Email.get_all())

@app.route('/back',methods=['POST'])
def back():
    return redirect('/')

@app.route('/delete/<name>')
def delete(name):
    data={
        "email":name
    }
    Email.delete(data)
    return redirect('/show')