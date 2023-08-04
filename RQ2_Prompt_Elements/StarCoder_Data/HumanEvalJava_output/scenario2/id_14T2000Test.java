// AllPrefixesTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains ten unit test cases for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {

    /**
     * Test case for the {@link AllPrefixes#allPrefixes(String)} method.
     * It tests the case when the input string is empty.
     */
    @Test
    void testAllPrefixesEmptyString() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, AllPrefixes.allPrefixes(""));
    }

    /**
     * Test case for the {@link AllPrefixes#allPrefixes(String)} method.
     * It tests the case when the input string is not empty.
     */
    @Test
    void testAllPrefixesString() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        expected.add("abcd");
        expected.add("abcde");
        expected.add("abcdef");
        expected.add("abcdefg");
        expected.add("abcdefgh");
        expected.add("abcdefghi");
        expected.add("abcdefghij");
        assertEquals(expected, AllPrefixes.allPrefixes("abcdefghij"));
    }
}
