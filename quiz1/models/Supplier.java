package quiz1.models;

public class Supplier {
    private String supplierNumber;
    private String supplierName;
    private String contactPhoneNumber;
    private Address address;

    Supplier(String supplierNumber, String supplierName, String contactPhoneNumber, String street, String city, String state, String zipCode) {
        this.supplierNumber = supplierNumber;
        this.supplierName = supplierName;
        this.contactPhoneNumber = contactPhoneNumber;
        this.address = new Address(street, city, state, zipCode, this);
    }

    Supplier(){}

    public String getSupplierNumber() {
        return supplierNumber;
    }

    public void setSupplierNumber(String supplierNumber) {
        this.supplierNumber = supplierNumber;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierNumber='" + supplierNumber + '\'' +
                ", supplierName='" + supplierName + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", address=" + address +
                '}';
    }
}
