package final_practice.prog9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        List<String> strings = Arrays.asList("asdzzz", "basd");

        System.out.println(findSecondLargest(strings).get());
    }

    public static <T extends Comparable<? super T>> Optional<T> findSecondLargest(List<T> list) {
        if (list.isEmpty()) return Optional.empty();

        List<T> unique = list.stream().distinct().toList();

        if (unique.size() < 2) return Optional.empty();

        T max = unique.stream().max(Comparator.comparing(Function.identity())).get();
        return unique.stream().filter(x -> !x.equals(max)).max(Comparator.comparing(Function.identity()));
    }
}
