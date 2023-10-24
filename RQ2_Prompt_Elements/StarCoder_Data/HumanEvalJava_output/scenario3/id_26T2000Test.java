// RemoveDuplicatesTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveDuplicates}.
* It contains ten unit test cases for the {@link RemoveDuplicates#removeDuplicates(List)} method.
*/
class RemoveDuplicatesTest {

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     */
    @Test
    void testRemoveDuplicates() {
        List<Object> numbers = List.of(1, 2, 3, 2, 4);
        List<Object> expected = List.of(1, 3, 4);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     */
    @Test
    void testRemoveDuplicatesEmpty() {
        List<Object> numbers = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     */
    @Test
    void testRemoveDuplicatesSingle() {
        List<Object> numbers = List.of(1, 2, 3, 4);
        List<Object> expected = List.of(1, 2, 3, 4);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }

    /**
     * Test case for the {@link RemoveDuplicates#removeDuplicates(List)} method.
     */
    @Test
    void testRemoveDuplicatesMultiple() {
        List<Object> numbers = List.of(1, 2, 3, 2, 4, 3, 5);
        List<Object> expected = List.of(1, 4, 5);
        assertEquals(expected, RemoveDuplicates.removeDuplicates(numbers));
    }
}
