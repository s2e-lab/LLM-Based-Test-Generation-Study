// HowManyTimesTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {

    /**
     * Test case for the {@link HowManyTimes#howManyTimes(String, String)} method.
     */
    @Test
    void testHowManyTimes() {
        assertEquals(0, HowManyTimes.howManyTimes("abc", "d"));
        assertEquals(0, HowManyTimes.howManyTimes("abc", "ab"));
        assertEquals(1, HowManyTimes.howManyTimes("abc", "a"));
        assertEquals(1, HowManyTimes.howManyTimes("abc", "b"));
        assertEquals(2, HowManyTimes.howManyTimes("abc", "c"));
        assertEquals(0, HowManyTimes.howManyTimes("abc", "abcd"));
        assertEquals(1, HowManyTimes.howManyTimes("abc", "bc"));
        assertEquals(1, HowManyTimes.howManyTimes("abc", "abc"));
        assertEquals(2, HowManyTimes.howManyTimes("abcabc", "abc"));
        assertEquals(3, HowManyTimes.howManyTimes("abcabc", "bc"));
        assertEquals(1, HowManyTimes.howManyTimes("abcabc", "a"));
        assertEquals(2, HowManyTimes.howManyTimes("abcabc", "b"));
        assertEquals(3, HowManyTimes.howManyTimes("abcabc", "c"));
        assertEquals(4, HowManyTimes.howManyTimes("abcabc", "ab"));
        assertEquals(5, HowManyTimes.howManyTimes("abcabc", "abc"));
        assertEquals(6, HowManyTimes.howManyTimes("abcabc", "abcd"));
        assertEquals(7, HowManyTimes.howManyTimes("abcabc", "abcabc"));
    }
}
