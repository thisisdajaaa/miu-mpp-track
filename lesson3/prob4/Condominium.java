package lesson3.prob4;

public class Condominium extends Property {
    private Integer numOfFloors;
    private Address address;

    public Condominium(Integer numOfFloors, Address address) {
        this.numOfFloors = numOfFloors;
        this.address = address;
    }

    public Integer getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(Integer numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public double computeRent() {
        return 400 * numOfFloors;
    }
}
