// RollingMaxTest.java
package scenario2;

import java.util.ArrayList;
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
     * It tests the method with a list of integers.
     */
    @Test
    void testRollingMax() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testRollingMax2() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        expected.add(11);
        expected.add(12);
        expected.add(13);
        expected.add(14);
        expected.add(15);
        expected.add(16);
        expected.add(17);
        expected.add(18);
        expected.add(19);
        expected.add(20);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testRollingMax3() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        numbers.add(21);
        numbers.add(22);
        numbers.add(23);
        numbers.add(24);
        numbers.add(25);
        numbers.add(26);
        numbers.add(27);
        numbers.add(28);
        numbers.add(29);
        numbers.add(30);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        expected.add(11);
        expected.add(12);
        expected.add(13);
        expected.add(14);
        expected.add(15);
        expected.add(16);
        expected.add(17);
        expected.add(18);
        expected.add(19);
        expected.add(20);
        expected.add(21);
        expected.add(22);
        expected.add(23);
        expected.add(24);
        expected.add(25);
        expected.add(26);
        expected.add(27);
        expected.add(28);
        expected.add(29);
        expected.add(30);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testRollingMax4() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);
        numbers.add(21);
        numbers.add(22);
        numbers.add(23);
        numbers.add(24);
        numbers.add(25);
        numbers.add(26);
        numbers.add(27);
        numbers.add(28);
        numbers.add(29);
        numbers.add(30);
        numbers.add(31);
        numbers.add(32);
        numbers.add(33);
        numbers.add(34);
        numbers.add(35);
        numbers.add(36);
        numbers.add(37);
        numbers.add(38);
        numbers.add(39);
        numbers.add(40);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);
        expected.add(8);
        expected.add(9);
        expected.add(10);
        expected.add(11);
        expected.add(12);
        expected.add(13);
        expected.add(14);
        expected.add(15);
        expected.add(16);
        expected.add(17);
        expected.add(18);
        expected.add(19);
        expected.add(20);
        expected.add(21);
        expected.add(22);
        expected.add(23);
        expected.add(24);
        expected.add(25);
        expected.add(26);
        expected.add(27);
        expected.add(28);
        expected.add(29);
        expected.add(30);
        expected.add(31);
        expected.add(32);
        expected.add(33);
        expected.add(34);
        expected.add(35);
        expected.add(36);
        expected.add(37);
        expected.add(38);
        expected.add(39);
        expected.add(40);
        List<Object> actual = RollingMax.rollingMax(numbers);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link RollingMax#rollingMax(List)} method.
     * It tests the method with a list of integers.
     */
    @Test
    void testRollingMax5() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers