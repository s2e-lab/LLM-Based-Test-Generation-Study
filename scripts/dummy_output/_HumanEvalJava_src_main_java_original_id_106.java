// FTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {
    
    @Test
    void testFWithNEqualOne() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        List<Integer> actual = F.f(1);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualTwo() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        List<Integer> actual = F.f(2);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualThree() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        List<Integer> actual = F.f(3);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualFour() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        List<Integer> actual = F.f(4);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualFive() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        List<Integer> actual = F.f(5);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualSix() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        List<Integer> actual = F.f(6);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualSeven() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        List<Integer> actual = F.f(7);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualEight() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        expected.add(40320);
        List<Integer> actual = F.f(8);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualNine() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        expected.add(40320);
        expected.add(45);
        List<Integer> actual = F.f(9);
        assertEquals(expected, actual);
    }
    
    @Test
    void testFWithNEqualTen() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(2);
        expected.add(6);
        expected.add(24);
        expected.add(15);
        expected.add(720);
        expected.add(28);
        expected.add(40320);
        expected.add(45);
        expected.add(362880);
        List<Integer> actual = F.f(10);
        assertEquals(expected, actual);
    }
}