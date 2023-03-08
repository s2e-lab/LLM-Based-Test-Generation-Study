package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarRaceCollisionTest {

    @Test
    public void test() throws Exception {

        assertEquals(4, scenario2.CarRaceCollision.carRaceCollision(2));
        assertEquals(9, scenario2.CarRaceCollision.carRaceCollision(3));
        assertEquals(16, scenario2.CarRaceCollision.carRaceCollision(4));
        assertEquals(64, scenario2.CarRaceCollision.carRaceCollision(8));
        assertEquals(100, scenario2.CarRaceCollision.carRaceCollision(10));

    }

}