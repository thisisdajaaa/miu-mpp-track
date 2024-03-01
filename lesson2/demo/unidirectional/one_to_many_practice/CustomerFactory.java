package lesson2.demo.unidirectional.one_to_many_practice;

public class CustomerFactory {
    public static Customer addCustomer(String name, Integer accountId) {
        return new Customer(name, accountId);
    }
}
