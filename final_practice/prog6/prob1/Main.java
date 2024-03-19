package final_practice.prog6.prob1;


import java.util.function.Supplier;

public class Main {
    public static class Inner<T> implements Supplier<T> {
        private final Supplier<T> supplier;

        public Inner(Supplier<T> supplier) {
            this.supplier = supplier;
        }

        @Override
        public T get() {
            return supplier.get();
        }
    }

    public static void main(String[] args) {
        // method 1
        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());

        // method 2
        Inner<Double> doubleInner = new Inner<>(Math::random);
        System.out.println(doubleInner.get());

    }
}
