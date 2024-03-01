package quiz1.models;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private Supplier supplier;

    Address(String street, String city, String state, String zipCode, Supplier supplier) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.supplier = supplier;
    }

    Address(){}

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipcode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
