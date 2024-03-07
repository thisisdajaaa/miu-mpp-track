package midterm_practice.midterm_practice_4.models;

import java.time.LocalDate;

public class ModelFactory {
    public static Admin createAdmin(String compName, String deptName, String location, String jobPositionTitle, String empName, double salary, LocalDate hireDate) {
        return new Admin(compName, deptName, location, jobPositionTitle, empName, salary, hireDate);
    }
}
