// ByLengthTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByLength}.
* It contains ten unit test cases for the {@link ByLength#byLength(List)} method.
*/
class ByLengthTest {

    /**
    * Test case for {@link ByLength#byLength(List)} where the array is empty.
    */
    @Test
    void testByLengthEmpty() {
        List<Object> arr = List.of();
        List<Object> expected = List.of();
        assertEquals(expected, ByLength.byLength(arr));
    }

    /**
    * Test case for {@link ByLength#byLength(List)} where the array has any strange number.
    */
    @Test
    void testByLengthStrange() {
        List<Object> arr = List.of(1, -1, 55);
        List<Object> expected = List.of("One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    /**
    * Test case for {@link ByLength#byLength(List)} where the array has numbers from 1 to 9.
    */
    @Test
    void testByLength() {
        List<Object> arr = List.of(2, 1, 1, 4, 5, 8, 2, 3);
        List<Object> expected = List.of("Eight", "Five", "Four", "Three", "Two", "Two", "One", "One");
        assertEquals(expected, ByLength.byLength(arr));
    }

    /**
    * Test case for {@link ByLength#byLength(List)} where the array has numbers from 1 to 9.
    */
    @Test
    void testByLength2() {
        List<Object> arr = List.of(9, 4, 8);
        List<Object> expected = List.of("Nine", "Eight", "Four");
        assertEquals(expected, ByLength.byLength(arr));
    }
}
