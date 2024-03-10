package lesson8.prog6;


import lesson8.prog6.comparator.EmployeeComparator;
import lesson8.prog6.models.Apple;
import lesson8.prog6.models.Employee;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        evaluate();


    }

    public static void evaluate() {
        // A
        Function<Employee, String> employeeStringFunction = Employee::getName;
        System.out.println(employeeStringFunction.apply(new Employee("das")));

        // B
        Employee employee = new Employee();
        BiConsumer<Employee, String> employeeStringBiConsumer = Employee::setName;
        employeeStringBiConsumer.accept(employee, "DAs");
        System.out.println(employee.getName());

        // C
        BiFunction<String, String, Integer> stringIntegerBiFunction = String::compareTo;
        System.out.println(stringIntegerBiFunction.apply("aat", "wat"));

        // D
        BiFunction<Integer, Integer, Double> integerIntegerDoubleBiFunction = Math::pow;
        System.out.println(integerIntegerDoubleBiFunction.apply(2, 2));

        // E
        Function<Apple, Double> appleDoubleFunction = Apple::getWeight;
        System.out.println(appleDoubleFunction.apply(new Apple(3.0)));

        // F
        Function<String, Integer> stringIntegerFunction = Integer::parseInt;
        System.out.println(stringIntegerFunction.apply("1"));

        // G
        EmployeeComparator employeeComparator = new EmployeeComparator();
        BiFunction<Employee, Employee, Integer> employeeIntegerBiFunction = employeeComparator::compare;
        System.out.println(employeeIntegerBiFunction.apply(new Employee("Das1"), new Employee("Das2")));
    }
}
