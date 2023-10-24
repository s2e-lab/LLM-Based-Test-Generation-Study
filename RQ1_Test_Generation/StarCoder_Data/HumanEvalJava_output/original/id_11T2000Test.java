// StringXorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringXor}.
* It contains ten unit test cases for the {@link StringXor#stringXor(String, String)} method.
*/
class StringXorTest {

    /**
    * Test case for {@link StringXor#stringXor(String, String)} where a and b are both "010".
    */
    @Test
    void testStringXor01() {
        String a = "010";
        String b = "010";
        String expected = "000";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringXor#stringXor(String, String)} where a and b are both "110".
    */
    @Test
    void testStringXor02() {
        String a = "110";
        String b = "110";
        String expected = "000";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringXor#stringXor(String, String)} where a and b are both "1".
    */
    @Test
    void testStringXor03() {
        String a = "1";
        String b = "1";
        String expected = "0";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringXor#stringXor(String, String)} where a and b are both "0101".
    */
    @Test
    void testStringXor04() {
        String a = "0101";
        String b = "0101";
        String expected = "0000";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringXor#stringXor(String, String)} where a and b are both "0000".
    */
    @Test
    void testStringXor05() {
        String a = "0000";
        String b = "0000";
        String expected = "0000";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringXor#stringXor(String, String)} where a and b are both "111000".
    */
    @Test
    void testStringXor06() {
        String a = "111000";
        String b = "111000";
        String expected = "000000";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringXor#stringXor(String, String)} where a and b are both "101010".
    */
    @Test
    void testStringXor07() {
        String a = "101010";
        String b = "101010";
        String expected = "000000";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringXor#stringXor(String, String)} where a is "010" and b is "110".
    */
    @Test
    void testStringXor08() {
        String a = "010";
        String b = "110";
        String expected = "100";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringXor#stringXor(String, String)} where a is "111000" and b is "101010".
    */
    @Test
    void testStringXor09() {
        String a = "111000";
        String b = "101010";
        String expected = "010010";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link StringXor#stringXor(String, String)} where a is "1" and b is "1".
    */
    @Test
    void testStringXor10() {
        String a = "1";
        String b = "1";
        String expected = "0";
        String actual = StringXor.stringXor(a, b);
        assertEquals(expected, actual);
    }
}
