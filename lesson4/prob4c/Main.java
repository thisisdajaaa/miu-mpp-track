package lesson4.prob4c;

import lesson4.prob4c.models.Commissioned;
import lesson4.prob4c.models.Hourly;
import lesson4.prob4c.models.ModelFactory;
import lesson4.prob4c.models.Salaried;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Salaried salaried = ModelFactory.createSalariedEmployee(1, 7000.0);

        Hourly hourly = ModelFactory.createHourlyEmployee(2, 35.5, 40.0);

        Commissioned commissioned = ModelFactory.createCommissionedEmployee(3, 0.2, 3000.0);
        commissioned.addOrder(1, LocalDate.of(2024, 3, 12), 12.0);
        commissioned.addOrder(2, LocalDate.of(2024, 3, 11), 13.0);
        commissioned.addOrder(3, LocalDate.of(2024, 3, 13), 14.0);
        commissioned.addOrder(3, LocalDate.of(2024, 2, 13), 15.0);

        System.out.printf("Salaried employee compensation: $%,.2f \n", salaried.calcCompensation(3, 2024).getNetPay());
        System.out.printf("Hourly employee compensation: $%,.2f \n", hourly.calcCompensation(3, 2024).getNetPay());
        System.out.printf("Commissioned employee compensation: $%,.2f \n", commissioned.calcCompensation(3, 2024).getNetPay());

    }
}
