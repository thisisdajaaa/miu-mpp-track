package lesson4.prob4c.models;

public class Salaried extends Employee{
    private Double salary;

    Salaried(Integer empId, Double salary) {
        super(empId);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public Double calcGrossPay(Integer month, Integer year) {
        return salary;
    }
}
