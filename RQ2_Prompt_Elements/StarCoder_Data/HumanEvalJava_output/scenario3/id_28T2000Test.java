// ConcatenateTest.java
package scenario3;

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
    * Test case for {@link Concatenate#concatenate(List)} where the list is empty.
    */
    @Test
    void testConcatenateEmptyList2() {
        List<Object> strings = List.of();
        String expected = "";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains three strings.
    */
    @Test
    void testConcatenateThreeStrings2() {
        List<Object> strings = List.of("x", "y", "z");
        String expected = "xyz";
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

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains five strings.
    */
    @Test
    void testConcatenateFiveStrings2() {
        List<Object> strings = List.of("x", "y", "z", "w", "k");
        String expected = "xyzwk";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains five strings.
    */
    @Test
    void testConcatenateFiveStrings3() {
        List<Object> strings = List.of("x", "y", "z", "w", "k");
        String expected = "xyzwk";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains five strings.
    */
    @Test
    void testConcatenateFiveStrings4() {
        List<Object> strings = List.of("x", "y", "z", "w", "k");
        String expected = "xyzwk";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains five strings.
    */
    @Test
    void testConcatenateFiveStrings5() {
        List<Object> strings = List.of("x", "y", "z", "w", "k");
        String expected = "xyzwk";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains five strings.
    */
    @Test
    void testConcatenateFiveStrings6() {
        List<Object> strings = List.of("x", "y", "z", "w", "k");
        String expected = "xyzwk";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains five strings.
    */
    @Test
    void testConcatenateFiveStrings7() {
        List<Object> strings = List.of("x", "y", "z", "w", "k");
        String expected = "xyzwk";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains five strings.
    */
    @Test
    void testConcatenateFiveStrings8() {
        List<Object> strings = List.of("x", "y", "z", "w", "k");
        String expected = "xyzwk";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains five strings.
    */
    @Test
    void testConcatenateFiveStrings9() {
        List<Object> strings = List.of("x", "y", "z", "w", "k");
        String expected = "xyzwk";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
    * Test case for {@link Concatenate#concatenate(List)} where the list contains five strings.
    */
    @Test
    void testConcatenateFiveStrings10() {
        List<Object> strings = List.of("x", "y", "z", "w", "k");
        String expected = "xyzwk";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }
}
