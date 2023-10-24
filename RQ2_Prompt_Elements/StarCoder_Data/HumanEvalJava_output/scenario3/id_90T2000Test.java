// NextSmallestTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

    /**
     * Test case for the {@link NextSmallest#nextSmallest(List)} method.
     * It tests the following scenario:
     * <ul>
     * <li>The list is not empty.</li>
     * <li>The list contains only one element.</li>
     * <li>The list contains two elements.</li>
     * <li>The list contains three elements.</li>
     * <li>The list contains four elements.</li>
     * <li>The list contains five elements.</li>
     * <li>The list contains six elements.</li>
     * <li>The list contains seven elements.</li>
     * <li>The list contains eight elements.</li>
     * <li>The list contains nine elements.</li>
     * </ul>
     */
    @Test
    void testNextSmallest() {
        // Test case for the list not empty.
        List<Object> lst1 = List.of(1, 2, 3, 4, 5);
        assertEquals(2, NextSmallest.nextSmallest(lst1));

        // Test case for the list contains only one element.
        List<Object> lst2 = List.of(5);
        assertNull(NextSmallest.nextSmallest(lst2));

        // Test case for the list contains two elements.
        List<Object> lst3 = List.of(5, 1);
        assertEquals(1, NextSmallest.nextSmallest(lst3));

        // Test case for the list contains three elements.
        List<Object> lst4 = List.of(5, 1, 4);
        assertEquals(1, NextSmallest.nextSmallest(lst4));

        // Test case for the list contains four elements.
        List<Object> lst5 = List.of(5, 1, 4, 3);
        assertEquals(1, NextSmallest.nextSmallest(lst5));

        // Test case for the list contains five elements.
        List<Object> lst6 = List.of(5, 1, 4, 3, 2);
        assertEquals(1, NextSmallest.nextSmallest(lst6));

        // Test case for the list contains six elements.
        List<Object> lst7 = List.of(5, 1, 4, 3, 2, 1);
        assertEquals(1, NextSmallest.nextSmallest(lst7));

        // Test case for the list contains seven elements.
        List<Object> lst8 = List.of(5, 1, 4, 3, 2, 1, 0);
        assertEquals(0, NextSmallest.nextSmallest(lst8));

        // Test case for the list contains eight elements.
        List<Object> lst9 = List.of(5, 1, 4, 3, 2, 1, 0, -1);
        assertEquals(-1, NextSmallest.nextSmallest(lst9));

        // Test case for the list contains nine elements.
        List<Object> lst10 = List.of(5, 1, 4, 3, 2, 1, 0, -1, -2);
        assertEquals(-1, NextSmallest.nextSmallest(lst10));
    }
}
