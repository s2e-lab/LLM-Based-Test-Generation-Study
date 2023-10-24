// IsHappyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {

    /**
    * Test case for {@link IsHappy#isHappy(String)}.
    * The input string is "a".
    * The expected output is false.
    */
    @Test
    void testIsHappy_a() {
        String s = "a";
        boolean expected = false;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    /**
    * Test case for {@link IsHappy#isHappy(String)}.
    * The input string is "aa".
    * The expected output is false.
    */
    @Test
    void testIsHappy_aa() {
        String s = "aa";
        boolean expected = false;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    /**
    * Test case for {@link IsHappy#isHappy(String)}.
    * The input string is "abcd".
    * The expected output is true.
    */
    @Test
    void testIsHappy_abcd() {
        String s = "abcd";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    /**
    * Test case for {@link IsHappy#isHappy(String)}.
    * The input string is "aabb".
    * The expected output is false.
    */
    @Test
    void testIsHappy_aabb() {
        String s = "aabb";
        boolean expected = false;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    /**
    * Test case for {@link IsHappy#isHappy(String)}.
    * The input string is "adb".
    * The expected output is true.
    */
    @Test
    void testIsHappy_adb() {
        String s = "adb";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    /**
    * Test case for {@link IsHappy#isHappy(String)}.
    * The input string is "xyy".
    * The expected output is false.
    */
    @Test
    void testIsHappy_xyy() {
        String s = "xyy";
        boolean expected = false;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    /**
    * Test case for {@link IsHappy#isHappy(String)}.
    * The input string is "iopaxpoi".
    * The expected output is true.
    */
    @Test
    void testIsHappy_iopaxpoi() {
        String s = "iopaxpoi";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    /**
    * Test case for {@link IsHappy#isHappy(String)}.
    * The input string is "iopaxioi".
    * The expected output is false.
    */
    @Test
    void testIsHappy_iopaxioi() {
        String s = "iopaxioi";
        boolean expected = false;
        assertEquals(expected, IsHappy.isHappy(s));
    }
}
