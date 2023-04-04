package Models;

public class Car extends MotorVehicle {

    public Car(String brandName, double value, int maxOccupancy , int numberOfWheels, boolean manual){
        super(brandName, value, maxOccupancy, numberOfWheels, manual);
    }

    public String value(){
        return "this car is worth £" + this.value + ".";
    }

}
