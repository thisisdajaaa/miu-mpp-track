package lesson4.prob4c.models;

public class Hourly extends Employee {
    private Double hourlyWage;
    private Double hoursPerWeek;

    Hourly(Integer empId, Double hourlyWage, Double hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    public Double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(Double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public Double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(Double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public Double calcGrossPay(Integer month, Integer year) {
        return hourlyWage * hoursPerWeek * 4;
    }
}
