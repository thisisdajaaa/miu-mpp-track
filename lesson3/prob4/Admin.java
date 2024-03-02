package lesson3.prob4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0.0;

		for (Property property: properties) {
			totalRent += property.computeRent();
		}

		return totalRent;
	}
}
