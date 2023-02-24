// LongestTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Longest}.
 * It contains ten test cases for the {@link scenario1.Longest#longest()} method.
 */
class LongestTest {
		


    @Test
    void testLongest() {
        List<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcde");
        list.add("abcdef");
        list.add("abcdefg");
        list.add("abcdefgh");
        list.add("abcdefghi");
        list.add("abcdefghij");
        assertEquals("abcdefghij", Longest.longest(list));
    }

    @Test
    void testLongest2() {
        List<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcde");
        list.add("abcdef");
        list.add("abcdefg");
        list.add("abcdefgh");
        list.add("abcdefghi");
        list.add("abcdefghij");
        list.add("abcdefghijk");
        assertEquals("abcdefghijk", Longest.longest(list));
    }

    @Test
    void testLongest3() {
        List<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcde");
        list.add("abcdef");
        list.add("abcdefg");
        list.add("abcdefgh");
        list.add("abcdefghi");
        list.add("abcdefghij");
        list.add("abcdefghijk");
        list.add("abcdefghijkl");
        assertEquals("abcdefghijkl", Longest.longest(list));
    }

    @Test
    void testLongest4() {
        List<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcde");
        list.add("abcdef");
        list.add("abcdefg");
        list.add("abcdefgh");
        list.add("abcdefghi");
        list.add("abcdefghij");
        list.add("abcdefghijk");
        list.add("abcdefghijkl");
        list.add("abcdefghijklm");
        assertEquals("abcdefghijklm", Longest.longest(list));
    }

    @Test
    void testLongest5() {
        List<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcde");
        list.add("abcdef");
        list.add("abcdefg");
        list.add("abcdefgh");
        list.add("abcdefghi");
        list.add("abcdefghij");
        list.add("abcdefghijk");
        list.add("abcdefghijkl");
        list.add("abcdefghijklm");
        list.add("abcdefghijklmn");
        assertEquals("abcdefghijklmn", Longest.longest(list));
    }

    @Test
    void testLongest6() {
        List<Object> list = new ArrayList<Object>();
        list.add("a");
        list.add("ab");
        list.add("abc");
        list.add("abcd");
        list.add("abcde");
        list.add("abcdef");
        list.add("abcdefg");
        list.add("abcdefgh");
        list.add("abcdefghi");
        list.add("abcdefghij");
        list.add("abcdefghijk");
        list.add("abcdefghijkl");
        list.add("abcdefghijklm");
        list.add("abcdefghijklmn");
        list.add("abcdefghijklmno");
