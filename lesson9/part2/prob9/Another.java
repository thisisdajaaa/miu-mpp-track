package lesson9.part2.prob9;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Another {
    public static void main(String[] args) {
        List<Integer> squareList = generateNumbers(3).limit(3).toList();
        String formattedItems = squareList.stream().map(String::valueOf).collect(Collectors.joining(" + ")).trim();
        int sum = calculateSum(squareList);

        System.out.printf("The sequence of the first 3 Cubes, %s can be summed with the expression, %s, and the sum is: %d.", squareList, formattedItems, sum);


        // System.out.println(findAllNamesEndingWithGivenLetter(List.of("Marine", "Ford", "arc", "is", "epic"), 'c'));
    }

    private static boolean isSquare(int x) {
        int square = (int) Math.sqrt(x);
        return square * square == x;
    }

    public static int findNextCube(int current, int power) {
        int num = (int) Math.pow(current, 1.0 / power);

        int incremented = num + 1;

        return (int) Math.pow(incremented, power);
    }

    static Function<Integer, Stream<Integer>> powerComputer = num -> Stream.iterate(1, x -> nextPerfectPower(x, num));
    static Function<Integer, Stream<Integer>> powerComputer2 = num -> Stream.iterate(1, x -> x + 1).map(x -> (int) Math.pow(x, num)).toList().stream();

    static Stream<Integer> generateNumbers(int x) {
        return powerComputer.apply(x);
    }

    public static int nextPerfectPower(int current, int power) {
        double root = Math.pow(current, 1.0 / power);

        int nextBase = (int) Math.floor(root) + 1;

        return (int) Math.pow(nextBase, power);
    }


    public static int calculateSum(List<Integer> intNums) {
        return intNums.stream().reduce(0, Integer::sum);
    }

    public static List<String> findAllNamesEndingWithGivenLetter(List<String> names, char endLetter) {
        return names.stream().filter(x -> x.charAt(x.length() - 1) == endLetter).toList();
    }
}
