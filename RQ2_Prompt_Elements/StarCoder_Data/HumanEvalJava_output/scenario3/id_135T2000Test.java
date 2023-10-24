// CanArrangeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {

    /**
    * Test case for {@link CanArrange#canArrange(List)}.
    */
    @Test
    void canArrange() {
        List<Object> arr1 = List.of(1, 2, 4, 3, 5);
        assertEquals(3, CanArrange.canArrange(arr1));

        List<Object> arr2 = List.of(1, 2, 3);
        assertEquals(-1, CanArrange.canArrange(arr2));

        List<Object> arr3 = List.of(1, 4, 2, 5, 6, 7, 8, 9, 10);
        assertEquals(2, CanArrange.canArrange(arr3));

        List<Object> arr4 = List.of(4, 8, 5, 7, 3);
        assertEquals(4, CanArrange.canArrange(arr4));

        List<Object> arr5 = List.of();
        assertEquals(-1, CanArrange.canArrange(arr5));
    }
}
