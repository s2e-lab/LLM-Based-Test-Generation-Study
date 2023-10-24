// DigitsumTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {

    /**
     * Test case for the {@link Digitsum#digitSum(String)} method.
     */
    @Test
    void testDigitSum() {
        assertEquals(10, Digitsum.digitSum("Hello World!"));
        assertEquals(10, Digitsum.digitSum("Hello World!"));
        assertEquals(10, Digitsum.digitSum("Hello World!"));
        assertEquals(10, Digitsum.digitSum("Hello World!"));
        assertEquals(10, Digitsum.digitSum("Hello World!"));
        assertEquals(10, Digitsum.digitSum("Hello World!"));
        assertEquals(10, Digitsum.digitSum("Hello World!"));
        assertEquals(10, Digitsum.digitSum("Hello World!"));
        assertEquals(10, Digitsum.digitSum("Hello World!"));
        assertEquals(10, Digitsum.digitSum("Hello World!"));
    }
}
