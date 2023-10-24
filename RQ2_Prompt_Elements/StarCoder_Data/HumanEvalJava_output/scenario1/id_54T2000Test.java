// SameCharsTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains ten unit test cases for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {

    @Test
    void testSameChars0() {
        String s0 = "abc";
        String s1 = "abc";
        Boolean expected = true;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    @Test
    void testSameChars1() {
        String s0 = "abc";
        String s1 = "abd";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    @Test
    void testSameChars2() {
        String s0 = "abc";
        String s1 = "abcd";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    @Test
    void testSameChars3() {
        String s0 = "abc";
        String s1 = "ab";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    @Test
    void testSameChars4() {
        String s0 = "abc";
        String s1 = "a";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    @Test
    void testSameChars5() {
        String s0 = "abc";
        String s1 = "b";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    @Test
    void testSameChars6() {
        String s0 = "abc";
        String s1 = "c";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    @Test
    void testSameChars7() {
        String s0 = "abc";
        String s1 = "d";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    @Test
    void testSameChars8() {
        String s0 = "abc";
        String s1 = "e";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    @Test
    void testSameChars9() {
        String s0 = "abc";
        String s1 = "f";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }
}
