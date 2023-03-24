// CountNumsTest.java
package original;

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
    void testEmptyList() {
        List<Object> arr = Arrays.asList();
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllZeros() {
        List<Object> arr = Arrays.asList(0, 0, 0);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllNegatives() {
        List<Object> arr = Arrays.asList(-1, -2, -3);
        int expected = 0;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllPositives() {
        List<Object> arr = Arrays.asList(1, 2, 3);
        int expected = 3;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMixedNumbers() {
        List<Object> arr = Arrays.asList(-1, 11, -11, 1, 1, 2, -2, 3, 4, 5, 1, 6, 9, -6, 0, 1, 5, 1, 100, 98, -7, 1, -1, 12, 23, 34, -45, -56, 0, 0, 1);
        int expected = 20;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSinglePositiveNumber() {
        List<Object> arr = Arrays.asList(1);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSingleNegativeNumber() {
        List<Object> arr = Arrays.asList(-1);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testPositiveNumberWithZero() {
        List<Object> arr = Arrays.asList(1, 0);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNegativeNumberWithZero() {
        List<Object> arr = Arrays.asList(-1, 0);
        int expected = 1;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNegativeNumberWithPositiveDigits() {
        List<Object> arr = Arrays.asList(-123, -456, -789);
        int expected = 9;
        int actual = CountNums.countNums(arr);
        assertEquals(expected, actual);
    }
}