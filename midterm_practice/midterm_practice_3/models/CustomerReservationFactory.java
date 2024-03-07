package midterm_practice_3.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerReservationFactory {
    private static final List<Customer> customers = new ArrayList<>();
    private static final List<Reservation> reservations = new ArrayList<>();

    public static Customer createCustomer(String customerId,String name, LocalDate dateOfBirth, String accountId) {
        Customer customer = new Customer(customerId, name, dateOfBirth, accountId);
        customers.add(customer);
        return customer;
    }

    public static Reservation createReservation(LocalDate startDate, LocalDate endDate, Vehicle vehicle) {
        Double cost = Period.between(startDate, endDate).getDays() * vehicle.getRatePerDay();

        Reservation reservation = new Reservation(startDate, endDate, cost, vehicle);
        reservations.add(reservation);
        return reservation;
    }

    public static void addCustomerToReservation(Customer customer, Reservation reservation) {
        if (findCustomerReservation(customer, reservation) == null) {
            CustomerReservation customerReservation = new CustomerReservation(customer, reservation);
            customer.getCustomerReservations().add(customerReservation);
            reservation.getCustomerReservations().add(customerReservation);
        }
    }

    public static CustomerReservation findCustomerReservation(Customer customer, Reservation reservation) {
        for (CustomerReservation customerReservation : customer.getCustomerReservations()) {
            if (customerReservation.getReservation().equals(reservation)) {
                return customerReservation;
            }
        }

        return null;
    }

    public static List<Reservation> getReservations() {
        return Collections.unmodifiableList(reservations);
    }

    public static List<Customer> getCustomers() {
        return Collections.unmodifiableList(customers);
    }
}
