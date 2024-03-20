package final_exam.part2q1.model;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountNumber;
    private double balance;
    private List<Transaction> trxns = new ArrayList<>();
    private AccountType accountType;

    public Account(String an, AccountType accountType) {
        this.accountNumber = an;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTrxns() {
        return trxns;
    }

    public void addTransaction(Transaction trxn) {
        this.trxns.add(trxn);
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public String toString() {
        return "AccountNumber: " + this.accountNumber + " of AccountType: " + accountType + ", has a balance of $" + this.balance;
    }
}