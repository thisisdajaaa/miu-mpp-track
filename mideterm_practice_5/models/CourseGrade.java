package mideterm_practice_5.models;

public class CourseGrade {
    private int grade;
    private Student student;
    private Course course;

    public CourseGrade(int grade, Student student, Course course) {
        this.grade = grade;
        this.student = student;
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "CourseGrade{" +
                "grade=" + grade +
                '}';
    }
}
