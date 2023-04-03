import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoatTest {

    Boat boat;

    @BeforeEach
    public void setUp(){
        boat = new Boat(12, BoatType.YACHT);
    }

    @Test
    public void canGetBoatValue(){
        assertThat(boat.getValue()).isEqualTo(250000.00);
    }

    @Test
    public void canCheckAnchor(){
        assertThat(boat.hasAnchor()).isEqualTo(false);
    }

}
