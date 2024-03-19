package final_practice.prog5.prob2;

public interface Polygon extends ClosedCurve {
    double[] getSides();

    default double computePerimeter() {
        int total = 0;

        for (double side : getSides()) {
            total += side;
        }

        return total;
    }
}
