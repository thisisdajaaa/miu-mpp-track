package lesson1.quiz;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String... args) {
        Person[] people = new Person[]{
                new Person(3128874111L, "Banana", LocalDate.of(2024, 2, 28), 1, 0.21),
                new Person(3128874112L, "Carrot", LocalDate.of(2024, 2, 28), 1, 0.22),
                new Person(3128874113L, "Orange", LocalDate.of(2024, 2, 28), 1, 0.23),
        };

        List<Person> peoples = new ArrayList<>(Arrays.asList(people));

        for (Person person: peoples) {
            System.out.println(person);
        }
    }
}
