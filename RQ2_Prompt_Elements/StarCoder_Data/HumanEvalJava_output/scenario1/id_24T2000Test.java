// LargestDivisorTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestDivisor}.
* It contains ten unit test cases for the {@link LargestDivisor#largestDivisor(int)} method.
*/
class LargestDivisorTest {

    @Test
    void testLargestDivisor() {
        assertEquals(1, LargestDivisor.largestDivisor(1));
        assertEquals(1, LargestDivisor.largestDivisor(2));
        assertEquals(2, LargestDivisor.largestDivisor(3));
        assertEquals(3, LargestDivisor.largestDivisor(4));
        assertEquals(3, LargestDivisor.largestDivisor(5));
        assertEquals(5, LargestDivisor.largestDivisor(6));
        assertEquals(5, LargestDivisor.largestDivisor(7));
        assertEquals(7, LargestDivisor.largestDivisor(8));
        assertEquals(7, LargestDivisor.largestDivisor(9));
        assertEquals(11, LargestDivisor.largestDivisor(10));
        assertEquals(11, LargestDivisor.largestDivisor(11));
    }
}
