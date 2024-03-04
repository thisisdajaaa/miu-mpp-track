package lesson5.prob2.models;

import lesson5.prob2.interfaces.IShape;

public class Circle implements IShape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double computeArea() {
        return Math.PI * radius * radius;
    }
}
