// FilterIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FilterIntegers}.
* It contains ten unit test cases for the {@link FilterIntegers#filterIntegers(List)} method.
*/
class FilterIntegersTest {

    /**
     * Test case for {@link FilterIntegers#filterIntegers(List)}.
     */
    @Test
    void testFilterIntegers() {
        List<Object> values = List.of("a", 3.14, 5);
        List<Object> expected = List.of(5);
        assertEquals(expected, FilterIntegers.filterIntegers(values));

        values = List.of(1, 2, 3, "abc", new Object(), List.of());
        expected = List.of(1, 2, 3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));

        values = List.of();
        expected = List.of();
        assertEquals(expected, FilterIntegers.filterIntegers(values));

        values = List.of(4, new Object(), List.of(), 23.2, 9, "adasd");
        expected = List.of(4, 9);
        assertEquals(expected, FilterIntegers.filterIntegers(values));

        values = List.of(3, "c", 3, 3, "a", "b");
        expected = List.of(3, 3, 3);
        assertEquals(expected, FilterIntegers.filterIntegers(values));
    }
}
