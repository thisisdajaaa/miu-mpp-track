package lesson2.demo.unidirectional.one_to_one_practice;

public class Account {
    private Integer accountNum;

    Account(Integer accountNum) {
        this.accountNum = accountNum;
    }

    public Integer getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(Integer accountNum) {
        this.accountNum = accountNum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNum=" + accountNum +
                '}';
    }
}
