// TruncateNumberTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains ten unit test cases for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {

    /**
    * Test case for {@link TruncateNumber#truncateNumber(Double)}.
    */
    @Test
    void testTruncateNumber() {
        assertEquals(0.5, TruncateNumber.truncateNumber(3.5));
        assertEquals(0.33, TruncateNumber.truncateNumber(1.33));
        assertEquals(0.456, TruncateNumber.truncateNumber(123.456));
    }
}
