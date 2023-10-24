// SameCharsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains ten unit test cases for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {

    /**
    * Test case for {@link SameChars#sameChars(String, String)}
    * with the following parameters:
    * <ul>
    * <li>s0: "abcd"</li>
    * <li>s1: "dddddddabce"</li>
    * </ul>
    */
    @Test
    void testSameChars0() {
        String s0 = "abcd";
        String s1 = "dddddddabce";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SameChars#sameChars(String, String)}
    * with the following parameters:
    * <ul>
    * <li>s0: "eabcdzzzz"</li>
    * <li>s1: "dddzzzzzzzddeddabc"</li>
    * </ul>
    */
    @Test
    void testSameChars1() {
        String s0 = "eabcdzzzz";
        String s1 = "dddzzzzzzzddeddabc";
        Boolean expected = true;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SameChars#sameChars(String, String)}
    * with the following parameters:
    * <ul>
    * <li>s0: "abcd"</li>
    * <li>s1: "dddddddabc"</li>
    * </ul>
    */
    @Test
    void testSameChars2() {
        String s0 = "abcd";
        String s1 = "dddddddabc";
        Boolean expected = true;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SameChars#sameChars(String, String)}
    * with the following parameters:
    * <ul>
    * <li>s0: "dddddddabc"</li>
    * <li>s1: "abcd"</li>
    * </ul>
    */
    @Test
    void testSameChars3() {
        String s0 = "dddddddabc";
        String s1 = "abcd";
        Boolean expected = true;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SameChars#sameChars(String, String)}
    * with the following parameters:
    * <ul>
    * <li>s0: "eabcd"</li>
    * <li>s1: "dddddddabc"</li>
    * </ul>
    */
    @Test
    void testSameChars4() {
        String s0 = "eabcd";
        String s1 = "dddddddabc";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SameChars#sameChars(String, String)}
    * with the following parameters:
    * <ul>
    * <li>s0: "abcd"</li>
    * <li>s1: "dddddddabcf"</li>
    * </ul>
    */
    @Test
    void testSameChars5() {
        String s0 = "abcd";
        String s1 = "dddddddabcf";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SameChars#sameChars(String, String)}
    * with the following parameters:
    * <ul>
    * <li>s0: "eabcdzzzz"</li>
    * <li>s1: "dddzzzzzzzddddabc"</li>
    * </ul>
    */
    @Test
    void testSameChars6() {
        String s0 = "eabcdzzzz";
        String s1 = "dddzzzzzzzddddabc";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link SameChars#sameChars(String, String)}
    * with the following parameters:
    * <ul>
    * <li>s0: "aabb"</li>
    * <li>s1: "aaccc"</li>
    * </ul>
    */
    @Test
    void testSameChars7() {
        String s0 = "aabb";
        String s1 = "aaccc";
        Boolean expected = false;
        Boolean actual = SameChars.sameChars(s0, s1);
        assertEquals(expected, actual);
    }
}
