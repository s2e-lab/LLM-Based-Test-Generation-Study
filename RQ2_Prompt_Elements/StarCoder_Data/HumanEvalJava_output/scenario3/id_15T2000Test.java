// StringSequenceTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains ten unit test cases for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {

    /**
     * Test case for {@link StringSequence#stringSequence(int)}.
     */
    @Test
    void testStringSequence() {
        assertEquals("0", StringSequence.stringSequence(0));
        assertEquals("0 1 2 3 4 5", StringSequence.stringSequence(5));
        assertEquals("0", StringSequence.stringSequence(0));
        assertEquals("0 1 2 3", StringSequence.stringSequence(3));
        assertEquals("0 1 2 3 4 5 6 7 8 9 10", StringSequence.stringSequence(10));
    }
}
