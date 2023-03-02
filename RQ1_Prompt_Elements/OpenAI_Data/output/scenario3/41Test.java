// CarRaceCollisionTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CarRaceCollision}.
* It contains ten unit test cases for the {@link CarRaceCollision#carRaceCollision(int)} method.
*/
class CarRaceCollisionTest {
@Test
	void testCarRaceCollision() {
		assertEquals(4, CarRaceCollision.carRaceCollision(2));
		assertEquals(9, CarRaceCollision.carRaceCollision(3));
		assertEquals(16, CarRaceCollision.carRaceCollision(4));
		assertEquals(25, CarRaceCollision.carRaceCollision(5));
		assertEquals(36, CarRaceCollision.carRaceCollision(6));
		assertEquals(49, CarRaceCollision.carRaceCollision(7));
		assertEquals(64, CarRaceCollision.carRaceCollision(8));
		assertEquals(81, CarRaceCollision.carRaceCollision(9));
		assertEquals(100, CarRaceCollision.carRaceCollision(10));
		assertEquals(121, CarRaceCollision.carRaceCollision(11));
	}
}