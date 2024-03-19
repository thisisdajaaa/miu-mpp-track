package final_practice.prog6.prob5;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        evaluator();
    }

    public static void evaluator() {
        Function<Employee, String> employeeStringFunction = Employee::getName;
        System.out.println(employeeStringFunction.apply(new Employee("das")));

        BiConsumer<Employee, String> employeeStringBiConsumer = Employee::setName;
        Employee was = new Employee("as");
        employeeStringBiConsumer.accept(was, "dz");
        System.out.println(was.getName());

        BiFunction<String, String, Integer> stringIntegerBiFunction = String::compareTo;
        System.out.println(stringIntegerBiFunction.apply("das", "eas"));

        Function<Apple, Integer> appleIntegerFunction = Apple::getWeight;
        System.out.println(appleIntegerFunction.apply(new Apple(1)));

        Function<String, Integer> stringIntegerFunction = Integer::parseInt;
        System.out.println(stringIntegerFunction.apply("1"));

        Comparator<Employee> comparator = new EmpNameComparator();
        BiFunction<Employee, Employee, Integer> employeeIntegerBiFunction = comparator::compare;
        System.out.println(employeeIntegerBiFunction.apply(new Employee("das"), new Employee("eas")));
    }
}
