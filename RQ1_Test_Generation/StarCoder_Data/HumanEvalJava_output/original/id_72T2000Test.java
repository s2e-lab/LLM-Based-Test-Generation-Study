// WillItFlyTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {

    @Test
    void test_01() {
        List<Integer> q = List.of(1, 2);
        int w = 5;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test_02() {
        List<Integer> q = List.of(3, 2, 3);
        int w = 1;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test_03() {
        List<Integer> q = List.of(3, 2, 3);
        int w = 9;
        assertEquals(true, WillItFly.willItFly(q, w));
    }

    @Test
    void test_04() {
        List<Integer> q = List.of(3);
        int w = 5;
        assertEquals(true, WillItFly.willItFly(q, w));
    }

    @Test
    void test_05() {
        List<Integer> q = List.of(3, 2, 3);
        int w = 1;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test_06() {
        List<Integer> q = List.of(1, 2, 3);
        int w = 6;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test_07() {
        List<Integer> q = List.of(5);
        int w = 5;
        assertEquals(true, WillItFly.willItFly(q, w));
    }

    @Test
    void test_08() {
        List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int w = 15;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test_09() {
        List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int w = 10;
        assertEquals(true, WillItFly.willItFly(q, w));
    }

    @Test
    void test_10() {
        List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int w = 11;
        assertEquals(false, WillItFly.willItFly(q, w));
    }
}
