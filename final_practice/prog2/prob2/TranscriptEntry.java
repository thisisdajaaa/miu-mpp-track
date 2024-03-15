package final_practice.prog2.prob2;

import java.time.LocalDate;
import java.util.Objects;

public class TranscriptEntry {
    private LocalDate dateTaken;
    private String grade;
    private Course course;

    public TranscriptEntry(LocalDate dateTaken, String grade, Course course) {
        this.dateTaken = dateTaken;
        this.grade = grade;
        this.course = course;
    }

    public LocalDate getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(LocalDate dateTaken) {
        this.dateTaken = dateTaken;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TranscriptEntry that = (TranscriptEntry) o;
        return Objects.equals(dateTaken, that.dateTaken) && Objects.equals(grade, that.grade) && Objects.equals(course, that.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dateTaken, grade, course);
    }
}
