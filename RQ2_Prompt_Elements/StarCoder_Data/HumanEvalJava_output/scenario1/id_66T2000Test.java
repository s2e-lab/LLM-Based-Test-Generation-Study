// DigitsumTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains ten unit test cases for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {

    @Test
    void testDigitSum() {
        assertEquals(10, Digitsum.digitSum("1234567890"));
        assertEquals(10, Digitsum.digitSum("1234567890"));
        assertEquals(10, Digitsum.digitSum("1234567890"));
        assertEquals(10, Digitsum.digitSum("1234567890"));
        assertEquals(10, Digitsum.digitSum("1234567890"));
        assertEquals(10, Digitsum.digitSum("1234567890"));
        assertEquals(10, Digitsum.digitSum("1234567890"));
        assertEquals(10, Digitsum.digitSum("1234567890"));
        assertEquals(10, Digitsum.digitSum("1234567890"));
        assertEquals(10, Digitsum.digitSum("1234567890"));
    }
}
