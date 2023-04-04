package Models;

public abstract class MotorVehicle extends Vehicle {

    private int numberOfWheels;
    private boolean manual;
    private String brandName;
    protected double value;

    public MotorVehicle(String brandName, double value, int maxOccupancy , int numberOfWheels, boolean manual) {
        super(maxOccupancy);
        this.numberOfWheels = numberOfWheels;
        this.manual = manual;
        this.brandName = brandName;
        this.value = value;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public boolean getManual() {
        return this.manual;
    }

    public double getValue(){
        return this.value;
    }

    public String travelling(){
        return "driven on the road";
    }

    public String travelling(int mileage){
        if (mileage <= 0){
            return "This motor-vehicle is brand new!";
        } else {
            return "driven " + mileage + " miles on the road";
        }
    }



}
