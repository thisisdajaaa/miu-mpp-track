package lesson3.prob4;

public class Trailer extends Property{
    private final static double RENT = 500.0;
    private Address address;

    public Trailer(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public double computeRent() {
        return RENT;
    }
}
