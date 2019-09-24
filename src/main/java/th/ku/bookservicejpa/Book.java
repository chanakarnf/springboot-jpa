package th.ku.bookservicejpa;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private int id;

    private String name;
    private double price;
    public Book() {}
    public Book(int id, String name, double price) {

        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return "th.ku.bookstore.Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price + '}';
    }

}
