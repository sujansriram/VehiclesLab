import java.util.ArrayList;

public class Garage {

    private ArrayList<Vehicle> vehicles;
    private String owner;

    public Garage(String owner){
        this.owner = owner;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public int getVehicleCount(){
        return this.vehicles.size();
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Vehicle vehicle : vehicles){
            totalValue += vehicle.getValue();
        }
        return totalValue;
    }

}
