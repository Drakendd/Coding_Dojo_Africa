from flask import Flask , render_template 
app = Flask(__name__) 
@app.route('/play')
def index():
    return render_template('index.html')
#level2
# Here the second parameter is cast into an integer before being passed to the function
# @app.route('/play/<int:num>') 
# def play(x, num):
#     return f"play, {x * num}"
@app.route('/play/<int:nums>') 
def hello(nums):
    return render_template('index.html',num=nums)
# #named arg!
@app.route('/play/<int:nums>/<string:color>')
def hi(nums, color):
    return render_template('index.html' , num=nums, color=color)



# @app.route('/play/') 
# def hi(color):
#     return  render_template('index.html',color=color)




if __name__=="__main__":
    app.run(debug=True)

