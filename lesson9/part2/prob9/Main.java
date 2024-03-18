package lesson9.part2.prob9;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 3, 1);

        getBiggestEvenNumberImperative(list).ifPresentOrElse(
                x -> System.out.printf("The biggest even number in te list, %s, is %d", list.toString(), x),
                () -> {
                    System.out.print("No even number is in the list");
                });
    }



    public static int nextPerfectPower(int current, int root) {
        // Calculate the next perfect power (e.g., square, cube) after the given number
        return (int) Math.pow(Math.pow(current, 1.0 / root) + 1, root);
    }

    public static Optional<Integer> getBiggestEvenNumber(List<Integer> list) {
        if (list.isEmpty()) return Optional.empty();

        return list.stream().filter(x -> x % 2 == 0).max(Comparator.naturalOrder());
    }

    public static boolean isSquare(int n) {
        double square = Math.sqrt(n);
        return square * square == (double) n;
    }

    public static int findNextSquare(int x) {
        int nextInt = x + 1;

        while (!isSquare(x)) nextInt++;

        return nextInt;
    }

    public static Optional<Integer> getBiggestEvenNumberImperative(List<Integer> list) {
        if (list.isEmpty()) return Optional.empty();

        int max = Integer.MIN_VALUE;

        for (Integer x : list) if (x % 2 == 0 && max < x) max = x;

        if (max == Integer.MIN_VALUE) return Optional.empty();

        return Optional.of(max);
    }
}
