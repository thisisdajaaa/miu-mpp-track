package final_exam.part2q1.model;

public class CustomerAccountPair {

    private String customerName;
    private String accountNumber;
    private double balance;

    public CustomerAccountPair(String n, String an, double bal) {
        customerName = n;
        accountNumber = an;
        balance = bal;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "(" + customerName + ", " + accountNumber + ", $" + balance + ")";
    }
}
