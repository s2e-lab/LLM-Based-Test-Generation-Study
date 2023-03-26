// CountNumsTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountNums}.
* It contains ten unit test cases for the {@link CountNums#countNums(List)} method.
*/
class CountNumsTest {

    @Test
    void testCountNums_emptyList() {
        List<Object> arr = Arrays.asList();
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_positiveNumbers() {
        List<Object> arr = Arrays.asList(123, 456, 789);
        int expected = 3;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_negativeNumbers() {
        List<Object> arr = Arrays.asList(-123, -456, -789);
        int expected = 3;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_mixedNumbers() {
        List<Object> arr = Arrays.asList(-123, 456, -789);
        int expected = 3;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_zero() {
        List<Object> arr = Arrays.asList(0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_singleDigitPositive() {
        List<Object> arr = Arrays.asList(5);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_singleDigitNegative() {
        List<Object> arr = Arrays.asList(-5);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_multipleDigitsPositive() {
        List<Object> arr = Arrays.asList(12345, 67890);
        int expected = 2;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_multipleDigitsNegative() {
        List<Object> arr = Arrays.asList(-12345, -67890);
        int expected = 2;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_mixedDigits() {
        List<Object> arr = Arrays.asList(-12345, 67890);
        int expected = 2;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }

    @Test
    void testCountNums_largeNumbers() {
        List<Object> arr = Arrays.asList(1234567890, -987654321);
        int expected = 2;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
}