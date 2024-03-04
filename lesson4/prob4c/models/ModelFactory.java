package lesson4.prob4c.models;

public class ModelFactory {
    public static Commissioned createCommissionedEmployee(Integer empId, Double commission, Double baseSalary) {
        return new Commissioned(empId, commission, baseSalary);
    }

    public static Hourly createHourlyEmployee(Integer empId, Double hourlyWage, Double hoursPerWeek) {
        return new Hourly(empId, hourlyWage, hoursPerWeek);
    }

    public static Salaried createSalariedEmployee(Integer empId,Double salary) {
        return new Salaried(empId, salary);
    }
}
