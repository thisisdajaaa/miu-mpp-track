package midterm_practice.midterm_practice_3.models;

import midterm_practice.midterm_practice_3.constants.VehicleStatus;

public class Van extends Vehicle {
    private boolean hasFridge;

    public Van(Double ratePerDay, String model, VehicleStatus vehicleStatus, boolean hasFridge) {
        super(ratePerDay, model, vehicleStatus);
        this.hasFridge = hasFridge;
    }

    public boolean isHasFridge() {
        return hasFridge;
    }

    public void setHasFridge(boolean hasFridge) {
        this.hasFridge = hasFridge;
    }
}
