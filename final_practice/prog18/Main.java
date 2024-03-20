package final_practice.prog18;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        findBiggestEven(integerList).ifPresent(System.out::println);
    }

    public static Optional<Integer> findBiggestEven(List<Integer> list) {
        if (list.isEmpty()) return Optional.empty();

        List<Integer> unique = list.stream().distinct().toList();

        if (unique.size() < 2) return Optional.empty();

        return unique.stream().filter(x -> x % 2 == 0).max(Integer::compare);
    }
}
