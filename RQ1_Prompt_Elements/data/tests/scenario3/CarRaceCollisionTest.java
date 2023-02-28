package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarRaceCollisionTest {

    @Test
    public void test() throws Exception{

        assertEquals(4, scenario3.CarRaceCollision.carRaceCollision(2));
		assertEquals(9, scenario3.CarRaceCollision.carRaceCollision(3));
		assertEquals(16, scenario3.CarRaceCollision.carRaceCollision(4));
		assertEquals(64, scenario3.CarRaceCollision.carRaceCollision(8));
		assertEquals(100, scenario3.CarRaceCollision.carRaceCollision(10));
		
    }

}