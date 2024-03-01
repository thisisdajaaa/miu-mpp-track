package lesson2.demo.many_to_many_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {
    private List<CourseGrade> courseGrades = new ArrayList<>();
    private String name;

    Course(String name) {
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
        Course course = (Course) o;
        return Objects.equals(courseGrades, course.courseGrades) && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseGrades, name);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
}
