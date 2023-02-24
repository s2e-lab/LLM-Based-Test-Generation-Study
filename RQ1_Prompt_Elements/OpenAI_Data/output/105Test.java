// ByLengthTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link ByLength}.
 * It contains ten test cases for the {@link scenario1.ByLength#byLength()} method.
 */
class ByLengthTest {
		


    @Test
    void testByLength() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        List<Object> result = ByLength.byLength(arr);
        List<Object> expected = new ArrayList<Object>();
        expected.add("Nine");
        expected.add("Eight");
        expected.add("Seven");
        expected.add("Six");
        expected.add("Five");
        expected.add("Four");
        expected.add("Three");
        expected.add("Two");
        expected.add("One");
        assertEquals(expected, result);
    }

    @Test
    void testByLength2() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        arr.add(18);
        arr.add(19);
        arr.add(20);
        List<Object> result = ByLength.byLength(arr);
        List<Object> expected = new ArrayList<Object>();
        expected.add("Nine");
        expected.add("Eight");
        expected.add("Seven");
        expected.add("Six");
        expected.add("Five");
        expected.add("Four");
        expected.add("Three");
        expected.add("Two");
        expected.add("One");
        assertEquals(expected, result);
    }

    @Test
    void testByLength3() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(17);
        arr.add(18);
        arr.add(19);
        arr.add(20);
        arr.add(21);
        arr.add(22);
        arr.add(23);
        arr.add(24);
        arr.add(25);
        arr.add(26);
        arr.add(27);
        arr.add(28);
        arr.add(29);
        arr.add(30);
        arr.add(31);
        arr.add(32);
        arr.add(33);
        arr.add(34);
        arr.add(35);
        arr.add(36);
        arr.add(37);
        arr.add(38);
        arr.add(39);
        arr.add(40);
        arr.add(41);
        arr.add(42);
        arr.add(43);
        arr.add(44);
        arr.add(45);
        arr.add(46);
        arr.add(47);
        arr.add(48);
        arr.add(49);
        arr.add(50);
        List<Object> result = ByLength.byLength(arr);
        List<Object> expected = new ArrayList<Object>();
        expected.add("Nine");
        expected.add("Eight");
        expected.add("Seven");
        expected.add("Six");
        expected.add("Five");
        expected.add