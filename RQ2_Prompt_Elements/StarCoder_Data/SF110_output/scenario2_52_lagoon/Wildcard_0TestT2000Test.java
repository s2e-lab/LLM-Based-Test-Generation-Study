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
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_1Test {
		
    /**
    * Test method for {@link Wildcard#isWildcard(String)}.
    */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java"));
        assertFalse(Wildcard.isWildcard("*.java;*.class"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.xsl"));
    }
}

// Wildcard_2Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_2Test {
		
    /**
    * Test method for {@link Wildcard#isWildcard(String)}.
    */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java"));
        assertFalse(Wildcard.isWildcard("*.java;*.class"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.xsl"));
    }
}

// Wildcard_3Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_3Test {
		
    /**
    * Test method for {@link Wildcard#isWildcard(String)}.
    */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java"));
        assertFalse(Wildcard.isWildcard("*.java;*.class"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.xsl"));
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
        assertFalse(Wildcard.isWildcard("*.java"));
        assertFalse(Wildcard.isWildcard("*.java;*.class"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.xsl"));
    }
}

// Wildcard_5Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_5Test {
		
    /**
    * Test method for {@link Wildcard#isWildcard(String)}.
    */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java"));
        assertFalse(Wildcard.isWildcard("*.java;*.class"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt"));
        assertFalse(Wildcard.isWildcard("*.