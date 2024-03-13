package lesson9.part2.prob10c;

import java.util.IntSummaryStatistics;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5);

        IntSummaryStatistics stats = stream.summaryStatistics();

        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
    }

}
