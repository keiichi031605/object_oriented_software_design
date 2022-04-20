package design_by_contract;

import com.google.common.collect.*;
import com.google.java.contract.*;

@Invariant("books != null")
public class ShoppingCart {
  private final Multiset<Book> books = HashMultiset.create();

  public Multiset<Book> getBooks() {
    return this.books;
  }

  // Precondition
   @Requires("book != null")
   @Ensures("books.count(book) == old(books.count(book)) + copies")
  public void addBooks(Book book, int copies) {
    books.add(book, copies);
    // books.add(book, 5);
  }

  // Precondition
  @Requires({"book != null", "books.count(book) >= copies"})
  @Ensures("books.count(book) == old(books.count(book)) - copies")
  public void removeBooks(Book book, int copies) {
    books.remove(book, copies);
  }

  // Postcondition
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
    System.out.println("###########################");
    for (Book book : books) {
      System.out.println(book.getTitle() + ": " + book.getPrice());
      
      total += book.getPrice() * books.count(book);
    }
    System.out.println("###########################");
    return total;
  }

  public static void main(String[] args) {
	Book hp = new Book("Harry Potter and the Goblet of Fire", 10);
//    Book hp = null;
    Book hgg = new Book("The Hitchhiker's Guide to the Galaxy", 12);
    Book tt = new Book("The Two Towers", 15);

    ShoppingCart cart = new ShoppingCart();
    cart.addBooks(hp, 1);
    cart.addBooks(hgg, 2);
    cart.addBooks(tt, 3);

    // System.out.println("Count books = " + cart.getBooks().count(tt));
    // System.out.println("books Size = " + cart.getBooks().size());
    System.out.println("initial total = " + cart.getTotal());

    cart.removeBooks(hp, 1);
    System.out.println("total after removing = " + cart.getTotal());

    try {
        cart.removeBooksUnsafe(hgg, 4);
    } catch (IllegalStateException e) {
        System.out.println("error message: " + e.getMessage());
    }
    System.out.println("total after exception = " + cart.getTotal());
    
    
    System.out.println("\n//precondition violated here - only two books in the cart");
    cart.removeBooks(hgg, 4);
    System.out.println("last = " + cart.getTotal());
  }
}
