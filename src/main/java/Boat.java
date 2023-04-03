public class Boat extends Vehicle{

    private BoatType boatType;

    public Boat(int maxOccupancy, BoatType boatType){
        super(maxOccupancy);
        this.boatType = boatType;
    }

    public double getValue(){
        return this.boatType.getBoatValue();
    }

    public boolean hasAnchor(){
        return boatType.getAnchor();
    }

}
