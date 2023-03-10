package scenario4;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarRaceCollisionTest {
    @Test
	public void test1() throws Exception {
		assertEquals(4, scenario4.CarRaceCollision.carRaceCollision(2));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(9, scenario4.CarRaceCollision.carRaceCollision(3));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(16, scenario4.CarRaceCollision.carRaceCollision(4));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(64, scenario4.CarRaceCollision.carRaceCollision(8));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(100, scenario4.CarRaceCollision.carRaceCollision(10));
	}

	
}