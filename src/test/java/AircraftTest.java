import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class AircraftTest {

    Aircraft aircraft;

    @BeforeEach
    public void setUp(){
        aircraft = new Aircraft(12, 2, PRIVATEJET);
    }

    @Test
    public void canGetNumberOfEngines(){
        assertThat(aircraft.getNumberOfEngines()).isEqualTo(2);
    }

    @Test
    public void canGetAircraftValue(){
        assertThat(aircraft.getValue()).isEqualTo(100,000.00);
    }

}
