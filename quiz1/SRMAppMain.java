package quiz1;

import quiz1.models.Address;
import quiz1.models.Product;
import quiz1.models.Supplier;
import quiz1.models.SupplierFactory;

import java.time.LocalDate;

public class SRMAppMain {
    public enum GG {
        GG1("wtf", 1),
        GG2("wtff", 2);

        private final String name;
        private final Integer value;

        GG(String name, Integer value) {
            this.name = name;
            this.value = value;
        }

        public String getName() {
            return name;
        }

        public Integer getValue() {
            return value;
        }
    }
    public static void main(String[] args) {
        Supplier supplier1 = SupplierFactory.createSupplier(
                "SS0013",
                "Argos Fruit Supplies",
                "(641) 451-0098",
                "1000 N Main Street",
                "Fairfield",
                "IA",
                "52556-0001",
                3128874119L,
                "Banana",
                LocalDate.of(2023, 1, 24),
                124,
                0.55);

        SupplierFactory.createSupplier(
                "PS1909",
                "Iowa Farms LLC",
                "(123) 462-1123",
                "2 South Circle Road",
                "San Jose",
                "CA",
                "98123-0011",
                9189927460L,
                "Carrot",
                LocalDate.of(2023, 3, 31),
                89,
                2.99);

        SupplierFactory.createSupplier(
                "EP9981",
                "Barneys Poultries",
                "(660) 123-9811",
                "4500 Gallery Blvd",
                "Phoenix",
                "AZ",
                "85020-1988",
                8761230989L,
                "Berries",
                LocalDate.of(2024, 2, 19),
                1200,
                1.50);

        SupplierFactory.addProduct(2927458265L, "Apple", LocalDate.of(2022, 12, 9), 18, 1.09, supplier1);
        SupplierFactory.addProduct(8761230987L, "Pear", LocalDate.of(2023, 2, 19), 256, 0.50, supplier1);

//        for (Product product: SupplierFactory.getProducts()) {
//            System.out.printf("{ ProductId: %s, Name : %s, DateSupplied: %s, QuantityInStock: %d, UnitPrice: $%,.2f }%n",
//                    product.getProductId(),
//                    product.getProductName(),
//                    product.getDateSupplied(),
//                    product.getQuantityInStock(),
//                    product.getUnitPrice());
//        }

//        Person person = new Person("Alice", 30);
//        System.out.println(person.isAdult()); // true
//        Person minor = Person.ofMinor("Alice", -5);
//        System.out.println(minor.age()); // 0
//        System.out.println(Person.SPECIES); // Human
//        System.out.println(person.compareTo(minor));

        System.out.println(GG.GG1.getValue());
    }

    public record Person(String name, int age) implements Comparable<Person> {

        // Compact constructor for validation
        public Person {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative");
            }
        }

        // Instance method
        public boolean isAdult() {
            return age >= 18;
        }

        // Static method
        public static Person ofMinor(String name, int age) {
            return new Person(name, Math.max(age, 0));
        }

        // Static field
        public static final String SPECIES = "Human";

        // Implementing compareTo from Comparable interface
        @Override
        public int compareTo(Person other) {
            return this.name.compareTo(other.name);
        }
    }
}
