package final_practice.prog5.prob2;

public class Ellipse implements ClosedCurve {
    private final Double axis;
    private final Double ellipticalIntegral;

    public Ellipse(Double axis, Double ellipticalIntegral) {
        this.axis = axis;
        this.ellipticalIntegral = ellipticalIntegral;
    }


    @Override
    public double computePerimeter() {
        return 4 * axis * ellipticalIntegral;
    }
}
