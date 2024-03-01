package lesson2.demo.many_to_many_practice;

import java.util.Objects;

public class CourseGrade {
    private Course course;
    private Student student;
    private Integer grade;

    CourseGrade(Course course, Student student, Integer grade) {
        this.course = course;
        this.student = student;
        this.grade = grade;
    }

    CourseGrade(Integer grade) {
        this.grade = grade;
    }

    CourseGrade() {}

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseGrade that = (CourseGrade) o;
        return Objects.equals(course, that.course) && Objects.equals(student, that.student) && Objects.equals(grade, that.grade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, student, grade);
    }

    @Override
    public String toString() {
        return "CourseGrade{" +
                "grade=" + grade +
                '}';
    }
}
