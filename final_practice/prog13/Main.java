package final_practice.prog13;

import java.util.function.BiPredicate;

public class Main {
    static BiPredicate<Double, Double> biPredicate = (x, y) -> x * y < x + y;
    static BiPredicate<Double, Double> withHelper = Main::helper;

    public static void main(String[] args) {
        Main main = new Main();
        main.evaluator();

    }

    static class Inner implements BiPredicate<Double, Double> {
        @Override
        public boolean test(Double x, Double y) {
            return x * y < x + y;
        }
    }

    public void evaluator() {
        System.out.println(biPredicate.test(1.0, 7.0));
        System.out.println(withHelper.test(1.0, 7.0));
        System.out.println(new Inner().test(1.0, 7.0));
    }


    private static Boolean helper(Double x, Double y) {
        return x * y < x + y;
    }
}
