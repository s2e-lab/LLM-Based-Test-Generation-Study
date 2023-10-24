// ReverseDeleteTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReverseDelete}.
* It contains ten unit test cases for the {@link ReverseDelete#reverseDelete(String, String)} method.
*/
class ReverseDeleteTest {

    /**
    * Test case number: 1
    * Test case values: s = "abcde", c = "ae"
    * Expected test result: ('bcd',False)
    */
    @Test
    void testReverseDelete1() {
        String s = "abcde";
        String c = "ae";
        List<Object> expected = Arrays.asList("bcd", false);
        assertEquals(expected, ReverseDelete.reverseDelete(s, c));
    }

    /**
    * Test case number: 2
    * Test case values: s = "abcdef", c = "b"
    * Expected test result: ('acdef',False)
    */
    @Test
    void testReverseDelete2() {
        String s = "abcdef";
        String c = "b";
        List<Object> expected = Arrays.asList("acdef", false);
        assertEquals(expected, ReverseDelete.reverseDelete(s, c));
    }

    /**
    * Test case number: 3
    * Test case values: s = "abcdedcba", c = "ab"
    * Expected test result: ('cdedc',True)
    */
    @Test
    void testReverseDelete3() {
        String s = "abcdedcba";
        String c = "ab";
        List<Object> expected = Arrays.asList("cdedc", true);
        assertEquals(expected, ReverseDelete.reverseDelete(s, c));
    }

    /**
    * Test case number: 4
    * Test case values: s = "dwik", c = "w"
    * Expected test result: ('dik',False)
    */
    @Test
    void testReverseDelete4() {
        String s = "dwik";
        String c = "w";
        List<Object> expected = Arrays.asList("dik", false);
        assertEquals(expected, ReverseDelete.reverseDelete(s, c));
    }

    /**
    * Test case number: 5
    * Test case values: s = "a", c = "a"
    * Expected test result: ('',True)
    */
    @Test
    void testReverseDelete5() {
        String s = "a";
        String c = "a";
        List<Object> expected = Arrays.asList("", true);
        assertEquals(expected, ReverseDelete.reverseDelete(s, c));
    }

    /**
    * Test case number: 6
    * Test case values: s = "abcdedcba", c = ""
    * Expected test result: ('abcdedcba',True)
    */
    @Test
    void testReverseDelete6() {
        String s = "abcdedcba";
        String c = "";
        List<Object> expected = Arrays.asList("abcdedcba", true);
        assertEquals(expected, ReverseDelete.reverseDelete(s, c));
    }

    /**
    * Test case number: 7
    * Test case values: s = "abcdedcba", c = "v"
    * Expected test result: ('abcdedcba',True)
    */
    @Test
    void testReverseDelete7() {
        String s = "abcdedcba";
        String c = "v";
        List<Object> expected = Arrays.asList("abcdedcba", true);
        assertEquals(expected, ReverseDelete.reverseDelete(s, c));
    }

    /**
    * Test case number: 8
    * Test case values: s = "vabba", c = "v"
    * Expected test result: ('abba',True)
    */
    @Test
    void testReverseDelete8() {
        String s = "vabba";
        String c = "v";
        List<Object> expected = Arrays.asList("abba", true);
        assertEquals(expected, ReverseDelete.reverseDelete(s, c));
    }

    /**
    * Test case number: 9
    * Test case values: s = "mamma", c = "mia"
    * Expected test result: ('',True)
    */
    @Test
    void testReverseDelete9() {
        String s = "mamma";
        String c = "mia";
        List<Object> expected = Arrays.asList("", true);
        assertEquals(expected, ReverseDelete.reverseDelete(s, c));
    }

    /**
    * Test case number: 10
    * Test case values: s = "mamma", c = "mia"
    * Expected test result: ('',True)
    */
    @Test
    void testReverseDelete10() {
        String s = "mamma";
        String c = "mia";
        List<Object> expected = Arrays.asList("", true);
        assertEquals(expected, ReverseDelete.reverseDelete(s, c));
    }
}
