// Here's the generated code for the IsHappy class:

package scenario3;

class IsHappy {

    /**
     * You are given a string s.
     * Your task is to check if the string is happy or not.
     * A string is happy if its length is at least 3 and every 3 consecutive letters are distinct
     * For example:
     * isHappy(a) => False
     * isHappy(aa) => False
     * isHappy(abcd) => True
     * isHappy(aabb) => False
     * isHappy(adb) => True
     * isHappy(xyy) => False
     *
     * > isHappy("a")
     * false
     * > isHappy("aa")
     * false
     * > isHappy("abcd")
     * true
     * > isHappy("aabb")
     * false
     * > isHappy("adb")
     * true
     * > isHappy("xyy")
     * false
     * > isHappy("iopaxpoi")
     * true
     * > isHappy("iopaxioi")
     * false
     */
    public static Boolean isHappy(String s) {
        if (s.length() < 3) {
            return false;
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i + 2) || s.charAt(i + 1) == s.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}

// And here's the generated code for the IsHappyTest class:

package scenario3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {

    @Test
    void testIsHappyWithSingleLetter() {
        assertFalse(IsHappy.isHappy("a"));
    }

    @Test
    void testIsHappyWithDoubleLetter() {
        assertFalse(IsHappy.isHappy("aa"));
    }

    @Test
    void testIsHappyWithDistinctLetters() {
        assertTrue(IsHappy.isHappy("abcd"));
    }

    @Test
    void testIsHappyWithTwoPairsOfSameLetters() {
        assertFalse(IsHappy.isHappy("aabb"));
    }

    @Test
    void testIsHappyWithTwoDistinctLettersAndOneSameLetter() {
        assertTrue(IsHappy.isHappy("adb"));
    }

    @Test
    void testIsHappyWithTwoSameLettersAndOneDistinctLetter() {
        assertFalse(IsHappy.isHappy("xyy"));
    }

    @Test
    void testIsHappyWithDistinctLettersAndRepeatingPattern() {
        assertTrue(IsHappy.isHappy("iopaxpoi"));
    }

    @Test
    void testIsHappyWithDistinctLettersAndNonRepeatingPattern() {
        assertFalse(IsHappy.isHappy("iopaxioi"));
    }

    @Test
    void testIsHappyWithEmptyString() {
        assertFalse(IsHappy.isHappy(""));
    }

    @Test
    void testIsHappyWithNullString() {
        assertFalse(IsHappy.isHappy(null));
    }
}