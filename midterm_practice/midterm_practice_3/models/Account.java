package midterm_practice_3.models;

import java.time.LocalDate;

public class Account {
    private String accountId;
    private LocalDate createdAt;
    private Customer customer;

    public Account(String accountId, Customer customer) {
        this.accountId = accountId;
        this.createdAt = LocalDate.now();
        this.customer = customer;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
