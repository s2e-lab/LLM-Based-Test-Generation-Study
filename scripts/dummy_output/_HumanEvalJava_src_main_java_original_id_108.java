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
        List<Integer> arr = Arrays.asList();
        assertEquals(0, CountNums.countNums(arr));
    }
    
    @Test
    void testAllNegativeNumbers() {
        List<Integer> arr = Arrays.asList(-1, -2, 0);
        assertEquals(0, CountNums.countNums(arr));
    }
    
    @Test
    void testAllPositiveNumbers() {
        List<Integer> arr = Arrays.asList(1, 1, 2, -2, 3, 4, 5);
        assertEquals(6, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbers() {
        List<Integer> arr = Arrays.asList(1, 6, 9, -6, 0, 1, 5);
        assertEquals(5, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbersWithNegativeSignedDigits() {
        List<Integer> arr = Arrays.asList(1, 100, 98, -7, 1, -1);
        assertEquals(4, CountNums.countNums(arr));
    }
    
    @Test
    void testMixedNumbersWithZero() {
        List<Integer> arr = Arrays.asList(12, 23, 34, -45, -56, 0);
        assertEquals(5, CountNums.countNums(arr));
    }
    
    @Test
    void testListWithOneZero() {
        List<Integer> arr = Arrays.asList(0, 1);
        assertEquals(1, CountNums.countNums(arr));
    }
    
    @Test
    void testListWithOnePositiveNumber() {
        List<Integer> arr = Arrays.asList(1);
        assertEquals(1, CountNums.countNums(arr));
    }
    
    @Test
    void testListWithOneNegativeNumber() {
        List<Integer> arr = Arrays.asList(-1);
        assertEquals(1, CountNums.countNums(arr));
    }
    
    @Test
    void testListWithOneNegativeNumberWithNegativeSignedDigit() {
        List<Integer> arr = Arrays.asList(-123);
        assertEquals(1, CountNums.countNums(arr));
    }
}