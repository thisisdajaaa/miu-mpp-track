package lesson7.labs.prob2;

public class Ellipse implements ClosedCurve {
    private double axis;
    private double ellipticIntegral;

    public Ellipse(double axis, double ellipticIntegral) {
        this.axis = axis;
        this.ellipticIntegral = ellipticIntegral;
    }

    public double getAxis() {
        return axis;
    }

    public void setAxis(double axis) {
        this.axis = axis;
    }

    public double getEllipticIntegral() {
        return ellipticIntegral;
    }

    public void setEllipticIntegral(double ellipticIntegral) {
        this.ellipticIntegral = ellipticIntegral;
    }

    @Override
    public double computePerimeter() {
        return 4 * axis * ellipticIntegral;
    }
}
