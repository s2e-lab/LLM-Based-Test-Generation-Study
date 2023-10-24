// CountNumsTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

    /**
    * Test case for {@link CountNums#countNums(List)}.
    * The expected result is 0.
    */
    @Test
    void testCountNums0() {
        List<Object> arr = List.of();
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link CountNums#countNums(List)}.
    * The expected result is 0.
    */
    @Test
    void testCountNums1() {
        List<Object> arr = List.of(-1, 11, -11);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link CountNums#countNums(List)}.
    * The expected result is 3.
    */
    @Test
    void testCountNums2() {
        List<Object> arr = List.of(1, 1, 2);
        int expected = 3;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link CountNums#countNums(List)}.
    * The expected result is 6.
    */
    @Test
    void testCountNums3() {
        List<Object> arr = List.of(1, 1, 2, -2, 3, 4, 5);
        int expected = 6;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link CountNums#countNums(List)}.
    * The expected result is 5.
    */
    @Test
    void testCountNums4() {
        List<Object> arr = List.of(1, 6, 9, -6, 0, 1, 5);
        int expected = 5;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link CountNums#countNums(List)}.
    * The expected result is 4.
    */
    @Test
    void testCountNums5() {
        List<Object> arr = List.of(1, 100, 98, -7, 1, -1);
        int expected = 4;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link CountNums#countNums(List)}.
    * The expected result is 5.
    */
    @Test
    void testCountNums6() {
        List<Object> arr = List.of(12, 23, 34, -45, -56, 0);
        int expected = 5;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link CountNums#countNums(List)}.
    * The expected result is 1.
    */
    @Test
    void testCountNums7() {
        List<Object> arr = List.of(0, 1);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link CountNums#countNums(List)}.
    * The expected result is 1.
    */
    @Test
    void testCountNums8() {
        List<Object> arr = List.of(1);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
}
