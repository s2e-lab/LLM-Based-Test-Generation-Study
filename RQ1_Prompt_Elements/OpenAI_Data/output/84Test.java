// Solve1Test.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Solve1}.
* It contains ten test cases for the {@link Solve1#solve()} method.
*/
class Solve1Test {


    @Test
    void testSolve1() {
        assertEquals("101", Solve1.solve(13));
    }

    @Test
    void testSolve2() {
        assertEquals("11", Solve1.solve(3));
    }

    @Test
    void testSolve3() {
        assertEquals("101", Solve1.solve(123));
    }

    @Test
    void testSolve4() {
        assertEquals("11", Solve1.solve(12));
    }

    @Test
    void testSolve5() {
        assertEquals("101", Solve1.solve(12345));
    }

    @Test
    void testSolve6() {
        assertEquals("11", Solve1.solve(1234));
    }

    @Test
    void testSolve7() {
        assertEquals("101", Solve1.solve(123456789));
    }

    @Test
    void testSolve8() {
        assertEquals("11", Solve1.solve(12345678));
    }

    @Test
    void testSolve9() {
        assertEquals("101", Solve1.solve(1234567890123456789));
    }

    @Test
    void testSolve10() {
        assertEquals("11", Solve1.solve(123456789012345678));
    }
}

// Solve2.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Solve2 {

    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return Integer.toBinaryString(sum);
    }
}

// Solve2Test.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Solve2}.
* It contains ten test cases for the {@link Solve2#solve()} method.
*/
class Solve2Test {

    @Test
    void testSolve1() {
        assertEquals("101", Solve2.solve(13));
    }

    @Test
    void testSolve2() {
        assertEquals("11", Solve2.solve(3));
    }

    @Test
    void testSolve3() {
        assertEquals("101", Solve2.solve(123));
    }

    @Test
    void testSolve4() {
        assertEquals("11", Solve2.solve(12));
    }

    @Test
    void testSolve5() {
        assertEquals("101", Solve2.solve(12345));
    }

    @Test
    void testSolve6() {
        assertEquals("11", Solve2.solve(1234));
    }

    @Test
    void testSolve7() {
        assertEquals("101", Solve2.solve(123456789));
    }

    @Test
    void testSolve8() {
        assertEquals("11", Solve2.solve(12345678));
    }

    @Test
    void testSolve9() {
        assertEquals("101", Solve2.solve(1234567890123456789));
    }

    @Test
    void testSolve10() {
        assertEquals("11", Solve2.solve(123456789012345678));
    }
}

// Solve3.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Solve3 {

    public static String solve(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10