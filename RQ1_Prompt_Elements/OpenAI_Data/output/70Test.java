// StrangeSortListTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link StrangeSortList}.
 * It contains ten test cases for the {@link scenario1.StrangeSortList#strangeSortList()} method.
 */
class StrangeSortListTest {
		


    @Test
    void testStrangeSortList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(10, result.size());
        assertEquals(1, result.get(0));
        assertEquals(10, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(9, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(8, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(7, result.get(7));
        assertEquals(5, result.get(8));
        assertEquals(6, result.get(9));
    }

    @Test
    void testStrangeSortList2() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(9, result.size());
        assertEquals(1, result.get(0));
        assertEquals(9, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(8, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(7, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(6, result.get(7));
        assertEquals(5, result.get(8));
    }

    @Test
    void testStrangeSortList3() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(8, result.size());
        assertEquals(1, result.get(0));
        assertEquals(8, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(7, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(6, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(5, result.get(7));
    }

    @Test
    void testStrangeSortList4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        assertEquals(7, result.size());
        assertEquals(1, result.get(0));
        assertEquals(7, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(6, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(5, result.get(5