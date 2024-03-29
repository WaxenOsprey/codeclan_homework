from flask import render_template, redirect, request
from app import app
from models.books import book_list, add_new_book, remove_book
from models.book import Book

@app.route('/')
def home():
   return render_template('home.html')

@app.route('/books')
def index():
    return render_template('index.html', book_list=book_list)

@app.route('/books/<index>')
def single_book(index):
  chosen_book = book_list[int(index)]
  return render_template('book.html', book=chosen_book)


@app.route('/books', methods=['POST'])
def add_book():
   bookTitle = request.form['title']
   bookAuthor = request.form['author']
   bookGenre = request.form['genre']
   newBook = Book(title=bookTitle, author=bookAuthor, genre=bookGenre, checked_out = False)
   add_new_book(book_list, newBook)

   return render_template('index.html', book_list=book_list)

@app.route("/books/delete/<index>", methods=["POST"])
def books_delete(index):
    remove_book(book_list, int(index))
    return redirect("/books")


# @app.route("/books/<index>", methods=["POST"])
# def books_update(index):
#     book = book_list[int(index)]
#     checked_out = "checked_out" in request.form
#     book.toggle_check_out(checked_out)
#     return redirect("/books/" + index)