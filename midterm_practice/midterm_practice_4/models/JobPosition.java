package midterm_practice_4.models;

public class JobPosition {
    private String title;

    private Employee employee;

    JobPosition(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "JobPosition{" +
                "title='" + title + '\'' +
                '}';
    }
}
