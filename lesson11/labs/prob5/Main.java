package lesson11.labs.prob5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
        List<String> stringList = Arrays.asList("Asd", "Bazd", "CCCC", "DDDD");

        getSecondSmallest(integerList).ifPresent(System.out::println);
        getSecondSmallest(stringList).ifPresent(System.out::println);

        List<? super Number> gg = Arrays.asList(9,2);
        gg.add(1);
    }

    public static <T extends Comparable<T>> Optional<? extends T> getSecondSmallest(List<? extends T> list) {
        if (list.isEmpty() || list.size() == 1) return Optional.empty();

        T min = list.get(0);
        T max = list.get(0);

        for (T item : list) {
            if (item.compareTo(min) < 0) min = item;
            if (item.compareTo(max) > 0) max = item;
        }

        T secondMin = max;

        for (T item : list) {
            if (!min.equals(item) && item.compareTo(secondMin) < 0) secondMin = item;

        }

        return Optional.of(secondMin);
    }
}
