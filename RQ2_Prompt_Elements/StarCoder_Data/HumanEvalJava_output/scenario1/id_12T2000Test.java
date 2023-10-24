// LongestTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Longest}.
* It contains ten unit test cases for the {@link Longest#longest(List)} method.
*/
class LongestTest {

    @Test
    void testLongest() {
        List<Object> strings = List.of("a", "ab", "abc", "abcd");
        assertEquals("abcd", Longest.longest(strings));
    }

    @Test
    void testLongestEmpty() {
        List<Object> strings = List.of();
        assertNull(Longest.longest(strings));
    }

    @Test
    void testLongestOne() {
        List<Object> strings = List.of("a");
        assertEquals("a", Longest.longest(strings));
    }

    @Test
    void testLongestTwo() {
        List<Object> strings = List.of("a", "b");
        assertEquals("b", Longest.longest(strings));
    }

    @Test
    void testLongestThree() {
        List<Object> strings = List.of("a", "b", "c");
        assertEquals("c", Longest.longest(strings));
    }

    @Test
    void testLongestFour() {
        List<Object> strings = List.of("a", "b", "c", "d");
        assertEquals("d", Longest.longest(strings));
    }

    @Test
    void testLongestFive() {
        List<Object> strings = List.of("a", "ab", "abc", "abcd", "abcde");
        assertEquals("abcde", Longest.longest(strings));
    }

    @Test
    void testLongestSix() {
        List<Object> strings = List.of("a", "ab", "abc", "abcd", "abcde", "abcdef");
        assertEquals("abcdef", Longest.longest(strings));
    }

    @Test
    void testLongestSeven() {
        List<Object> strings = List.of("a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg");
        assertEquals("abcdefg", Longest.longest(strings));
    }

    @Test
    void testLongestEight() {
        List<Object> strings = List.of("a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh");
        assertEquals("abcdefgh", Longest.longest(strings));
    }

    @Test
    void testLongestNine() {
        List<Object> strings = List.of("a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi");
        assertEquals("abcdefghi", Longest.longest(strings));
    }

    @Test
    void testLongestTen() {
        List<Object> strings = List.of("a", "ab", "abc", "abcd", "abcde", "abcdef", "abcdefg", "abcdefgh", "abcdefghi", "abcdefghij");
        assertEquals("abcdefghij", Longest.longest(strings));
    }
}
