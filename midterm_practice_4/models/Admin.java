package midterm_practice_4.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Company> companies = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<EmployeeReport> employeeReports = new ArrayList<>();

    Admin(String compName, String deptName, String location, String jobPositionTitle, String empName, double salary, LocalDate hireDate) {
        addCompany(compName, deptName, location, jobPositionTitle);
        addEmployee(empName, jobPositionTitle, salary, hireDate);
    }

    public List<Company> getCompanies() {
        return companies;
    }

    public void setCompanies(List<Company> companies) {
        this.companies = companies;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<EmployeeReport> getEmployeeReports() {
        return employeeReports;
    }

    public void setEmployeeReports(List<EmployeeReport> employeeReports) {
        this.employeeReports = employeeReports;
    }

    public void addCompany(String name, String deptName, String location, String jobPositionTitle) {
        companies.add(new Company(name, deptName, location, jobPositionTitle));
    }

    public void addEmployee(String name, String jobPositionTitle, double salary, LocalDate hireDate) {
        employees.add(new Employee(name, jobPositionTitle));
        employeeReports.add(new EmployeeReport(salary, hireDate));
    }


    public Company getCompany(String name) {
        for (Company company : companies) {
            if (company.getName().equals(name)) return company;
        }

        return null;
    }

    public Employee getEmployee(String name) {
        for (Employee employee : employees) {
            if (employee.getName().equals(name)) return employee;
        }

        return null;
    }
}
