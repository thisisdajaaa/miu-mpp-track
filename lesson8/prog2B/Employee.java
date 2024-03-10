package lesson8.prog2B;

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
		sb.append("" + salary+">");
		return sb.toString();
		
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return Objects.equals(salary, employee.salary) && Objects.equals(name, employee.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, salary);
	}
}

