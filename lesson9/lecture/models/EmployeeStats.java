package lesson9.lecture.models;

public class EmployeeStats {
    private Integer totalAge;
    private Double totalSalary;
    private Integer totalNumberOfEmployees;

    public EmployeeStats(Integer totalAge, Double totalSalary, Integer totalNumberOfEmployees) {
        this.totalAge = totalAge;
        this.totalSalary = totalSalary;
        this.totalNumberOfEmployees = totalNumberOfEmployees;
    }

    public EmployeeStats(){}

    public Integer getTotalAge() {
        return totalAge;
    }

    public void setTotalAge(Integer totalAge) {
        this.totalAge = totalAge;
    }

    public Double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(Double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public Integer getTotalNumberOfEmployees() {
        return totalNumberOfEmployees;
    }

    public void setTotalNumberOfEmployees(Integer totalNumberOfEmployees) {
        this.totalNumberOfEmployees = totalNumberOfEmployees;
    }

    public EmployeeStats combine(EmployeeStats other) {
        this.totalAge += (this.totalAge + other.totalAge) / totalNumberOfEmployees;
        this.totalNumberOfEmployees += other.totalNumberOfEmployees;
        this.totalSalary += other.totalSalary;
        return this;
    }

    @Override
    public String toString() {
        return "EmployeeStats{" +
                "totalAge=" + totalAge +
                ", totalSalary=" + totalSalary +
                ", totalNumberOfEmployees=" + totalNumberOfEmployees +
                ", getAverageAge=" + getAverageAge() +
                ", getAverageSalary=" + getAverageSalary() +
                '}';
    }

    public double getAverageAge() {
        return totalNumberOfEmployees == 0 ? 0 : (double) totalAge / totalNumberOfEmployees;
    }

    public double getAverageSalary() {
        return totalNumberOfEmployees == 0 ? 0 : totalSalary / totalNumberOfEmployees;
    }
}
