package final_practice.prog8.prob7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(4, 5, -2, 0, -3, -1, -5, -4);
        //expected output: [0, -1, -2, -3, -4, 4, -5, 5]
        ordering1(intList);
        List<String> stringList = Arrays.asList("cba", "efg", "doe", "fie", "set");
        //expected output: [cba, fie, doe, efg, set]
        ordering2(stringList);

    }

    //Orders the integers according to this pattern:
    // 0, -1, 1, -2, 2, -3, 3, . . .
    //Using this ordering, this method sorts the list as part of
    //a stream pipeline, and prints to the console
    public static void ordering1(List<Integer> list) {
        list.stream().sorted(Comparator.comparing((Integer x) -> Math.abs(x)).thenComparing(Comparator.naturalOrder())).toList().forEach(System.out::println);

    }

    //Orders words by first reversing each and comparing
    //in the usual way.  So
    //    cba precedes bed
    //since
    //    cba.reverse() precedes bed.reverse()
    //in the usual ordering
    //Using this ordering, this method sorts the list as part of
    //a stream pipeline, and prints to the console
    public static void ordering2(List<String> words) {
        words.stream().sorted(Comparator.comparing(x -> new StringBuilder(x).reverse().toString())).toList().forEach(System.out::println);

    }

}
