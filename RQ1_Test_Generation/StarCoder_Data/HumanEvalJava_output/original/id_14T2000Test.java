// AllPrefixesTest.java
package original;

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
    * Test case for {@link AllPrefixes#allPrefixes(String)} where the input string is "abc".
    */
    @Test
    void testAllPrefixes1() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("ab");
        expected.add("abc");
        assertEquals(expected, AllPrefixes.allPrefixes("abc"));
    }

    /**
    * Test case for {@link AllPrefixes#allPrefixes(String)} where the input string is "".
    */
    @Test
    void testAllPrefixes2() {
        List<Object> expected = new ArrayList<Object>();
        assertEquals(expected, AllPrefixes.allPrefixes(""));
    }

    /**
    * Test case for {@link AllPrefixes#allPrefixes(String)} where the input string is "asdfgh".
    */
    @Test
    void testAllPrefixes3() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("a");
        expected.add("as");
        expected.add("asd");
        expected.add("asdf");
        expected.add("asdfg");
        expected.add("asdfgh");
        assertEquals(expected, AllPrefixes.allPrefixes("asdfgh"));
    }

    /**
    * Test case for {@link AllPrefixes#allPrefixes(String)} where the input string is "WWW".
    */
    @Test
    void testAllPrefixes4() {
        List<Object> expected = new ArrayList<Object>();
        expected.add("W");
        expected.add("WW");
        expected.add("WWW");
        assertEquals(expected, AllPrefixes.allPrefixes("WWW"));
    }
}
