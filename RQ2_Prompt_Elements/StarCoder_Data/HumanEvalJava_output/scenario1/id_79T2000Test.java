// DecimalToBinaryTest.java
package scenario1;


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
        assertEquals("db100db", DecimalToBinary.decimalToBinary(4));
        assertEquals("db1000db", DecimalToBinary.decimalToBinary(8));
        assertEquals("db10000db", DecimalToBinary.decimalToBinary(16));
        assertEquals("db100000db", DecimalToBinary.decimalToBinary(32));
        assertEquals("db1000000db", DecimalToBinary.decimalToBinary(64));
        assertEquals("db10000000db", DecimalToBinary.decimalToBinary(128));
        assertEquals("db100000000db", DecimalToBinary.decimalToBinary(256));
    }
}
