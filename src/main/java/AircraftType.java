public enum AircraftType {

    HELICOPTER(50000.00),
    PRIVATEJET(100000.00),
    BOEING737(1000000.00),
    BLIMP(20000.00),
    FIGHTERJET(1000000.00);

    private double value;

    AircraftType(double value){
        this.value = value;
    }

    public double getAirCraftValue(){
        return this.value;
    }


}
