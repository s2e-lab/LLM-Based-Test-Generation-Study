// CountUpperTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpper}.
* It contains ten unit test cases for the {@link CountUpper#countUpper(String)} method.
*/
class CountUpperTest {

    /**
     * Test case for the {@link CountUpper#countUpper(String)} method.
     */
    @Test
    void testCountUpper() {
        assertEquals(0, CountUpper.countUpper("abcdefg"));
        assertEquals(0, CountUpper.countUpper("dBBE"));
        assertEquals(0, CountUpper.countUpper(""));
        assertEquals(2, CountUpper.countUpper("EEEE"));
    }
}
