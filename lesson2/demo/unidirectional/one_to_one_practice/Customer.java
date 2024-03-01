package lesson2.demo.unidirectional.one_to_one_practice;

public class Customer {
    private String name;

    private Account account;

    Customer(String name, Integer accountNum) {
        this.name = name;
        this.account = new Account(accountNum);
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
                ", account=" + account +
                '}';
    }
}
