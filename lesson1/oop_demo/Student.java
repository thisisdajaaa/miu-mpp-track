package lesson1.oop_demo;

import java.time.LocalDate;

public class Student extends Person {
    private Integer id;

    public Student(String name, LocalDate dateOfBirth, Integer id) {
        super(name, dateOfBirth);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getInfo() {
        return "Person{" +
                "name='" + this.getName() + '\'' +
                ", dateOfBirth=" + this.getDateOfBirth() +
                ", studentId=" + this.getId() +
                '}';
    }
}
