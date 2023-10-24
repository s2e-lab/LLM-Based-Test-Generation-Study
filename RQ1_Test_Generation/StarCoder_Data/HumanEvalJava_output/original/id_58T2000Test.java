// CommonTest.java
package original;

import java.util.*;
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
        List<Integer> l1 = Arrays.asList(1, 4, 3, 34, 653, 2, 5);
        List<Object> l2 = Arrays.asList(5, 7, 1, 5, 9, 653, 121);
        List<Object> expected = Arrays.asList(1, 5, 653);
        assertEquals(expected, Common.common(l1, l2));

        l1 = Arrays.asList(5, 3, 2, 8);
        l2 = Arrays.asList(3, 2);
        expected = Arrays.asList(2, 3);
        assertEquals(expected, Common.common(l1, l2));

        l1 = Arrays.asList(4, 3, 2, 8);
        l2 = Arrays.asList(3, 2, 4);
        expected = Arrays.asList(2, 3, 4);
        assertEquals(expected, Common.common(l1, l2));

        l1 = Arrays.asList(4, 3, 2, 8);
        l2 = Arrays.asList();
        expected = Arrays.asList();
        assertEquals(expected, Common.common(l1, l2));
    }
}
