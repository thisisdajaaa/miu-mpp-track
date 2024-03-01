package lesson2.demo.unidirectional.one_to_one_practice.extpackage;

import lesson2.demo.unidirectional.one_to_one_practice.Customer;
import lesson2.demo.unidirectional.one_to_one_practice.CustomerFactory;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.addCustomer("Daz", 123);

        System.out.println(customer.getAccount().getAccountNum());
    }
}
