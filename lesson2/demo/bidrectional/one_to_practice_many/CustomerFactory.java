package lesson2.demo.bidrectional.one_to_practice_many;

public class CustomerFactory {
    public static Customer addCustomer(String name, Integer accountId) {
        Customer customer = new Customer(name);
        customer.addAccount(accountId);

        return customer;
    }
}
