package design_by_contract;

import com.google.java.contract.*;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
 
// @invariant is for instance field validation
@Invariant({"title != null && title.length() > 0", "price > 0"})
public class Book {
    private final String title;
    private int price;
    // @require is for constructor validation
    @Requires({"title != null && title.length() > 0", "price > 0"})
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
 
    public int getPrice() {
        return price;
    }
 
    @Requires("price > 0")
    public void setPrice(int price) {
        this.price = price;
    }
 
    public String getTitle() {
        return title;
    }
 
    @Override
    public boolean equals(Object obj) {
        // boilerplate implementation from Apache Commons Lang
        return EqualsBuilder.reflectionEquals(this, obj, "price");
    }
 
    @Override
    public int hashCode() {
        // boilerplate implementation from Apache Commons Lang
        return HashCodeBuilder.reflectionHashCode(this, "price");
    }
}
