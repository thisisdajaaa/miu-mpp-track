package lesson4.prob4e;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
	private List<Account> accountList;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	public void addAccount(Account acct) {
		if (accountList == null) accountList = new ArrayList<>();

		accountList.add(acct);
	}

	public double computeUpdatedBalanceSum() {
		Double totalSum = 0.0;

		for (Account account: accountList ) {
			totalSum += account.computeUpdatedBalance();
		}

		return totalSum;
	}
}
