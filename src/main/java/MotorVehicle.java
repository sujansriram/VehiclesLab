public class MotorVehicle extends Vehicle {

    private int numberOfWheels;
    private boolean manual;

    public MotorVehicle(int maxOccupancy , int numberOfWheels, boolean manual) {
        super(maxOccupancy);
        this.numberOfWheels = numberOfWheels;
        this.manual = manual;
    }

    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }

    public boolean getManual() {
        return this.manual;
    }

}
