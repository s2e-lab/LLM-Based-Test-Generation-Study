// IsHappyTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {

    /** Test case for {@link IsHappy#isHappy(String)}. */
    @Test
    void testIsHappy() {
        assertTrue(IsHappy.isHappy("abcd"));
        assertFalse(IsHappy.isHappy("aabb"));
        assertTrue(IsHappy.isHappy("adb"));
        assertFalse(IsHappy.isHappy("xyy"));
        assertTrue(IsHappy.isHappy("iopaxpoi"));
        assertFalse(IsHappy.isHappy("iopaxioi"));
    }
}
