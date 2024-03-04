package lesson4.prob4e;

public class SavingsAccount extends Account {
    private Double balance;
    private Double interestRate;
    private String accId;

    public SavingsAccount(String accId, Double interestRate, Double balance) {
        this.balance = balance;
        this.interestRate = interestRate;
        this.accId = accId;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
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
        return balance + (interestRate * balance);
    }
}
