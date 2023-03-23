from flask import Flask, render_template

from controllers.planets_controller import planets_blueprint
from controllers.moons_controller import moons_controller

app = Flask(__name__)

app.register_blueprint(planets_blueprint)
app.register_blueprint(moons_blueprint)

@app.route('/')
def home():
    return render_template('index.html')

if __name__ == '__main__':
    app.run(debug=True)
