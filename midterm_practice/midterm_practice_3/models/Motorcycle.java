package midterm_practice.midterm_practice_3.models;

import midterm_practice.midterm_practice_3.constants.VehicleStatus;

public class Motorcycle extends Vehicle{
    private Integer horsePower;

    public Motorcycle(Double ratePerDay, String model, VehicleStatus vehicleStatus, Integer horsePower) {
        super(ratePerDay, model, vehicleStatus);
        this.horsePower = horsePower;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
}
