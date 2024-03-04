package lesson5.prob2;

import lesson5.prob2.interfaces.IShape;
import lesson5.prob2.models.Circle;
import lesson5.prob2.models.Rectangle;
import lesson5.prob2.models.Triangle;

public class Main {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[]{
                new Circle(1.1),
                new Rectangle(12.0, 13.0),
                new Triangle(12.0, 12.0)
        };

        double area = 0.0;

        for (IShape shape : shapes) {
            area += shape.computeArea();
        }

        System.out.printf("Sum of Areas: %.2f", area);
    }
}
