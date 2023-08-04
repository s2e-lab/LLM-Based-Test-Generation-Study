// ConcatenateTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

    @Test
    void testConcatenate() {
        List<Object> strings = List.of("Hello", " ", "World");
        String result = Concatenate.concatenate(strings);
        assertEquals("Hello World", result);
    }

    @Test
    void testConcatenateWithEmptyList() {
        List<Object> strings = List.of();
        String result = Concatenate.concatenate(strings);
        assertEquals("", result);
    }

    @Test
    void testConcatenateWithNull() {
        List<Object> strings = null;
        String result = Concatenate.concatenate(strings);
        assertEquals("", result);
    }

    @Test
    void testConcatenateWithNullElements() {
        List<Object> strings = List.of("Hello", null, "World");
        String result = Concatenate.concatenate(strings);
        assertEquals("HelloWorld", result);
    }

    @Test
    void testConcatenateWithNullElements2() {
        List<Object> strings = List.of(null, null, null);
        String result = Concatenate.concatenate(strings);
        assertEquals("", result);
    }

    @Test
    void testConcatenateWithNullElements3() {
        List<Object> strings = List.of(null, "Hello", null);
        String result = Concatenate.concatenate(strings);
        assertEquals("Hello", result);
    }

    @Test
    void testConcatenateWithNullElements4() {
        List<Object> strings = List.of(null, null, "World");
        String result = Concatenate.concatenate(strings);
        assertEquals("World", result);
    }

    @Test
    void testConcatenateWithNullElements5() {
        List<Object> strings = List.of("Hello", null, null);
        String result = Concatenate.concatenate(strings);
        assertEquals("Hello", result);
    }

    @Test
    void testConcatenateWithNullElements6() {
        List<Object> strings = List.of(null, null, null, null);
        String result = Concatenate.concatenate(strings);
        assertEquals("", result);
    }

    @Test
    void testConcatenateWithNullElements7() {
        List<Object> strings = List.of(null, "Hello", null, null);
        String result = Concatenate.concatenate(strings);
        assertEquals("Hello", result);
    }

    @Test
    void testConcatenateWithNullElements8() {
        List<Object> strings = List.of(null, null, "World", null);
        String result = Concatenate.concatenate(strings);
        assertEquals("World", result);
    }

    @Test
    void testConcatenateWithNullElements9() {
        List<Object> strings = List.of("Hello", null, null, null);
        String result = Concatenate.concatenate(strings);
        assertEquals("Hello", result);
    }

    @Test
    void testConcatenateWithNullElements10() {
        List<Object> strings = List.of(null, null, null, null, null);
        String result = Concatenate.concatenate(strings);
        assertEquals("", result);
    }
}
