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
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; "));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; "));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; "));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; "));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; "));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; "));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;*.txt; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ; ;"));
        assertFalse(Wildcard.isWildcard("*.java;*.class;