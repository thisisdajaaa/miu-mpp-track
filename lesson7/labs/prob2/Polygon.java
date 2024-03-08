package lesson7.labs.prob2;

public interface Polygon extends ClosedCurve {
    double[] getSides();

    default double computePerimeter() {
        double totalPerimeter = 0.0;

        for (double side : getSides()) {
            totalPerimeter += side;
        }

        return totalPerimeter;
    }
}
