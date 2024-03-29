package final_exam.part2q1.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerTestData {

    private static List<Address> addresses = new ArrayList<Address>();
    private static List<Customer> customers = new ArrayList<Customer>();

    static {
        addresses.add(new Address("101 Main street", "Houston", "TX", "70116"));
        addresses.add(new Address("1 Davis road", "Van Nuys", "CA", "92243"));
        addresses.add(new Address("52 Westland", "Santa Monica", "CA", "93341"));
        addresses.add(new Address("23 N. Platte", "Austin", "TX", "65352"));
        addresses.add(new Address("44 Dogwood Avenue", "Phoenix", "AZ", "85020"));

        /** Create Accounts and Transactions **/
        Account a0 = new Account("100000", AccountType.SAVINGS);
        a0.addTransaction(new Transaction(LocalDate.of(1987, 11, 24), 250.00));
        a0.addTransaction(new Transaction(LocalDate.of(2001, 1, 2), 1785.00));

        Account a1 = new Account("100001", AccountType.CHECKING);
        a1.addTransaction(new Transaction(LocalDate.of(1990, 12, 29), 2850.00));
        a1.addTransaction(new Transaction(LocalDate.of(2014, 10, 7), 165.00));
        a1.setBalance(1200.00);

        Account a2 = new Account("100002", AccountType.CHECKING);
        a2.addTransaction(new Transaction(LocalDate.of(1985, 3, 18), 2500.00));

        Account a3 = new Account("100003", AccountType.LOAN);
        a3.addTransaction(new Transaction(LocalDate.of(2014, 10, 7), 10000.00));
        a3.setBalance(10000.00);

        Account a4 = new Account("100004", AccountType.SAVINGS);
        a4.setBalance(5500.00);

        customers.add(new Customer("John Bell", addresses.get(0), a0));
        customers.add(new Customer("Anne Edwards", addresses.get(1), a1));
        customers.add(new Customer("Michael Heseltine", addresses.get(2), a2));
        customers.add(new Customer("Rebecca Ashcroft", addresses.get(3), a3));
        customers.add(new Customer("Andrew Lazaenby", addresses.get(4), a4));
    }

    public static List<Customer> getCustomers() {
        return customers;
    }

}
