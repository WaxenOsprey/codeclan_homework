import pdb
from flask import Flask, render_template, request, redirect
from flask import Blueprint
import repositories.moon_repository as moon_repository
import repositories.planet_repository as planet_repository

moons_blueprint = Blueprint("moons", __name__)

@moons_blueprint.route("/planets/<id>/moons")
def show_moons(id):
    planet = planet_repository.select(id)
    moons = moon_repository.select_moons(id)

    pdb.set_trace()
    
    return render_template("planets/moons/index.html", local_moons = moons, planet = planet)