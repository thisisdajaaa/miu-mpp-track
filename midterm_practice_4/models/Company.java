package midterm_practice_4.models;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private List<Department> departments = new ArrayList<>();

    Company(String name, String deptName, String location, String jobPositionTitle) {
        this.name = name;
        addDepartment(deptName, location, jobPositionTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(String name, String location, String jobPositionTitle) {
        departments.add(new Department(name, location, jobPositionTitle));
    }

    public Department getDepartment(String name) {
        for (Department department : departments) {
            if (department.getName().equals(name)) return department;
        }

        return null;
    }

    @Override
    public String toString() {
        return name;
    }
}
