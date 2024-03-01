package lesson2.demo.unidirectional.one_to_one_practice;

public class CustomerFactory {
    public static Customer addCustomer(String name, Integer accountNum) {
        if (name == null || accountNum == null) throw new IllegalArgumentException("Missing argument/s");

        return new Customer(name, accountNum);
    }
}
