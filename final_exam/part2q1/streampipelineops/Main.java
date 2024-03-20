package final_exam.part2q1.streampipelineops;

import final_exam.part2q1.model.*;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

/**
 * USE STREAM PIPELINES TO SOLVE THE PROBLEMS GIVEN HERE
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Starting CS401-MPP Final Exam: Java Stream-Pipeline operations...");

        prob1();
        prob2();
        prob3();
        prob4();
        prob5();
    }

    /* Create a stream pipeline that does the following: */

    // (5 points)
    // Print the Names of only the Customers whose address is NOT in the state
    // of Arizona, "AZ" and whose AccountType is either CHECKING or SAVINGS
    // Expected result:
    // John Bell
    // Anne Edwards
    // Michael Heseltine
    public static void prob1() {
        //use this list
        List<Customer> customers = CustomerTestData.getCustomers();
        // Implement your code here
        customers.stream()
                .filter(x -> !x.getAddress().getState().equals("AZ"))
                .filter(x -> x.getAccount().getAccountType().equals(AccountType.CHECKING) || x.getAccount().getAccountType().equals(AccountType.SAVINGS))
                .map(Customer::getName)
                .toList()
                .forEach(System.out::println);
    }

    // (6 points)
    // Create a stream pipeline that obtains a list of
    // all customer/account pairs (i.e. use the CustomerAccountPair class)
    // extracted from the list of Customers for which
    // there is at least two transactions in the account.
    // Print the list sorted in descending order of the Customer Account balance.
    // Expected output:
    // (Anne Edwards, 100001, $1200.0)
    // (John Bell, 100000, $0.0)
    public static void prob2() {
        //use this list
        List<Customer> customers = CustomerTestData.getCustomers();
        // Implement your code here
        customers.stream()
                .filter(x -> x.getAccount().getTrxns().size() >= 2)
                .map(x -> new CustomerAccountPair(x.getName(), x.getAccount().getAccountNumber(), x.getAccount().getBalance()))
                .sorted(Comparator.comparing(CustomerAccountPair::getBalance, Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

    // (7 points)
    // Create a stream pipeline to print all the transactions for all
    // the customers' accounts where the AccountType is NOT LOAN,
    // displaying them, in sorted order, from the oldest
    // to the most recent and then by descending order of the transaction amounts.
    // (Note: there is an instance variable "amount" in Transaction)
    // Expected output:
    //	{Transaction done on: 1985-03-18, with value of:2500.0}

    //	{Transaction done on: 1987-11-24, with value of:250.0}

    //	{Transaction done on: 1990-12-29, with value of:2850.0}

    //	{Transaction done on: 2001-01-02, with value of:1785.0}

    //	{Transaction done on: 2014-10-07, with value of:165.0}
    public static void prob3() {
        //use this list
        List<Customer> customers = CustomerTestData.getCustomers();
        // Implement your code here
        customers.stream()
                .filter(x -> !x.getAccount().getAccountType().equals(AccountType.LOAN))
                .flatMap(x -> x.getAccount().getTrxns().stream())
                .sorted(Comparator.comparing(Transaction::getDate).thenComparing(Transaction::getAmount, Comparator.reverseOrder()))
                .toList()
                .forEach(System.out::println);
    }

    // (6 points)
    // Create a stream pipeline to find all transactions done on just
    // Accounts of AccountType CHECKING, before the year, 2010
    // and sort them in descending order of the transaction amount
    // (from high to low), and print them out to the console/screen.
    // (Note: there is an instance variable "amount" in Transaction)
    // Expected output:
    //	{Transaction done on: 1990-12-29, with value of:2850.0}

    //	{Transaction done on: 1985-03-18, with value of:2500.0}
    public static void prob4() {
        //use this list
        List<Customer> customers = CustomerTestData.getCustomers();
        // Implement your code here
        customers.stream()
                .filter(x -> x.getAccount().getAccountType().equals(AccountType.CHECKING))
                .flatMap(x -> x.getAccount().getTrxns().stream())
                .filter(x -> x.getDate().isBefore(LocalDate.of(2010, 1, 1)))
                .forEach(System.out::println);
    }

    // (6 points)
    // Create a stream pipeline to find all Accounts where the AccountType
    // is NOT LOAN and with balance less than $6000 and having
    // at most 1 transaction.
    // Sort them in ascending order of the Balance.
    // And print the result to console/screen.
    // Expected output:
    //	AccountNumber: 100002 of AccountType: CHECKING, has a balance of $0.0
    //	AccountNumber: 100004 of AccountType: SAVINGS, has a balance of $5500.0
    public static void prob5() {
        //Use this list
        List<Customer> customers = CustomerTestData.getCustomers();
        // Implement your code here

        customers.stream()
                .filter(x -> !x.getAccount().getAccountType().equals(AccountType.LOAN))
                .filter(x -> x.getAccount().getTrxns().size() < 2)
                .sorted(Comparator.comparing(x -> x.getAccount().getBalance()))
                .map(Customer::getAccount)
                .forEach(System.out::println);
    }
}
