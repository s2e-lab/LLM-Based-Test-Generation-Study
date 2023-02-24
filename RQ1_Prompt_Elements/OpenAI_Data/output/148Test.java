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
* It contains ten test cases for the {@link Bf#bf()} method.
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
        List<Object> result = Bf.bf("Jupiter", "Saturn");
        assertEquals(1, result.size());
        assertEquals("Saturn", result.get(0));
    }
    @Test
    void test8() {
        List<Object> result = Bf.bf("Saturn", "Jupiter");
        assertEquals(1, result.size());
        assertEquals("Saturn", result.get(0));
    }
    @Test
    void test9() {
        List<Object> result = Bf.bf("Jupiter", "Uranus");
        assertEquals(2, result.size());
        assertEquals("Saturn", result.get(0));
        assertEquals("Uranus", result.get(1));
    }
    @Test
    void test10() {
        List<Object> result = Bf.bf("Uranus", "Jupiter");
        assertEquals(2, result.size());
        assertEquals("Saturn", result.get(0));
        assertEquals("Uranus", result.get(1));
    }
}