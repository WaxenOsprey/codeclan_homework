import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<Book>();
    }

    public void borrowBook(Book book){
        this.collection.add(book);
    }

    public int getCollection() {
        return this.collection.size();
    }
}
