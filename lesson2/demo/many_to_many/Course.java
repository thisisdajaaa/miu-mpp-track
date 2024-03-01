package lesson2.demo.many_to_many;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {
    private String name;

    private List<CourseLike> courseLikes = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        StudentCourseFactory.addCourseToStudent(this, student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) && Objects.equals(courseLikes, course.courseLikes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, courseLikes);
    }

    public List<CourseLike> getCourseLikes() {
        return courseLikes;
    }

    public void setCourseLikes(List<CourseLike> courseLikes) {
        this.courseLikes = courseLikes;
    }
}
