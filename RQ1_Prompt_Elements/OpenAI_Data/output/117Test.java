// SelectWordsTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link SelectWords}.
 * It contains ten test cases for the {@link scenario1.SelectWords#selectWords()} method.
 */
class SelectWordsTest {
		


    @Test
    void testSelectWords() {
        String s = "I am a student";
        int n = 2;
        List<Object> expected = new ArrayList<>();
        expected.add("student");
        List<Object> actual = SelectWords.selectWords(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords2() {
        String s = "I am a student";
        int n = 3;
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords3() {
        String s = "I am a student";
        int n = 4;
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords4() {
        String s = "I am a student";
        int n = 5;
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords5() {
        String s = "I am a student";
        int n = 6;
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords6() {
        String s = "I am a student";
        int n = 7;
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords7() {
        String s = "I am a student";
        int n = 8;
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords8() {
        String s = "I am a student";
        int n = 9;
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords9() {
        String s = "I am a student";
        int n = 10;
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords(s, n);
        assertEquals(expected, actual);
    }

    @Test
    void testSelectWords10() {
        String s = "I am a student";
        int n = 11;
        List<Object> expected = new ArrayList<>();
        List<Object> actual = SelectWords.selectWords(s, n);
        assertEquals(expected, actual);
    }
}