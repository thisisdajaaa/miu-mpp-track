package lesson2.demo.bidrectional.one_to_one_practice.extpackage;

import lesson2.demo.bidrectional.one_to_one_practice.Customer;
import lesson2.demo.bidrectional.one_to_one_practice.CustomerFactory;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.addCustomer("Das", 1);
        System.out.println(customer.getName());
        System.out.println(customer.getAccount().getOwner().getName());
    }
}
