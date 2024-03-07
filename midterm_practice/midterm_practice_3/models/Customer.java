package midterm_practice.midterm_practice_3.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private String customerId;
    private Account account;
    private List<CustomerReservation> customerReservations = new ArrayList<>();

    public Customer(String customerId, String name, LocalDate dateOfBirth, String accountId) {
        super(name, dateOfBirth);
        this.customerId = customerId;
        this.account = new Account(accountId, this);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<CustomerReservation> getCustomerReservations() {
        return customerReservations;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setCustomerReservations(List<CustomerReservation> customerReservations) {
        this.customerReservations = customerReservations;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId +
                '}';
    }
}
