// CommonTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {

    /**
     * Test case for {@link Common#common(List, List)}.
     */
    @Test
    void testCommon() {
        List<Integer> l1 = List.of(1, 4, 3, 34, 653, 2, 5);
        List<Object> l2 = List.of(5, 7, 1, 5, 9, 653, 121);
        List<Object> expected = List.of(1, 5, 653);
        assertEquals(expected, Common.common(l1, l2));

        l1 = List.of(5, 3, 2, 8);
        l2 = List.of(3, 2);
        expected = List.of(2, 3);
        assertEquals(expected, Common.common(l1, l2));

        l1 = List.of(4, 3, 2, 8);
        l2 = List.of(3, 2, 4);
        expected = List.of(2, 3, 4);
        assertEquals(expected, Common.common(l1, l2));

        l1 = List.of(4, 3, 2, 8);
        l2 = List.of();
        expected = List.of();
        assertEquals(expected, Common.common(l1, l2));
    }
}
