import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    Garage garage;
    Bike bike;
    Car car;
    Vehicle vehicle;
    Vehicle boat;

    @BeforeEach
    public void setUp(){
        garage = new Garage("Sujan");
        car = new Car("Ford", 10000.00,5, 4, false);
        bike = new Bike("Ducati", 90000.00, 1, 2, true);
        vehicle  = new Aircraft(12, 2, AircraftType.PRIVATEJET);
        boat = new Boat(12, BoatType.YACHT);
        garage.addVehicle(car);
        garage.addVehicle(bike);
    }

    @Test
    public void canAddVehicle(){
        garage.addVehicle(boat);
        garage.addVehicle(vehicle);
        assertThat(garage.getSize()).isEqualTo(4);
    }
    
    @Test
    public void canGetTotalValue(){
        assertThat(garage.getTotalValue()).isEqualTo(100000.00);
    }
}
