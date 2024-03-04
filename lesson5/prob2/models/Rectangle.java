package lesson5.prob2.models;

import lesson5.prob2.interfaces.IShape;

public class Rectangle implements IShape {
    private Double width;
    private Double length;

    public Rectangle(Double width, Double length) {
        this.width = width;
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public Double getLength() {
        return length;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public Double computeArea() {
        return width * length;
    }
}
