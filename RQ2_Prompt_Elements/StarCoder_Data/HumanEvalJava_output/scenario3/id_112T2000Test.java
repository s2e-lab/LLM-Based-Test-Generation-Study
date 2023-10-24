// ReverseDeleteTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains ten unit test cases for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {

    /**
    * Test case for {@link ReverseDelete#reverseDelete(String, String)}.
    */
    @Test
    void testReverseDelete() {
        assertEquals(List.of("bcd", false), ReverseDelete.reverseDelete("abcde", "ae"));
        assertEquals(List.of("acdef", false), ReverseDelete.reverseDelete("abcdef", "b"));
        assertEquals(List.of("cdedc", true), ReverseDelete.reverseDelete("abcdedcba", "ab"));
        assertEquals(List.of("dik", false), ReverseDelete.reverseDelete("dwik", "w"));
        assertEquals(List.of("", true), ReverseDelete.reverseDelete("a", "a"));
        assertEquals(List.of("abcdedcba", true), ReverseDelete.reverseDelete("abcdedcba", ""));
        assertEquals(List.of("abcdedcba", true), ReverseDelete.reverseDelete("abcdedcba", "v"));
        assertEquals(List.of("abba", true), ReverseDelete.reverseDelete("vabba", "v"));
        assertEquals(List.of("", true), ReverseDelete.reverseDelete("mamma", "mia"));
    }
}
