package lesson2.demo.unidirectional.one_to_many_practice.extpackage;

import lesson2.demo.unidirectional.one_to_many_practice.Customer;
import lesson2.demo.unidirectional.one_to_many_practice.CustomerFactory;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.addCustomer("Das", 1);
        customer.addAccount(2);
        customer.addAccount(3);
        customer.addAccount(4);

        System.out.println(customer);
    }
}
