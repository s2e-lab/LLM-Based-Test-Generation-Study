// LargestSmallestIntegersTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link LargestSmallestIntegers}.
* It contains ten test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers()} method.
*/
class LargestSmallestIntegersTest {


    @Test
    void testLargestSmallestIntegers() {
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
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(result.get(0), 1);
        assertEquals(result.get(1), 10);
    }

    @Test
    void testLargestSmallestIntegers2() {
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
        lst.add(-10);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(result.get(0), -10);
        assertEquals(result.get(1), 1);
    }

    @Test
    void testLargestSmallestIntegers3() {
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
        lst.add(-10);
        lst.add(-11);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(result.get(0), -11);
        assertEquals(result.get(1), 1);
    }

    @Test
    void testLargestSmallestIntegers4() {
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
        lst.add(-10);
        lst.add(-11);
        lst.add(-12);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(result.get(0), -12);
        assertEquals(result.get(1), 1);
    }

    @Test
    void testLargestSmallestIntegers5() {
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
        lst.add(-10);
        lst.add(-11);
        lst.add(-12);
        lst.add(-13);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(result.get(0), -13);
        assertEquals(result.get(1), 1);
    }

    @Test
    void testLargestSmallestIntegers6() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.