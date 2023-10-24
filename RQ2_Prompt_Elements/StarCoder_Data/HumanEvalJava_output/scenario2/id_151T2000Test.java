// DoubleTheDifferenceTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with an empty list.
     */
    @Test
    void testDoubleTheDifferenceWithEmptyList() {
        List<Object> lst = List.of();
        assertEquals(0, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testDoubleTheDifferenceWithIntegers() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a negative number.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndNegativeNumber() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a floating point number.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndFloatingPointNumber() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1.5);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a string.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndString() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, "1");
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a null object.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndNullObject() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a list.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndList() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, List.of(1));
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a map.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndMap() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Map.of("1", 1));
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a set.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndSet() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Set.of(1));
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a character.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndCharacter() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, '1');
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a boolean.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndBoolean() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, true);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a double.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndDouble() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1.0);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a float.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndFloat() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1.0f);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a long.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndLong() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1L);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a short.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndShort() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, (short) 1);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    /**
     * Test case for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
     * It tests the method with a list of integers and a byte.
     */
    @Test
    void testDoubleTheDifferenceWithIntegersAndByte() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, (byte) 1);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }
}
