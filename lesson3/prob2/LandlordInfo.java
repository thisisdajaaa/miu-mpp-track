package lesson3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private List<Building> buildings = new ArrayList<>();

    public LandlordInfo() {}

    public List<Building> getBuildings() {
        return buildings;
    }

    public void setBuildings(List<Building> buildings) {
        this.buildings = buildings;
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public Double calcProfits() {
        Double totalProfit = 0.0;

        for (Building building: buildings) {
            totalProfit += building.getProfit();
        }

        return totalProfit;
    }
 }
