// DoubleTheDifferenceTest.java
package original;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {
    
    @Test
    void testEmptyList() {
        List<Object> lst = new ArrayList<>();
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testOnlyEvenNumbers() {
        List<Object> lst = Arrays.asList(2, 4, 6, 8);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testOnlyNegativeNumbers() {
        List<Object> lst = Arrays.asList(-1, -3, -5, -7);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testOnlyZero() {
        List<Object> lst = Arrays.asList(0);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(0, result);
    }
    
    @Test
    void testOnlyOddNumbers() {
        List<Object> lst = Arrays.asList(1, 3, 5, 7);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(84, result);
    }
    
    @Test
    void testMixedNumbers() {
        List<Object> lst = Arrays.asList(-1, 2, 3, 0, 5, -6, 7);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(59, result);
    }
    
    @Test
    void testMixedNumbersWithDecimals() {
        List<Object> lst = Arrays.asList(-1, 2, 3, 0, 5, -6, 7, 0.5, 1.5, 2.5);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(59, result);
    }
    
    @Test
    void testMixedNumbersWithStrings() {
        List<Object> lst = Arrays.asList(-1, 2, "3", 0, 5, -6, 7, "hello");
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(59, result);
    }
    
    @Test
    void testMixedNumbersWithNull() {
        List<Object> lst = Arrays.asList(-1, 2, 3, null, 0, 5, -6, 7);
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(59, result);
    }
    
    @Test
    void testLargeList() {
        List<Object> lst = new ArrayList<>();
        for (int i = -99; i <= 99; i++) {
            lst.add(i);
        }
        int result = DoubleTheDifference.doubleTheDifference(lst);
        assertEquals(166650, result);
    }
}