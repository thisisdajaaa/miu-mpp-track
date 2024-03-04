package lesson4.prob4e;

public class CheckingAccount extends Account {
    private Double balance;
    private Double monthlyFee;
    private String accId;

    public CheckingAccount(String accId, Double monthlyFee, Double balance) {
        this.balance = balance;
        this.monthlyFee = monthlyFee;
        this.accId = accId;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setMonthlyFee(Double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public Double getMonthlyFee() {
        return monthlyFee;
    }

    public String getAccId() {
        return accId;
    }

    @Override
    public String getAccountId() {
        return accId;
    }

    @Override
    public Double getBalance() {
        return balance;
    }

    @Override
    public Double computeUpdatedBalance() {
        return balance - monthlyFee;
    }
}
