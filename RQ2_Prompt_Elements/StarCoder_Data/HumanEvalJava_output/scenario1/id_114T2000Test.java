// MinsubarraysumTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Minsubarraysum}.
* It contains ten unit test cases for the {@link Minsubarraysum#minsubarraysum(List)} method.
*/
class MinsubarraysumTest {

    /**
    * Test case for {@link Minsubarraysum#minsubarraysum(List)}.
    */
    @Test
    void testMinsubarraysum() {
        List<Object> nums = List.of(1, 2, 3, 4, 5);
        assertEquals(15, Minsubarraysum.minsubarraysum(nums));
        nums = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(21, Minsubarraysum.minsubarraysum(nums));
        nums = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(28, Minsubarraysum.minsubarraysum(nums));
        nums = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(36, Minsubarraysum.minsubarraysum(nums));
        nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(45, Minsubarraysum.minsubarraysum(nums));
        nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(55, Minsubarraysum.minsubarraysum(nums));
        nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(66, Minsubarraysum.minsubarraysum(nums));
        nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(78, Minsubarraysum.minsubarraysum(nums));
        nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(91, Minsubarraysum.minsubarraysum(nums));
        nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(105, Minsubarraysum.minsubarraysum(nums));
        nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(120, Minsubarraysum.minsubarraysum(nums));
    }
}
