// RollingMaxTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

    @Test
    void testRollingMax() {
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
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(10, result.size());
        assertEquals(10, result.get(0));
        assertEquals(10, result.get(1));
        assertEquals(10, result.get(2));
        assertEquals(10, result.get(3));
        assertEquals(10, result.get(4));
        assertEquals(10, result.get(5));
        assertEquals(10, result.get(6));
        assertEquals(10, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(10, result.get(9));
    }

    @Test
    void testRollingMaxWithNull() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(null);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(10, result.size());
        assertEquals(10, result.get(0));
        assertEquals(10, result.get(1));
        assertEquals(10, result.get(2));
        assertEquals(10, result.get(3));
        assertEquals(10, result.get(4));
        assertEquals(10, result.get(5));
        assertEquals(10, result.get(6));
        assertEquals(10, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(10, result.get(9));
    }

    @Test
    void testRollingMaxWithNulls() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(10, result.size());
        assertEquals(null, result.get(0));
        assertEquals(null, result.get(1));
        assertEquals(null, result.get(2));
        assertEquals(null, result.get(3));
        assertEquals(null, result.get(4));
        assertEquals(null, result.get(5));
        assertEquals(null, result.get(6));
        assertEquals(null, result.get(7));
        assertEquals(null, result.get(8));
        assertEquals(null, result.get(9));
    }

    @Test
    void testRollingMaxWithMixedTypes() {
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
        numbers.add("11");
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(10, result.size());
        assertEquals(10, result.get(0));
        assertEquals(10, result.get(1));
        assertEquals(10, result.get(2));
        assertEquals(10, result.get(3));
        assertEquals(10, result.get(4));
        assertEquals(10, result.get(5));
        assertEquals(10, result.get(6));
        assertEquals(10, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(10, result.get(9));
    }

    @Test
    void testRollingMaxWithEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(0, result.size());
    }

    @Test
    void testRollingMaxWithNullList() {
        List<Object> result = RollingMax.rollingMax(null);
        assertEquals(0, result.size());
    }

    @Test
    void testRollingMaxWithNullElements() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(null);
        numbers.add(3);
        numbers.add(null);
        numbers.add(5);
        numbers.add(6);
        numbers.add(null);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(10, result.size());
        assertEquals(10, result.get(0));
        assertEquals(10, result.get(1));
        assertEquals(10, result.get(2));
        assertEquals(10, result.get(3));
        assertEquals(10, result.get(4));
        assertEquals(10, result.get(5));
        assertEquals(10, result.get(6));
        assertEquals(10, result.get(7));
        assertEquals(10, result.get(8));
        assertEquals(10, result.get(9));
    }

    @Test
    void testRollingMaxWithNegativeNumbers() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(-3);
        numbers.add(-4);
        numbers.add(-5);
        numbers.add(-6);
        numbers.add(-7);
        numbers.add(-8);
        numbers.add(-9);
        numbers.add(-10);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(10, result.size());
        assertEquals(-1, result.get(0));
        assertEquals(-1, result.get(1));
        assertEquals(-1, result.get(2));
        assertEquals(-1, result.get(3));
        assertEquals(-1, result.get(4));
        assertEquals(-1, result.get(5));
        assertEquals(-1, result.get(6));
        assertEquals(-1, result.get(7));
        assertEquals(-1, result.get(8));
        assertEquals(-1, result.get(9));
    }

    @Test
    void testRollingMaxWithNegativeNumbersAndNulls() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(-1);
        numbers.add(null);
        numbers.add(-3);
        numbers.add(null);
        numbers.add(-5);
        numbers.add(-6);
        numbers.add(null);
        numbers.add(-8);
        numbers.add(-9);
        numbers.add(-10);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(10, result.size());
        assertEquals(-1, result.get(0));
        assertEquals(-1, result.get(1));
        assertEquals(-1, result.get(2));
        assertEquals(-1, result.get(3));
        assertEquals(-1, result.get(4));
        assertEquals(-1, result.get(5));
        assertEquals(-1, result.get(6));
        assertEquals(-1, result.get(7));
        assertEquals(-1, result.get(8));
        assertEquals(-1, result.get(9));
    }

    @Test
    void testRollingMaxWithNegativeNumbersAndNullsAndMixedTypes() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(-1);
        numbers.add(null);
        numbers.add(-3);
        numbers.add(null);
        numbers.add(-5);
        numbers.add(-6);
        numbers.add(null);
        numbers.add(-8);
        numbers.add(-9);
        numbers.add(-10);
        numbers.add("11");
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(10, result.size());
        assertEquals(-1, result.get(0));
        assertEquals(-1, result.get(1));
        assertEquals(-1, result.get(2));
        assertEquals(-1, result.get(3));
        assertEquals(-1, result.get(4));
        assertEquals(-1, result.get(5));
        assertEquals(-1, result.get(6));
       