package final_practice.prog8.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        IntSummaryStatistics intSummaryStatistics = stream.mapToInt(x -> x).summaryStatistics();
        System.out.println(STR."max: \{intSummaryStatistics.getMax()}");
        System.out.println(STR."min: \{intSummaryStatistics.getMin()}");
    }
}
