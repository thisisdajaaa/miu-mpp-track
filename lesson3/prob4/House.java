package lesson3.prob4;

public class House extends Property{
    private Double lotSize;
    private Address address;

    public House(Double lotSize, Address address) {
        this.lotSize = lotSize;
        this.address = address;
    }

    public Double getLotSize() {
        return lotSize;
    }

    public void setLotSize(Double lotSize) {
        this.lotSize = lotSize;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public double computeRent() {
        return 0.1 * lotSize;
    }
}
