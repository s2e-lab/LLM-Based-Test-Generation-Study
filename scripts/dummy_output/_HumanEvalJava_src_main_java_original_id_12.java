// LongestTest.java
package original;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Test class of {@link Longest}.
 * It contains ten unit test cases for the {@link Longest#longest(List)} method.
 */
class LongestTest {

    @Test
    void testLongestWithEmptyList() {
        List<String> strings = new ArrayList<>();
        assertNull(Longest.longest(strings));
    }

    @Test
    void testLongestWithOneString() {
        List<String> strings = Arrays.asList("hello");
        assertEquals("hello", Longest.longest(strings));
    }

    @Test
    void testLongestWithMultipleStrings() {
        List<String> strings = Arrays.asList("a", "bb", "ccc");
        assertEquals("ccc", Longest.longest(strings));
    }

    @Test
    void testLongestWithMultipleStringsOfSameLength() {
        List<String> strings = Arrays.asList("x", "y", "z");
        assertEquals("x", Longest.longest(strings));
    }

    @Test
    void testLongestWithLongStrings() {
        List<String> strings = Arrays.asList("x", "yyy", "zzzz", "www", "kkkk", "abc");
        assertEquals("zzzz", Longest.longest(strings));
    }

    @Test
    void testLongestWithNullString() {
        List<String> strings = Arrays.asList("a", null, "b");
        assertEquals("a", Longest.longest(strings));
    }

    @Test
    void testLongestWithEmptyString() {
        List<String> strings = Arrays.asList("a", "", "b");
        assertEquals("a", Longest.longest(strings));
    }

    @Test
    void testLongestWithWhitespaceString() {
        List<String> strings = Arrays.asList("a", "  ", "b");
        assertEquals("a", Longest.longest(strings));
    }

    @Test
    void testLongestWithSpecialCharacters() {
        List<String> strings = Arrays.asList("a", "b", "c!", "d@@", "e#");
        assertEquals("d@@", Longest.longest(strings));
    }

    @Test
    void testLongestWithUnicodeCharacters() {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "α", "β", "γ", "δ", "ε", "ζ", "η", "θ", "ι", "κ", "λ", "μ", "ν", "ξ", "ο", "π", "ρ", "σ", "τ", "υ", "φ", "χ", "ψ", "ω");
        assertEquals("α", Longest.longest(strings));
    }
}