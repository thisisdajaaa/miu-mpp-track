package lesson4.prob4c.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
    private Double commission;
    private Double baseSalary;
    private List<Order> orderList;

    Commissioned(Integer empId, Double commission, Double baseSalary) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void addOrder(Integer orderNo, LocalDate orderDate, Double orderAmount) {
        if (orderList == null) orderList = new ArrayList<>();

        Order order = new Order(orderNo, orderDate, orderAmount, this);
        orderList.add(order);
    }

    @Override
    public Double calcGrossPay(Integer month, Integer year) {
        double totalCommission = 0.0;

        for (Order order : orderList) {
            boolean isWithinMonthAndYear = order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == year;

            if (isWithinMonthAndYear) {
                totalCommission += order.getOrderAmount() * this.commission;
            }
        }

        return totalCommission + baseSalary;
    }
}
