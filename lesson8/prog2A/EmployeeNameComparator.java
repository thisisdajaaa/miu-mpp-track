package lesson8.prog2A;

import java.util.Comparator;

/* A functor, but not a closure */
public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {

        return e1.name.compareTo(e2.name) != 0 ? e1.name.compareTo(e2.name) : e1.salary.compareTo(e2.salary);
    }
}
