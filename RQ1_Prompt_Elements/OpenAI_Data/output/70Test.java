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
* It contains ten test cases for the {@link StrangeSortList#strangeSortList()} method.
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
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(10);
        expected.add(2);
        expected.add(9);
        expected.add(3);
        expected.add(8);
        expected.add(4);
        expected.add(7);
        expected.add(5);
        expected.add(6);
        assertEquals(expected, result);
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
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(9);
        expected.add(2);
        expected.add(8);
        expected.add(3);
        expected.add(7);
        expected.add(4);
        expected.add(6);
        expected.add(5);
        assertEquals(expected, result);
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
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(8);
        expected.add(2);
        expected.add(7);
        expected.add(3);
        expected.add(6);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, result);
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
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(7);
        expected.add(2);
        expected.add(6);
        expected.add(3);
        expected.add(5);
        expected.add(4);
        assertEquals(expected, result);
    }

    @Test
    void testStrangeSortList5() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        List<Object> result = StrangeSortList.strangeSortList(lst);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(6