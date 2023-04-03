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

    public AircraftType getAircraftType(){
        return this.aircraftType;
    }

}
