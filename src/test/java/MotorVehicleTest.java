import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorVehicleTest {

    MotorVehicle motorVehicle;

    @BeforeEach
    public void setUp(){
        motorVehicle = new MotorVehicle(5, 4, false);
    }

    @Test
    public void canGetNumberOfWheels(){
        assertThat(motorVehicle.getNumberOfWheels()).isEqualTo(4);
    }

    @Test
    public void canCheckIfManual(){
        assertThat(motorVehicle.getManual()).isEqualTo(false);
    }

}
