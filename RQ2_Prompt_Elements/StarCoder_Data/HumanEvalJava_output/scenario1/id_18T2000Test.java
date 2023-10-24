// HowManyTimesTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {

    @Test
    void testHowManyTimes() {
        assertEquals(0, HowManyTimes.howManyTimes("abc", "d"));
        assertEquals(0, HowManyTimes.howManyTimes("abc", "a"));
        assertEquals(1, HowManyTimes.howManyTimes("abc", "b"));
        assertEquals(1, HowManyTimes.howManyTimes("abc", "c"));
        assertEquals(2, HowManyTimes.howManyTimes("abc", "ab"));
        assertEquals(2, HowManyTimes.howManyTimes("abc", "bc"));
        assertEquals(1, HowManyTimes.howManyTimes("abc", "abc"));
        assertEquals(0, HowManyTimes.howManyTimes("abc", "abcd"));
        assertEquals(0, HowManyTimes.howManyTimes("abc", "abcd"));
        assertEquals(0, HowManyTimes.howManyTimes("abc", "abcd"));
        assertEquals(0, HowManyTimes.howManyTimes("abc", "abcd"));
    }
}
