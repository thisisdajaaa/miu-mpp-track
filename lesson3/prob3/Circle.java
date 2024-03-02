package lesson3.prob3;

public class Circle {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Circle() {}

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getArea() {
        return Math.PI * (radius * radius);
    }
}
