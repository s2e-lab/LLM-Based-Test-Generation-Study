// NextSmallestTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

    /**
    * Test case for {@link NextSmallest#nextSmallest(List)}.
    */
    @Test
    void testNextSmallest() {
        List<Object> lst1 = List.of(1, 2, 3, 4, 5);
        assertEquals(2, NextSmallest.nextSmallest(lst1));
        List<Object> lst2 = List.of(5, 1, 4, 3, 2);
        assertEquals(2, NextSmallest.nextSmallest(lst2));
        List<Object> lst3 = List.of();
        assertNull(NextSmallest.nextSmallest(lst3));
        List<Object> lst4 = List.of(1, 1);
        assertNull(NextSmallest.nextSmallest(lst4));
        List<Object> lst5 = List.of(1, 1, 1, 1, 0);
        assertEquals(1, NextSmallest.nextSmallest(lst5));
        List<Object> lst6 = List.of(1, 1);
        assertNull(NextSmallest.nextSmallest(lst6));
        List<Object> lst7 = List.of(-35, 34, 12, -45);
        assertEquals(-35, NextSmallest.nextSmallest(lst7));
    }
}
