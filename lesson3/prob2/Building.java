package lesson3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private Integer id;
    private List<Apartment> apartments = new ArrayList<>();

    private Double maintenanceCost;

    public Building(Integer id, Double maintenanceCost) {
        this.id = id;
        this.maintenanceCost = maintenanceCost;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public void setApartments(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public Double getMaintenanceCost() {
        return maintenanceCost;
    }

    public void setMaintenanceCost(Double maintenanceCost) {
        this.maintenanceCost = maintenanceCost;
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getProfit() {
        Double totalProfit = 0.0;

        for (Apartment apartment: apartments) {
            totalProfit += apartment.getRent();
        }

        return totalProfit - maintenanceCost;
    }
}
