package lesson9.part2.prob9;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream stream = IntStream.iterate(1, n -> nextPerfectPower(n, 2));

        stream.limit(4).forEach(System.out::println);
    }

    public static boolean isSquare(int num) {
        double squareRoot = Math.sqrt(num);

        return squareRoot * squareRoot == (double) num;
    }

    private static int findNextSquare(int number) {
        int nextNumber = number + 1;

        while (!isSquare(nextNumber)) nextNumber++;

        return nextNumber;
    }

    public static int nextPerfectPower(int current, int root) {
        // Calculate the next perfect power (e.g., square, cube) after the given number
       return (int) Math.pow(Math.pow(current, 1.0 / root) + 1, root);
    }

}
