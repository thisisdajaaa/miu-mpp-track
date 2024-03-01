package lesson2.demo.bidrectional.prob2B;

public class OrderFactory {
    public static Order createOrder(Integer orderNum, String orderLineName) {
        return new Order(orderNum, orderLineName);
    }
}
