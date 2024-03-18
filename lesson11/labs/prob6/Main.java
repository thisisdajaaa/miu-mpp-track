package lesson11.labs.prob6;
import java.util.*;
import java.util.function.*;


public class Main {

    //simple version
	public static boolean contains1(List<String> list, String s) {
		for(String x: list) {
			if(x == null && s == null) return true;
			if(s == null || x == null) continue;
			if(x.equals(s)) return true;
		}
		return false;	
	}

	public static <T> boolean contains(List<? extends T> list, T target, BiPredicate<? super T,? super T> isEqual) {
		for (T element : list) {
			if (isEqual.test(element, target)) return true;
		}

		return false;
	}
	
	//your generalization -- should work with lists of
	//Employees, Accounts. You may not override equals
	//in the data-holder classes (like Employee, Account, etc)
	//so you need to find another way to deal with the fact
	//that these classes do not have their own equals methods.
	
	//public static boolean contains2(List<T> list ... )
	
	public static void test1() {
		List<String> list = Arrays.asList("Bob", "Joe", "Tom");
		BiPredicate<String, String> predicate = String::equals;
		boolean result = Main.contains(list, "Tom", String::equals);
		System.out.println(result);
	}
	
	public static void test2() {
		List<Employee> list = new ArrayList<>();
		Employee tom = new Employee(1003, "Tom", 60000);
		Employee potter = new Employee(1006, "potter", 80000);
		list.add(tom);
		list.add(new Employee(1002, "Harry", 70000));
		list.add(new Employee(1001, "Joe", 50000));
		boolean result = Main.contains(list, tom, (Employee e1, Employee e2) -> e1.getId() == e2.getId());
		System.out.println(result);

	}
	
	public static void test3() {
		List<Manager> list = new ArrayList<>();
		Manager tom = new Manager(1003, "Tom", 60000, 700);
		Manager potter = new Manager(1008, "potter", 90000, 90);
		list.add(tom);
		list.add(new Manager(1002, "Harry", 70000, 400));
		list.add(new Manager(1001, "Joe", 50000, 500));
		boolean result = Main.contains(list, tom, (Manager e1, Manager e2) -> e1.getName().equals(e2.getName()));
		System.out.println(result);
		
	}
	
	
	
	public static void test4() {
		List<CheckingAccount> list = new ArrayList<>();
		CheckingAccount checkingAccount1 = new CheckingAccount(1001, 25.00);
		CheckingAccount checkingAccount2 = new CheckingAccount(1004, 45.00);
		list.add(checkingAccount1);
		list.add(new CheckingAccount(1002, 35.00));
		list.add(new CheckingAccount(1003, 125.00));
		boolean result = Main.contains(list, checkingAccount1, (CheckingAccount c1, CheckingAccount c2) -> c1.getAcctId() == c2.getAcctId());
		System.out.println(result);

		List<? extends Integer> aa = new ArrayList<>();
		List<? extends Number> zz = aa;
		
	}
	
	
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
	}	
		
		
	
}
