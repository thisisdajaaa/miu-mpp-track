package final_practice.prog2.prob2;

import java.util.Objects;

public class Course {
    private String courseTitle;
    private String primaryProfessor;

    public Course(String courseTitle, String primaryProfessor) {
        this.courseTitle = courseTitle;
        this.primaryProfessor = primaryProfessor;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getPrimaryProfessor() {
        return primaryProfessor;
    }

    public void setPrimaryProfessor(String primaryProfessor) {
        this.primaryProfessor = primaryProfessor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseTitle, course.courseTitle) && Objects.equals(primaryProfessor, course.primaryProfessor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseTitle, primaryProfessor);
    }

    @Override
    public String toString() {
        return courseTitle + ": " + primaryProfessor;
    }
}
