package final_practice.prog7.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Integer[] arrOfInt = {1, 3, 5, 7};
//        Stream<Integer> strOfInt = Stream.of(arrOfInt);
//        System.out.println(strOfInt.toList());

        int[] arrOfInt = {1, 3, 5, 7};
//one-element Stream
        Stream<int[]> strOfInt = Stream.of(arrOfInt);
        System.out.println(strOfInt.flatMapToInt(Arrays::stream).boxed().toList());

        Stream<Integer> oddElements = Stream.iterate(1, n -> n + 2);
        System.out.println(oddElements.limit(5).toList());

        String[] zz = new String[]{"1"};
        System.out.println(Arrays.toString(Arrays.stream(zz).toArray()));

        List<String> list = Arrays.asList("Joe", "Tom", "Abe");
        Stream<Stream<Character>> result
                = list.stream().map(Main::characterStream);

        System.out.println(list.stream().flatMap(Main::characterStream).toList());
    }

    public static Stream<Character> characterStream(String s) {
        List<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
        }

        return list.stream();
    }
}
