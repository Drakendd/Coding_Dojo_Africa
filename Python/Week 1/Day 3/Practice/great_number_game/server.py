from flask import Flask,render_template,redirect,session,request
import random


app=Flask(__name__)

app.secret_key="this the secret key"

ran=random.randint(1,100)

@app.route('/')
def show():
    return render_template('doss.html')

@app.route('/wow',methods=['POST'])
def wow():
    global ran
    print(ran)
    session['guess']=request.form['guess']
    if int(session['guess'])>ran:
        return render_template('uno.html')
    elif int(session['guess'])<ran:
        return render_template('tress.html')
    else:
        return render_template('tress.html',ran=ran)



if __name__=='__main__':
    app.run(debug=True)



    #--------------------------------------------------------------
    # this  one was tough to be a practice (((<3)))