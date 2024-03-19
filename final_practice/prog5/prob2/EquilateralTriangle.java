package final_practice.prog5.prob2;

public class EquilateralTriangle implements Polygon {
    final private Double side;

    public EquilateralTriangle(Double side) {
        this.side = side;
    }


    @Override
    public double[] getSides() {
        return new double[]{side, side, side};
    }
}
