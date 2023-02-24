// SimplifyTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Simplify}.
* It contains ten test cases for the {@link Simplify#simplify()} method.
*/
class SimplifyTest {

    @Test
    void testSimplify() {
        assertTrue(Simplify.simplify("1/2", "1/2"));
        assertTrue(Simplify.simplify("1/2", "2/4"));
        assertTrue(Simplify.simplify("1/2", "4/8"));
        assertTrue(Simplify.simplify("1/2", "8/16"));
        assertTrue(Simplify.simplify("1/2", "16/32"));
        assertTrue(Simplify.simplify("1/2", "32/64"));
        assertTrue(Simplify.simplify("1/2", "64/128"));
        assertTrue(Simplify.simplify("1/2", "128/256"));
        assertTrue(Simplify.simplify("1/2", "256/512"));
        assertTrue(Simplify.simplify("1/2", "512/1024"));
    }
}

// Simplify.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Simplify {

    public static Boolean simplify(String x, String n) {
        String[] a = x.split("/");
        String[] b = n.split("/");
        int numerator = Integer.parseInt(a[0]) * Integer.parseInt(b[0]);
        int denom = Integer.parseInt(a[1]) * Integer.parseInt(b[1]);
        if (numerator % denom == 0) {
            return true;
        }
        return false;
    }
}

// SimplifyTest.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Simplify}.
* It contains ten test cases for the {@link Simplify#simplify()} method.
*/
class SimplifyTest {
    @Test
    void testSimplify() {
        assertTrue(Simplify.simplify("1/2", "1/2"));
        assertTrue(Simplify.simplify("1/2", "2/4"));
        assertTrue(Simplify.simplify("1/2", "4/8"));
        assertTrue(Simplify.simplify("1/2", "8/16"));
        assertTrue(Simplify.simplify("1/2", "16/32"));
        assertTrue(Simplify.simplify("1/2", "32/64"));
        assertTrue(Simplify.simplify("1/2", "64/128"));
        assertTrue(Simplify.simplify("1/2", "128/256"));
        assertTrue(Simplify.simplify("1/2", "256/512"));
        assertTrue(Simplify.simplify("1/2", "512/1024"));
    }
}

// Simplify.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Simplify {

    public static Boolean simplify(String x, String n) {
        String[] a = x.split("/");
        String[] b = n.split("/");
        int numerator = Integer.parseInt(a[0]) * Integer.parseInt(b[0]);
        int denom = Integer.parseInt(a[1]) * Integer.parseInt(b[1]);
        if (numerator % denom == 0) {
            return true;
        }
        return false;
    }
}

// SimplifyTest.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;