// MinsubarraysumTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {

    /**
    * Test case number: 1
    * Test case values: [[1, 2, 3, 4, 5], 15]
    */
    @Test
    void testcase1() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        long expected = 15;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values: [[1, 2, 3, 4, 5], 10]
    */
    @Test
    void testcase2() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        long expected = 10;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values: [[1, 2, 3, 4, 5], 11]
    */
    @Test
    void testcase3() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        long expected = 11;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values: [[1, 2, 3, 4, 5], 12]
    */
    @Test
    void testcase4() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        long expected = 12;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values: [[1, 2, 3, 4, 5], 13]
    */
    @Test
    void testcase5() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        long expected = 13;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values: [[1, 2, 3, 4, 5], 14]
    */
    @Test
    void testcase6() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        long expected = 14;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 7
    * Test case values: [[1, 2, 3, 4, 5], 16]
    */
    @Test
    void testcase7() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        long expected = 16;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 8
    * Test case values: [[1, 2, 3, 4, 5], 17]
    */
    @Test
    void testcase8() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        long expected = 17;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 9
    * Test case values: [[1, 2, 3, 4, 5], 18]
    */
    @Test
    void testcase9() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        long expected = 18;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 10
    * Test case values: [[1, 2, 3, 4, 5], 19]
    */
    @Test
    void testcase10() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        long expected = 19;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
}
