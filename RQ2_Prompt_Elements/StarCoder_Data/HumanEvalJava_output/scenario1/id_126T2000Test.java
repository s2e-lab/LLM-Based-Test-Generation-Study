// IsSortedTest.java
package scenario1;

import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSorted}.
* It contains ten unit test cases for the {@link IsSorted#isSorted(List)} method.
*/
class IsSortedTest {

    @Test
    void testIsSorted() {
        List<Object> lst1 = List.of(1, 2, 3, 4, 5);
        assertTrue(IsSorted.isSorted(lst1));
        List<Object> lst2 = List.of(1, 2, 3, 4, 5, 5);
        assertFalse(IsSorted.isSorted(lst2));
        List<Object> lst3 = List.of(1, 2, 3, 4, 5, 6);
        assertFalse(IsSorted.isSorted(lst3));
        List<Object> lst4 = List.of(1, 2, 3, 4, 5, 6, 7);
        assertFalse(IsSorted.isSorted(lst4));
        List<Object> lst5 = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertFalse(IsSorted.isSorted(lst5));
        List<Object> lst6 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertFalse(IsSorted.isSorted(lst6));
        List<Object> lst7 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(IsSorted.isSorted(lst7));
        List<Object> lst8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertFalse(IsSorted.isSorted(lst8));
        List<Object> lst9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertFalse(IsSorted.isSorted(lst9));
        List<Object> lst10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertFalse(IsSorted.isSorted(lst10));
    }
}
