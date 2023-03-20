from models.book import Book

book_1_desc = "Harry Potter has never even heard of Hogwarts when the letters start dropping on the doormat at number four, Privet Drive. Addressed in green ink on yellowish parchment with a purple seal, they are swiftly confiscated by his grisly aunt and uncle. Then, on Harry's eleventh birthday, a great beetle-eyed giant of a man called Rubeus Hagrid bursts in with some astonishing news: Harry Potter is a wizard, and he has a place at Hogwarts School of Witchcraft and Wizardry. An incredible adventure is about to begin!"
book_2_desc = "‘By far the most stimulating, the most instructive and the most readable account of Scotch history that I have read…this splendid work carries us from Knox to Neilson, from the hot gospel of Calvin to the hot-blast of the smelting process – and incidentally seeks to explain the change. For always, in following this lucid narrative, we see an original mind at work, questioning and explaining, as well as illustrating.’ Hugh Trevor-Roper, Sunday Times"
book_3_desc = "The struggle between the English and the Danes and the strife between christianity and paganism is the background to Uhtred's growing up. He is left uncertain of his loyalties but a slaughter in a winter dawn propels him to the English side and he will become a man just as the Danes launch their fiercest attack yet on Alfred's kingdom. Marriage ties him further still to the West Saxon cause but when his wife and child vanish in the chaos of the Danish invasion, Uhtred is driven to face the greatest of the Viking chieftains in a battle beside the sea. There, in the horror of the shield-wall, he discovers his true allegiance."
book_4_desc = "On November 15, 1959, in the small town of Holcomb, Kansas, four members of the Clutter family were savagely murdered by blasts from a shotgun held a few inches from their faces. There was no apparent motive for the crime, and there were almost no clues. As Truman Capote reconstructs the murder and the investigation that led to the capture, trial, and execution of the killers, he generates both mesmerizing suspense and astonishing empathy. In Cold Blood is a work that transcends its moment, yielding poignant insights into the nature of American violence."
book_5_desc = "Okonkwo is the greatest wrestler and warrior alive, and his fame spreads throughout West Africa like a bush-fire in the harmattan. But when he accidentally kills a clansman, things begin to fall apart. Then Okonkwo returns from exile to find missionaries and colonial governors have arrived in the village. With his world thrown radically off-balance he can only hurtle towards tragedy."

book_1 = Book("Harry Potter and the Philosopher's Stone", "J. K. Rowling", "Fantasy", False, book_1_desc)
book_2 = Book("A History of the Scottish People", "T. C. Smout", "History", True, book_2_desc)
book_3 = Book("The Last Kingdom", "Bernard Cornwall", "Historical Fiction", True, book_3_desc)
book_4 = Book("In Cold Blood", "Truman Capote", "New Journalism", False, book_4_desc)
book_5 = Book("Things Fall Apart", "Chinua Achebe", "Tragedy", False, book_5_desc)

book_list = [book_1, book_2, book_3, book_4, book_5]


def add_new_book(book):
    book_list.append(book)

def remove_book( book_index):
    book_list.pop(book_index)
