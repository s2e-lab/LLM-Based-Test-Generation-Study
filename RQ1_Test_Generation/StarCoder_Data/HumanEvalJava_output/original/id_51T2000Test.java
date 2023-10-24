// RemoveVowelsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "abcdef".
     */
    @Test
    void testRemoveVowels1() {
        String text = "abcdef";
        String expected = "bcdf";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "aaaaa".
     */
    @Test
    void testRemoveVowels2() {
        String text = "aaaaa";
        String expected = "";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "aaBAA".
     */
    @Test
    void testRemoveVowels3() {
        String text = "aaBAA";
        String expected = "B";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "zbcd".
     */
    @Test
    void testRemoveVowels4() {
        String text = "zbcd";
        String expected = "zbcd";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "".
     */
    @Test
    void testRemoveVowels5() {
        String text = "";
        String expected = "";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "abcdef\nghijklm".
     */
    @Test
    void testRemoveVowels6() {
        String text = "abcdef\nghijklm";
        String expected = "bcdf\nghjklm";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "fedcba".
     */
    @Test
    void testRemoveVowels7() {
        String text = "fedcba";
        String expected = "fdcb";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "eeeee".
     */
    @Test
    void testRemoveVowels8() {
        String text = "eeeee";
        String expected = "";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "acBAA".
     */
    @Test
    void testRemoveVowels9() {
        String text = "acBAA";
        String expected = "cB";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "EcBOO".
     */
    @Test
    void testRemoveVowels10() {
        String text = "EcBOO";
        String expected = "cB";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link RemoveVowels#removeVowels(String)} where the given string is "ybcd".
     */
    @Test
    void testRemoveVowels11() {
        String text = "ybcd";
        String expected = "ybcd";
        String actual = RemoveVowels.removeVowels(text);
        assertEquals(expected, actual);
    }
}
