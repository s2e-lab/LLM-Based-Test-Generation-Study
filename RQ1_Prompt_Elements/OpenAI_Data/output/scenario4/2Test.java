// TruncateNumberTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {

	@Test
	void testTruncateNumber() {
		assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
		assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
		assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
		assertEquals(0.0, TruncateNumber.truncateNumber(0.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(1.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(2.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(3.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(4.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(5.0));
		assertEquals(0.0, TruncateNumber.truncateNumber(6.0));
	}
}