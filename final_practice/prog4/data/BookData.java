package final_practice.prog4.data;

import final_practice.prog4.model.Book;
import final_practice.prog4.model.Publisher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookData {

    private static List<Book> books = new ArrayList<>();

    static {
        books.add(new Book("978-0321127426", "Patterns of Enterprise Archiecture", 25, LocalDate.of(2002, 11, 7), new Publisher(1314, "Apress, Inc.")));
        books.add(new Book("978-0073523323", "Database Systems Concepts", 6, LocalDate.of(2011, 5, 19), new Publisher(1314, "Apress, Inc.")));
        books.add(new Book("978-0135166307", "Core Java, Volume I - Fundamentals", 13, LocalDate.of(2022, 3, 14), new Publisher(1909, "McGraw-Hill Publishing")));
        books.add(new Book("801-1234567890", "Agile Software Development", 0, LocalDate.of(2021, 9, 22), new Publisher(9981, "Hachette Book Group")));
    }

    public static List<Book> getBooks() {
        return books;
    }
}
