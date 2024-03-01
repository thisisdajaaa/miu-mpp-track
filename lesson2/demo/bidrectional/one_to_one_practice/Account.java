package lesson2.demo.bidrectional.one_to_one_practice;

public class Account {
    private Integer accountId;
    private Customer owner;

    Account(Integer accountId, Customer owner) {
        this.accountId = accountId;
        this.owner = owner;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", owner=" + owner +
                '}';
    }
}
