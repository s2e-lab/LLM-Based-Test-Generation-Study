// Fib4Test.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Fib4}.
 * It contains ten test cases for the {@link scenario1.Fib4#fib4()} method.
 */
class Fib4Test {
		


    @Test
    void testFib4() {
        assertEquals(0, Fib4.fib4(1));
        assertEquals(0, Fib4.fib4(2));
        assertEquals(2, Fib4.fib4(3));
        assertEquals(2, Fib4.fib4(4));
        assertEquals(4, Fib4.fib4(5));
        assertEquals(6, Fib4.fib4(6));
        assertEquals(10, Fib4.fib4(7));
        assertEquals(16, Fib4.fib4(8));
        assertEquals(26, Fib4.fib4(9));
        assertEquals(42, Fib4.fib4(10));
    }
}

// Fib5.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Fib5 {

    public static int fib5(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        int a = 0;
        int b = 0;
        int c = 2;
        int d = 0;
        int e = 0;
        for (int i = 4; i <= n; i++) {
            e = a + b + c + d;
            a = b;
            b = c;
            c = d;
            d = e;
        }
        return e;
    }
}

// Fib5Test.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Fib5}.
 * It contains ten test cases for the {@link scenario1.Fib5#fib5()} method.
 */
class Fib5Test {

    @Test
    void testFib5() {
        assertEquals(0, Fib5.fib5(1));
        assertEquals(0, Fib5.fib5(2));
        assertEquals(2, Fib5.fib5(3));
        assertEquals(2, Fib5.fib5(4));
        assertEquals(4, Fib5.fib5(5));
        assertEquals(6, Fib5.fib5(6));
        assertEquals(10, Fib5.fib5(7));
        assertEquals(16, Fib5.fib5(8));
        assertEquals(26, Fib5.fib5(9));
        assertEquals(42, Fib5.fib5(10));
    }
}

// Fib6.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Fib6 {

    public static int fib6(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        int a = 0;
        int b = 0;
        int c = 2;
        int d = 0;
        int e = 0;
        for (int i = 4; i <= n; i++) {
            e = a + b + c + d;
            a = b;
            b = c;
            c = d;
            d = e;
        }
        return e;
    }
}

// Fib6Test.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Fib6}.
 * It contains ten test cases for the {@link scenario1.Fib6#fib6()} method.
 */
class Fib6Test {

    @Test
    void testFib6() {
        assertEqu