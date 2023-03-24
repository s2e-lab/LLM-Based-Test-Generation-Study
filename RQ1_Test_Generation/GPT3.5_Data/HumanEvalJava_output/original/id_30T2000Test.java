// GetPositive.java
package updated;

import java.util.ArrayList;
import java.util.List;

class GetPositive {

    /**
     * Return only positive numbers in the list.
     *
     * > getPositive([-1, 2, -4, 5, 6])
     * [2, 5, 6]
     * > getPositive([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
     * [5, 3, 2, 3, 9, 123, 1]
     * > getPositive([-1, -2, 4, 5, 6])
     * [4, 5, 6]
     * > getPositive([5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10])
     * [5, 3, 2, 3, 3, 9, 123, 1]
     * > getPositive([-1, -2])
     * []
     * > getPositive([])
     * []
     */
    public static List<Integer> getPositive(List<Integer> l) {
        List<Integer> result = new ArrayList<Integer>();
        for (Integer value : l) {
            if (value > 0) {
                result.add(value);
            }
        }
        return result;
    }
}

// GetPositiveTest.java
package updated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
    
    @Test
    void testGetPositiveWithPositiveNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetPositiveWithNegativeNumbers() {
        List<Integer> input = Arrays.asList(-1, -2, -3, -4, -5);
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetPositiveWithMixedNumbers() {
        List<Integer> input = Arrays.asList(-1, 2, -3, 4, -5);
        List<Integer> expected = Arrays.asList(2, 4);
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetPositiveWithZero() {
        List<Integer> input = Arrays.asList(0);
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetPositiveWithEmptyList() {
        List<Integer> input = new ArrayList<Integer>();
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetPositiveWithNull() {
        List<Integer> input = null;
        assertThrows(NullPointerException.class, () -> {
            GetPositive.getPositive(input);
        });
    }
    
    @Test
    void testGetPositiveWithLargeList() {
        List<Integer> input = new ArrayList<Integer>();
        for (int i = -100000; i <= 100000; i++) {
            input.add(i);
        }
        List<Integer> expected = new ArrayList<Integer>();
        for (int i = 1; i <= 100000; i++) {
            expected.add(i);
        }
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetPositiveWithSinglePositiveNumber() {
        List<Integer> input = Arrays.asList(5);
        List<Integer> expected = Arrays.asList(5);
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetPositiveWithSingleNegativeNumber() {
        List<Integer> input = Arrays.asList(-5);
        List<Integer> expected = new ArrayList<Integer>();
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }
    
    @Test
    void testGetPositiveWithMultiplePositiveNumbers() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> actual = GetPositive.getPositive(input);
        assertEquals(expected, actual);
    }
}