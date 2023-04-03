// CountUpToTest.java
package original;


import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {
    
    @Test
    void testCountUpToWith5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        assertEquals(expected, CountUpTo.countUpTo(5));
    }
    
    @Test
    void testCountUpToWith6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        assertEquals(expected, CountUpTo.countUpTo(6));
    }
    
    @Test
    void testCountUpToWith7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        assertEquals(expected, CountUpTo.countUpTo(7));
    }
    
    @Test
    void testCountUpToWith10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        assertEquals(expected, CountUpTo.countUpTo(10));
    }
    
    @Test
    void testCountUpToWith0() {
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, CountUpTo.countUpTo(0));
    }
    
    @Test
    void testCountUpToWith22() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        expected.add(19);
        assertEquals(expected, CountUpTo.countUpTo(22));
    }
    
    @Test
    void testCountUpToWith1() {
        List<Integer> expected = new ArrayList<Integer>();
        assertEquals(expected, CountUpTo.countUpTo(1));
    }
    
    @Test
    void testCountUpToWith18() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        assertEquals(expected, CountUpTo.countUpTo(18));
    }
    
    @Test
    void testCountUpToWith47() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        expected.add(19);
        expected.add(23);
        expected.add(29);
        expected.add(31);
        expected.add(37);
        expected.add(41);
        expected.add(43);
        assertEquals(expected, CountUpTo.countUpTo(47));
    }
    
    @Test
    void testCountUpToWith101() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(5);
        expected.add(7);
        expected.add(11);
        expected.add(13);
        expected.add(17);
        expected.add(19);
        expected.add(23);
        expected.add(29);
        expected.add(31);
        expected.add(37);
        expected.add(41);
        expected.add(43);
        expected.add(47);
        expected.add(53);
        expected.add(59);
        expected.add(61);
        expected.add(67);
        expected.add(71);
        expected.add(73);
        expected.add(79);
        expected.add(83);
        expected.add(89);
        expected.add(97);
        assertEquals(expected, CountUpTo.countUpTo(101));
    }
}