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
     * Test case for {@link Wildcard#isWildcard(String)}.
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
        assertTrue(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties"));
        assertTrue(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties;*.xml"));
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
     * Test case for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties;*.xml;"));
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
     * Test case for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties;*.xml;*."));
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
     * Test case for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties;*.xml;*.;"));
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
     * Test case for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties;*.xml;*.;*"));
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
     * Test case for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties;*.xml;*.;*;"));
    }
}

// Wildcard_6Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_6Test {
		
    /**
     * Test case for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties;*.xml;*.;*;*"));
    }
}

// Wildcard_7Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_7Test {
		
    /**
     * Test case for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties;*.xml;*.;*;*;"));
    }
}

// Wildcard_8Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_8Test {
		
    /**
     * Test case for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties;*.xml;*.;*;*;*"));
    }
}

// Wildcard_9Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Wildcard}.
* It contains ten unit test cases for the {@link Wildcard#isWildcard(String)} method.
*/
class Wildcard_9Test {
		
    /**
     * Test case for {@link Wildcard#isWildcard(String)}.
     */
    @Test
    void testIsWildcard() {
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;*.html;*.xml;*.xsl;*.xslt;*.xsd;*.dtd;*.properties;*.xml;*.;*;*;*;"));
    }
}

// Wildcard_10Test.java
package nu.staldal.lagoon.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static