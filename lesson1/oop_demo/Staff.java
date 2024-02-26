package lesson1.oop_demo;

import java.time.LocalDate;

public class Staff extends Person {
    private Integer id;
    private Integer salary;

    public Staff(String name, LocalDate dateOfBirth, Integer id, Integer salary) {
        super(name, dateOfBirth);
        this.id = id;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return "Staff{" +
                "name='" + this.getName() + '\'' +
                ", dateOfBirth=" + this.getDateOfBirth() +
                ", staffId=" + this.getId() +
                '}';
    }
}
