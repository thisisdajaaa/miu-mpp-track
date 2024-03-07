package midterm_practice.midterm_practice_1.crmapp;

import midterm_practice.midterm_practice_1.crmapp.models.Customer;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void printAllCustomers(Customer[] customers) {
        for (Customer customer : customers) {
            System.out.printf("{customerId: %s, name: %s, birthday: %s} \n", customer.getCustomerId(), customer.getName(), customer.getCustomerId());
        }    
    }

    public static void printEliteCustomers(Customer[] customers) {
        for (Customer customer: customers) {
            int age = Period.between(customer.getDateOfBirth(), LocalDate.now()).getYears();

            if (age >= 41 && customer.getName().toLowerCase().startsWith("a")) {
                System.out.printf("{customerId: %s, name: %s, birthday: %s} \n", customer.getCustomerId(), customer.getName(), customer.getCustomerId());
            }
        }
    }

    public static void main(String[] args) {
        Customer[] customers = new Customer[]{
                new Customer(3109128478L, "John Dean", LocalDate.of(1989, 12, 7)),
                new Customer(2910019138L, "Anna Smith", LocalDate.of(1977, 1, 31)),
                new Customer(7281100287L, "Albert Einstein", LocalDate.of(1951, 11, 18))
        };

        printEliteCustomers(customers);
    }
}
