package final_practice.prog8.prob10b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Bill", "Thomas", "Mary");
        System.out.println(stream.collect(Collectors.joining(",")));
    }
}
