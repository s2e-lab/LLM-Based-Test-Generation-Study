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

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard() {
        String pattern = "a*b";
        String filename = "ab";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);

        pattern = "a*b";
        filename = "abc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "aabc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("aa", result);

        pattern = "a*b";
        filename = "aab";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "a";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "b";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "c";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "d";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "ab";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);

        pattern = "a*b";
        filename = "abc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "aabc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("aa", result);

        pattern = "a*b";
        filename = "aab";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "a";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "b";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "c";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "d";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }
}

// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_2Test {
		
    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard() {
        String pattern = "a*b";
        String filename = "ab";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);

        pattern = "a*b";
        filename = "abc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "aabc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("aa", result);

        pattern = "a*b";
        filename = "aab";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "a";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "b";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "c";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "d";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "ab";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);

        pattern = "a*b";
        filename = "abc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "aabc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("aa", result);

        pattern = "a*b";
        filename = "aab";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "a";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "b";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "c";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "d";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }
}

// Wildcard_3Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_3Test {
		
    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard() {
        String pattern = "a*b";
        String filename = "ab";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);

        pattern = "a*b";
        filename = "abc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "aabc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("aa", result);

        pattern = "a*b";
        filename = "aab";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "a";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "b";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "c";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "d";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "ab";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("", result);

        pattern = "a*b";
        filename = "abc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "aabc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("aa", result);

        pattern = "a*b";
        filename = "aab";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a", result);

        pattern = "a*b";
        filename = "a";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "b";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "c";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);

        pattern = "a*b";
        filename = "d";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }
}

// Wildcard_4Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.