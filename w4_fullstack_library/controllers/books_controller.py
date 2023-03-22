from flask import Flask, render_template, request, redirect
from repositories import book_repository
from repositories import author_repository
from models.book import Book
from flask import Blueprint

books_blueprint = Blueprint("books", __name__)

# RESTful CRUD Routes

# INDEX
# GET '/books'

@books_blueprint.route("/books")
def books():
    books = book_repository.select_all()
    return render_template("books/index.html", all_books = books)

# DELETE
# DELETE '/books/<id>'
@books_blueprint.route("/books/<id>/delete", methods=['POST'])
def delete_book(id):
    book_repository.delete(id)
    return redirect('/books')