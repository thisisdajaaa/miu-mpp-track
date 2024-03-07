package midterm_practice_3.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Staff extends User {
    private String staffId;
    private List<Vehicle> vehicles = new ArrayList<>();

    public Staff(String name, LocalDate dateOfBirth, String staffId) {
        super(name, dateOfBirth);
        this.staffId = staffId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
