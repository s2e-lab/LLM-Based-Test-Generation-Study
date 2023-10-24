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
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "ac";
        result = Wildcard.matchWildcard(pattern, filename);
        assertNull(result);

        pattern = "a*b";
        filename = "abc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abcd";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");
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
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "ac";
        result = Wildcard.matchWildcard(pattern, filename);
        assertNull(result);

        pattern = "a*b";
        filename = "abc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abcd";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");
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
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "ac";
        result = Wildcard.matchWildcard(pattern, filename);
        assertNull(result);

        pattern = "a*b";
        filename = "abc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abcd";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");
    }
}

// Wildcard_4Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#matchWildcard(String, String)} method.
*/
class Wildcard_4Test {
		
    /**
     * Test method for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard() {
        String pattern = "a*b";
        String filename = "ab";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "ac";
        result = Wildcard.matchWildcard(pattern, filename);
        assertNull(result);

        pattern = "a*b";
        filename = "abc";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abcd";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a*b";
        filename = "abbbbbbbb";
        result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "a");

        pattern = "a