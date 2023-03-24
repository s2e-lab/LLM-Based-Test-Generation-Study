// MaxElementTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {
    
    @Test
    void testMaxElementWithPositiveNumbers() {
        List<Integer> l = Arrays.asList(1, 2, 3);
        assertEquals(3, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithNegativeNumbers() {
        List<Integer> l = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        assertEquals(123, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithRepeatedNumbers() {
        List<Integer> l = Arrays.asList(1, 2, 3);
        assertEquals(3, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithLargestNumberAtTheEnd() {
        List<Integer> l = Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
        assertEquals(124, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithLargestNumberAtTheBeginning() {
        List<Integer> l = Arrays.asList(124, 5, 3, -5, 2, -3, 3, 9, 0, 1, -10);
        assertEquals(124, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithOneElement() {
        List<Integer> l = Arrays.asList(5);
        assertEquals(5, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithEmptyList() {
        List<Integer> l = Arrays.asList();
        assertThrows(IllegalArgumentException.class, () -> MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithNullList() {
        assertThrows(NullPointerException.class, () -> MaxElement.maxElement(null));
    }
    
    @Test
    void testMaxElementWithMaxValue() {
        List<Integer> l = Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, MaxElement.maxElement(l));
    }
    
    @Test
    void testMaxElementWithMinValue() {
        List<Integer> l = Arrays.asList(Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertEquals(Integer.MAX_VALUE, MaxElement.maxElement(l));
    }
}