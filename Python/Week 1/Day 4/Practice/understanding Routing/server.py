from flask import Flask
app = Flask(__name__)
@app.route('/')
def hello_world():
    return 'Hello World!'
@app.route('/Dojo')
def Dojo():
    return "Dojo"
@app.route('/Hi/<name>') # for a route '/hello/____' anything after '/hello/' gets passed as a variable 'name'
def hello(name):
    print(name)
    return "Hi, " + name
# Here the second parameter is cast into an integer before being passed to the function
@app.route('/Hi/<name>/<int:num>') 
def Hi(name, num):
    return f"Hi, {name * num}"


if __name__=="__main__":
    app.run(debug=True)
