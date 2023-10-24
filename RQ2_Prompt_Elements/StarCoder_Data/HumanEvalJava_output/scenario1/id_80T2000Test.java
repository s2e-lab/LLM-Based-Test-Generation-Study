// IsHappyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {

    @Test
    void testIsHappy1() {
        String s = "19";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    @Test
    void testIsHappy2() {
        String s = "199";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    @Test
    void testIsHappy3() {
        String s = "1999";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    @Test
    void testIsHappy4() {
        String s = "19999";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    @Test
    void testIsHappy5() {
        String s = "199999";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    @Test
    void testIsHappy6() {
        String s = "1999999";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    @Test
    void testIsHappy7() {
        String s = "19999999";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    @Test
    void testIsHappy8() {
        String s = "199999999";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    @Test
    void testIsHappy9() {
        String s = "1999999999";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }

    @Test
    void testIsHappy10() {
        String s = "19999999999";
        boolean expected = true;
        assertEquals(expected, IsHappy.isHappy(s));
    }
}
