import Models.Aircraft;
import Models.AircraftType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class AircraftTest {

    Aircraft aircraft;

    @BeforeEach
    public void setUp(){
        aircraft = new Aircraft(12, 2, AircraftType.PRIVATEJET);
    }

    @Test
    public void canGetNumberOfEngines(){
        assertThat(aircraft.getNumberOfEngines()).isEqualTo(2);
    }

    @Test
    public void canGetAircraftValue(){
        assertThat(aircraft.getValue()).isEqualTo(100000.00);
    }

    @Test
    public void returnsTravelling(){
        assertThat(aircraft.travelling()).isEqualTo("flown in the air");
        assertThat(aircraft.travelling(10000)).isEqualTo("flown 10000 miles in the air");
        assertThat(aircraft.travelling(0)).isEqualTo("This aircraft is brand new!");
    }

}
