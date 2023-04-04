import Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle;
    Boat boat;
    Aircraft aircraft;

    @BeforeEach
    public void setUp(){
        vehicle = new Car("Ford", 10000.00,5, 4, false);
        boat = new Boat(12, BoatType.YACHT);
        aircraft = new Aircraft(12, 2, AircraftType.PRIVATEJET);
    }

    @Test
    public void canGetValue(){
        assertThat(vehicle.getValue()).isEqualTo(10000.00);
    }

    @Test
    public void canGetTravelling(){
        assertThat(vehicle.travelling()).isEqualTo("driven on the road");
    }

    @Test
    public void givesValue(){
        assertThat(aircraft.value()).isEqualTo("this aircraft is worth £100000.0.");
        assertThat(vehicle.value()).isEqualTo("this car is worth £10000.0.");
    }

}
