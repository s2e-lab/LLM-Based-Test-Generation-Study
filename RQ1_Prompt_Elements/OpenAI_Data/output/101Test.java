// WordsStringTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link WordsString}.
* It contains ten test cases for the {@link WordsString#wordsString()} method.
*/
class WordsStringTest {


    @Test
    void testWordsString() {
        assertEquals(new ArrayList<Object>(), WordsString.wordsString(""));
        assertEquals(Arrays.asList("a", "b", "c"), WordsString.wordsString("a,b,c"));
        assertEquals(Arrays.asList("a", "b", "c"), WordsString.wordsString("a,b,c,"));
        assertEquals(Arrays.asList("a", "b", "c"), WordsString.wordsString("a,b,c, "));
        assertEquals(Arrays.asList("a", "b", "c"), WordsString.wordsString("a, b, c"));
        assertEquals(Arrays.asList("a", "b", "c"), WordsString.wordsString("a, b, c, "));
        assertEquals(Arrays.asList("a", "b", "c"), WordsString.wordsString("a, b, c,  "));
        assertEquals(Arrays.asList("a", "b", "c"), WordsString.wordsString("a, b, c,   "));
        assertEquals(Arrays.asList("a", "b", "c"), WordsString.wordsString("a, b, c,    "));
        assertEquals(Arrays.asList("a", "b", "c"), WordsString.wordsString("a, b, c,     "));
    }
}