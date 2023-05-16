import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class BookTest {
    Book book;

    @Before
    public void setUp(){
        book = new Book("Harry Potter and the Philosphers Stone", "J. K. Rowling", "Fantasy");
    }

    @Test
    public void hasTitle(){
        assertEquals("Harry Potter and the Philosphers Stone", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("J. K. Rowling", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }

}
