public class Aircraft extends Vehicle{

    private int numberOfEngines;
    private AircraftType aircraftType;

    public Aircraft(int maxOccupancy, int numberOFEngines, AircraftType aircraftType){
        super(maxOccupancy);
        this.numberOfEngines = numberOFEngines;
        this.aircraftType = aircraftType;
    }

    public int getNumberOfEngines(){
        return this.numberOfEngines;
    }

    public String value(){
        return "this aircraft is worth £" + this.aircraftType.value + ".";
    }

    public double getValue(){
        return this.aircraftType.value;
    }

    public String travelling(){
        return "flown in the air";
    }

    public String travelling(int mileage){
        if (mileage <= 0){
            return "This aircraft is brand new!";
        } else {
            return "flown " + mileage + " miles in the air";
        }
    }



}
