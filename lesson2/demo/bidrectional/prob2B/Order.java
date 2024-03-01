package lesson2.demo.bidrectional.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer orderNum;

    private List<OrderLine> orderLineList = new ArrayList<>();

    Order(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    public List<OrderLine> getOrderLineList() {
        return orderLineList;
    }

    public void setOrderLineList(List<OrderLine> orderLineList) {
        this.orderLineList = orderLineList;
    }

    public void addOrderLine(String orderLineName) {
        if (orderLineName == null) throw new IllegalArgumentException("orderLineName is required!");

        OrderLine newOrderLine = new OrderLine(this, orderLineName);

        orderLineList.add(newOrderLine);
    }

    public OrderLine getOrderLine(String orderLineName) {
        for (OrderLine orderLine: orderLineList) {
            if (orderLine.getName().equalsIgnoreCase(orderLineName)) {
                return orderLine;
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum=" + orderNum +
                ", orderLineList=" + orderLineList.toString() +
                '}';
    }
}
