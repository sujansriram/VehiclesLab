import Models.Car;
import Models.MotorVehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorVehicleTest {

    MotorVehicle motorVehicle;

    @BeforeEach
    public void setUp(){
        motorVehicle = new Car("Ford", 10000.00,5, 4, false);
    }

    @Test
    public void canGetNumberOfWheels(){
        assertThat(motorVehicle.getNumberOfWheels()).isEqualTo(4);
    }

    @Test
    public void canCheckIfManual(){
        assertThat(motorVehicle.getManual()).isEqualTo(false);
    }

    @Test
    public void returnsTravelling(){
        assertThat(motorVehicle.travelling()).isEqualTo("driven on the road");
        assertThat(motorVehicle.travelling(10000)).isEqualTo("driven 10000 miles on the road");
        assertThat(motorVehicle.travelling(0)).isEqualTo("This motor-vehicle is brand new!");
    }
}
