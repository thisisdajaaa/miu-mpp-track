package lesson2.demo.unidirectional.one_to_zero_one_practice;

public class Account {
    private Integer accountId;

    Account(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                '}';
    }
}
