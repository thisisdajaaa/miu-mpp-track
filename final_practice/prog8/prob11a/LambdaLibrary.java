package final_practice.prog8.prob11a;

import java.util.Comparator;
import java.util.List;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Double, Character, List<String>> characterListTriFunction = (list, salary, character) -> list.stream()
            .filter(x -> x.salary > 100000)
            .filter(x -> x.lastName.toLowerCase().charAt(0) > 'm')
            .sorted(Comparator.comparing(Employee::getFirstName))
            .map(x -> String.format("%s %s", x.firstName, x.lastName))
            .toList();
}
