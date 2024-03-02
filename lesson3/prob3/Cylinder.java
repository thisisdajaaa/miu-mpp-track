package lesson3.prob3;

public class Cylinder {
    private Double height;
    private Circle circle;

    public Cylinder(Double radius) {
        this.circle = new Circle(radius);
    }

    public Cylinder(Double radius, Double height) {
        this.circle = new Circle(radius);
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Double getVolume() {
        return Math.PI * (circle.getRadius() * circle.getRadius()) * height;
    }
}
