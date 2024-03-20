package final_exam.part2q3;

import final_exam.part2q3.model.Book;

import java.util.List;
import java.util.stream.Stream;

public class BooksApp {

    public static void main(String[] args) {
        System.out.println("Hello. Starting BooksApp...");
        var list1 = List.of(
                new Book("101", "Agile Software"),
                new Book("102", "Design Patterns"),
                new Book("103", "Core Java")
        );
        var list2 = List.of(
                new Book("103", "Core Java"),
                new Book("101", "Agile Software"),
                new Book("104", "Database Concepts")
        );
        System.out.println("List of inclusive books, found in both lists");
        findInclusiveBooks(list1, list2).forEach(System.out::println);
    }

    /**
     * Using Functional programming with Stream API and Lambdas to find list of
     * inclusive books. i.e. books found in both of the input lists
     *
     * @param l1 first list
     * @param l2 second list
     * @return list of inclusive books found in both lists, l1 and l2
     */
    private static List<Book> findInclusiveBooks(List<Book> l1, List<Book> l2) {
        return Stream.concat(l1.stream(), l2.stream()).filter(x -> l1.contains(x) && l2.contains(x)).distinct().toList();
    }
}
