package lesson10.prob5;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Stream<Employee> emps = Stream.of(
                new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        String output = Main.asString(emps.toList());
        Main.printEmps(output);
    }

    public static String asString(List<Employee> list) {
        return list.stream()
                .filter(Main::salaryGreaterThan100000)
                .filter(Main::lastNameAfterM)
                .map(Main::fullName)
                .sorted()
                .collect(Collectors.joining(", "));
    }

    public static boolean salaryGreaterThan100000(Employee employee) {
        return employee.getSalary() > 100000;
    };

    public static boolean lastNameAfterM(Employee employee) {
        return employee.getLastName().charAt(0) > 'M';
    }

    public static void printEmps(String list) {
        System.out.println(list);
    }

    public static String fullName(Employee e) {
        return e.getFirstName() + " " + e.getLastName();
    }

}
