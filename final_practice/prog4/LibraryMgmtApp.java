package final_practice.prog4;

import final_practice.prog4.data.BookData;
import final_practice.prog4.model.Book;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LibraryMgmtApp {

    public static void main(String[] args) {
        System.out.println("Hello... Starting LibraryMgmtApp");
        var books1 = BookData.getBooks();
        // sortBooksByPublisherAndTitle1(books1);
        // Print-out the sorted books1
        System.out.println("List of Books1 Sorted:");
        books1.forEach(System.out::println);

        var books2 = BookData.getBooks();
        // sortBooksByPublisherAndTitle2(books2);
        // Print-out the sorted books2
        System.out.println("List of Books2 Sorted:");
        books2.forEach(System.out::println);

        var books3 = BookData.getBooks();

        System.out.println("List of Books3 Sorted:");
        sortBooksByPublisherAndTitle3(books3);

        books3.forEach(System.out::println);
        // Print-out the sorted books3

    }

    private static void sortBooksByPublisherAndTitle1(List<Book> books) {
        // a.	(5 points) Using an anonymous inner class
        Comparator<Book> sortedBooks = new Comparator<Book>() {

            @Override
            public int compare(Book o1, Book o2) {
                if (o1.equals(o2)) return 0;
                if (o1.getPublisher().getName().compareTo(o2.getPublisher().getName()) > 0 ||
                        o1.getPublisher().getName().compareTo(o2.getPublisher().getName()) == 0 && o1.getTitle().compareTo(o2.getTitle()) > 0)
                    return 1;
                return -1;
            }
        };

        Collections.sort(books, sortedBooks);
    }

    private static void sortBooksByPublisherAndTitle2(List<Book> books) {
        // b.	(5 points) Using a lambda expression. 
        // TODO Implement your code here
        Comparator<Book> sortedBooks = (o1, o2) -> {
            if (o1.equals(o2)) return 0;
            if (o1.getPublisher().getName().compareTo(o2.getPublisher().getName()) > 0 ||
                    o1.getPublisher().getName().compareTo(o2.getPublisher().getName()) == 0 && o1.getTitle().compareTo(o2.getTitle()) > 0)
                return 1;
            return -1;
        };

        books.sort(sortedBooks);
    }

    private static void sortBooksByPublisherAndTitle3(List<Book> books) {
        // c.	(5 points) Using Comparator.comparing(…).thenComparing(…).
        // TODO Implement your code here

        Comparator<Book> sorComparator = Comparator.comparing((Book x) -> x.getPublisher().getName()).thenComparing(Book::getTitle);

        Collections.sort(books, sorComparator);
    }
}
