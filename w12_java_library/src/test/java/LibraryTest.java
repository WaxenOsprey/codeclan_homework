import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;

    @Before
    public void setUp(){
        library = new Library();
        book1 = new Book("Harry Potter and the Philosphers Stone", "J. K. Rowling", "Fantasy");
    }

    @Test
    public void canCountBooks(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void hasCapacity(){
        assertEquals(100, library.getCapacity());
    }

}
