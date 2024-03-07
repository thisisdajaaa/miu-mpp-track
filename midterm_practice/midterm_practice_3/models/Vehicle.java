package midterm_practice_3.models;

import midterm_practice_3.constants.VehicleStatus;

public abstract class Vehicle {
    private Double ratePerDay;
    private String model;
    private VehicleStatus vehicleStatus;

    Vehicle(Double ratePerDay, String model, VehicleStatus vehicleStatus) {
        this.ratePerDay = ratePerDay;
        this.model = model;
        this.vehicleStatus = vehicleStatus;
    }

    public Double getRatePerDay() {
        return ratePerDay;
    }

    public void setRatePerDay(Double ratePerDay) {
        this.ratePerDay = ratePerDay;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "ratePerDay=" + ratePerDay +
                ", model='" + model + '\'' +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }
}
