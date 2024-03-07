package midterm_exam.prob1.models;

import java.time.LocalDate;

public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private double yearlySalary;
    private RetirementPlan retirementPlan;

    Employee(long employeeId, String firstName, String lastName, double yearlySalary, String referenceNumber, LocalDate enrollmentDate, LocalDate retirementDate, double monthlyContribution) {
        if (firstName == null || lastName == null || referenceNumber == null || enrollmentDate == null || retirementDate == null)
            throw new IllegalArgumentException("Missing argument/s!");

        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearlySalary = yearlySalary;
        this.retirementPlan = new RetirementPlan(referenceNumber, enrollmentDate, retirementDate, monthlyContribution, this);
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public void setRetirementPlan(RetirementPlan retirementPlan) {
        this.retirementPlan = retirementPlan;
    }

    public RetirementPlan getRetirementPlan() {
        return retirementPlan;
    }

    public Boolean isUpcomingRetiree() {
        LocalDate retirementDate = this.retirementPlan.getRetirementDate();
        LocalDate todayDate = LocalDate.now();
        LocalDate nextMonthDate = todayDate.plusMonths(1);

        return retirementDate.getMonth().equals(nextMonthDate.getMonth()) && retirementDate.getYear() == nextMonthDate.getYear();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearlySalary=" + yearlySalary +
                '}';
    }
}
