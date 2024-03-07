package midterm_practice.midterm_practice_4.models;

public class Employee {
    private String name;
    private JobPosition jobPosition;

    Employee(String name, String jobPositionTitle) {
        this.name = name;
        this.jobPosition = new JobPosition(jobPositionTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name +
                '}';
    }
}
