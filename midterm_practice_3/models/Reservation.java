package midterm_practice_3.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private LocalDate startDate;
    private LocalDate endDate;
    private Double totalCost;
    private Vehicle vehicle;

    private List<CustomerReservation> customerReservations = new ArrayList<>();

    public Reservation(LocalDate startDate, LocalDate endDate, Double totalCost, Vehicle vehicle) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = totalCost;
        this.vehicle = vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public List<CustomerReservation> getCustomerReservations() {
        return customerReservations;
    }

    public void setCustomerReservations(List<CustomerReservation> customerReservations) {
        this.customerReservations = customerReservations;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalCost=" + totalCost +
                ", vehicle=" + vehicle +
                '}';
    }
}
