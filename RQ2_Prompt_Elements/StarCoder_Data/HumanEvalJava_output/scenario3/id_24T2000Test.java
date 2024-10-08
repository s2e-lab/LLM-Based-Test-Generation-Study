// LargestDivisorTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {

    /**
     * Test case for the {@link LargestDivisor#largestDivisor(int)} method.
     */
    @Test
    void testLargestDivisor() {
        assertEquals(5, LargestDivisor.largestDivisor(15));
        assertEquals(1, LargestDivisor.largestDivisor(3));
        assertEquals(1, LargestDivisor.largestDivisor(7));
        assertEquals(5, LargestDivisor.largestDivisor(10));
        assertEquals(50, LargestDivisor.largestDivisor(100));
        assertEquals(7, LargestDivisor.largestDivisor(49));
    }
}
