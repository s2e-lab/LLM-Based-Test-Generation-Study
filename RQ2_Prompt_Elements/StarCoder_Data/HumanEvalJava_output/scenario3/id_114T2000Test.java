// MinsubarraysumTest.java
package scenario3;

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
    * Test case values: [2, 3, 4, 1, 2, 4]
    * Expected output (Post-state): 1
    */
    @Test
    void test1() {
        List<Object> nums = List.of(2, 3, 4, 1, 2, 4);
        long expected = 1;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values: [-1, -2, -3]
    * Expected output (Post-state): -6
    */
    @Test
    void test2() {
        List<Object> nums = List.of(-1, -2, -3);
        long expected = -6;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values: [-1, -2, -3, 2, -10]
    * Expected output (Post-state): -14
    */
    @Test
    void test3() {
        List<Object> nums = List.of(-1, -2, -3, 2, -10);
        long expected = -14;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values: [-9999999999999999L]
    * Expected output (Post-state): -9999999999999999L
    */
    @Test
    void test4() {
        List<Object> nums = List.of(-9999999999999999L);
        long expected = -9999999999999999L;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values: [0, 10, 20, 1000000]
    * Expected output (Post-state): 0
    */
    @Test
    void test5() {
        List<Object> nums = List.of(0, 10, 20, 1000000);
        long expected = 0;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values: [-1, -2, -3, 10, -5]
    * Expected output (Post-state): -6
    */
    @Test
    void test6() {
        List<Object> nums = List.of(-1, -2, -3, 10, -5);
        long expected = -6;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 7
    * Test case values: [100, -1, -2, -3, 10, -5]
    * Expected output (Post-state): -6
    */
    @Test
    void test7() {
        List<Object> nums = List.of(100, -1, -2, -3, 10, -5);
        long expected = -6;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 8
    * Test case values: [10, 11, 13, 8, 3, 4]
    * Expected output (Post-state): 3
    */
    @Test
    void test8() {
        List<Object> nums = List.of(10, 11, 13, 8, 3, 4);
        long expected = 3;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 9
    * Test case values: [100, -33, 32, -1, 0, -2]
    * Expected output (Post-state): -33
    */
    @Test
    void test9() {
        List<Object> nums = List.of(100, -33, 32, -1, 0, -2);
        long expected = -33;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 10
    * Test case values: [-10]
    * Expected output (Post-state): -10
    */
    @Test
    void test10() {
        List<Object> nums = List.of(-10);
        long expected = -10;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 11
    * Test case values: [7]
    * Expected output (Post-state): 7
    */
    @Test
    void test11() {
        List<Object> nums = List.of(7);
        long expected = 7;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 12
    * Test case values: [1, -1]
    * Expected output (Post-state): -1
    */
    @Test
    void test12() {
        List<Object> nums = List.of(1, -1);
        long expected = -1;
        long actual = Minsubarraysum.minsubarraysum(nums);
        assertEquals(expected, actual);
    }
}
