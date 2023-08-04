// GreatestCommonDivisorTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GreatestCommonDivisor}.
* It contains ten unit test cases for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
*/
class GreatestCommonDivisorTest {

    /**
     * Test case for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
     * It tests the method with the following inputs:
     * <ul>
     * <li>a = 10, b = 15</li>
     * <li>a = 15, b = 10</li>
     * <li>a = 10, b = 10</li>
     * <li>a = 15, b = 15</li>
     * <li>a = 10, b = 5</li>
     * <li>a = 5, b = 10</li>
     * <li>a = 5, b = 5</li>
     * <li>a = 1, b = 1</li>
     * <li>a = 1, b = 0</li>
     * <li>a = 0, b = 1</li>
     * </ul>
     * It expects the following results:
     * <ul>
     * <li>1</li>
     * <li>1</li>
     * <li>10</li>
     * <li>15</li>
     * <li>5</li>
     * <li>5</li>
     * <li>5</li>
     * <li>1</li>
     * <li>0</li>
     * <li>1</li>
     * </ul>
     */
    @Test
    void testGreatestCommonDivisor() {
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(10, 15));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(15, 10));
        assertEquals(10, GreatestCommonDivisor.greatestCommonDivisor(10, 10));
        assertEquals(15, GreatestCommonDivisor.greatestCommonDivisor(15, 15));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(10, 5));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(5, 10));
        assertEquals(5, GreatestCommonDivisor.greatestCommonDivisor(5, 5));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(1, 1));
        assertEquals(0, GreatestCommonDivisor.greatestCommonDivisor(1, 0));
        assertEquals(1, GreatestCommonDivisor.greatestCommonDivisor(0, 1));
    }
}
