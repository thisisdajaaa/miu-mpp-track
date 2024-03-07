package midterm_exam.prob1;

import midterm_exam.prob1.models.Employee;
import midterm_exam.prob1.models.EmployeeRetirementFactory;

import java.time.LocalDate;

public class EmployeesApp {
    public static void main(String[] args) {
        Employee[] employeeList = new Employee[]{
                EmployeeRetirementFactory.createEmployeeWithRetirement(
                        1L,
                        "Daniel",
                        "Agar",
                        105945.50,
                        "EX1089",
                        LocalDate.of(2023, 8, 13),
                        LocalDate.of(2024, 5, 13),
                        100.0),
                EmployeeRetirementFactory.createEmployeeWithRetirement(
                        2L,
                        "Benard",
                        "Shaw",
                        197750.00,
                        "SM1104",
                        LocalDate.of(2023, 8, 21),
                        LocalDate.of(2024, 5, 21),
                        950.0),
                EmployeeRetirementFactory.createEmployeeWithRetirement(
                        3L,
                        "Carly",
                        "DeFiori",
                        842000.75,
                        "SM2307",
                        LocalDate.of(2020, 5, 16),
                        LocalDate.of(2024, 5, 4),
                        1555.50),
                EmployeeRetirementFactory.createEmployeeWithRetirement(
                        4,
                        "Wesley",
                        "Schneider",
                        74500.00,
                        "SM4133",
                        LocalDate.of(2019, 12, 1),
                        LocalDate.of(2024, 4, 1),
                        85.00)
        };

        printUpcomingRetirees(employeeList);

    }

    public static void printUpcomingRetirees(Employee[] employeeList) {
        for (Employee employee : employeeList) {
            if (employee.isUpcomingRetiree()) {
                System.out.printf(
                        "{EmpID: %s, PlanReferenceNumber: %s, FirstName: %s, LastName: %s, YearlySalary: $ %,.2f, EnrollmentDate: %s, RetirementDate: %s, MonthlyContributions: $ %,.2f} \n",
                        employee.getEmployeeId(),
                        employee.getRetirementPlan().getReferenceNumber(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getYearlySalary(),
                        employee.getRetirementPlan().getEnrollmentDate(),
                        employee.getRetirementPlan().getRetirementDate(),
                        employee.getRetirementPlan().getMonthlyContribution()
                );
            }
        }
    }
}
