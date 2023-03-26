// DerivativeTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {

    @Test
    void testDerivative1() {
        List<Integer> xs = Arrays.asList(3, 1, 2, 4, 5);
        List<Integer> expected = Arrays.asList(1, 4, 12, 20);
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivative2() {
        List<Integer> xs = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(2, 6);
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivative3() {
        List<Integer> xs = Arrays.asList(3, 2, 1);
        List<Integer> expected = Arrays.asList(2, 2);
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivative4() {
        List<Integer> xs = Arrays.asList(3, 2, 1, 0, 4);
        List<Integer> expected = Arrays.asList(2, 2, 0, 16);
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivative5() {
        List<Integer> xs = Arrays.asList(1);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivative6() {
        List<Integer> xs = Arrays.asList(0, 0, 0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivative7() {
        List<Integer> xs = Arrays.asList(1, 0, 0, 0, 0);
        List<Integer> expected = Arrays.asList(0, 0, 0, 0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivative8() {
        List<Integer> xs = Arrays.asList(0, 0, 0, 0, 1);
        List<Integer> expected = Arrays.asList(0, 0, 0, 4);
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivative9() {
        List<Integer> xs = Arrays.asList(0, 0, 0, 1, 0);
        List<Integer> expected = Arrays.asList(0, 0, 3, 0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    @Test
    void testDerivative10() {
        List<Integer> xs = Arrays.asList(0, 0, 1, 0, 0);
        List<Integer> expected = Arrays.asList(0, 2, 0, 0);
        assertEquals(expected, Derivative.derivative(xs));
    }
}