from flask_app import app

#import all flask controller here
from flask_app.controller import user

if __name__=="__main__":
    app.run(debug=True,port=5000)