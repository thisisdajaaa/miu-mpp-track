package lesson11.lectures;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> dogs = Arrays.asList(1, 1);
        List<? extends Integer> animals = dogs;

        for (Integer animal : animals) {

        }
    }
}
