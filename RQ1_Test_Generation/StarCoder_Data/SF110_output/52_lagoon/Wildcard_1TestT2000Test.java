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
        String filename = "a1234567890b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a1234567890", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard2() {
        String pattern = "a*b";
        String filename = "a1234567890";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard3() {
        String pattern = "a*b";
        String filename = "b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard4() {
        String pattern = "a*b";
        String filename = "a1234567890b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a1234567890", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard5() {
        String pattern = "a*b";
        String filename = "a1234567890";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard6() {
        String pattern = "a*b";
        String filename = "b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard7() {
        String pattern = "a*b";
        String filename = "a1234567890b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a1234567890", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard8() {
        String pattern = "a*b";
        String filename = "a1234567890";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard9() {
        String pattern = "a*b";
        String filename = "b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard10() {
        String pattern = "a*b";
        String filename = "a1234567890b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a1234567890", result);
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
        String filename = "a1234567890b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a1234567890", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard2() {
        String pattern = "a*b";
        String filename = "a1234567890";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard3() {
        String pattern = "a*b";
        String filename = "b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard4() {
        String pattern = "a*b";
        String filename = "a1234567890b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a1234567890", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard5() {
        String pattern = "a*b";
        String filename = "a1234567890";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard6() {
        String pattern = "a*b";
        String filename = "b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard7() {
        String pattern = "a*b";
        String filename = "a1234567890b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a1234567890", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard8() {
        String pattern = "a*b";
        String filename = "a1234567890";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard9() {
        String pattern = "a*b";
        String filename = "b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals(null, result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard10() {
        String pattern = "a*b";
        String filename = "a1234567890b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a1234567890", result);
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
        String filename = "a1234567890b";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("a1234567890", result);
    }

    /**
    * Test method for {@link Wildcard#matchWildcard(String, String)}.
    */
    @Test
    void testMatchWildcard2() {
        String pattern = "a*b";
        String filename = "a12