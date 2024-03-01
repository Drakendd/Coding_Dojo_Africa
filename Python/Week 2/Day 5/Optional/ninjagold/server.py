from flask import Flask , render_template,session,request, redirect
import random,datetime
app = Flask(__name__) 
app.secret_key="azertyuiop"
@app.route('/')
def index():
    if 'gold' not in session:
        session['gold']=0
        session['activities']=[]

    return render_template('index.html')

@app.route('/process_money', methods =['POST'])
def process_money():
    current_time=datetime.datetime.now().strftime("%d/%m/%Y %I:%M %p")
    choice=request.form['building']
    if choice =="farm":
        gold=random.randint(10,20)
    elif choice =="cave":
        gold=random.randint(5,10)
    elif choice =="house":
        gold=random.randint(2,5)
    elif choice =="casino":
        gold=random.randint(-50,50)



    session['gold']+=gold
    if gold<0:
        session['activities'].insert(0,f"<p style='color:red;'>Earned {gold} golds from the {choice}! ({current_time})</p>")
    else:
        session['activities'].insert(0,f"<p style='color:green;'>Earned {gold} golds from the {choice}! ({current_time})</p>")
    return redirect('/')




@app.route('/reset')
def reset():
    session.clear()
    return redirect('/')











if  __name__=="__main__":
    app.run(debug=True)

