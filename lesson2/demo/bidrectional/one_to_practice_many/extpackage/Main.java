package lesson2.demo.bidrectional.one_to_practice_many.extpackage;

import lesson2.demo.bidrectional.one_to_practice_many.Customer;
import lesson2.demo.bidrectional.one_to_practice_many.CustomerFactory;

public class Main {
    public static void main(String[] args) {
        Customer customer = CustomerFactory.addCustomer("das", 1);
        customer.addAccount(2);
        customer.addAccount(3);

        System.out.println(customer.getAccountList());
    }
}
