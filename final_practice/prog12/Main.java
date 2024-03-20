package final_practice.prog12;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> odds = Stream.iterate(1, x -> x + 2);

        System.out.println(merge(odds));
    }

    public static int merge(Stream<Integer> integerStream) {
        return integerStream.limit(5).reduce(0, Integer::sum);
    }

    public static int findNextPower(int current, int power) {
        int currentNum = (int) Math.pow(current, 1.0 / power) + 1;
        return (int) Math.pow(currentNum, power);
    }
}
