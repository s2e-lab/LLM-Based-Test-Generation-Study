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
        String part = "c";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("ac*b", result);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard2() {
        String pattern = "a*b";
        String part = "c";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("ac*b", result);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard3() {
        String pattern = "a*b";
        String part = "c";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("ac*b", result);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard4() {
        String pattern = "a*b";
        String part = "c";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("ac*b", result);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard5() {
        String pattern = "a*b";
        String part = "c";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("ac*b", result);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard6() {
        String pattern = "a*b";
        String part = "c";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("ac*b", result);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard7() {
        String pattern = "a*b";
        String part = "c";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("ac*b", result);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard8() {
        String pattern = "a*b";
        String part = "c";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("ac*b", result);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard9() {
        String pattern = "a*b";
        String part = "c";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("ac*b", result);
    }

    /**
    * Test method for {@link Wildcard#instantiateWildcard(String, String)}.
    */
    @Test
    void testInstantiateWildcard10() {
        String pattern = "a*b";
        String part = "c";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("ac*b", result);
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
        String filename = "ac*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("c", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard2() {
        String pattern = "a*b";
        String filename = "ac*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("c", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard3() {
        String pattern = "a*b";
        String filename = "ac*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("c", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard4() {
        String pattern = "a*b";
        String filename = "ac*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("c", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard5() {
        String pattern = "a*b";
        String filename = "ac*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("c", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard6() {
        String pattern = "a*b";
        String filename = "ac*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("c", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard7() {
        String pattern = "a*b";
        String filename = "ac*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("c", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard8() {
        String pattern = "a*b";
        String filename = "ac*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("c", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard9() {
        String pattern = "a*b";
        String filename = "ac*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("c", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard10() {
        String pattern = "a*b";
        String filename = "ac*b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("c", result);
    }
}

// Wildcard_4Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_4Test {
		
    /**
    * Test method for {@link Wildcard#isWildcard(String)}.
    */
    @Test
    void testIsWildcard() {
        String pattern = "a*b";
        boolean result = Wildcard.isWildcard(pattern);
        assertTrue(result);
    }

    /**
    * Test method for {@link Wildcard#isWildcard(String)}.
    */
    @Test
    void testIsWildcard2() {
        String pattern = "a*b";
        boolean result = Wildcard.isWildcard(pattern);
        assertTrue(result);
    }

    /**
    * Test method for {@link Wildcard#isWildcard(String)}.
    */
    @Test
    void testIsWildcard3() {
        String pattern = "a*b";
        boolean result = Wildcard.isWildcard(pattern);
        assertTrue(result);
    }

    /**
    * Test method for {@link Wildcard#isWildcard(String)}.
    */
    @Test
    void testIsWildcard4() {
        String pattern = "a*b";
        boolean result = Wildcard.isWildcard(pattern);
        assertTrue(result);
    }

    /**
    * Test method for {@link Wildcard#isWildcard(String)}.
    */
    @Test
    void testIsWildcard5() {
        String pattern = "a*b";
        boolean result = Wildcard.isWildcard(pattern);
        assertTrue(result);
    }

    /**
    * Test method for {@link Wildcard#isWildcard(String)}.
    */
    @Test
    void testIsWildcard6() {
       