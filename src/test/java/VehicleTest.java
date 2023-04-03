import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        vehicle = new Vehicle(5);
    }

    @Test
    public void canGetValue(){
        assertThat(vehicle.getValue()).isEqualTo(0);
    }

    @Test
    public void canGetTravelType(){
        assertThat(vehicle.travelling()).isEqualTo("I am not sure...");
    }



}
