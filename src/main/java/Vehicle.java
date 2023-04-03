public class Vehicle {

    private int maxOccupancy;
    private int value;

    public Vehicle(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
        this.value = 0;
    }

    public int getValue() {
        return this.value;
    }

    public String travelling(){
        return "I am not sure...";
    }

}
