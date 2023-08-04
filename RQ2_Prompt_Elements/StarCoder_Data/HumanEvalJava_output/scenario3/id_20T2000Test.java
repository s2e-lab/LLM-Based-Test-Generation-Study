// FindClosestElementsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindClosestElements}.
* It contains ten unit test cases for the {@link FindClosestElements#findClosestElements(List)} method.
*/
class FindClosestElementsTest {

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of numbers of length at least two.
     */
    @Test
    void testFindClosestElements() {
        List<Double> numbers = List.of(1.0, 2.0, 3.9, 4.0, 5.0, 2.2);
        List<Double> expected = List.of(3.9, 4.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of numbers of length at least two.
     */
    @Test
    void testFindClosestElements2() {
        List<Double> numbers = List.of(1.0, 2.0, 5.9, 4.0, 5.0);
        List<Double> expected = List.of(5.0, 5.9);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of numbers of length at least two.
     */
    @Test
    void testFindClosestElements3() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.2);
        List<Double> expected = List.of(2.0, 2.2);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of numbers of length at least two.
     */
    @Test
    void testFindClosestElements4() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 2.0);
        List<Double> expected = List.of(2.0, 2.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of numbers of length at least two.
     */
    @Test
    void testFindClosestElements5() {
        List<Double> numbers = List.of(1.1, 2.2, 3.1, 4.1, 5.1);
        List<Double> expected = List.of(2.2, 3.1);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with an empty list.
     */
    @Test
    void testFindClosestElements6() {
        List<Double> numbers = List.of();
        List<Double> expected = List.of();
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length one.
     */
    @Test
    void testFindClosestElements7() {
        List<Double> numbers = List.of(1.0);
        List<Double> expected = List.of(1.0, 1.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length two.
     */
    @Test
    void testFindClosestElements8() {
        List<Double> numbers = List.of(1.0, 2.0);
        List<Double> expected = List.of(1.0, 2.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length three.
     */
    @Test
    void testFindClosestElements9() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0);
        List<Double> expected = List.of(1.0, 3.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }

    /**
     * Test case for the {@link FindClosestElements#findClosestElements(List)} method.
     * It tests the method with a list of length four.
     */
    @Test
    void testFindClosestElements10() {
        List<Double> numbers = List.of(1.0, 2.0, 3.0, 4.0);
        List<Double> expected = List.of(1.0, 4.0);
        assertEquals(expected, FindClosestElements.findClosestElements(numbers));
    }
}
