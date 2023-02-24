// FactorizeTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Factorize}.
 * It contains ten test cases for the {@link scenario1.Factorize#factorize()} method.
 */
class FactorizeTest {
		


    @Test
    void testFactorize() {
        assertEquals(new ArrayList<Integer>(), Factorize.factorize(1));
        assertEquals(Arrays.asList(2), Factorize.factorize(2));
        assertEquals(Arrays.asList(3), Factorize.factorize(3));
        assertEquals(Arrays.asList(2, 2), Factorize.factorize(4));
        assertEquals(Arrays.asList(5), Factorize.factorize(5));
        assertEquals(Arrays.asList(2, 3), Factorize.factorize(6));
        assertEquals(Arrays.asList(7), Factorize.factorize(7));
        assertEquals(Arrays.asList(2, 2, 2), Factorize.factorize(8));
        assertEquals(Arrays.asList(3, 3), Factorize.factorize(9));
        assertEquals(Arrays.asList(2, 5), Factorize.factorize(10));
    }
}

// Factorize.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Factorize {

    public static List<Integer> factorize(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                result.add(i);
                n /= i;
            }
        }
        return result;
    }
}

// FactorizeTest.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Factorize}.
 * It contains ten test cases for the {@link scenario2.Factorize#factorize()} method.
 */
class FactorizeTest {

    @Test
    void testFactorize() {
        assertEquals(new ArrayList<Integer>(), Factorize.factorize(1));
        assertEquals(Arrays.asList(2), Factorize.factorize(2));
        assertEquals(Arrays.asList(3), Factorize.factorize(3));
        assertEquals(Arrays.asList(2, 2), Factorize.factorize(4));
        assertEquals(Arrays.asList(5), Factorize.factorize(5));
        assertEquals(Arrays.asList(2, 3), Factorize.factorize(6));
        assertEquals(Arrays.asList(7), Factorize.factorize(7));
        assertEquals(Arrays.asList(2, 2, 2), Factorize.factorize(8));
        assertEquals(Arrays.asList(3, 3), Factorize.factorize(9));
        assertEquals(Arrays.asList(2, 5), Factorize.factorize(10));
    }
}

// Factorize.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Factorize {

    public static List<Integer> factorize(int n) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                result.add(i);
                n /= i;
            }
        }
        return result;
    }
}

// FactorizeTest.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Factorize}.
 * It contains ten test cases for the {@link scenario3.Factorize#factorize()} method.
 */
class FactorizeTest {

    @Test
    void testFactorize() {
        assertEquals