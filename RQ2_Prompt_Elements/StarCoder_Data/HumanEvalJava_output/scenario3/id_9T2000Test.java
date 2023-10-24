// RollingMaxTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list is empty.
     */
    @Test
    void testRollingMaxEmptyList() {
        List<Object> numbers = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list contains only one element.
     */
    @Test
    void testRollingMaxSingleElementList() {
        List<Object> numbers = List.of(1);
        List<Object> expected = List.of(1);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list contains two elements.
     */
    @Test
    void testRollingMaxTwoElementList() {
        List<Object> numbers = List.of(1, 2);
        List<Object> expected = List.of(1, 2);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list contains three elements.
     */
    @Test
    void testRollingMaxThreeElementList() {
        List<Object> numbers = List.of(1, 2, 3);
        List<Object> expected = List.of(1, 2, 3);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list contains four elements.
     */
    @Test
    void testRollingMaxFourElementList() {
        List<Object> numbers = List.of(1, 2, 3, 4);
        List<Object> expected = List.of(1, 2, 3, 4);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list contains five elements.
     */
    @Test
    void testRollingMaxFiveElementList() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5);
        List<Object> expected = List.of(1, 2, 3, 4, 5);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list contains six elements.
     */
    @Test
    void testRollingMaxSixElementList() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Object> expected = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list contains seven elements.
     */
    @Test
    void testRollingMaxSevenElementList() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list contains eight elements.
     */
    @Test
    void testRollingMaxEightElementList() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list contains nine elements.
     */
    @Test
    void testRollingMaxNineElementList() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the case where the list contains ten elements.
     */
    @Test
    void testRollingMaxTenElementList() {
        List<Object> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Object> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(expected, RollingMax.rollingMax(numbers));
    }
}
