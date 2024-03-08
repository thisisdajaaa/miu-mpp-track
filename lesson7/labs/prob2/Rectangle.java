package lesson7.labs.prob2;

public record Rectangle(double width, double length) implements Polygon {
	@Override
	public double computePerimeter() {
		return width * length;
	}

	@Override
	public double[] getSides() {
		return new double[]{width, length, length, width};
	}
}
