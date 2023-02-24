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
* It contains ten test cases for the {@link SelectWords#selectWords()} method.
*/
class SelectWordsTest {


    @Test
    void testSelectWords() {
        String s = "I am a student";
        int n = 2;
        List<Object> result = SelectWords.selectWords(s, n);
        List<Object> expected = new ArrayList<>();
        expected.add("student");
        assertEquals(expected, result);
    }

    @Test
    void testSelectWords2() {
        String s = "I am a student";
        int n = 3;
        List<Object> result = SelectWords.selectWords(s, n);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testSelectWords3() {
        String s = "I am a student";
        int n = 4;
        List<Object> result = SelectWords.selectWords(s, n);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testSelectWords4() {
        String s = "I am a student";
        int n = 5;
        List<Object> result = SelectWords.selectWords(s, n);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testSelectWords5() {
        String s = "I am a student";
        int n = 6;
        List<Object> result = SelectWords.selectWords(s, n);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testSelectWords6() {
        String s = "I am a student";
        int n = 7;
        List<Object> result = SelectWords.selectWords(s, n);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testSelectWords7() {
        String s = "I am a student";
        int n = 8;
        List<Object> result = SelectWords.selectWords(s, n);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testSelectWords8() {
        String s = "I am a student";
        int n = 9;
        List<Object> result = SelectWords.selectWords(s, n);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testSelectWords9() {
        String s = "I am a student";
        int n = 10;
        List<Object> result = SelectWords.selectWords(s, n);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, result);
    }

    @Test
    void testSelectWords10() {
        String s = "I am a student";
        int n = 11;
        List<Object> result = SelectWords.selectWords(s, n);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, result);
    }
}