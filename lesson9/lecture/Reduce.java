package lesson9.lecture;


import lesson9.lecture.models.Employee;
import lesson9.lecture.models.EmployeeStats;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("we", "are", "the", "champions");
        String reducedString = strings.reduce("", (accumulator, element) -> String.format("%s %s", accumulator, element));

        System.out.println(reducedString);

        List<Employee> list = Arrays.asList(new Employee(1, 22, 1200.0), new Employee(2, 24, 1300.0));
        EmployeeStats employeeStats = list.stream().reduce(new EmployeeStats(0, 0.0, 0),
                (EmployeeStats accumulator, Employee element) -> new EmployeeStats(
                    accumulator.getTotalAge() + element.getAge(),
                    accumulator.getTotalSalary() + element.getSalary(),
                    accumulator.getTotalNumberOfEmployees() + 1
                ), EmployeeStats::combine);

        System.out.println(employeeStats);
    }
}
