// PluckTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Pluck}.
 * It contains ten test cases for the {@link scenario1.Pluck#pluck()} method.
 */
class PluckTest {
		


    @Test
    void testPluck() {
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
        List<Object> result = Pluck.pluck(arr);
        assertEquals(2, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void testPluck2() {
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
        List<Object> result = Pluck.pluck(arr);
        assertEquals(2, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void testPluck3() {
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
        List<Object> result = Pluck.pluck(arr);
        assertEquals(2, result.get(0));
        assertEquals(1, result.get(1));
    }

    @Test
    void testPluck4() {
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
        arr