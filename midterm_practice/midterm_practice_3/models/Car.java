package midterm_practice_3.models;

import midterm_practice_3.constants.CarPosition;
import midterm_practice_3.constants.VehicleStatus;

public class Car extends Vehicle {
    private CarPosition position;

    public Car(Double ratePerDay, String model, VehicleStatus vehicleStatus, CarPosition position) {
        super(ratePerDay, model, vehicleStatus);
        this.position = position;
    }

    public CarPosition getPosition() {
        return position;
    }

    public void setPosition(CarPosition position) {
        this.position = position;
    }
}
