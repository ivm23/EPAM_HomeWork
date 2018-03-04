package main.model;

import java.util.ArrayList;

public class Employee {
    private String name;
    private ArrayList<Stationery> stationery;

    public Employee() {
        name = "";
        stationery = new ArrayList<>();
    }

    public Employee(String name) {
        this.name = name;
        stationery = new ArrayList<>();
    }

    public Employee(String name, ArrayList<Stationery> stationery) {
        this.name = name;
        this.stationery = new ArrayList<>(stationery);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Stationery> getStationery() {
        return stationery;
    }

    public void addStationery(Stationery stationery) {
        this.stationery.add(stationery);
    }

    public void addStationery(ArrayList<Stationery> stationery) {
        this.stationery.addAll(0, stationery);
    }

    public int calculateTotalSumOfStationery() {
        int sum = 0;
        for (Stationery certainStationery : stationery) {
            sum += certainStationery.getPrice();
        }
        return sum;
    }

}
