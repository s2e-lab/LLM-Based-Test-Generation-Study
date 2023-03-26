// SumSquares1Test.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SumSquares1}.
* It contains ten unit test cases for the {@link SumSquares1#sumSquares(List)} method.
*/
class SumSquares1Test {
    
    @Test
    void testEmptyList() {
        List<Object> lst = new ArrayList<Object>();
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSingleEntry() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        int expected = 2;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testOnlyMultiplesOf3() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        int expected = 2 + 9 + 4 + 25 + 36;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testOnlyMultiplesOf4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        int expected = 2 + 3 + 64 + 5 + 6 + 7 + 512;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testMultiplesOf3And4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        int expected = 2 + 9 + 64 + 25 + 36 + 7 + 512 + 729;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNoMultiplesOf3Or4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(5);
        lst.add(7);
        lst.add(11);
        int expected = 2 + 5 + 7 + 11;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testAllMultiplesOf3And4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        lst.add(9);
        lst.add(10);
        lst.add(11);
        lst.add(12);
        int expected = 2 + 9 + 64 + 25 + 36 + 7 + 512 + 729 + 100 + 121 + 1728;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testNegativeNumbers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-2);
        lst.add(3);
        lst.add(-4);
        lst.add(5);
        lst.add(-6);
        lst.add(7);
        lst.add(-8);
        lst.add(9);
        int expected = 4 + 9 + 64 + 25 + 36 + 7 + 512 + 729;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testZero() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(0);
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testLargeNumbers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1000000);
        lst.add(2000000);
        lst.add(3000000);
        lst.add(4000000);
        lst.add(5000000);
        int expected = 10000000000000 + 8000000000000000000L + 2700000000000000000L + 64000000000000000000L + 250000000000000000000L;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
}