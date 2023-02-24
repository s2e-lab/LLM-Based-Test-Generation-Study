// IsSortedTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link IsSorted}.
* It contains ten test cases for the {@link IsSorted#isSorted()} method.
*/
class IsSortedTest {


    @Test
    void testIsSorted() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testIsSorted2() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(5);
        assertTrue(IsSorted.isSorted(lst));
    }

    @Test
    void testIsSorted3() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(5);
        lst.add(5);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testIsSorted4() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(5);
        lst.add(5);
        lst.add(6);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testIsSorted5() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(5);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testIsSorted6() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(5);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testIsSorted7() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(5);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testIsSorted8() {
        List<Object> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(5);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        assertFalse(IsSorted.isSorted(lst));
    }

    @Test
    void testIsSorted9() {
        List<Object> lst = new ArrayList<>