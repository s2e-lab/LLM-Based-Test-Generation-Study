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
        String pattern = "a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*q*r*s*t*u*v*w*x*y*z*";
        String part = "abcdefghijklmnopqrstuvwxyz";
        String result = Wildcard.instantiateWildcard(pattern, part);
        assertEquals("abcdefghijklmnopqrstuvwxyz", result);
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
        String pattern = "a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*q*r*s*t*u*v*w*x*y*z*";
        String filename = "abcdefghijklmnopqrstuvwxyz";
        String result = Wildcard.matchWildcard(pattern, filename);
        assertEquals("abcdefghijklmnopqrstuvwxyz", result);
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
        String pattern = "a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*q*r*s*t*u*v*w*x*y*z*";
        boolean result = Wildcard.isWildcard(pattern);
        assertTrue(result);
    }
}
