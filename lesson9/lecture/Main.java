package lesson9.lecture;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(19, 7, 23, 99);
        Stream<Integer> streamNums = nums.stream();
        streamNums.forEach(System.out::println);

        Stream<String> stringStream = Stream.of("Eye", "Like", "Java", "Stream", "API");
        stringStream.forEach(System.out::println);

        Stream.iterate(0, n -> n + 2).limit(5).forEach(System.out::println);
    }
}
