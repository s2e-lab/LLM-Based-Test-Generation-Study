// GetRowTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains ten unit test cases for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {

    /**
    * Test case for {@link GetRow#getRow(List, int)}.
    * It tests the following conditions:
    * - The list is empty.
    * - The list contains only one row.
    * - The list contains multiple rows.
    */
    @Test
    void testGetRow() {
        // Test case for the list is empty.
        List<Object> lst = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, GetRow.getRow(lst, 1));

        // Test case for the list contains only one row.
        lst = List.of(List.of(1, 2, 3, 4, 5, 6));
        expected = List.of();
        assertEquals(expected, GetRow.getRow(lst, 1));

        // Test case for the list contains multiple rows.
        lst = List.of(List.of(1, 2, 3, 4, 1, 6), List.of(1, 2, 3, 4, 5, 1));
        expected = List.of(List.of(0, 0), List.of(1, 4), List.of(1, 0), List.of(2, 5), List.of(2, 0));
        assertEquals(expected, GetRow.getRow(lst, 1));
    }
}
