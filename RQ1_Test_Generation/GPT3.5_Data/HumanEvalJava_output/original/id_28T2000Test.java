// ConcatenateTest.java
package original;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains ten unit test cases for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

    @Test
    void testEmptyList() {
        List<Object> strings = Collections.emptyList();
        String result = Concatenate.concatenate(strings);
        assertEquals("", result);
    }

    @Test
    void testSingleElementList() {
        List<Object> strings = Collections.singletonList("a");
        String result = Concatenate.concatenate(strings);
        assertEquals("a", result);
    }

    @Test
    void testMultipleElementList() {
        List<Object> strings = Arrays.asList("a", "b", "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("abc", result);
    }

    @Test
    void testListWithNullElement() {
        List<Object> strings = Arrays.asList("a", null, "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("anullc", result);
    }

    @Test
    void testListWithEmptyStringElement() {
        List<Object> strings = Arrays.asList("a", "", "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("ac", result);
    }

    @Test
    void testListWithWhitespaceStringElement() {
        List<Object> strings = Arrays.asList("a", " ", "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("a c", result);
    }

    @Test
    void testListWithIntegerElement() {
        List<Object> strings = Arrays.asList("a", 1, "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("a1c", result);
    }

    @Test
    void testListWithDoubleElement() {
        List<Object> strings = Arrays.asList("a", 1.5, "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("a1.5c", result);
    }

    @Test
    void testListWithBooleanElement() {
        List<Object> strings = Arrays.asList("a", true, "c");
        String result = Concatenate.concatenate(strings);
        assertEquals("atruec", result);
    }

    @Test
    void testListWithMixedElements() {
        List<Object> strings = Arrays.asList("a", 1, true, "c", 1.5);
        String result = Concatenate.concatenate(strings);
        assertEquals("a1truec1.5", result);
    }
}