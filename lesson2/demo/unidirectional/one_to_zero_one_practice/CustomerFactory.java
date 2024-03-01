package lesson2.demo.unidirectional.one_to_zero_one_practice;

public class CustomerFactory {
    public static Customer addCustomer(String name) {
        return new Customer(name);
    }
}
