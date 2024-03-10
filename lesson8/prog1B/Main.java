package lesson8.prog1B;

public class Main {
    public static class SupplierRandom implements Supplier<Double> {

        @Override
        public Double get() {
            return Math.random();
        }
    }

    public static void main(String[] args) {

        Supplier<Double> supplier = Math::random;
        System.out.println(supplier.get());

        SupplierRandom supplierRandom = new SupplierRandom();
        System.out.println(supplierRandom.get());
    }
}
