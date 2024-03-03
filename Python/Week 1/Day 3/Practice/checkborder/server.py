from flask import Flask, rendertemplate

app = Flask(name)

@app.route('/')
def index():
    return rendertemplate("index.html", row=8, col=8, colorone='red', colortwo='black')

@app.route('/<int:x>')
def row(x):
    return render_template("index.html", row=x, col=8, color_one='red', color_two='black')

@app.route('/<int:x>/<int:y>')
def row_col(x, y):
    return render_template("index.html", row=x, col=y, color_one='red', color_two='black')

@app.route('/<int:x>/<int:y>/<string:one>')
def row_col_one(x, y, one):
    return render_template("index.html", row=x, col=y, color_one=one, color_two='black')

@app.route('/<int:x>/<int:y>/<string:one>/<string:two>')
def row_col_two(x, y, one, two):
    return render_template("index.html", row=x, col=y, color_one=one, color_two=two)

if __name == "__main":
    app.run(debug=True)