package lesson2.demo.unidirectional.one_to_zero_one_practice;

public class Customer {
    private String name;
    private Account account;

    Customer(String name) {
        this.name = name;
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

    public void addAccount(Integer accountId) {
        if (account != null) throw new IllegalArgumentException("Account already exists");

        account = new Account(accountId);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", account=" + account +
                '}';
    }
}
