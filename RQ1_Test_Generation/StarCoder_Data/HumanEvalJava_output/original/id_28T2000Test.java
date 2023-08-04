// ConcatenateTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list is empty.
    */
    @Test
    void testConcatenateEmptyList() {
        List<Object> strings = List.of();
        String expected = "";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains one string.
    */
    @Test
    void testConcatenateOneString() {
        List<Object> strings = List.of("a");
        String expected = "a";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains two strings.
    */
    @Test
    void testConcatenateTwoStrings() {
        List<Object> strings = List.of("a", "b");
        String expected = "ab";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains three strings.
    */
    @Test
    void testConcatenateThreeStrings() {
        List<Object> strings = List.of("a", "b", "c");
        String expected = "abc";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains four strings.
    */
    @Test
    void testConcatenateFourStrings() {
        List<Object> strings = List.of("x", "y", "z", "w");
        String expected = "xyzw";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains five strings.
    */
    @Test
    void testConcatenateFiveStrings() {
        List<Object> strings = List.of("x", "y", "z", "w", "k");
        String expected = "xyzwk";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }
}
