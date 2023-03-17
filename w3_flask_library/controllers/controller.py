from flask import render_template, request
from app import app
from models.books import book_list, add_new_book
from models.book import Book

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
   newBook = Book(title=bookTitle, author=bookAuthor, genre=bookGenre)
   add_new_book(newBook)

   return render_template('index.html', book_list=book_list)