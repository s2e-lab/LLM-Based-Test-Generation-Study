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

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard() {
        String pattern = "a*b";
        String part = "abc";
        String expected = "aabc";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard2() {
        String pattern = "a*b";
        String part = "ab";
        String expected = "aab";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard3() {
        String pattern = "a*b";
        String part = "a";
        String expected = "a";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard4() {
        String pattern = "a*b";
        String part = "b";
        String expected = "b";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard5() {
        String pattern = "a*b";
        String part = "c";
        String expected = "c";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard6() {
        String pattern = "a*b";
        String part = "d";
        String expected = "d";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard7() {
        String pattern = "a*b";
        String part = "abbc";
        String expected = "aabbc";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard8() {
        String pattern = "a*b";
        String part = "abbb";
        String expected = "aabbb";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard9() {
        String pattern = "a*b";
        String part = "abbb";
        String expected = "aabbb";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard10() {
        String pattern = "a*b";
        String part = "abbb";
        String expected = "aabbb";
        String actual = Wildcard.instantiateWildcard(pattern, part);
        assertEquals(expected, actual);
    }
}
