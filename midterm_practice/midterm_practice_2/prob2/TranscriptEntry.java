package midterm_practice.midterm_practice_2.prob2;

import java.time.LocalDate;

public class TranscriptEntry {
    private LocalDate dateTaken;
    private String grade;
    private Course course;

    TranscriptEntry(LocalDate dateTaken, String grade, Course course) {
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
}
