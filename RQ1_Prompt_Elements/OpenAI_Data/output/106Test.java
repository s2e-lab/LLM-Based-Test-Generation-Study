// FTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests of {@link F}.
 * It contains ten test cases for the {@link scenario1.F#f()} method.
 */
class FTest {
		


    @Test
    void test1() {
        List<Integer> result = F.f(1);
        assertEquals(1, result.size());
        assertEquals(1, result.get(0));
    }

    @Test
    void test2() {
        List<Integer> result = F.f(2);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    void test3() {
        List<Integer> result = F.f(3);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(6, result.get(2));
    }

    @Test
    void test4() {
        List<Integer> result = F.f(4);
        assertEquals(4, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(6, result.get(2));
        assertEquals(24, result.get(3));
    }

    @Test
    void test5() {
        List<Integer> result = F.f(5);
        assertEquals(5, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(6, result.get(2));
        assertEquals(24, result.get(3));
        assertEquals(120, result.get(4));
    }

    @Test
    void test6() {
        List<Integer> result = F.f(6);
        assertEquals(6, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(6, result.get(2));
        assertEquals(24, result.get(3));
        assertEquals(120, result.get(4));
        assertEquals(720, result.get(5));
    }

    @Test
    void test7() {
        List<Integer> result = F.f(7);
        assertEquals(7, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(6, result.get(2));
        assertEquals(24, result.get(3));
        assertEquals(120, result.get(4));
        assertEquals(720, result.get(5));
        assertEquals(5040, result.get(6));
    }

    @Test
    void test8() {
        List<Integer> result = F.f(8);
        assertEquals(8, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(6, result.get(2));
        assertEquals(24, result.get(3));
        assertEquals(120, result.get(4));
        assertEquals(720, result.get(5));
        assertEquals(5040, result.get(6));
        assertEquals(40320, result.get(7));
    }

    @Test
    void test9() {
        List<Integer> result = F.f(9);
        assertEquals(9, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(6, result.get(2));
        assertEquals(24, result.get(3));
        assertEquals(120, result.get(4));
        assertEquals(720, result.get(5));
        assertEquals(5040, result.get(6));
        assertEquals(40320, result.get(7));
        assertEquals(362880, result.get(8));
    }

    @Test
    void test10() {
        List<Integer> result = F.f(10);
