// Wildcard_1Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_1Test {

    @Test
    void testMatchWildcard() {
        String pattern = "a*b";
        String filename = "ab";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcard2() {
        String pattern = "a*b";
        String filename = "abc";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcard3() {
        String pattern = "a*b";
        String filename = "aabc";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcard4() {
        String pattern = "a*b";
        String filename = "aab";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcard5() {
        String pattern = "a*b";
        String filename = "a";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcard6() {
        String pattern = "a*b";
        String filename = "b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcard7() {
        String pattern = "a*b";
        String filename = "c";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcard8() {
        String pattern = "a*b";
        String filename = "ab";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcard9() {
        String pattern = "a*b";
        String filename = "a*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }

    @Test
    void testMatchWildcard10() {
        String pattern = "a*b";
        String filename = "a*bc";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);
    }
}
