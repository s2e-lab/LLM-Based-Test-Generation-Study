// DerivativeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains ten unit test cases for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {

    @Test
    void testDerivative() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(9);
        expected.add(16);
        expected.add(25);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative2() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(9);
        expected.add(16);
        expected.add(25);
        expected.add(36);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative3() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(1);
        xs.add(2);
        xs.add(3);
        xs.add(4);
        xs.add(5);
        xs.add(6);
        xs.add(7);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(9);
        expected.add(16);
        expected.add(25);
        expected.add(36);
        expected.add(49);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative4() {
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
        expected.add(1);
        expected.add(4);
        expected.add(9);
        expected.add(16);
        expected.add(25);
        expected.add(36);
        expected.add(49);
        expected.add(64);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative5() {
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
        expected.add(1);
        expected.add(4);
        expected.add(9);
        expected.add(16);
        expected.add(25);
        expected.add(36);
        expected.add(49);
        expected.add(64);
        expected.add(81);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative6() {
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
        expected.add(1);
        expected.add(4);
        expected.add(9);
        expected.add(16);
        expected.add(25);
        expected.add(36);
        expected.add(49);
        expected.add(64);
        expected.add(81);
        expected.add(100);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative7() {
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
        xs.add(11);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(9);
        expected.add(16);
        expected.add(25);
        expected.add(36);
        expected.add(49);
        expected.add(64);
        expected.add(81);
        expected.add(100);
        expected.add(121);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative8() {
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
        xs.add(11);
        xs.add(12);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(9);
        expected.add(16);
        expected.add(25);
        expected.add(36);
        expected.add(49);
        expected.add(64);
        expected.add(81);
        expected.add(100);
        expected.add(121);
        expected.add(144);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative9() {
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
        xs.add(11);
        xs.add(12);
        xs.add(13);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(9);
        expected.add(16);
        expected.add(25);
        expected.add(36);
        expected.add(49);
        expected.add(64);
        expected.add(81);
        expected.add(100);
        expected.add(121);
        expected.add(144);
        expected.add(169);
        List<Object> actual = Derivative.derivative(xs);
        assertEquals(expected, actual);
    }

    @Test
    void testDerivative10() {
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
        xs.add(11);
        xs.add(12);
        xs.add(13);
        xs.add(14);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(4);
        expected.add(9);
        expected.add(16);
        expected.add(25);
        expected.add(36);
        expected.add(49);
        expected.add(64);
        expected.add(81);
        expected.add(100);
        expected.add(121);
        expected.add(144);
        expected.add(169);
        expected.add(196);