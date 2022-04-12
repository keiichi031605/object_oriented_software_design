package design_by_contract;

import com.google.common.collect.*;
import com.google.java.contract.*;
 
@Invariant("books != null")
public class ShoppingCart {
    private final Multiset<Book> books = HashMultiset.create();
 
    @Requires("book != null")
    @Ensures("books.count(book) == old(books.count(book)) + copies")
    public void addBooks(Book book, int copies) {
        books.add(book, copies);
    }
 
    @Requires({"book != null", "books.count(book) >= copies"})
    @Ensures("books.count(book) == old(books.count(book)) - copies")
    public void removeBooks(Book book, int copies) {
        books.remove(book, copies);
    }
 
    @Requires("book != null")
    @Ensures("books.count(book) == old(books.count(book)) - copies")
    @ThrowEnsures("books.count(book) == old(books.count(book))")
    public void removeBooksUnsafe(Book book, int copies) {
        if (books.count(book) >= copies) {
            books.remove(book, copies);
        } else {
            throw new IllegalStateException("Not enough books to remove");
        }
    }
 
    @Ensures("result >= 0")
    public int getTotal() {
        int total = 0;
        for (Book book : books) {
            total += book.getPrice() * books.count(book);
        }
        return total;
    }
 
    public static void main(String[] args) {
        Book hp = new Book("Harry Potter and the Goblet of Fire", 10);
        Book hhg = new Book("The Hitchhiker's Guide to the Galaxy", 12);
        Book lotr = new Book("The Two Towers", 15);
 
        ShoppingCart cart = new ShoppingCart();
        cart.addBooks(hp, 1);
        cart.addBooks(hhg, 2);
        cart.addBooks(lotr, 3);
        System.out.println("initial total = " + cart.getTotal());
 
        cart.removeBooks(hp, 1);
        System.out.println("total after removing = " + cart.getTotal());
 
        try {
            cart.removeBooksUnsafe(hhg, 4);
        } catch (IllegalStateException e) {
            System.out.println("error message: " + e.getMessage());
        }
        System.out.println("total after exception = " + cart.getTotal());
 
 
        System.out.println("\n//precondition violated here - only two books in the cart");
        cart.removeBooks(hhg, 4);
    }
}
