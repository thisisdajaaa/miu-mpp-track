package lesson3.prob4;

public class Driver {

    public static void main(String[] args) {
        Address[] addresses = {
                new Address("1 St.", "Los Angeles", "CA", "12345"),
                new Address("2 St.", "Los Angeles", "CA", "12345"),
                new Address("3 St.", "Los Angeles", "CA", "12345")
        };

        Property[] properties = {
                new House(3200.0, addresses[0]),
                new Condominium(3, addresses[1]),
                new Trailer(addresses[2])
        };

        double totalRent = Admin.computeTotalRent(properties);
        System.out.println(totalRent);
    }
}
