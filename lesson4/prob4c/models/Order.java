package lesson4.prob4c.models;

import java.time.LocalDate;

public class Order {
    private Integer orderNo;
    private LocalDate orderDate;
    private Double orderAmount;
    private Commissioned commissionedBy;

    Order(Integer orderNo, LocalDate orderDate, Double orderAmount, Commissioned commissioned) {
        this.orderNo = orderNo;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.commissionedBy = commissioned;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Commissioned getCommissionedBy() {
        return commissionedBy;
    }

    public void setCommissionedBy(Commissioned commissionedBy) {
        this.commissionedBy = commissionedBy;
    }
}
