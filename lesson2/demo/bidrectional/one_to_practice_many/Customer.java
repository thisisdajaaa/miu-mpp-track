package lesson2.demo.bidrectional.one_to_practice_many;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private List<Account> accountList;

    private String name;

    Customer(String name) {
        this.name = name;
        this.accountList = new ArrayList<>();
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

    public void addAccount(Integer id) {
       if (id == null) throw new IllegalArgumentException("ID is required");

       accountList.add(new Account(id, this));
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                '}';
    }
}
