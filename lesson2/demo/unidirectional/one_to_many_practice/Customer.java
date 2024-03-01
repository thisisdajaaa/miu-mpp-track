package lesson2.demo.unidirectional.one_to_many_practice;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Account> accountList;
    private String name;

    Customer(String name, Integer accountId) {
        this.accountList = new ArrayList<>(List.of(new Account(accountId)));
        this.name = name;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<Account> accountList) {
        this.accountList = accountList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addAccount(Integer accountId) {
        if (accountId == null) throw new NullPointerException("Account ID is required");

        accountList.add(new Account(accountId));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "accountList=" + accountList +
                ", name='" + name + '\'' +
                '}';
    }
}
