// DecimalToBinaryTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DecimalToBinary}.
* It contains ten unit test cases for the {@link DecimalToBinary#decimalToBinary(int)} method.
*/
class DecimalToBinaryTest {

	@Test
	void testDecimalToBinary_0() {
		assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
	}
	
	@Test
	void testDecimalToBinary_1() {
		assertEquals("db1db", DecimalToBinary.decimalToBinary(1));
	}
	
	@Test
	void testDecimalToBinary_2() {
		assertEquals("db10db", DecimalToBinary.decimalToBinary(2));
	}
	
	@Test
	void testDecimalToBinary_3() {
		assertEquals("db11db", DecimalToBinary.decimalToBinary(3));
	}
	
	@Test
	void testDecimalToBinary_4() {
		assertEquals("db100db", DecimalToBinary.decimalToBinary(4));
	}
	
	@Test
	void testDecimalToBinary_5() {
		assertEquals("db101db", DecimalToBinary.decimalToBinary(5));
	}
	
	@Test
	void testDecimalToBinary_6() {
		assertEquals("db110db", DecimalToBinary.decimalToBinary(6));
	}
	
	@Test
	void testDecimalToBinary_7() {
		assertEquals("db111db", DecimalToBinary.decimalToBinary(7));
	}
	
	@Test
	void testDecimalToBinary_8() {
		assertEquals("db1000db", DecimalToBinary.decimalToBinary(8));
	}
	
	@Test
	void testDecimalToBinary_9() {
		assertEquals("db1001db", DecimalToBinary.decimalToBinary(9));
	}
	
}