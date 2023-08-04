// WillItFlyTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {

    @Test
    void test1() {
        List<Integer> q = List.of(1, 2);
        int w = 5;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test2() {
        List<Integer> q = List.of(3, 2, 3);
        int w = 1;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test3() {
        List<Integer> q = List.of(3, 2, 3);
        int w = 9;
        assertEquals(true, WillItFly.willItFly(q, w));
    }

    @Test
    void test4() {
        List<Integer> q = List.of(3);
        int w = 5;
        assertEquals(true, WillItFly.willItFly(q, w));
    }

    @Test
    void test5() {
        List<Integer> q = List.of(3, 2, 3);
        int w = 1;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test6() {
        List<Integer> q = List.of(1, 2, 3);
        int w = 6;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test7() {
        List<Integer> q = List.of(5);
        int w = 5;
        assertEquals(true, WillItFly.willItFly(q, w));
    }

    @Test
    void test8() {
        List<Integer> q = List.of(1, 2, 3);
        int w = 6;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test9() {
        List<Integer> q = List.of(1, 2, 3);
        int w = 6;
        assertEquals(false, WillItFly.willItFly(q, w));
    }

    @Test
    void test10() {
        List<Integer> q = List.of(1, 2, 3);
        int w = 6;
        assertEquals(false, WillItFly.willItFly(q, w));
    }
}
