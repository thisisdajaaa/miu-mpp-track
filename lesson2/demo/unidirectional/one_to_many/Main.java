package lesson2.demo.unidirectional.one_to_many;

import lesson2.demo.unidirectional.one_to_many.models.Customer;
import lesson2.demo.unidirectional.one_to_many.models.Order;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("GG");
        customer.addOrder(new Order("G1"));
        System.out.println(customer);
    }
}
