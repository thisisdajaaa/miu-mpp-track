package final_practice.prog1;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(19, 9, 11, 0, 12);
        List<String> strings = List.of("was", "tray", "brb", "asd");

        Optional<Integer> secondLargestInteger = getSecondLargest(integerList);
        Optional<String> secondLargestString = getSecondLargest(strings);

        secondLargestInteger.ifPresent(value -> System.out.println(print(integerList, value)));
        secondLargestString.ifPresent(value -> System.out.println(print(strings, value)));
    }

    public static <T> String print(List<T> list, T secondLargest) {
        if (list == null || secondLargest == null) return "Second largest of array, null is: Not available";
        if (list.isEmpty()) return "Second largest of array, [ ] are: Not available";
        if (list.size() == 1) return String.format("Second largest of array, %s is: Not available", list.get(0));

        return String.format("Second largest of array, %s is: %s", list, secondLargest);
    }

    public static <T extends Comparable<T>> Optional<T> getSecondLargest(List<T> list) {
        if (list == null || list.isEmpty() || list.size() == 1) return Optional.empty();

        T max = null;
        T secondMax = null;

        for (T item : list) {
            if (max == null || item.compareTo(max) > 0) {
                secondMax = max;
                max = item;
            } else if (item.compareTo(max) < 0 && (secondMax == null || item.compareTo(secondMax) > 0)) {
                secondMax = item;
            }
        }

        return Optional.ofNullable(secondMax);
    }

}
