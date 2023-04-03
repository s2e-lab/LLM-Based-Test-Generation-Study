// FindMaxTest.java
package original;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

    @Test
    void testFindMaxWithNullList() {
        assertNull(FindMax.findMax(null));
    }

    @Test
    void testFindMaxWithEmptyList() {
        assertNull(FindMax.findMax(Arrays.asList()));
    }

    @Test
    void testFindMaxWithOneElement() {
        assertEquals("b", FindMax.findMax(Arrays.asList("b")));
    }

    @Test
    void testFindMaxWithMultipleElements() {
        assertEquals("string", FindMax.findMax(Arrays.asList("name", "of", "string")));
        assertEquals("enam", FindMax.findMax(Arrays.asList("name", "enam", "game")));
        assertEquals("aaaaaaa", FindMax.findMax(Arrays.asList("aaaaaaa", "bb", "cc")));
        assertEquals("abc", FindMax.findMax(Arrays.asList("abc", "cba")));
        assertEquals("footbott", FindMax.findMax(Arrays.asList("play", "this", "game", "of", "footbott")));
        assertEquals("gonna", FindMax.findMax(Arrays.asList("we", "are", "gonna", "rock")));
        assertEquals("nation", FindMax.findMax(Arrays.asList("we", "are", "a", "mad", "nation")));
        assertEquals("this", FindMax.findMax(Arrays.asList("this", "is", "a", "prrk")));
        assertEquals("play", FindMax.findMax(Arrays.asList("play", "play", "play")));
    }

    @Test
    void testFindMaxWithDuplicateMaxUniqueElements() {
        assertEquals("abc", FindMax.findMax(Arrays.asList("abc", "cba", "bac")));
        assertEquals("enam", FindMax.findMax(Arrays.asList("name", "enam", "amen")));
        assertEquals("footbott", FindMax.findMax(Arrays.asList("play", "this", "game", "of", "footbott", "bottfoot")));
    }
}