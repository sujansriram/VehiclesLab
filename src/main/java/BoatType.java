public enum BoatType {

    FISHINGBOAT(10000.00, false),
    YACHT(250000.00, false),
    CRUISESHIP(1000000.00, true),
    SUBMARINE(300000.00, false),
    PIRATESHIP(20000.00, true),
    OILTANKER(50000000.00, true);



    private double value;
    private boolean anchor;

    BoatType(double value, boolean hasAnchor){
        this.value = value;
        this.anchor = hasAnchor;
    }

    public double getBoatValue(){
        return this.value;
    }

    public boolean getAnchor(){
        return this.anchor;
    }


}
