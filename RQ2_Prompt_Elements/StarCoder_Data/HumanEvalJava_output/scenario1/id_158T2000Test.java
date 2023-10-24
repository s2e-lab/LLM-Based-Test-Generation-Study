// FindMaxTest.java
package scenario1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FindMax}.
* It contains ten unit test cases for the {@link FindMax#findMax(List)} method.
*/
class FindMaxTest {

    @Test
    void testFindMax() {
        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        assertEquals("j", FindMax.findMax(words));
    }

    @Test
    void testFindMax2() {
        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k");
        assertEquals("k", FindMax.findMax(words));
    }

    @Test
    void testFindMax3() {
        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l");
        assertEquals("l", FindMax.findMax(words));
    }

    @Test
    void testFindMax4() {
        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m");
        assertEquals("m", FindMax.findMax(words));
    }

    @Test
    void testFindMax5() {
        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n");
        assertEquals("n", FindMax.findMax(words));
    }

    @Test
    void testFindMax6() {
        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o");
        assertEquals("o", FindMax.findMax(words));
    }

    @Test
    void testFindMax7() {
        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p");
        assertEquals("p", FindMax.findMax(words));
    }

    @Test
    void testFindMax8() {
        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q");
        assertEquals("q", FindMax.findMax(words));
    }

    @Test
    void testFindMax9() {
        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r");
        assertEquals("r", FindMax.findMax(words));
    }

    @Test
    void testFindMax10() {
        List<String> words = List.of("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s");
        assertEquals("s", FindMax.findMax(words));
    }
}
