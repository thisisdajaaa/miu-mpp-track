package lesson9.part2.prob11b;

import java.util.Comparator;
import java.util.List;

public class LambdaLibrary {
    public static final TriFunction<List<Employee>, Double, Character, List<String>> FILTERED_EMPLOYEES = (list, amount, character) ->
            list.stream()
                    .filter(item -> item.lastName.toLowerCase().charAt(0) > character)
                    .filter(item -> item.salary > amount)
                    .sorted(Comparator.comparing(Employee::getFirstName))
                    .map(item -> String.format("%s %s", item.firstName, item.lastName))
                    .toList();
}
