package lesson2.demo.unidirectional.one_to_zero_one.models;

public class Customer {
    private String name;

    private ShoppingCart account;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShoppingCart getAccount() {
        return account;
    }

    public void setAccount(ShoppingCart account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}