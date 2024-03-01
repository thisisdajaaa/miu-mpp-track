package lesson2.demo.bidrectional.prob2B.extpackage;

import lesson2.demo.bidrectional.prob2B.Order;
import lesson2.demo.bidrectional.prob2B.OrderFactory;

public class Main {
    public static void main(String[] args) {
        Order order = OrderFactory.createOrder(1, "GG1");
        order.addOrderLine("GG2");

        System.out.println(order.getOrderLineList());
    }
}
