// ConcatenateTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

    /**
     * Test case for the {@link Concatenate#concatenate(List)} method.
     * It tests the concatenation of a list of strings.
     */
    @Test
    void testConcatenate() {
        List<Object> strings = List.of("Hello", " ", "World", "!");
        String expected = "Hello World!";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Concatenate#concatenate(List)} method.
     * It tests the concatenation of a list of integers.
     */
    @Test
    void testConcatenate2() {
        List<Object> strings = List.of(1, 2, 3, 4, 5);
        String expected = "12345";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Concatenate#concatenate(List)} method.
     * It tests the concatenation of a list of booleans.
     */
    @Test
    void testConcatenate3() {
        List<Object> strings = List.of(true, false, true);
        String expected = "truefalsetrue";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Concatenate#concatenate(List)} method.
     * It tests the concatenation of a list of characters.
     */
    @Test
    void testConcatenate4() {
        List<Object> strings = List.of('a', 'b', 'c', 'd', 'e');
        String expected = "abcde";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Concatenate#concatenate(List)} method.
     * It tests the concatenation of a list of doubles.
     */
    @Test
    void testConcatenate5() {
        List<Object> strings = List.of(1.0, 2.0, 3.0, 4.0, 5.0);
        String expected = "1.02.03.04.05.0";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Concatenate#concatenate(List)} method.
     * It tests the concatenation of a list of floats.
     */
    @Test
    void testConcatenate6() {
        List<Object> strings = List.of(1.0f, 2.0f, 3.0f, 4.0f, 5.0f);
        String expected = "1.02.03.04.05.0";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Concatenate#concatenate(List)} method.
     * It tests the concatenation of a list of longs.
     */
    @Test
    void testConcatenate7() {
        List<Object> strings = List.of(1L, 2L, 3L, 4L, 5L);
        String expected = "12345";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Concatenate#concatenate(List)} method.
     * It tests the concatenation of a list of shorts.
     */
    @Test
    void testConcatenate8() {
        List<Object> strings = List.of((short) 1, (short) 2, (short) 3, (short) 4, (short) 5);
        String expected = "12345";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Concatenate#concatenate(List)} method.
     * It tests the concatenation of a list of bytes.
     */
    @Test
    void testConcatenate9() {
        List<Object> strings = List.of((byte) 1, (byte) 2, (byte) 3, (byte) 4, (byte) 5);
        String expected = "12345";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }

    /**
     * Test case for the {@link Concatenate#concatenate(List)} method.
     * It tests the concatenation of a list of objects.
     */
    @Test
    void testConcatenate10() {
        List<Object> strings = List.of(new Object(), new Object(), new Object(), new Object(), new Object());
        String expected = "java.lang.Objectjava.lang.Objectjava.lang.Objectjava.lang.Objectjava.lang.Object";
        String actual = Concatenate.concatenate(strings);
        assertEquals(expected, actual);
    }
}
