// IntersperseTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Intersperse}.
* It contains ten test cases for the {@link Intersperse#intersperse()} method.
*/
class IntersperseTest {


    @Test
    void testIntersperse() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(10, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(0, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(0, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(0, result.get(7));
        assertEquals(5, result.get(8));
        assertEquals(0, result.get(9));
    }
}

// IntersperseTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Intersperse}.
* It contains ten test cases for the {@link Intersperse#intersperse()} method.
*/
class IntersperseTest {

    @Test
    void testIntersperse() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(10, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(0, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(0, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(0, result.get(7));
        assertEquals(5, result.get(8));
        assertEquals(0, result.get(9));
    }
}

// IntersperseTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Intersperse}.
* It contains ten test cases for the {@link Intersperse#intersperse()} method.
*/
class IntersperseTest {

    @Test
    void testIntersperse() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> result = Intersperse.intersperse(numbers, 0);
        assertEquals(10, result.size());
        assertEquals(1, result.get(0));
        assertEquals(0, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(0, result.get(3));
        assertEquals(3, result.get(4));
        assertEquals(0, result.get(5));
        assertEquals(4, result.get(6));
        assertEquals(0, result.get(7));
        assertEquals(5, result.get(8));
        assertEquals(0, result.get(9));
    }
}

// IntersperseTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import