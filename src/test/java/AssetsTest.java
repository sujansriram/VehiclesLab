import Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssetsTest {

    Assets assets;
    Bike bike;
    Car car;
    Vehicle vehicle;
    Vehicle boat;
    Wristwatch wristwatch;

    @BeforeEach
    public void setUp(){
        assets = new Assets("Sujan");
        car = new Car("Ford", 10000.00,5, 4, false);
        bike = new Bike("Ducati", 90000.00, 1, 2, true);
        vehicle  = new Aircraft(12, 2, AircraftType.PRIVATEJET);
        boat = new Boat(12, BoatType.YACHT);
        wristwatch = new Wristwatch("Audemars Piguet", 41995.00);
        assets.addValuable(car);
        assets.addValuable(bike);
        assets.addValuable(wristwatch);
    }

    @Test
    public void canAddVehicle(){
        assets.addValuable(boat);
        assets.addValuable(vehicle);
        assertThat(assets.getValuableCount()).isEqualTo(5);
    }

    @Test
    public void canGetTotalValue(){
        assertThat(assets.getTotalValue()).isEqualTo(141995.00);
    }
}
