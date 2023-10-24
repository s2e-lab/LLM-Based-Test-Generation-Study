// AllPrefixesTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains ten unit test cases for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {

    /**
     * Test case for the {@link AllPrefixes#allPrefixes(String)} method.
     */
    @Test
    void testAllPrefixes() {
        assertEquals(List.of("a", "ab", "abc"), AllPrefixes.allPrefixes("abc"));
        assertEquals(List.of(), AllPrefixes.allPrefixes(""));
        assertEquals(List.of("a", "as", "asd", "asdf", "asdfg", "asdfgh"), AllPrefixes.allPrefixes("asdfgh"));
        assertEquals(List.of("W", "WW", "WWW"), AllPrefixes.allPrefixes("WWW"));
    }
}
