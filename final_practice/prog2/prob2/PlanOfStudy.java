package final_practice.prog2.prob2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlanOfStudy {
    List<Course> courses;
    public PlanOfStudy() {
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        if (courses == null)  courses = new ArrayList<>();
        courses.add(new Course(course.getCourseTitle(), course.getPrimaryProfessor()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanOfStudy that = (PlanOfStudy) o;
        return Objects.equals(courses, that.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courses);
    }
}
