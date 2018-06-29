package book;

import author.Author;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String isbn;
    private String title;
    private Set<Author> authors;
    private double price;

    public Book(long id, String isbn, String title, Set<Author> authors, double price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return id == book.id;
    }
    @Override
    public int hashCode() {
        return (int) (id^ (id>>> 32));
    }
}