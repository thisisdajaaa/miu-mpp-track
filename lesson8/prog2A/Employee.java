package lesson8.prog2A;

import java.util.Objects;

public class Employee {
	String name;
	Integer salary;

	public Employee(String n, int s) {
		this.name = n;
		this.salary = s;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(name);
		sb.append(" salary: ");
		sb.append("").append(salary).append(">");
		return sb.toString();
		
	}
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		Employee e = (Employee)ob;
		return e.name.equals(name) && Objects.equals(e.salary, salary);
	}
}

