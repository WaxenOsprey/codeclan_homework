from models.book import Book

book_1 = Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "fantasy")
book_2 = Book("A History of the Scottish People", "T. C. Smout", "history")
book_3 = Book("The Last Kingdom", "Bernard Cornwall", "historical fiction")
book_4 = Book("In Cold Blood", "Truman Capote", "new journalism")
book_5 = Book("Things Fall Apart", "Chinua Achebe", "tragedy")

book_list = [book_1, book_2, book_3, book_4, book_5]


def add_new_book(book):
    book_list.append(book)

