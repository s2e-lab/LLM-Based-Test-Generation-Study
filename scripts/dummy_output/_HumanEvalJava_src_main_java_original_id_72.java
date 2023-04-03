// WillItFlyTest.java
package original;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
    
    @Test
    void testWillItFly1() {
        List<Integer> q = Arrays.asList(3, 2, 3);
        int w = 9;
        assertTrue(WillItFly.willItFly(q, w));
    }
    
    @Test
    void testWillItFly2() {
        List<Integer> q = Arrays.asList(1, 2);
        int w = 5;
        assertFalse(WillItFly.willItFly(q, w));
    }
    
    @Test
    void testWillItFly3() {
        List<Integer> q = Arrays.asList(3);
        int w = 5;
        assertTrue(WillItFly.willItFly(q, w));
    }
    
    @Test
    void testWillItFly4() {
        List<Integer> q = Arrays.asList(3, 2, 3);
        int w = 1;
        assertFalse(WillItFly.willItFly(q, w));
    }
    
    @Test
    void testWillItFly5() {
        List<Integer> q = Arrays.asList(1, 2, 3);
        int w = 6;
        assertFalse(WillItFly.willItFly(q, w));
    }
    
    @Test
    void testWillItFly6() {
        List<Integer> q = Arrays.asList(5);
        int w = 5;
        assertTrue(WillItFly.willItFly(q, w));
    }
    
    @Test
    void testWillItFly7() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 10;
        assertTrue(WillItFly.willItFly(q, w));
    }
    
    @Test
    void testWillItFly8() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 9;
        assertFalse(WillItFly.willItFly(q, w));
    }
    
    @Test
    void testWillItFly9() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 11;
        assertTrue(WillItFly.willItFly(q, w));
    }
    
    @Test
    void testWillItFly10() {
        List<Integer> q = Arrays.asList(1, 2, 3, 2, 1);
        int w = 12;
        assertTrue(WillItFly.willItFly(q, w));
    }
}