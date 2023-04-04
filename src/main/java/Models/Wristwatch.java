package Models;

import Interfaces.IValuable;

public class Wristwatch implements IValuable {

    private String model;
    private double value;

    public Wristwatch(String model, double value){
        this.value = value;
        this.model = model;
    }

    public double getValue(){
        return this.value;
    }

    public String value(){
        return "this watch is worth £" + this.value + ".";
    }
}
