// LongestTest.java
package scenario2;

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
     * It tests the method with an empty list.
     */
    @Test
    void testLongestWithEmptyList() {
        List<Object> strings = List.of();
        String longest = Longest.longest(strings);
        assertNull(longest);
    }

    /**
     * Test case for the {@link Longest#longest(List)} method.
     * It tests the method with a list of one string.
     */
    @Test
    void testLongestWithOneString() {
        List<Object> strings = List.of("abc");
        String longest = Longest.longest(strings);
        assertEquals("abc", longest);
    }

    /**
     * Test case for the {@link Longest#longest(List)} method.
     * It tests the method with a list of two strings of the same length.
     */
    @Test
    void testLongestWithTwoStringsOfSameLength() {
        List<Object> strings = List.of("abc", "def");
        String longest = Longest.longest(strings);
        assertEquals("abc", longest);
    }

    /**
     * Test case for the {@link Longest#longest(List)} method.
     * It tests the method with a list of two strings of different lengths.
     */
    @Test
    void testLongestWithTwoStringsOfDifferentLengths() {
        List<Object> strings = List.of("abc", "defg");
        String longest = Longest.longest(strings);
        assertEquals("defg", longest);
    }

    /**
     * Test case for the {@link Longest#longest(List)} method.
     * It tests the method with a list of three strings of different lengths.
     */
    @Test
    void testLongestWithThreeStringsOfDifferentLengths() {
        List<Object> strings = List.of("abc", "defg", "hijkl");
        String longest = Longest.longest(strings);
        assertEquals("hijkl", longest);
    }

    /**
     * Test case for the {@link Longest#longest(List)} method.
     * It tests the method with a list of three strings of different lengths.
     */
    @Test
    void testLongestWithFourStringsOfDifferentLengths() {
        List<Object> strings = List.of("abc", "defg", "hijkl", "mno");
        String longest = Longest.longest(strings);
        assertEquals("mno", longest);
    }
}
