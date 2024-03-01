package lesson2.demo.bidrectional.one_to_one_practice;

public class CustomerFactory {
    public static Customer addCustomer(String name, Integer id) {
        Customer customer = new Customer(name);
        Account account = new Account(id, customer);

        customer.setAccount(account);

        return customer;
    }
}
