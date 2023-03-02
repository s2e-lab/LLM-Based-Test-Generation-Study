// DecimalToBinaryTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {
@Test
	void testDecimalToBinary() {
		assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
		assertEquals("db1db", DecimalToBinary.decimalToBinary(1));
		assertEquals("db10db", DecimalToBinary.decimalToBinary(2));
		assertEquals("db11db", DecimalToBinary.decimalToBinary(3));
		assertEquals("db100db", DecimalToBinary.decimalToBinary(4));
		assertEquals("db101db", DecimalToBinary.decimalToBinary(5));
		assertEquals("db110db", DecimalToBinary.decimalToBinary(6));
		assertEquals("db111db", DecimalToBinary.decimalToBinary(7));
		assertEquals("db1000db", DecimalToBinary.decimalToBinary(8));
		assertEquals("db1001db", DecimalToBinary.decimalToBinary(9));
	}
}