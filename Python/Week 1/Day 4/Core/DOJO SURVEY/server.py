from flask import Flask , render_template , session , redirect , request
app = Flask(__name__)
app.secret_key= 'mlsd;ls;dmsq;lmd'   

@app.route("/")
def dojosurvey():
    return render_template("index.html")

@app.post("/result")
def result_form():
        session["name"] = request.form["name"]
        session["location"] = request.form["location"]
        session["lang"] = request.form["lang"]
        session["com"] = request.form["com"]
        return redirect("/result")

@app.get("/result")
def result():
    print(session["location"])
    return render_template('result.html')





if __name__=="__main__":   
            app.run(debug=True)    