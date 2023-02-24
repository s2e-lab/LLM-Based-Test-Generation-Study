// SplitWordsTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link SplitWords}.
 * It contains ten test cases for the {@link scenario1.SplitWords#splitWords()} method.
 */
class SplitWordsTest {
		


    @Test
    void testSplitWords() {
        assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a b c"));
        assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a,b,c"));
        assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a, b, c"));
        assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a,b, c"));
        assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a, b,c"));
        assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a,b, c"));
        assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a, b,c"));
        assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a,b, c"));
        assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a, b,c"));
        assertEquals(Arrays.asList("a", "b", "c"), SplitWords.splitWords("a,b, c"));
    }
}