package midterm_practice.midterm_practice_4.models;

import java.time.LocalDate;

public class EmployeeReport {
    private double salary;
    private LocalDate hireDate;

    EmployeeReport(double salary, LocalDate hireDate) {
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "EmployeeReport{" +
                "salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }
}
