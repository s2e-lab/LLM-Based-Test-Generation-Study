// GetRowTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains ten unit test cases for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {
    
    @Test
    void testEmptyList() {
        List<Object> lst = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GetRow.getRow(lst, 1));
    }
    
    @Test
    void testSingleElementList() {
        List<Object> lst = Arrays.asList(Arrays.asList(1));
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GetRow.getRow(lst, 2));
    }
    
    @Test
    void testElementNotFound() {
        List<Object> lst = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GetRow.getRow(lst, 6));
    }
    
    @Test
    void testSingleElementFound() {
        List<Object> lst = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4, 5));
        List<Object> expected = Arrays.asList(Arrays.asList(0, 1));
        assertEquals(expected, GetRow.getRow(lst, 2));
    }
    
    @Test
    void testMultipleElementsFound() {
        List<Object> lst = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6), Arrays.asList(1, 2, 3, 4, 1, 6), Arrays.asList(1, 2, 3, 4, 5, 1));
        List<Object> expected = Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 4), Arrays.asList(1, 0), Arrays.asList(2, 5), Arrays.asList(2, 0));
        assertEquals(expected, GetRow.getRow(lst, 1));
    }
    
    @Test
    void testMultipleElementsFoundWithDuplicates() {
        List<Object> lst = Arrays.asList(Arrays.asList(1, 2, 3, 4, 5, 6), Arrays.asList(1, 2, 3, 4, 1, 6), Arrays.asList(1, 2, 3, 4, 5, 1), Arrays.asList(1, 2, 3, 4, 1, 6));
        List<Object> expected = Arrays.asList(Arrays.asList(0, 0), Arrays.asList(1, 4), Arrays.asList(1, 0), Arrays.asList(2, 5), Arrays.asList(2, 0), Arrays.asList(3, 4), Arrays.asList(3, 0));
        assertEquals(expected, GetRow.getRow(lst, 1));
    }
    
    @Test
    void testListWithEmptySublists() {
        List<Object> lst = Arrays.asList(Arrays.asList(), Arrays.asList(1), Arrays.asList(1, 2, 3));
        List<Object> expected = Arrays.asList(Arrays.asList(2, 2));
        assertEquals(expected, GetRow.getRow(lst, 3));
    }
    
    @Test
    void testListWithNullSublists() {
        List<Object> lst = Arrays.asList(null, Arrays.asList(1), Arrays.asList(1, 2, 3));
        List<Object> expected = Arrays.asList(Arrays.asList(2, 2));
        assertEquals(expected, GetRow.getRow(lst, 3));
    }
    
    @Test
    void testListWithNullElements() {
        List<Object> lst = Arrays.asList(Arrays.asList(1, null, 3), Arrays.asList(1, 2, 3), Arrays.asList(null, 2, 3));
        List<Object> expected = Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(2, 2));
        assertEquals(expected, GetRow.getRow(lst, null));
    }
    
    @Test
    void testListWithNegativeElements() {
        List<Object> lst = Arrays.asList(Arrays.asList(-1, 2, -3), Arrays.asList(1, -2, 3), Arrays.asList(-1, -2, -3));
        List<Object> expected = Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2), Arrays.asList(2, 1));
        assertEquals(expected, GetRow.getRow(lst, -2));
    }
}