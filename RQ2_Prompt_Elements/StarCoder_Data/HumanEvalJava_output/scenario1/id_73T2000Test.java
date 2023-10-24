// SmallestChangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SmallestChange}.
* It contains ten unit test cases for the {@link SmallestChange#smallestChange(List)} method.
*/
class SmallestChangeTest {

    /**
    * Test case for the {@link SmallestChange#smallestChange(List)} method.
    */
    @Test
    void testSmallestChange() {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        assertEquals(1, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(2, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(3, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(4, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(5, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(6, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(7, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(8, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(9, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(10, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(11, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(12, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertEquals(13, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertEquals(14, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertEquals(15, SmallestChange.smallestChange(arr));

        arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertEquals(16, SmallestChange.smallestChange(arr));
    }
}
