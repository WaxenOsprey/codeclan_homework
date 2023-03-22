import pdb
from models.book import Book
from models.author import Author

import repositories.book_repository as book_repository
import repositories.author_repository as author_repository

book_repository.delete_all()
author_repository.delete_all()

author1 = Author("J. K.", "Rowling")
author_repository.save(author1)
author2 = Author("T. C.", "Smout")
author_repository.save(author2)
author3 = Author("Bernard", "Cornwall")
author_repository.save(author3)
author4 = Author("Truman", "Capote")
author_repository.save(author4)
author5 = Author("Chinua", "Achebe")
author_repository.save(author5)

book1 = Book("Harry Potter and the Philosopher's Stone", author1, "testtesttest")
book_repository.save(book1)
book2 = Book("A History of the Scottish People", author2, "testtesttest")
book_repository.save(book2)
book3 = Book("The Last Kingdom", author3, "testtesttest")
book_repository.save(book3)
book4 = Book("In Cold Blood", author4, "testtesttest")
book_repository.save(book4)
book5 = Book("Things Fall Apart", author5, "testtesttest")
book_repository.save(book5)


author_results = author_repository.select_all()
for result in author_results:
    print(f"{result.first_name}{result.last_name}")

book_results = book_repository.select_all()
for result in book_results:
    print(f"{result.title} {result.author.first_name} {result.author.last_name} {result.description}")



