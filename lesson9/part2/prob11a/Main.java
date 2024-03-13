package lesson9.part2.prob11a;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        List<String> strings = emps.stream()
                .filter(item -> item.lastName.toLowerCase().charAt(0) > 'n')
                .filter(item -> item.salary > 100000)
                .sorted(Comparator.comparing(Employee::getFirstName))
                .map(item -> String.format("%s %s", item.firstName, item.lastName))
                .toList();

        System.out.println(strings.toString());
    }
}
