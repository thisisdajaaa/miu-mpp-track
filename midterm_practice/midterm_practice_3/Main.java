package midterm_practice_3;

import midterm_practice_3.constants.CarPosition;
import midterm_practice_3.constants.VehicleStatus;
import midterm_practice_3.models.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        var car = new Car(123.00, "Nissan", VehicleStatus.AVAILABLE, CarPosition.LEFT);
        var motorcycle = new Motorcycle(124.44, "Kawasaki", VehicleStatus.AVAILABLE, 123);
        var van = new Van(444.44, "RV", VehicleStatus.AVAILABLE, false);

        var staff = new Staff("Staff1", LocalDate.of(2002, 12, 12), "123AD");
        staff.addVehicle(car);
        staff.addVehicle(motorcycle);
        staff.addVehicle(van);

        var customer1 = CustomerReservationFactory.createCustomer("1", "Cust1", LocalDate.of(1994, 12, 1), "123asdzz");
        var customer2 = CustomerReservationFactory.createCustomer("2","Cust2", LocalDate.of(1974, 3, 31), "123asdzz");

        var reservation1 = CustomerReservationFactory.createReservation(LocalDate.of(2024, 3, 4), LocalDate.of(2024, 3, 12), car);
        car.setVehicleStatus(VehicleStatus.RENTED);

        var reservation2 = CustomerReservationFactory.createReservation(LocalDate.of(2024, 3, 3), LocalDate.of(2024, 3, 9), van);
        van.setVehicleStatus(VehicleStatus.RENTED);

        var reservation3 = CustomerReservationFactory.createReservation(LocalDate.of(2024, 3, 12), LocalDate.of(2024, 3, 11), motorcycle);
        motorcycle.setVehicleStatus(VehicleStatus.RENTED);

        CustomerReservationFactory.addCustomerToReservation(customer1, reservation1);
        CustomerReservationFactory.addCustomerToReservation(customer1, reservation3);
        CustomerReservationFactory.addCustomerToReservation(customer2, reservation2);

        System.out.println(customer2.getCustomerReservations());
    }
}
