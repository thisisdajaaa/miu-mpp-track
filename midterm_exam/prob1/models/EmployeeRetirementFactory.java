package edu.miu.cs.cs401.midtermp2.app.models;

import java.time.LocalDate;

public class EmployeeRetirementFactory {
    public static Employee createEmployeeWithRetirement(
            long employeeId,
            String firstName,
            String lastName,
            double yearlySalary,
            String referenceNumber,
            LocalDate enrollmentDate,
            LocalDate retirementDate,
            double monthlyContribution
    ) {
        return new Employee(employeeId, firstName, lastName, yearlySalary, referenceNumber, enrollmentDate, retirementDate, monthlyContribution);
    }
}
