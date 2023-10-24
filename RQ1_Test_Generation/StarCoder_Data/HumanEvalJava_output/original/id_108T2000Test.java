// CountNumsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

    /**
    * Test case number: 1
    * Test case values: []
    */
    @Test
    void test1() {
        List<Object> arr = List.of();
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 2
    * Test case values: [-1, 11, -11]
    */
    @Test
    void test2() {
        List<Object> arr = List.of(-1, 11, -11);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 3
    * Test case values: [1, 1, 2]
    */
    @Test
    void test3() {
        List<Object> arr = List.of(1, 1, 2);
        int expected = 3;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 4
    * Test case values: [1, 6, 9, -6, 0, 1, 5]
    */
    @Test
    void test4() {
        List<Object> arr = List.of(1, 6, 9, -6, 0, 1, 5);
        int expected = 5;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 5
    * Test case values: [1, 100, 98, -7, 1, -1]
    */
    @Test
    void test5() {
        List<Object> arr = List.of(1, 100, 98, -7, 1, -1);
        int expected = 4;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 6
    * Test case values: [12, 23, 34, -45, -56, 0]
    */
    @Test
    void test6() {
        List<Object> arr = List.of(12, 23, 34, -45, -56, 0);
        int expected = 5;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 7
    * Test case values: [0, 1]
    */
    @Test
    void test7() {
        List<Object> arr = List.of(0, 1);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 8
    * Test case values: [1]
    */
    @Test
    void test8() {
        List<Object> arr = List.of(1);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 9
    * Test case values: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
    */
    @Test
    void test9() {
        List<Object> arr = List.of(1, 1, 1, 1, 1, 1, 1, 1, 1, 1);
        int expected = 10;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case number: 10
    * Test case values: [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 