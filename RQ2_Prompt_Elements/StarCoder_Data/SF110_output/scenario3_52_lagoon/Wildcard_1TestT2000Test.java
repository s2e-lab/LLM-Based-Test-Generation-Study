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
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard() {
        String pattern = "a*b";
        String filename = "ab";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "ab");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_1() {
        String pattern = "a*b";
        String filename = "ac";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, null);
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_2() {
        String pattern = "a*b";
        String filename = "abc";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abc");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_3() {
        String pattern = "a*b";
        String filename = "abcd";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abc");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_4() {
        String pattern = "a*b";
        String filename = "abbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_5() {
        String pattern = "a*b";
        String filename = "abbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_6() {
        String pattern = "a*b";
        String filename = "abbbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_7() {
        String pattern = "a*b";
        String filename = "abbbbbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_8() {
        String pattern = "a*b";
        String filename = "abbbbbbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_9() {
        String pattern = "a*b";
        String filename = "abbbbbbbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_10() {
        String pattern = "a*b";
        String filename = "abbbbbbbbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
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
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard() {
        String pattern = "a*b";
        String filename = "ab";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "ab");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_1() {
        String pattern = "a*b";
        String filename = "ac";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, null);
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_2() {
        String pattern = "a*b";
        String filename = "abc";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abc");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_3() {
        String pattern = "a*b";
        String filename = "abcd";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abc");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_4() {
        String pattern = "a*b";
        String filename = "abbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_5() {
        String pattern = "a*b";
        String filename = "abbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_6() {
        String pattern = "a*b";
        String filename = "abbbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_7() {
        String pattern = "a*b";
        String filename = "abbbbbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_8() {
        String pattern = "a*b";
        String filename = "abbbbbbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_9() {
        String pattern = "a*b";
        String filename = "abbbbbbbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_10() {
        String pattern = "a*b";
        String filename = "abbbbbbbbbb";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "abbb");
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
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard() {
        String pattern = "a*b";
        String filename = "ab";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, "ab");
    }

    /**
     * Test case for {@link Wildcard#matchWildcard(String, String)}.
     */
    @Test
    void testMatchWildcard_1() {
        String pattern = "a*b";
        String filename = "ac";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(result, null);
    }

    /**
     * Test