package lesson2.demo.unidirectional.one_to_one.models;

public class Customer {
    private String name;

    private Account account;

    public Customer(String name, Integer id, Double balance) {
        this.name = name;
        this.account = new Account(id, balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", account=" + account.toString() +
                '}';
    }
}
