// SumSquares1Test.java
package original;

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
    void testSumSquares1() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        int expected = 6;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares2() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(4);
        lst.add(9);
        int expected = 14;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares3() {
        List<Object> lst = new ArrayList<Object>();
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares4() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        int expected = 9;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares5() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        lst.add(-1);
        lst.add(-1);
        lst.add(-1);
        lst.add(-1);
        lst.add(-1);
        lst.add(-1);
        lst.add(-1);
        lst.add(-1);
        int expected = -3;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares6() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(0);
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares7() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        lst.add(-5);
        lst.add(2);
        lst.add(-1);
        lst.add(-5);
        int expected = -126;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares8() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-56);
        lst.add(-99);
        lst.add(1);
        lst.add(0);
        lst.add(-2);
        int expected = 3030;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares9() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        lst.add(0);
        lst.add(0);
        lst.add(0);
        lst.add(0);
        lst.add(0);
        lst.add(0);
        lst.add(0);
        lst.add(-1);
        int expected = 0;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares10() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-16);
        lst.add(-9);
        lst.add(-2);
        lst.add(36);
        lst.add(36);
        lst.add(26);
        lst.add(-20);
        lst.add(25);
        lst.add(-40);
        lst.add(20);
        lst.add(-4);
        lst.add(12);
        lst.add(-26);
        lst.add(35);
        lst.add(37);
        int expected = -14196;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
    
    @Test
    void testSumSquares11() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-1);
        lst.add(-3);
        lst.add(17);
        lst.add(-1);
        lst.add(-15);
        lst.add(13);
        lst.add(-1);
        lst.add(14);
        lst.add(-14);
        lst.add(-12);
        lst.add(-5);
        lst.add(14);
        lst.add(-14);
        lst.add(6);
        lst.add(13);
        lst.add(11);
        lst.add(16);
        lst.add(16);
        lst.add(4);
        lst.add(10);
        int expected = -1448;
        int actual = SumSquares1.sumSquares(lst);
        assertEquals(expected, actual);
    }
}