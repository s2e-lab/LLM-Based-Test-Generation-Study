// LongestTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {

    /**
     * Test case for the {@link Longest#longest(List)} method.
     */
    @Test
    void testLongest() {
        assertEquals("a", Longest.longest(List.of("a", "b", "c")));
        assertEquals("ccc", Longest.longest(List.of("a", "bb", "ccc")));
        assertEquals(null, Longest.longest(List.of()));
        assertEquals("x", Longest.longest(List.of("x", "y", "z")));
        assertEquals("zzzz", Longest.longest(List.of("x", "yyy", "zzzz", "www", "kkkk", "abc")));
    }
}
