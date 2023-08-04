// CanArrangeTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CanArrange}.
* It contains ten unit test cases for the {@link CanArrange#canArrange(List)} method.
*/
class CanArrangeTest {

    @Test
    void testCanArrange1() {
        List<Object> arr = List.of(1, 2, 3, 4, 5);
        assertEquals(4, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrange2() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrange3() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrange4() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrange5() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrange6() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrange7() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrange8() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrange9() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(-1, CanArrange.canArrange(arr));
    }

    @Test
    void testCanArrange10() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(-1, CanArrange.canArrange(arr));
    }
}
