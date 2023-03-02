// RoundedAvgTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RoundedAvg}.
* It contains ten unit test cases for the {@link RoundedAvg#roundedAvg(int, int)} method.
*/
class RoundedAvgTest {
@Test
	void testRoundedAvg() {
		assertEquals("0b11", RoundedAvg.roundedAvg(1, 3));
		assertEquals("0b11", RoundedAvg.roundedAvg(3, 1));
		assertEquals("0b11", RoundedAvg.roundedAvg(1, 1));
		assertEquals("0b11", RoundedAvg.roundedAvg(3, 3));
		assertEquals("0b11", RoundedAvg.roundedAvg(2, 2));
		assertEquals("0b11", RoundedAvg.roundedAvg(2, 4));
		assertEquals("0b11", RoundedAvg.roundedAvg(4, 2));
		assertEquals("0b11", RoundedAvg.roundedAvg(2, 3));
		assertEquals("0b11", RoundedAvg.roundedAvg(3, 2));
		assertEquals("0b11", RoundedAvg.roundedAvg(2, 2));
	}
}