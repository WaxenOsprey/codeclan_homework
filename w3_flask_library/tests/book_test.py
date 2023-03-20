import unittest
from models.book import Book
from models.books import *

class TestBook(unittest.TestCase):

    def setUp(self):
        self.book_1 = Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "fantasy", False,"")
        self.book_2 = Book("A History of the Scottish People", "T. C. Smout", "history", True, "")
        self.book_3 = Book("The Last Kingdom", "Bernard Cornwall", "historical fiction", True, "")
        self.book_4 = Book("In Cold Blood", "Truman Capote", "new journalism", False, "")
        self.book_5 = Book("Things Fall Apart", "Chinua Achebe", "tragedy", False, "")

        self.book_list = [self.book_1, self.book_2, self.book_3, self.book_4, self.book_5]

        self.book_6 = Book("Brave New World", "Aldous Huxley", "dystopian", True, "")

    def test_add_new_book(self):
        add_new_book(self.book_list, self.book_6)
        self.assertEqual(6, len(self.book_list))

    def test_remove_book(self):
        book_to_delete = self.book_list.index(self.book_4)
        remove_book(self.book_list, book_to_delete)
        self.assertEqual(4, len(self.book_list))
