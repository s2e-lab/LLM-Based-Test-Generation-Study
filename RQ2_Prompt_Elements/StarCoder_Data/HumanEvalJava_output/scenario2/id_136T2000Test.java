// LargestSmallestIntegersTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LargestSmallestIntegers}.
* It contains ten unit test cases for the {@link LargestSmallestIntegers#largestSmallestIntegers(List)} method.
*/
class LargestSmallestIntegersTest {

    /**
    * Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
    * with a list of integers.
    */
    @Test
    void testLargestSmallestIntegersWithIntegers() {
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
        assertEquals(2, result.size());
        assertEquals(10, result.get(0).intValue());
        assertEquals(1, result.get(1).intValue());
    }

    /**
    * Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
    * with a list of integers and a null value.
    */
    @Test
    void testLargestSmallestIntegersWithIntegersAndNull() {
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
        lst.add(null);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(2, result.size());
        assertEquals(10, result.get(0).intValue());
        assertEquals(1, result.get(1).intValue());
    }

    /**
    * Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
    * with a list of integers and a null value.
    */
    @Test
    void testLargestSmallestIntegersWithIntegersAndNulls() {
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
        lst.add(null);
        lst.add(null);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(2, result.size());
        assertEquals(10, result.get(0).intValue());
        assertEquals(1, result.get(1).intValue());
    }

    /**
    * Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
    * with a list of integers and a null value.
    */
    @Test
    void testLargestSmallestIntegersWithIntegersAndNullsAndEmpty() {
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
        lst.add(null);
        lst.add(null);
        lst.add(null);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(2, result.size());
        assertEquals(10, result.get(0).intValue());
        assertEquals(1, result.get(1).intValue());
    }

    /**
    * Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
    * with a list of integers and a null value.
    */
    @Test
    void testLargestSmallestIntegersWithIntegersAndNullsAndEmptyAndNull() {
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
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(2, result.size());
        assertEquals(10, result.get(0).intValue());
        assertEquals(1, result.get(1).intValue());
    }

    /**
    * Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
    * with a list of integers and a null value.
    */
    @Test
    void testLargestSmallestIntegersWithIntegersAndNullsAndEmptyAndNullAndIntegers() {
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
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(11);
        lst.add(12);
        lst.add(13);
        lst.add(14);
        lst.add(15);
        lst.add(16);
        lst.add(17);
        lst.add(18);
        lst.add(19);
        lst.add(20);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(2, result.size());
        assertEquals(20, result.get(0).intValue());
        assertEquals(1, result.get(1).intValue());
    }

    /**
    * Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
    * with a list of integers and a null value.
    */
    @Test
    void testLargestSmallestIntegersWithIntegersAndNullsAndEmptyAndNullAndIntegersAndNegativeIntegers() {
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
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(11);
        lst.add(12);
        lst.add(13);
        lst.add(14);
        lst.add(15);
        lst.add(16);
        lst.add(17);
        lst.add(18);
        lst.add(19);
        lst.add(20);
        lst.add(-1);
        lst.add(-2);
        lst.add(-3);
        lst.add(-4);
        lst.add(-5);
        lst.add(-6);
        lst.add(-7);
        lst.add(-8);
        lst.add(-9);
        lst.add(-10);
        List<Integer> result = LargestSmallestIntegers.largestSmallestIntegers(lst);
        assertEquals(2, result.size());
        assertEquals(20, result.get(0).intValue());
        assertEquals(-10, result.get(1).intValue());
    }

    /**
    * Test case for {@link LargestSmallestIntegers#largestSmallestIntegers(List)}
    * with a list of integers and a null value.
    */
    @Test
    void testLargestSmallestIntegersWithIntegersAndNullsAndEmptyAndNullAndIntegersAndNegativeIntegersAndPositiveIntegers() {
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
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(null);
        lst.add(11);
        lst.add(12);
        lst.add(13);
        lst.add(14);
        lst.