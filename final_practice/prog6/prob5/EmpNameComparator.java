package final_practice.prog6.prob5;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.equals(e2)) return 0;
        if (e1.getName().compareTo(e2.getName()) > 0) return 1;
        return -1;
    }
}
