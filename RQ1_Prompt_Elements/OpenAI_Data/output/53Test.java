// AddTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Add}.
* It contains ten test cases for the {@link Add#add()} method.
*/
class AddTest {


    @Test
    void testAdd() {
        assertEquals(2, Add.add(1, 1));
        assertEquals(4, Add.add(2, 2));
        assertEquals(6, Add.add(3, 3));
        assertEquals(8, Add.add(4, 4));
        assertEquals(10, Add.add(5, 5));
        assertEquals(12, Add.add(6, 6));
        assertEquals(14, Add.add(7, 7));
        assertEquals(16, Add.add(8, 8));
        assertEquals(18, Add.add(9, 9));
        assertEquals(20, Add.add(10, 10));
    }
}

// Subtract.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Subtract {

    public static int subtract(int x, int y) {
        return x - y;
    }
}

// SubtractTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Subtract}.
* It contains ten test cases for the {@link Subtract#subtract()} method.
*/
class SubtractTest {

    @Test
    void testSubtract() {
        assertEquals(0, Subtract.subtract(1, 1));
        assertEquals(0, Subtract.subtract(2, 2));
        assertEquals(0, Subtract.subtract(3, 3));
        assertEquals(0, Subtract.subtract(4, 4));
        assertEquals(0, Subtract.subtract(5, 5));
        assertEquals(0, Subtract.subtract(6, 6));
        assertEquals(0, Subtract.subtract(7, 7));
        assertEquals(0, Subtract.subtract(8, 8));
        assertEquals(0, Subtract.subtract(9, 9));
        assertEquals(0, Subtract.subtract(10, 10));
    }
}

// Multiply.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class Multiply {

    public static int multiply(int x, int y) {
        return x * y;
    }
}

// MultiplyTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Multiply}.
* It contains ten test cases for the {@link Multiply#multiply()} method.
*/
class MultiplyTest {

    @Test
    void testMultiply() {
        assertEquals(1, Multiply.multiply(1, 1));
        assertEquals(4, Multiply.multiply(2, 2));
        assertEquals(9, Multiply.multiply(3, 3));
        assertEquals(16, Multiply.multiply(4, 4));
        assertEquals(25, Multiply.multiply(5, 5));
        assertEquals(36, Multiply.multiply(6, 6));
        assertEquals(49, Multiply.multiply(7, 7));
        assertEquals(64, Multiply.multiply(8, 8));
        assertEquals(81, Multiply.multiply(9, 9));
        assertEquals(100, Multiply.multiply(10, 10));
    }
}

// Divide.java
package scenario1;

import java.io