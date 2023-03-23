from flask import Flask, render_template, request, redirect
from flask import Blueprint
from models.moon import Moon
import repositories.moon_repository as moon_repository

moons_blueprint = Blueprint("moons", __name__)
