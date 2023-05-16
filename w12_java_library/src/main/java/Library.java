import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity = 100;

    public Library(){
        this.stock = new ArrayList<Book>();
    }

    public int countBooks(){
        return stock.size();
    }

    public void addBook(Book book){
        if(countBooks() < this.capacity){
            this.stock.add(book);
        }
    }

    public int getCapacity(){
        return this.capacity;
    }

    public void lendBook(Borrower borrower, Book book){
        borrower.borrowBook(book);
        this.stock.remove(book);
    }


}
