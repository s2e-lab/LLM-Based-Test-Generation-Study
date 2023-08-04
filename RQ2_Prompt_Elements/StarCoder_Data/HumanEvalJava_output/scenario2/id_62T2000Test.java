// DerivativeTest.java
package scenario2;

import java.util.ArrayList;
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
     * It tests the case when the input is a polynomial with a single term.
     */
    @Test
    void testSingleTerm() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case when the input is a polynomial with two terms.
     */
    @Test
    void testTwoTerms() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case when the input is a polynomial with three terms.
     */
    @Test
    void testThreeTerms() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(3);
        expected.add(6);
        expected.add(0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case when the input is a polynomial with four terms.
     */
    @Test
    void testFourTerms() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(12);
        expected.add(24);
        expected.add(0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case when the input is a polynomial with five terms.
     */
    @Test
    void testFiveTerms() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        expected.add(20);
        expected.add(60);
        expected.add(120);
        expected.add(0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case when the input is a polynomial with six terms.
     */
    @Test
    void testSixTerms() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        List<Object> expected = new ArrayList<Object>();
        expected.add(6);
        expected.add(30);
        expected.add(120);
        expected.add(360);
        expected.add(720);
        expected.add(0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case when the input is a polynomial with seven terms.
     */
    @Test
    void testSevenTerms() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        List<Object> expected = new ArrayList<Object>();
        expected.add(7);
        expected.add(42);
        expected.add(210);
        expected.add(840);
        expected.add(2520);
        expected.add(6300);
        expected.add(0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case when the input is a polynomial with eight terms.
     */
    @Test
    void testEightTerms() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        xs.add(8);
        List<Object> expected = new ArrayList<Object>();
        expected.add(8);
        expected.add(56);
        expected.add(336);
        expected.add(1800);
        expected.add(7200);
        expected.add(21875);
        expected.add(57600);
        expected.add(0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case when the input is a polynomial with nine terms.
     */
    @Test
    void testNineTerms() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        xs.add(8);
        xs.add(9);
        List<Object> expected = new ArrayList<Object>();
        expected.add(9);
        expected.add(72);
        expected.add(504);
        expected.add(3600);
        expected.add(22400);
        expected.add(135135);
        expected.add(756000);
        expected.add(3276800);
        expected.add(0);
        assertEquals(expected, Derivative.derivative(xs));
    }

    /**
     * Test case for the {@link Derivative#derivative(List)} method.
     * It tests the case when the input is a polynomial with ten terms.
     */
    @Test
    void testTenTerms() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        xs.add(8);
        xs.add(9);
        xs.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(10);
        expected.add(88);
        expected.add(720);
        expected.add(6480);
        expected.add(64800);
        expected.add(725760);
        expected.add(9072000);
        expected.add(12252250);
        expected.add(17280000);
        expected.add(0);
        assertEquals(expected, Derivative.derivative(xs));
    }
}
