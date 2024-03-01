package lesson2.demo.many_to_many;

public class CourseLike {
    private Integer rating;
    private Course course;
    private Student student;

    CourseLike(Integer rating, Course course, Student student) {
        this.rating = rating;
        this.course = course;
        this.student = student;
    }

    CourseLike() {}

    CourseLike(Integer rating) {
        this.rating = rating;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

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

    @Override
    public String toString() {
        return "CourseLike{" +
                "rating=" + rating +
                ", course=" + course.getName() +
                ", student=" + student.getName() +
                '}';
    }
}
