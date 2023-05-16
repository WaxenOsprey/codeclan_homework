import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp() {
        book = new Book("title1", "author1", "genre1");
        library = new Library();
        borrower = new Borrower();
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(book);
        assertEquals(1, borrower.getCollection());
    }
}

