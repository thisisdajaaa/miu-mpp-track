package lesson5.prob3.extpackage;

import lesson5.prob3.CustOrderFactory;
import lesson5.prob3.Customer;
import lesson5.prob3.Order;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Customer cust = CustOrderFactory.createCustomer("Bob");
		Order order = CustOrderFactory.addOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustOrderFactory.addOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
