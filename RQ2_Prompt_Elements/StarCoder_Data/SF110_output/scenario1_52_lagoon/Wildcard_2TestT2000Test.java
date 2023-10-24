// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#instantiateWildcard(String, String)} method.
*/
class Wildcard_2Test {

    @Test
    void testInstantiateWildcard() {
        String pattern = "a*b";
        String part = "c";
        String expected = "acb";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard2() {
        String pattern = "a*b";
        String part = "d";
        String expected = "ad";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard3() {
        String pattern = "a*b";
        String part = "cd";
        String expected = "acd";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard4() {
        String pattern = "a*b";
        String part = "bcd";
        String expected = "abcd";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard5() {
        String pattern = "a*b";
        String part = "abcd";
        String expected = "aabcd";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard6() {
        String pattern = "a*b";
        String part = "abcde";
        String expected = "aabcde";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard7() {
        String pattern = "a*b";
        String part = "abcde";
        String expected = "aabcde";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard8() {
        String pattern = "a*b";
        String part = "abcde";
        String expected = "aabcde";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard9() {
        String pattern = "a*b";
        String part = "abcde";
        String expected = "aabcde";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    @Test
    void testInstantiateWildcard10() {
        String pattern = "a*b";
        String part = "abcde";
        String expected = "aabcde";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }
}
