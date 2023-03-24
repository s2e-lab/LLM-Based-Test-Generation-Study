// LongestTest.java
package original;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {

    @Test
    void testLongestWithMultipleStrings() {
        List<Object> strings = Arrays.asList("a", "bb", "ccc");
        assertEquals("ccc", Longest.longest(strings));
    }

    @Test
    void testLongestWithEmptyList() {
        List<Object> strings = Collections.emptyList();
        assertNull(Longest.longest(strings));
    }

    @Test
    void testLongestWithSingleString() {
        List<Object> strings = Collections.singletonList("a");
        assertEquals("a", Longest.longest(strings));
    }

    @Test
    void testLongestWithMultipleStringsOfSameLength() {
        List<Object> strings = Arrays.asList("x", "y", "z");
        assertEquals("x", Longest.longest(strings));
    }

    @Test
    void testLongestWithLongStrings() {
        List<Object> strings = Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc");
        assertEquals("zzzz", Longest.longest(strings));
    }

    @Test
    void testLongestWithNullList() {
        assertNull(Longest.longest(null));
    }

    @Test
    void testLongestWithMixedTypes() {
        List<Object> mixed = Arrays.asList("a", 1, "ccc", true);
        assertEquals("ccc", Longest.longest(mixed));
    }

    @Test
    void testLongestWithEmptyString() {
        List<Object> strings = Arrays.asList("", "a", "bb", "ccc");
        assertEquals("", Longest.longest(strings));
    }

    @Test
    void testLongestWithWhitespaceString() {
        List<Object> strings = Arrays.asList("a", "bb", "ccc", " ");
        assertEquals("ccc", Longest.longest(strings));
    }

    @Test
    void testLongestWithSpecialCharacters() {
        List<Object> strings = Arrays.asList("a", "bb", "ccc", "!@#$%^&*()");
        assertEquals("!@#$%^&*()", Longest.longest(strings));
    }
}