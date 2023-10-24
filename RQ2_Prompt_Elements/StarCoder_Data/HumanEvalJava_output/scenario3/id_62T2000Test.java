// DerivativeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list is empty.
     */
    @Test
    void testDerivativeEmpty() {
        List<Integer> xs = List.of();
        List<Object> expected = List.of();
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list contains one element.
     */
    @Test
    void testDerivativeOneElement() {
        List<Integer> xs = List.of(1);
        List<Object> expected = List.of();
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list contains two elements.
     */
    @Test
    void testDerivativeTwoElements() {
        List<Integer> xs = List.of(1, 2);
        List<Object> expected = List.of(2);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list contains three elements.
     */
    @Test
    void testDerivativeThreeElements() {
        List<Integer> xs = List.of(1, 2, 3);
        List<Object> expected = List.of(2, 6);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list contains four elements.
     */
    @Test
    void testDerivativeFourElements() {
        List<Integer> xs = List.of(1, 2, 3, 4);
        List<Object> expected = List.of(2, 6, 12);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list contains five elements.
     */
    @Test
    void testDerivativeFiveElements() {
        List<Integer> xs = List.of(1, 2, 3, 4, 5);
        List<Object> expected = List.of(2, 6, 12, 20);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list contains six elements.
     */
    @Test
    void testDerivativeSixElements() {
        List<Integer> xs = List.of(1, 2, 3, 4, 5, 6);
        List<Object> expected = List.of(2, 6, 12, 20, 30);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list contains seven elements.
     */
    @Test
    void testDerivativeSevenElements() {
        List<Integer> xs = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Object> expected = List.of(2, 6, 12, 20, 30, 42);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list contains eight elements.
     */
    @Test
    void testDerivativeEightElements() {
        List<Integer> xs = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        List<Object> expected = List.of(2, 6, 12, 20, 30, 42, 56);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list contains nine elements.
     */
    @Test
    void testDerivativeNineElements() {
        List<Integer> xs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Object> expected = List.of(2, 6, 12, 20, 30, 42, 56, 72);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case where the input list contains ten elements.
     */
    @Test
    void testDerivativeTenElements() {
        List<Integer> xs = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Object> expected = List.of(2, 6, 12, 20, 30, 42, 56, 72, 90);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }
}
