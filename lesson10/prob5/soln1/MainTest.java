package lesson10.prob5.soln1;

import lesson10.prob5.Employee;
import lesson10.prob5.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
    private Main main;
    private List<Employee> employees;

    @Before
    public void setUp() throws Exception {
        main = new Main();
        employees = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void testAsString() {
        employees.addAll(List.of(
                new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000))
        );

        String expected = "Alice Richards, Joe Stevens, John Sims, Steven Walters";
        assertEquals(expected, Main.asString(employees));
    }
}
