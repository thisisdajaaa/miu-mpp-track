package midterm_practice.midterm_practice_2.prob2;

public class Student {
    private String firstName;
    private String lastName;
    private PlanOfStudy planOfStudy;
    private Transcript transcript;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.planOfStudy = new PlanOfStudy();
        this.transcript = new Transcript();
    }

    public String getFirstName() {
        return firstName;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void setTranscript(Transcript transcript) {
        this.transcript = transcript;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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
}
