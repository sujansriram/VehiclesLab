import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        vehicle = new Car("Ford", 10000.00,5, 4, false);
    }

    @Test
    public void canGetValue(){
        assertThat(vehicle.getValue()).isEqualTo(10000.00);
    }

    @Test
    public void canGetTravelling(){
        assertThat(vehicle.travelling()).isEqualTo("I am not sure...");
    }



}
