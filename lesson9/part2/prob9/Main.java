package lesson9.part2.prob9;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream stream =  IntStream.iterate(1, Main::findNextSquare);

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

}
