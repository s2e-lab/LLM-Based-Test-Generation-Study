// SplitWordsTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SplitWords}.
* It contains ten unit test cases for the {@link SplitWords#splitWords(String)} method.
*/
class SplitWordsTest {

    @Test
    void test1() {
        String txt = "Hello world!";
        String[] expected = {"Hello", "world!"};
        assertEquals(Arrays.asList(expected), SplitWords.splitWords(txt));
    }

    @Test
    void test2() {
        String txt = "Hello,world!";
        String[] expected = {"Hello", "world!"};
        assertEquals(Arrays.asList(expected), SplitWords.splitWords(txt));
    }

    @Test
    void test3() {
        String txt = "Hello world,!";
        String[] expected = {"Hello", "world,!"};
        assertEquals(Arrays.asList(expected), SplitWords.splitWords(txt));
    }

    @Test
    void test4() {
        String txt = "Hello,Hello,world !";
        String[] expected = {"Hello,Hello,world", "!"};
        assertEquals(Arrays.asList(expected), SplitWords.splitWords(txt));
    }

    @Test
    void test5() {
        String txt = "abcdef";
        int expected = 3;
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test
    void test6() {
        String txt = "aaabb";
        int expected = 2;
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test
    void test7() {
        String txt = "aaaBb";
        int expected = 1;
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test
    void test8() {
        String txt = "";
        int expected = 0;
        assertEquals(expected, SplitWords.splitWords(txt));
    }

    @Test
    void test9() {
        String txt = "Hello, world!";
        String[] expected = {"Hello", "world!"};
        assertEquals(Arrays.asList(expected), SplitWords.splitWords(txt));
    }

    @Test
    void test10() {
        String txt = "Hello, world!";
        String[] expected = {"Hello", "world!"};
        assertEquals(Arrays.asList(expected), SplitWords.splitWords(txt));
    }
}
