// DecimalToBinaryTest.java
package original;

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
        assertEquals("db-1111111111111111111111111111111db", DecimalToBinary.decimalToBinary(-1));
        assertEquals("db-10000000000000000000000000000000db", DecimalToBinary.decimalToBinary(-2147483648));
    }
}