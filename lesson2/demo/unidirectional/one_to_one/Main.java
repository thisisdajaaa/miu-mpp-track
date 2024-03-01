package lesson2.demo.unidirectional.one_to_one;

import lesson2.demo.unidirectional.one_to_one.models.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Da", 1, 1.22);

        System.out.println(customer);
    }
}
