from db.run_sql import run_sql

from models.book import Book
from models.author import Author
import repositories.author_repository as author_repository


def save(book):
    sql = "INSERT INTO books (title, author_id, description) VALUES (%s, %s, %s) RETURNING *"
    values = [book.title, book.author.id, book.description]
    results = run_sql(sql, values)
    id = results[0]['id']
    book.id = id
    return book


def select_all():
    books = []

    sql = "SELECT * FROM books"
    results = run_sql(sql)

    for row in results:
        author = author_repository.select(row['author_id'])
        book = Book(row['title'], author, row['description'], row['id'] )
        books.append(book)
    return books



def select(id):
    book = None
    sql = "SELECT * FROM books WHERE id = %s"
    values = [id]
    results = run_sql(sql, values)

    # checking if the list returned by `run_sql(sql, values)` is empty. Empty lists are 'fasly' 
    # Could alternativly have..
    # if len(results) > 0 
    if results:
        result = results[0]
        author = author_repository.select(result['author_id'])
        book = Book(result['title'], author, result['description'], result['id'] )
    return book


def delete_all():
    sql = "DELETE  FROM book"
    run_sql(sql)


def delete(id):
    sql = "DELETE  FROM books WHERE id = %s"
    values = [id]
    run_sql(sql, values)


def update(book):
    sql = "UPDATE books SET (title, author_id, description) = (%s, %s, %s, %s) WHERE id = %s"
    values = [book.title, book.author.id, book.description, book.id]
    run_sql(sql, values)

def books_by_author(author):
    books = []

    sql = "SELECT * FROM books WHERE author_id = %s"
    values = [author.id]
    results = run_sql(sql, values)

    for row in results:
        book = Book(row['title'], author, row['description'], row['id'] )
        books.append(book)
    return books
