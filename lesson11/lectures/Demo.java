package lesson11.lectures;

import java.util.*;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
        Integer[] list = new Integer[] {1, 2, 3};
        String[] strings = new String[]{"Aras", "Sara"};

        List<Integer> gg1 = Arrays.asList(1, 2, 3);
        List<String> strings1 = Arrays.asList("ASd", "zxc");
        List<? extends Number> gg2 = gg1; // reassign it to a superclass which is a valid super class
        Number ggz = gg2.get(0); // can assign it to a variable of type SUPERCLASS
        // gg2.add(4); // not allowed

        System.out.println(reverse(strings1));

        System.out.println("Before swap: " + gg1);
        swap(gg1, 0, 1);
        System.out.println("After swap: " + gg1);

        System.out.println("Before swap: " + strings1);
        swap(strings1, 0, 1);
        System.out.println("After swap: " + strings1);

        List<? super Object> gg3 = new ArrayList<>(); // add anything that is a subclass of super class
        gg3.add(5);
        gg3.add(5.1);
        gg3.add(1L);
        // Integer gg = gg3.get(0); // not allowed since we dont know which type is which



        System.out.println(Demo.<Integer>countOccurrences(list, 0));
        System.out.println(Demo.<String>countOccurrences(strings, "Sara"));
    }

    public static <T> int countOccurrences(T[] arr, T target) {
        return (int) Stream.of(arr).filter(x -> Objects.equals(target, x)).count();
    }

    public static List<?> reverse(List<?> list) {
        return reverseHelper(list);
    }

    private static <T> List<T> reverseHelper(List<T> list) {
        List<T> tmp = new ArrayList<>(list);
        Collections.reverse(tmp);
        return tmp;
    }

    public static void swap(List<?> list, int pos1, int pos2) {
        swapHelper(list, pos1, pos2);
    }

    private static <T> void swapHelper(List<T> list, int pos1, int pos2) {
        T firstElement = list.get(pos1);
        T secondElement = list.get(pos2);

        list.set(pos1, secondElement);
        list.set(pos2, firstElement);
    }
}
