from models.book import Book

book_1 = Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "fantasy", False)
book_2 = Book("A History of the Scottish People", "T. C. Smout", "history", True)
book_3 = Book("The Last Kingdom", "Bernard Cornwall", "historical fiction", True)
book_4 = Book("In Cold Blood", "Truman Capote", "new journalism", False)
book_5 = Book("Things Fall Apart", "Chinua Achebe", "tragedy", False)

book_list = [book_1, book_2, book_3, book_4, book_5]


def add_new_book(book_list, book):
    book_list.append(book)

def remove_book(book_list, book_index):
    book_list.pop(book_index)
