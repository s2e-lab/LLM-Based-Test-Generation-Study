// SumToNTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link SumToN}.
 * It contains ten test cases for the {@link scenario1.SumToN#sumToN()} method.
 */
class SumToNTest {
		


    @Test
    void testSumToN() {
        assertEquals(1, SumToN.sumToN(1));
        assertEquals(3, SumToN.sumToN(2));
        assertEquals(6, SumToN.sumToN(3));
        assertEquals(10, SumToN.sumToN(4));
        assertEquals(15, SumToN.sumToN(5));
        assertEquals(21, SumToN.sumToN(6));
        assertEquals(28, SumToN.sumToN(7));
        assertEquals(36, SumToN.sumToN(8));
        assertEquals(45, SumToN.sumToN(9));
        assertEquals(55, SumToN.sumToN(10));
    }
}

// SumToN.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class SumToN {

    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link SumToN}.
 * It contains ten test cases for the {@link scenario2.SumToN#sumToN()} method.
 */
class SumToNTest {

    @Test
    void testSumToN() {
        assertEquals(1, SumToN.sumToN(1));
        assertEquals(3, SumToN.sumToN(2));
        assertEquals(6, SumToN.sumToN(3));
        assertEquals(10, SumToN.sumToN(4));
        assertEquals(15, SumToN.sumToN(5));
        assertEquals(21, SumToN.sumToN(6));
        assertEquals(28, SumToN.sumToN(7));
        assertEquals(36, SumToN.sumToN(8));
        assertEquals(45, SumToN.sumToN(9));
        assertEquals(55, SumToN.sumToN(10));
    }
}

// SumToN.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class SumToN {

    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

// SumToNTest.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link SumToN}.
 * It contains ten test cases for the {@link scenario3.SumToN#sumToN()} method.
 */
class SumToNTest {

    @Test
    void testSumToN() {
        assertEquals(1, SumToN.sumToN(1));
        assertEquals(3, SumToN.sumToN(2));
        assertEquals(6, SumToN.sumToN(3));
        assertEquals(10, SumToN.sumToN(4));
        assertEquals(15, SumToN.sumToN(5));
        assertEquals(21, SumToN.sumToN(6));
        assertEquals(28, SumToN.sumToN(7));
        assertEquals(36, SumToN.sumToN(8));
        assertEquals(45, SumToN.