// Here's the corrected code for the test class:

package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link HowManyTimes}.
 * It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
 */
class HowManyTimesTest {

    @Test
    void testEmptyString() {
        assertEquals(0, HowManyTimes.howManyTimes("", "a"));
    }

    @Test
    void testSingleCharString() {
        assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
    }

    @Test
    void testDoubleCharString() {
        assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
    }

    @Test
    void testNonMatchingSubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("", "x"));
    }

    @Test
    void testMultipleOccurrences() {
        assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
    }

    @Test
    void testOverlappingOccurrences() {
        assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
    }

    @Test
    void testSubstringAtBeginning() {
        assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
    }

    @Test
    void testSubstringAtEnd() {
        assertEquals(1, HowManyTimes.howManyTimes("doe john", "john"));
    }

    @Test
    void testSubstringInMiddle() {
        assertEquals(1, HowManyTimes.howManyTimes("hello world", "lo"));
    }

    @Test
    void testSubstringNotFound() {
        assertEquals(0, HowManyTimes.howManyTimes("hello world", "foo"));
    }
}