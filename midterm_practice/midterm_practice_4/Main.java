package midterm_practice.midterm_practice_4;

import midterm_practice.midterm_practice_4.models.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Admin admin = ModelFactory.createAdmin("Google", "RND", "ASdzc", "Dev 1", "Arthur", 2000.0, LocalDate.now());

        Company company = admin.getCompany("Google");
        Department department = company.getDepartment("RND");

        department.addJobPosition("Dev 2");

        admin.addEmployee("Beer", "Dev 2", 3000.0, LocalDate.now());

        JobPosition jobPosition1 = department.getJobPosition("Dev 1");
        JobPosition jobPosition2 = department.getJobPosition("Dev 2");

        Employee employee1 = admin.getEmployee("Arthur");
        Employee employee2 = admin.getEmployee("Beer");

        jobPosition1.setEmployee(employee1);
        jobPosition2.setEmployee(employee2);


        System.out.println(admin.getEmployeeReports().toString());
    }
}
