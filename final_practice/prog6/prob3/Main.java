package final_practice.prog6.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, List<Double>> function = (x, y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x, y));
            list.add((double) x * y);
            return list;
        };

        System.out.println(function.apply(2, 2));
    }
}
