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
    void testDecimalToBinaryWithZero() {
        assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
    }

    @Test
    void testDecimalToBinaryWithPositiveNumber() {
        assertEquals("db100000db", DecimalToBinary.decimalToBinary(32));
        assertEquals("db1100111db", DecimalToBinary.decimalToBinary(103));
        assertEquals("db1111db", DecimalToBinary.decimalToBinary(15));
    }

    @Test
    void testDecimalToBinaryWithNegativeNumber() {
        assertEquals("db-100000db", DecimalToBinary.decimalToBinary(-32));
        assertEquals("db-1100111db", DecimalToBinary.decimalToBinary(-103));
        assertEquals("db-1111db", DecimalToBinary.decimalToBinary(-15));
    }

    @Test
    void testDecimalToBinaryWithMaxValue() {
        assertEquals("db1111111111111111111111111111111db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE));
    }

    @Test
    void testDecimalToBinaryWithMinValue() {
        assertEquals("db-10000000000000000000000000000000db", DecimalToBinary.decimalToBinary(Integer.MIN_VALUE));
    }
}