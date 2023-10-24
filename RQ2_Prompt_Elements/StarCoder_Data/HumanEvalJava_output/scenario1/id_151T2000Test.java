// DoubleTheDifferenceTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DoubleTheDifference}.
* It contains ten unit test cases for the {@link DoubleTheDifference#doubleTheDifference(List)} method.
*/
class DoubleTheDifferenceTest {

    @Test
    void testDoubleTheDifference() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    @Test
    void testDoubleTheDifference2() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    @Test
    void testDoubleTheDifference3() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    @Test
    void testDoubleTheDifference4() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    @Test
    void testDoubleTheDifference5() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    @Test
    void testDoubleTheDifference6() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    @Test
    void testDoubleTheDifference7() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    @Test
    void testDoubleTheDifference8() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    @Test
    void testDoubleTheDifference9() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }

    @Test
    void testDoubleTheDifference10() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertEquals(100, DoubleTheDifference.doubleTheDifference(lst));
    }
}
