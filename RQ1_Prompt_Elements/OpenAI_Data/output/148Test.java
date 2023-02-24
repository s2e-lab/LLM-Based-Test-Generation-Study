// BfTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link Bf}.
 * It contains ten test cases for the {@link scenario1.Bf#bf()} method.
 */
class BfTest {
		


    @Test
    void test1() {
        List<Object> result = Bf.bf("Mercury", "Venus");
        assertEquals(1, result.size());
        assertEquals("Venus", result.get(0));
    }

    @Test
    void test2() {
        List<Object> result = Bf.bf("Venus", "Mercury");
        assertEquals(1, result.size());
        assertEquals("Venus", result.get(0));
    }

    @Test
    void test3() {
        List<Object> result = Bf.bf("Mercury", "Earth");
        assertEquals(2, result.size());
        assertEquals("Venus", result.get(0));
        assertEquals("Earth", result.get(1));
    }

    @Test
    void test4() {
        List<Object> result = Bf.bf("Earth", "Mercury");
        assertEquals(2, result.size());
        assertEquals("Venus", result.get(0));
        assertEquals("Earth", result.get(1));
    }

    @Test
    void test5() {
        List<Object> result = Bf.bf("Mercury", "Mars");
        assertEquals(3, result.size());
        assertEquals("Venus", result.get(0));
        assertEquals("Earth", result.get(1));
        assertEquals("Mars", result.get(2));
    }

    @Test
    void test6() {
        List<Object> result = Bf.bf("Mars", "Mercury");
        assertEquals(3, result.size());
        assertEquals("Venus", result.get(0));
        assertEquals("Earth", result.get(1));
        assertEquals("Mars", result.get(2));
    }

    @Test
    void test7() {
        List<Object> result = Bf.bf("Mercury", "Jupiter");
        assertEquals(4, result.size());
        assertEquals("Venus", result.get(0));
        assertEquals("Earth", result.get(1));
        assertEquals("Mars", result.get(2));
        assertEquals("Jupiter", result.get(3));
    }

    @Test
    void test8() {
        List<Object> result = Bf.bf("Jupiter", "Mercury");
        assertEquals(4, result.size());
        assertEquals("Venus", result.get(0));
        assertEquals("Earth", result.get(1));
        assertEquals("Mars", result.get(2));
        assertEquals("Jupiter", result.get(3));
    }

    @Test
    void test9() {
        List<Object> result = Bf.bf("Mercury", "Saturn");
        assertEquals(5, result.size());
        assertEquals("Venus", result.get(0));
        assertEquals("Earth", result.get(1));
        assertEquals("Mars", result.get(2));
        assertEquals("Jupiter", result.get(3));
        assertEquals("Saturn", result.get(4));
    }

    @Test
    void test10() {
        List<Object> result = Bf.bf("Saturn", "Mercury");
        assertEquals(5, result.size());
        assertEquals("Venus", result.get(0));
        assertEquals("Earth", result.get(1));
        assertEquals("Mars", result.get(2));
        assertEquals("Jupiter", result.get(3));
        assertEquals("Saturn", result.get(4));
    }
}