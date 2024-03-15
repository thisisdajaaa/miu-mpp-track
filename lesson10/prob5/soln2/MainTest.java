package lesson10.prob5.soln2;

import lesson10.prob5.Employee;
import lesson10.prob5.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    Main main;
    Employee employee;

    @Before
    public void setUp() throws Exception {
        main = new Main();
        employee = new Employee("Alice", "Richards", 101000);
    }

    @After
    public void tearDown() throws Exception {}

    @Test
    public void getSalaryGreaterThan() {
        assertTrue(Main.salaryGreaterThan100000(employee));
    }

    @Test
    public void getLastNameAfterM() {
        assertTrue(Main.lastNameAfterM(employee));
    }

    @Test
    public void getFullName() {
        assertEquals(Main.fullName(employee), "Alice Richards");
    }
}
