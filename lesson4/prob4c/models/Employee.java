package lesson4.prob4c.models;

public abstract class Employee {
    private Integer empId;

    Employee(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public void print() {
        System.out.printf("Employee ID: %s", empId);
    }

    public abstract Double calcGrossPay(Integer month, Integer year);

    public Paycheck calcCompensation(Integer month, Integer year) {
        double grossPay = this.calcGrossPay(month, year);
        return new Paycheck(grossPay);
    }
}
