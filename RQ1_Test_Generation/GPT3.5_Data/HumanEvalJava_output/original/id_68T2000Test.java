// PluckTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Pluck}.
* It contains ten unit test cases for the {@link Pluck#pluck(List)} method.
*/
class PluckTest {
    
    @Test
    void testEmptyList() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testNoEvenValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testOneEvenValue() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(4);
        expected.add(1);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testMultipleEvenValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(0);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testMultipleEvenValuesSameMin() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        arr.add(0);
        arr.add(10);
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(4);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testAllEvenValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(0);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testAllOddValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        List<Object> expected = new ArrayList<Object>();
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testMixedValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(2);
        expected.add(1);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testZeroValues() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(5);
        arr.add(0);
        arr.add(3);
        arr.add(0);
        arr.add(4);
        arr.add(2);
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(1);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
    
    @Test
    void testLargeList() {
        List<Object> arr = new ArrayList<Object>();
        for (int i = 0; i < 10000; i++) {
            arr.add(i);
        }
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(0);
        List<Object> result = Pluck.pluck(arr);
        assertEquals(expected, result);
    }
}