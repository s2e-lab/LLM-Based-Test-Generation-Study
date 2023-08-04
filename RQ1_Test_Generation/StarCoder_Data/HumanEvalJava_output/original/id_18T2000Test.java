// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {

    @Test
    void testHowManyTimes() {
        assertEquals(0, HowManyTimes.howManyTimes("", "a"));
        assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
        assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
        assertEquals(0, HowManyTimes.howManyTimes("", "x"));
        assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
        assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
        assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
    }
}
