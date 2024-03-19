package final_practice.prog8.prob9;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        printNSquares(4);
    }

    public static void printNSquares(int n) {
        Stream<Integer> integerStream = Stream.iterate(1, x -> findNextSquare(x, 2));

        integerStream.limit(n).toList().forEach(System.out::println);
    }

    public static int findNextSquare(int current, int power) {
        int currentNum = (int) Math.pow(current, 1.0 / power) + 1;
        return (int) Math.pow(currentNum, power);
    }
}
