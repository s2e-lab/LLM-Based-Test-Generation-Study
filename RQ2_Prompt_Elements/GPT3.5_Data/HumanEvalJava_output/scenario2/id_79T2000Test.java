Here's the source code for DecimalToBinaryTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DecimalToBinaryTest {

    @Test
    void testDecimalToBinaryWithZero() {
        assertEquals("db0db", DecimalToBinary.decimalToBinary(0));
    }

    @Test
    void testDecimalToBinaryWithOne() {
        assertEquals("db1db", DecimalToBinary.decimalToBinary(1));
    }

    @Test
    void testDecimalToBinaryWithTwo() {
        assertEquals("db10db", DecimalToBinary.decimalToBinary(2));
    }

    @Test
    void testDecimalToBinaryWithTen() {
        assertEquals("db1010db", DecimalToBinary.decimalToBinary(10));
    }

    @Test
    void testDecimalToBinaryWithFifteen() {
        assertEquals("db1111db", DecimalToBinary.decimalToBinary(15));
    }

    @Test
    void testDecimalToBinaryWithSixtyFour() {
        assertEquals("db1000000db", DecimalToBinary.decimalToBinary(64));
    }

    @Test
    void testDecimalToBinaryWithNegativeNumber() {
        assertEquals("db-101db", DecimalToBinary.decimalToBinary(-5));
    }

    @Test
    void testDecimalToBinaryWithMaxValue() {
        assertEquals("db1111111111111111111111111111111db", DecimalToBinary.decimalToBinary(Integer.MAX_VALUE));
    }

    @Test
    void testDecimalToBinaryWithMinValue() {
        assertEquals("db10000000000000000000000000000000db", DecimalToBinary.decimalToBinary(Integer.MIN_VALUE));
    }

    @Test
    void testDecimalToBinaryWithRandomNumber() {
        assertEquals("db101011db", DecimalToBinary.decimalToBinary(43));
    }
}
```

This class contains ten unit test cases for the `DecimalToBinary.decimalToBinary(int)` method. Each test case tests a different scenario, such as converting zero to binary, converting a negative number to binary, and converting the maximum and minimum integer values to binary. The `@Test` annotation is used to mark each test method, and the `assertEquals` method is used to compare the expected output with the actual output of the `decimalToBinary` method.