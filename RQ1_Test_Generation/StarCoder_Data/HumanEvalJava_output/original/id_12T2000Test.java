// LongestTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {

    /** Test case for {@link Longest#longest(List)} where the input list is empty. */
    @Test
    void testLongestEmpty() {
        List<Object> strings = List.of();
        assertNull(Longest.longest(strings));
    }

    /** Test case for {@link Longest#longest(List)} where the input list contains one string. */
    @Test
    void testLongestOne() {
        List<Object> strings = List.of("a");
        assertEquals("a", Longest.longest(strings));
    }

    /** Test case for {@link Longest#longest(List)} where the input list contains multiple strings. */
    @Test
    void testLongestMultiple() {
        List<Object> strings = List.of("a", "bb", "ccc");
        assertEquals("ccc", Longest.longest(strings));
    }

    /** Test case for {@link Longest#longest(List)} where the input list contains multiple strings of the same length. */
    @Test
    void testLongestMultipleSameLength() {
        List<Object> strings = List.of("x", "yyy", "zzzz", "www", "kkkk", "abc");
        assertEquals("zzzz", Longest.longest(strings));
    }
}
