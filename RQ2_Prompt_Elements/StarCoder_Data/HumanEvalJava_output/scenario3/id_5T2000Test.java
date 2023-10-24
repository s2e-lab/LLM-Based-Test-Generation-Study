// IntersperseTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersperse}.
* It contains ten unit test cases for the {@link Intersperse#intersperse(List, int)} method.
*/
class IntersperseTest {

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list is empty.
     */
    @Test
    void testIntersperse_emptyList() {
        List<Object> numbers = List.of();
        int delimiter = 4;
        List<Object> expected = List.of();
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains one element.
     */
    @Test
    void testIntersperse_listWithOneElement() {
        List<Object> numbers = List.of(1);
        int delimiter = 4;
        List<Object> expected = List.of(1);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains two elements.
     */
    @Test
    void testIntersperse_listWithTwoElements() {
        List<Object> numbers = List.of(1, 2);
        int delimiter = 4;
        List<Object> expected = List.of(1, 4, 2);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains three elements.
     */
    @Test
    void testIntersperse_listWithThreeElements() {
        List<Object> numbers = List.of(1, 2, 3);
        int delimiter = 4;
        List<Object> expected = List.of(1, 4, 2, 4, 3);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains four elements.
     */
    @Test
    void testIntersperse_listWithFourElements() {
        List<Object> numbers = List.of(1, 2, 3, 4);
        int delimiter = 4;
        List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains five elements.
     */
    @Test
    void testIntersperse_listWithFiveElements() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5);
        int delimiter = 4;
        List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 5);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains six elements.
     */
    @Test
    void testIntersperse_listWithSixElements() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6);
        int delimiter = 4;
        List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 5, 4, 6);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains seven elements.
     */
    @Test
    void testIntersperse_listWithSevenElements() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        int delimiter = 4;
        List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 5, 4, 6, 4, 7);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains eight elements.
     */
    @Test
    void testIntersperse_listWithEightElements() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        int delimiter = 4;
        List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 5, 4, 6, 4, 7, 4, 8);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains nine elements.
     */
    @Test
    void testIntersperse_listWithNineElements() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int delimiter = 4;
        List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the input list contains ten elements.
     */
    @Test
    void testIntersperse_listWithTenElements() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int delimiter = 4;
        List<Object> expected = List.of(1, 4, 2, 4, 3, 4, 4, 5, 4, 6, 4, 7, 4, 8, 4, 9, 4, 10);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the delimiter is zero.
     */
    @Test
    void testIntersperse_delimiterIsZero() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int delimiter = 0;
        List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the delimiter is negative.
     */
    @Test
    void testIntersperse_delimiterIsNegative() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int delimiter = -1;
        List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }

    /**
     * Test case for {@link Intersperse#intersperse(List, int)} where the delimiter is positive.
     */
    @Test
    void testIntersperse_delimiterIsPositive() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int delimiter = 1;
        List<Object> expected = List.of(1, 1, 2, 1, 3, 1, 4, 1, 5, 1, 6, 1, 7, 1, 8, 1, 9, 1, 10);
        assertEquals(expected, Intersperse.intersperse(numbers, delimiter));
    }
}
