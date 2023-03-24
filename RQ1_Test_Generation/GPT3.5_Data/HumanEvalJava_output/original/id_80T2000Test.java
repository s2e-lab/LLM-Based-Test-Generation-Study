// Here's the source code for the IsHappyTest class:

package original;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link IsHappy}.
 * It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
 */
class IsHappyTest {

    @Test
    void testEmptyString() {
        assertFalse(IsHappy.isHappy(""));
    }

    @Test
    void testSingleCharacterString() {
        assertFalse(IsHappy.isHappy("a"));
    }

    @Test
    void testTwoCharacterString() {
        assertFalse(IsHappy.isHappy("aa"));
    }

    @Test
    void testThreeCharacterStringWithDistinctCharacters() {
        assertTrue(IsHappy.isHappy("abc"));
    }

    @Test
    void testThreeCharacterStringWithRepeatedCharacters() {
        assertFalse(IsHappy.isHappy("aaa"));
    }

    @Test
    void testFourCharacterStringWithDistinctCharacters() {
        assertTrue(IsHappy.isHappy("abcd"));
    }

    @Test
    void testFourCharacterStringWithRepeatedCharacters() {
        assertFalse(IsHappy.isHappy("aabb"));
    }

    @Test
    void testFiveCharacterStringWithDistinctCharacters() {
        assertTrue(IsHappy.isHappy("abcde"));
    }

    @Test
    void testFiveCharacterStringWithRepeatedCharacters() {
        assertFalse(IsHappy.isHappy("abbbc"));
    }

    @Test
    void testLongStringWithDistinctCharacters() {
        assertTrue(IsHappy.isHappy("iopaxpoi"));
    }

    @Test
    void testLongStringWithRepeatedCharacters() {
        assertFalse(IsHappy.isHappy("iopaxioi"));
    }
}