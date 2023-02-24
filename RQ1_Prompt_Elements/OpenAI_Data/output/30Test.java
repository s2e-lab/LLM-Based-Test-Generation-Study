// GetPositiveTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link GetPositive}.
 * It contains ten test cases for the {@link scenario1.GetPositive#getPositive()} method.
 */
class GetPositiveTest {
		


    @Test
    void testGetPositive() {
        List<Object> l = new ArrayList<Object>();
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
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(10, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals(7, result.get(6));
        assertEquals(8, result.get(7));
        assertEquals(9, result.get(8));
        assertEquals(10, result.get(9));
    }

    @Test
    void testGetPositive2() {
        List<Object> l = new ArrayList<Object>();
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
        List<Object> result = GetPositive.getPositive(l);
        assertEquals(20, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals(7, result.get(6));
        assertEquals(8, result.get(7));
        assertEquals(9, result.get(8));
        assertEquals(10, result.get(9));
        assertEquals(11, result.get(10));
        assertEquals(12, result.get(11));
        assertEquals(13, result.get(12));
        assertEquals(14, result.get(13));
        assertEquals(15, result.get(14));
        assertEquals(16, result.get(15));
        assertEquals(17, result.get(16));
        assertEquals(18, result.get(17));
        assertEquals(19, result.get(18));
        assertEquals(20, result.get(19));
    }

    @Test
    void testGetPositive3() {
        List<Object> l = new ArrayList<Object>();
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
        l