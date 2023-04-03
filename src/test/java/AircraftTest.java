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
        assertThat(aircraft.getAircraftType().getAirCraftValue()).isEqualTo(100000.00);
    }

}
