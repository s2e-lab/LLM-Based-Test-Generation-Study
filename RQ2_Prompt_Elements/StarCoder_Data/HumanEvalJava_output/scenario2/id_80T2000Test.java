// IsHappyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {

    /**
    * Test case for the {@link IsHappy#isHappy(String)} method.
    * Tests if the string is happy.
    */
    @Test
    void testIsHappy1() {
        String s = "abc";
        assertTrue(IsHappy.isHappy(s));
    }

    /**
    * Test case for the {@link IsHappy#isHappy(String)} method.
    * Tests if the string is not happy.
    */
    @Test
    void testIsHappy2() {
        String s = "abca";
        assertFalse(IsHappy.isHappy(s));
    }

    /**
    * Test case for the {@link IsHappy#isHappy(String)} method.
    * Tests if the string is not happy.
    */
    @Test
    void testIsHappy3() {
        String s = "abcb";
        assertFalse(IsHappy.isHappy(s));
    }

    /**
    * Test case for the {@link IsHappy#isHappy(String)} method.
    * Tests if the string is not happy.
    */
    @Test
    void testIsHappy4() {
        String s = "abcc";
        assertFalse(IsHappy.isHappy(s));
    }

    /**
    * Test case for the {@link IsHappy#isHappy(String)} method.
    * Tests if the string is not happy.
    */
    @Test
    void testIsHappy5() {
        String s = "abcc";
        assertFalse(IsHappy.isHappy(s));
    }

    /**
    * Test case for the {@link IsHappy#isHappy(String)} method.
    * Tests if the string is not happy.
    */
    @Test
    void testIsHappy6() {
        String s = "abcc";
        assertFalse(IsHappy.isHappy(s));
    }

    /**
    * Test case for the {@link IsHappy#isHappy(String)} method.
    * Tests if the string is not happy.
    */
    @Test
    void testIsHappy7() {
        String s = "abcc";
        assertFalse(IsHappy.isHappy(s));
    }

    /**
    * Test case for the {@link IsHappy#isHappy(String)} method.
    * Tests if the string is not happy.
    */
    @Test
    void testIsHappy8() {
        String s = "abcc";
        assertFalse(IsHappy.isHappy(s));
    }

    /**
    * Test case for the {@link IsHappy#isHappy(String)} method.
    * Tests if the string is not happy.
    */
    @Test
    void testIsHappy9() {
        String s = "abcc";
        assertFalse(IsHappy.isHappy(s));
    }

    /**
    * Test case for the {@link IsHappy#isHappy(String)} method.
    * Tests if the string is not happy.
    */
    @Test
    void testIsHappy10() {
        String s = "abcc";
        assertFalse(IsHappy.isHappy(s));
    }
}
