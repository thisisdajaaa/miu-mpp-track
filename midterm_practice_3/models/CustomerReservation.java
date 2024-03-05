package midterm_practice_3.models;

public class CustomerReservation {
    private Customer customer;
    private Reservation reservation;

    CustomerReservation(){}

    CustomerReservation(Customer customer, Reservation reservation) {
        this.customer = customer;
        this.reservation = reservation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "CustomerReservation{" +
                "customer=" + customer.getName() +
                ", reservation=" + reservation.getVehicle().getModel() +
                '}';
    }
}
