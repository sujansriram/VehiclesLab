public class Bike extends MotorVehicle {

    public Bike(String brandName, double value, int maxOccupancy , int numberOfWheels, boolean manual){
        super(brandName, value, maxOccupancy, numberOfWheels, manual);
    }

    public String value(){
        return "this bike is worth £" + this.value + ".";
    }

}
