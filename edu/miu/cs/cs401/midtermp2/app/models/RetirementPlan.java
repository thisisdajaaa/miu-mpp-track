package edu.miu.cs.cs401.midtermp2.app.models;

import java.time.LocalDate;

public class RetirementPlan {
    private String referenceNumber;
    private LocalDate enrollmentDate;
    private LocalDate retirementDate;
    private double monthlyContribution;
    private Employee employee;

    RetirementPlan(String referenceNumber, LocalDate enrollmentDate, LocalDate retirementDate, double monthlyContribution, Employee employee) {
        if (referenceNumber == null || enrollmentDate == null || retirementDate == null || employee == null) throw new IllegalArgumentException("Missing argument/s!");

        this.referenceNumber = referenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.retirementDate = retirementDate;
        this.monthlyContribution = monthlyContribution;
        this.employee = employee;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public LocalDate getRetirementDate() {
        return retirementDate;
    }

    public double getMonthlyContribution() {
        return monthlyContribution;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public void setRetirementDate(LocalDate retirementDate) {
        this.retirementDate = retirementDate;
    }

    public void setMonthlyContribution(double monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "RetirementPlan{" +
                "referenceNumber='" + referenceNumber + '\'' +
                ", enrollmentDate=" + enrollmentDate +
                ", retirementDate=" + retirementDate +
                ", monthlyContribution=" + monthlyContribution +
                '}';
    }
}
