package lesson5.prob3;

import java.time.LocalDate;

public class CustOrderFactory {
    public static Customer createCustomer(String name) {
        return new Customer(name);
    }

    public static Order addOrder(Customer customer, LocalDate date) {
        if (customer == null) throw new NullPointerException("Customer is required");
        if (date == null) throw new NullPointerException("Date is required");

        Order order = new Order(date);

        customer.addOrder(order);

        return order;
    }
}
