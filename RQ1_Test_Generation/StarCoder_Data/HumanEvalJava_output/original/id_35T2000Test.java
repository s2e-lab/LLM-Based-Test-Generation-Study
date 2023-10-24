// MaxElementTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {

    /**
     * Test case for the {@link MaxElement#maxElement(List)} method.
     * Tests that the method returns the maximum element in the list.
     */
    @Test
    void testMaxElement() {
        List<Integer> l1 = List.of(1, 2, 3);
        assertEquals(3, MaxElement.maxElement(l1));
        List<Integer> l2 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10);
        assertEquals(123, MaxElement.maxElement(l2));
        List<Integer> l3 = List.of(1, 2, 3);
        assertEquals(3, MaxElement.maxElement(l3));
        List<Integer> l4 = List.of(5, 3, -5, 2, -3, 3, 9, 0, 124, 1, -10);
        assertEquals(124, MaxElement.maxElement(l4));
    }
}
