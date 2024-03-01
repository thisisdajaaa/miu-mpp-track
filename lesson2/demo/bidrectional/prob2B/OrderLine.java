package lesson2.demo.bidrectional.prob2B;

public class OrderLine {
    private Order order;

    private String name;

    OrderLine(Order order, String name) {
        this.order = order;
        this.name = name;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
