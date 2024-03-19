package final_practice.prog4.model;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private String isbn;
    private String title;
    private Integer numberOfCopiesInStock;
    private LocalDate datePublished;
    private Publisher publisher;

    public Book(String isbn, String title, Integer numberOfCopiesInStock, LocalDate datePublished,
                Publisher publisher) {
        this.isbn = isbn;
        this.title = title;
        this.numberOfCopiesInStock = numberOfCopiesInStock;
        this.datePublished = datePublished;
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Integer getNumberOfCopiesInStock() {
        return numberOfCopiesInStock;
    }

    public LocalDate getDatePublished() {
        return datePublished;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", title=" + title + ", numberOfCopiesInStock=" + numberOfCopiesInStock
                + ", datePublished=" + datePublished + ", publisher=" + publisher + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(numberOfCopiesInStock, book.numberOfCopiesInStock) && Objects.equals(datePublished, book.datePublished) && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, numberOfCopiesInStock, datePublished, publisher);
    }
}
