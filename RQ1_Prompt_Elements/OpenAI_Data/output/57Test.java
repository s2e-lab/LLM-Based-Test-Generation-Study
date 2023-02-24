// MonotonicTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Monotonic}.
 * It contains ten test cases for the {@link scenario1.Monotonic#monotonic()} method.
 */
class MonotonicTest {
		


    @Test
    void testMonotonic() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic2() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(9);
        l.add(8);
        l.add(7);
        l.add(6);
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic3() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.add(18);
        l.add(19);
        l.add(20);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic4() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(20);
        l.add(19);
        l.add(18);
        l.add(17);
        l.add(16);
        l.add(15);
        l.add(14);
        l.add(13);
        l.add(12);
        l.add(11);
        l.add(10);
        l.add(9);
        l.add(8);
        l.add(7);
        l.add(6);
        l.add(5);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        assertTrue(Monotonic.monotonic(l));
    }

    @Test
    void testMonotonic5() {
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(9);
        l.add(10);
        l.add(11);
        l.add(12);
        l.add(13);
        l.add(14);
        l.add(15);
        l.add(16);
        l.add(17);
        l.add(18);
        l.add(19);
        l.add(20);
        l.add(21);
        l.add(22);
        l.add(23);
        l.add(24);
        l.add(25);
        l.add(26);
        l.add(27);
        l.add(28);
        l.add(29);
        l.add(30);
        l.add(31);
        l.add(32);
        l.add(33);
        l.add(34);
        l.add(35);
        l.add(36);
        l.add(37);
        l.add(38);
        l.add(39);
        l.add(40);
        l.add(41