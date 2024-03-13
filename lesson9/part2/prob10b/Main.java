package lesson9.part2.prob10b;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        String formattedString = stringStream.reduce("", (accumulator, element) -> String.format("%s %s", accumulator, element)).trim();
        System.out.println(formattedString);
    }
}
