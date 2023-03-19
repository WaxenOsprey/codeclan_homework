from models.book import Book

book_1 = Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "Fantasy", False)
book_2 = Book("A History of the Scottish People", "T. C. Smout", "History", True)
book_3 = Book("The Last Kingdom", "Bernard Cornwall", "Historical Fiction", True)
book_4 = Book("In Cold Blood", "Truman Capote", "New Journalism", False)
book_5 = Book("Things Fall Apart", "Chinua Achebe", "Tragedy", False)

book_list = [book_1, book_2, book_3, book_4, book_5]


def add_new_book(book_list, book):
    book_list.append(book)

def remove_book(book_list, book_index):
    book_list.pop(book_index)
