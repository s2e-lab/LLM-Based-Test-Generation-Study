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
* It contains ten test cases for the {@link SplitWords#splitWords()} method.
*/
class SplitWordsTest {


    @Test
    void testSplitWords() {
        assertEquals(Arrays.asList("Hello", "World"), SplitWords.splitWords("Hello World"));
        assertEquals(Arrays.asList("Hello", "World"), SplitWords.splitWords("Hello,World"));
        assertEquals(Arrays.asList("Hello", "World"), SplitWords.splitWords("Hello, World"));
        assertEquals(Arrays.asList("Hello", "World"), SplitWords.splitWords("Hello World,"));
        assertEquals(Arrays.asList("Hello", "World"), SplitWords.splitWords("Hello, World,"));
        assertEquals(Arrays.asList("Hello", "World"), SplitWords.splitWords("Hello, World, "));
        assertEquals(Arrays.asList("Hello", "World"), SplitWords.splitWords("Hello, World, ,"));
        assertEquals(Arrays.asList("Hello", "World"), SplitWords.splitWords("Hello, World, , "));
        assertEquals(Arrays.asList("Hello", "World"), SplitWords.splitWords("Hello, World, , ,"));
        assertEquals(Arrays.asList("Hello", "World"), SplitWords.splitWords("Hello, World, , , "));
    }
}