package mideterm_practice_5.models;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<CourseGrade> courseGrades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseGrade> getCourseGrades() {
        return courseGrades;
    }

    public void setCourseGrades(List<CourseGrade> courseGrades) {
        this.courseGrades = courseGrades;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
