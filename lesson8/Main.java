package lesson8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    @FunctionalInterface
    interface Wtf {
        String add();
    }

    static class GG implements Wtf {

        @Override
        public String add() {
            return "S";
        }
    }

    interface LMAO<B, T, U> {
        B apply(T wtf, U wtz);
    }

    @FunctionalInterface
    interface TriEZ<T, U, V> {
        void accept(T i1, U i2, V i3);
    }

    static class Employee {
        private String name = "G";

        public String getName() {
            return name;
        }

    }
    public static void main(String[] args) {
        List<LocalDate> list = new ArrayList<>(List.of(LocalDate.of(2021, 12, 12), LocalDate.of(2022, 12, 12)));

        list.sort(LocalDate::compareTo);

        Consumer<LocalDate> consumer = System.out::println;

        list.forEach(consumer);

        GG gg = new GG();
        Function<String, Integer> f = Integer::parseInt;
        System.out.println(f.apply("1 ".trim()));
        Function<Employee, String> zz = Employee::getName;
        System.out.println(zz.apply(new Employee()));

        Function<String, String> lmao = String::valueOf;
        System.out.println(lmao.apply("as"));

        Wtf g = gg::add;
        System.out.println(g.add()); // This will print "S"
        int s = 12, t = 22;
        Runnable r = () ->
        {
            int[][] products = new int[s][t];
            for (int i = 0; i < s; i++) {
                for(int j = i + 1; j < t; j++) {
                    products[i][j] = i * j;
                }
            }

            System.out.println(Arrays.deepToString(products));
        };

        r.run();

        TriEZ<Integer, Integer, Integer> func = (Integer i1, Integer i2, Integer i3) -> System.out.printf("Int1 is %d\nInt2 is %d\nInt3 is %d", i1, i2, i3);

        func.accept(45, 76, 92);
    }


}
