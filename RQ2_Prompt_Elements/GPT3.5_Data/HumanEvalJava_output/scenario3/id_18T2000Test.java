// HowManyTimes.java
package scenario3;

class HowManyTimes {

    /**
     * Find how many times a given substring can be found in the original string. Count overlapping cases.
     *
     * > howManyTimes("", "a")
     * 0
     * > howManyTimes("aaa", "a")
     * 3
     * > howManyTimes("aaaa", "aa")
     * 3
     * > howManyTimes("", "x")
     * 0
     * > howManyTimes("xyxyxyx", "x")
     * 4
     * > howManyTimes("cacacacac", "cac")
     * 4
     * > howManyTimes("john doe", "john")
     * 1
     */
    public static int howManyTimes(String string, String substring) {
        if (string == null || substring == null || substring.isEmpty()) {
            return 0;
        }
        int count = 0;
        int index = 0;
        while (index != -1) {
            index = string.indexOf(substring, index);
            if (index != -1) {
                count++;
                index += substring.length() - 1;
            }
        }
        return count;
    }
}

// HowManyTimesTest.java
package scenario3;


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
        assertEquals(0, HowManyTimes.howManyTimes("", ""));
    }

    @Test
    void testEmptySubstring() {
        assertEquals(0, HowManyTimes.howManyTimes("aaa", ""));
        assertEquals(0, HowManyTimes.howManyTimes("xyxyxyx", ""));
    }

    @Test
    void testNonEmptyStringAndSubstring() {
        assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
        assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
        assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
        assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
        assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
    }

    @Test
    void testSubstringNotInString() {
        assertEquals(0, HowManyTimes.howManyTimes("aaa", "b"));
        assertEquals(0, HowManyTimes.howManyTimes("xyxyxyx", "z"));
    }

    @Test
    void testSubstringLongerThanString() {
        assertEquals(0, HowManyTimes.howManyTimes("a", "aa"));
        assertEquals(0, HowManyTimes.howManyTimes("xy", "xyz"));
    }
}