import Models.Wristwatch;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WristwatchTest {

    Wristwatch wristwatch;

    @BeforeEach
    public void setUp(){
        wristwatch = new Wristwatch("Audemars Piguet", 41995.00);
    }

    @Test
    public void canGetValue(){
        assertThat(wristwatch.getValue()).isEqualTo(41995.00);
    }

    @Test
    public void givesValue(){
        assertThat(wristwatch.value()).isEqualTo("this watch is worth £41995.0.");
    }
}
