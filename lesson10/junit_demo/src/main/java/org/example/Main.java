package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var main = new Main();
        List<Employee> employees = Arrays.asList(new Employee(123000.0, "Das"), new Employee(1440.0, "GG"));
        System.out.println(main.getHighEarningEmployeeCount(employees));

    }

    public int getHighEarningEmployeeCount(List<Employee> employees) {
        return (int) employees.stream().filter(item -> item.getSalary() > 100000.0).count();
    }
}