// SumProductTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link SumProduct}.
* It contains ten test cases for the {@link SumProduct#sumProduct()} method.
*/
class SumProductTest {


    @Test
    void testSumProduct() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(6, result.get(0).intValue());
        assertEquals(6, result.get(1).intValue());
    }

    @Test
    void testSumProduct2() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(10, result.get(0).intValue());
        assertEquals(24, result.get(1).intValue());
    }

    @Test
    void testSumProduct3() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(15, result.get(0).intValue());
        assertEquals(120, result.get(1).intValue());
    }

    @Test
    void testSumProduct4() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(21, result.get(0).intValue());
        assertEquals(720, result.get(1).intValue());
    }

    @Test
    void testSumProduct5() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(28, result.get(0).intValue());
        assertEquals(5040, result.get(1).intValue());
    }

    @Test
    void testSumProduct6() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(36, result.get(0).intValue());
        assertEquals(40320, result.get(1).intValue());
    }

    @Test
    void testSumProduct7() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        List<Integer> result = SumProduct.sumProduct(numbers);
        assertEquals(45, result.get(0).intValue());
        assertEquals(362880, result.get(1).intValue());
    }

    @Test
    void testSumProduct8() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
       