package final_practice.prog2.prob2;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private PlanOfStudy planOfStudy;
    private Transcript transcript;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        planOfStudy = new PlanOfStudy();
        transcript = new Transcript();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PlanOfStudy getPlanOfStudy() {
        return planOfStudy;
    }

    public void setPlanOfStudy(PlanOfStudy planOfStudy) {
        this.planOfStudy = planOfStudy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(planOfStudy, student.planOfStudy) && Objects.equals(transcript, student.transcript);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, planOfStudy, transcript);
    }
}
