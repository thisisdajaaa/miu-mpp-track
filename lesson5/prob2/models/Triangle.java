package lesson5.prob2.models;

import lesson5.prob2.interfaces.IShape;

public final class Triangle implements IShape {
    private Double base;
    private Double height;

    public Triangle(Double base, Double height) {
        this.base = base;
        this.height = height;
    }

    public Double getBase() {
        return base;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public Double computeArea() {
        return 1/2 * base * height;
    }
}
