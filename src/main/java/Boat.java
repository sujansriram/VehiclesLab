public class Boat extends Vehicle{

    private BoatType boatType;

    public Boat(int maxOccupancy, BoatType boatType){
        super(maxOccupancy);
        this.boatType = boatType;
    }

    public String value(){
        return "this aircraft is worth £" + this.boatType.value + ".";
    }

    public double getValue(){
        return this.boatType.value;
    }

    public boolean hasAnchor(){
        return boatType.getAnchor();
    }

    public String travelling(){
        return "sailed on the water";
    }

    public String travelling(int mileage){
        if (mileage <= 0){
            return "This boat is brand new!";
        } else {
            return "sailed " + mileage + " miles on the water";
        }
    }

}
