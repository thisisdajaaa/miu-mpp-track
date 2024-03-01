package lesson2.demo.many_to_many;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;

    private List<CourseLike> courseLikes = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseLike> getCourseLikes() {
        return courseLikes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(courseLikes, student.courseLikes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courseLikes);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
