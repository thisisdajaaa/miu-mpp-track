package lesson2.demo.many_to_many_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private List<CourseGrade> courseGrades = new ArrayList<>();
    private String name;

    Student(String name) {
        this.name = name;
    }

    public List<CourseGrade> getCourseGrades() {
        return courseGrades;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(courseGrades, student.courseGrades) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseGrades, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
