// WillItFlyTest.java
package scenario1;

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
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 10;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly2() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 11;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly3() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 12;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly4() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 13;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly5() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 14;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly6() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 15;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly7() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 16;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly8() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 17;
        assertFalse(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly9() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 18;
        assertTrue(WillItFly.willItFly(q, w));
    }

    @Test
    void testWillItFly10() {
        List<Integer> q = List.of(1, 2, 3, 4, 5);
        int w = 19;
        assertFalse(WillItFly.willItFly(q, w));
    }
}
