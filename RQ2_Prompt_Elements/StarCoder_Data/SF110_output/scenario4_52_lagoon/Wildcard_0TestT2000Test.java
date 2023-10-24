// Wildcard_0Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_0Test {

    /**
     * Test method for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    void testIsWildcard() {
        assertTrue(Wildcard.isWildcard("*.java"));
        assertTrue(Wildcard.isWildcard("*.java;*.class"));
        assertTrue(Wildcard.isWildcard("*.java;*.class;*.txt"));
        assertTrue(Wildcard.isWildcard("*.java;*.class;*.txt;*.html"));
        assertTrue(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml"));
        assertTrue(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl"));
        assertTrue(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt"));
        assertTrue(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd"));
        assertTrue(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd"));
        assertTrue(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.xsl"));
    }
}

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
        assertEquals("java", Wildcard.matchWildcard("*.java", "java.class"));
        assertEquals("java", Wildcard.matchWildcard("*.java", "java.class"));
        assertEquals("java", Wildcard.matchWildcard("*.java", "java.class"));
        assertEquals("java", Wildcard.matchWildcard("*.java", "java.class"));
        assertEquals("java", Wildcard.matchWildcard("*.java", "java.class"));
        assertEquals("java", Wildcard.matchWildcard("*.java", "java.class"));
        assertEquals("java", Wildcard.matchWildcard("*.java", "java.class"));
        assertEquals("java", Wildcard.matchWildcard("*.java", "java.class"));
        assertEquals("java", Wildcard.matchWildcard("*.java", "java.class"));
        assertEquals("java", Wildcard.matchWildcard("*.java", "java.class"));
    }
}

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
        assertEquals("java.class", Wildcard.instantiateWildcard("*.java", "java"));
        assertEquals("java.class", Wildcard.instantiateWildcard("*.java", "java"));
        assertEquals("java.class", Wildcard.instantiateWildcard("*.java", "java"));
        assertEquals("java.class", Wildcard.instantiateWildcard("*.java", "java"));
        assertEquals("java.class", Wildcard.instantiateWildcard("*.java", "java"));
        assertEquals("java.class", Wildcard.instantiateWildcard("*.java", "java"));
        assertEquals("java.class", Wildcard.instantiateWildcard("*.java", "java"));
        assertEquals("java.class", Wildcard.instantiateWildcard("*.java", "java"));
        assertEquals("java.class", Wildcard.instantiateWildcard("*.java", "java"));
        assertEquals("java.class", Wildcard.instantiateWildcard("*.java", "java"));
    }
}
