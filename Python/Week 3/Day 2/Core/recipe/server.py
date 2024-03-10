from flask_app import app
from flask_app.controllers import user_controll
from flask_app.controllers import recipe_controll


if __name__ == '__main__':
    app.run(debug=True, port=9999)  