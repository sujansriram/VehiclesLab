package Models;

import Interfaces.IValuable;

public abstract class Vehicle implements IValuable {

    private int maxOccupancy;

    public Vehicle(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

//    public abstract double getValue();

    public abstract String travelling();

}
