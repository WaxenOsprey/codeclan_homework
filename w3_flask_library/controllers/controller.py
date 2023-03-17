from flask import render_template
from app import app
from models.books import book_list

@app.route('/books')
def index():
    return render_template('index.html', book_list=book_list)

@app.route('/books/<index>')
def single_book(index):
  chosen_book = book_list[int(index)]
  
  return render_template('book.html', book=chosen_book)