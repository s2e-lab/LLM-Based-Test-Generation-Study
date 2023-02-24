// XOrYTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link XOrY}.
* It contains ten test cases for the {@link XOrY#xOrY()} method.
*/
class XOrYTest {


    @Test
    void testXOrY() {
        assertEquals(XOrY.xOrY(1, 1, 2), 2);
        assertEquals(XOrY.xOrY(2, 1, 2), 1);
        assertEquals(XOrY.xOrY(3, 1, 2), 1);
        assertEquals(XOrY.xOrY(4, 1, 2), 2);
        assertEquals(XOrY.xOrY(5, 1, 2), 1);
        assertEquals(XOrY.xOrY(6, 1, 2), 2);
        assertEquals(XOrY.xOrY(7, 1, 2), 1);
        assertEquals(XOrY.xOrY(8, 1, 2), 2);
        assertEquals(XOrY.xOrY(9, 1, 2), 2);
        assertEquals(XOrY.xOrY(10, 1, 2), 2);
    }
}

// XOrY.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class XOrY {

    public static int xOrY(int n, int x, int y) {
        if (n == 1) {
            return y;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return y;
            }
        }
        return x;
    }
}

// XOrYTest.java
package scenario2;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link XOrY}.
* It contains ten test cases for the {@link XOrY#xOrY()} method.
*/
class XOrYTest {

    @Test
    void testXOrY() {
        assertEquals(XOrY.xOrY(1, 1, 2), 2);
        assertEquals(XOrY.xOrY(2, 1, 2), 1);
        assertEquals(XOrY.xOrY(3, 1, 2), 1);
        assertEquals(XOrY.xOrY(4, 1, 2), 2);
        assertEquals(XOrY.xOrY(5, 1, 2), 1);
        assertEquals(XOrY.xOrY(6, 1, 2), 2);
        assertEquals(XOrY.xOrY(7, 1, 2), 1);
        assertEquals(XOrY.xOrY(8, 1, 2), 2);
        assertEquals(XOrY.xOrY(9, 1, 2), 2);
        assertEquals(XOrY.xOrY(10, 1, 2), 2);
    }
}

// XOrY.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class XOrY {

    public static int xOrY(int n, int x, int y) {
        if (n == 1) {
            return y;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return y;
            }
        }
        return x;
    }
}

// XOrYTest.java
package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link XOrY}.
* It contains ten test cases for the {@link XOrY#xOrY()} method.
*/
class XOrYTest {

    @Test
    void testXOrY() {
        assertEquals(XOrY.xOrY(1, 1, 2), 2);
       