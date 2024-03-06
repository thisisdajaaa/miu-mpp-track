package midterm_practice_4.models;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    private List<JobPosition> jobPositions = new ArrayList<>();

    Department(String name, String location, String jobPositionTitle) {
        this.name = name;
        this.location = location;
        addJobPosition(jobPositionTitle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<JobPosition> getJobPositions() {
        return jobPositions;
    }

    public void setJobPositions(List<JobPosition> jobPositions) {
        this.jobPositions = jobPositions;
    }

    public void addJobPosition(String title) {
        jobPositions.add(new JobPosition(title));
    }

    public JobPosition getJobPosition(String name) {
        for (JobPosition jobPosition : jobPositions) {
            if (jobPosition.getTitle().equals(name)) return jobPosition;
        }

        return null;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
