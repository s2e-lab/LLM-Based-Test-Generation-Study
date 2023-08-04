// MaxElementTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains ten unit test cases for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {

    @Test
    void testMaxElement() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(10, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElement2() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(11, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElement3() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(12, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElement4() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(13, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElement5() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(14, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElement6() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(15, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElement7() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(16, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElement8() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertEquals(17, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElement9() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertEquals(18, MaxElement.maxElement(l));
    }

    @Test
    void testMaxElement10() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertEquals(19, MaxElement.maxElement(l));
    }
}
