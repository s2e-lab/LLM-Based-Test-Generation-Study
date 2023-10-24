// NextSmallestTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NextSmallest}.
* It contains ten unit test cases for the {@link NextSmallest#nextSmallest(List)} method.
*/
class NextSmallestTest {

    @Test
    void testNextSmallest() {
        List<Object> lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(Integer.valueOf(2), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(Integer.valueOf(3), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(Integer.valueOf(4), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(Integer.valueOf(5), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(Integer.valueOf(6), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(Integer.valueOf(7), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(Integer.valueOf(8), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertEquals(Integer.valueOf(9), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        assertEquals(Integer.valueOf(10), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19);
        assertEquals(Integer.valueOf(11), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        assertEquals(Integer.valueOf(12), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
        assertEquals(Integer.valueOf(13), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22);
        assertEquals(Integer.valueOf(14), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23);
        assertEquals(Integer.valueOf(15), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24);
        assertEquals(Integer.valueOf(16), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25);
        assertEquals(Integer.valueOf(17), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26);
        assertEquals(Integer.valueOf(18), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27);
        assertEquals(Integer.valueOf(19), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28);
        assertEquals(Integer.valueOf(20), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29);
        assertEquals(Integer.valueOf(21), NextSmallest.nextSmallest(lst));
        lst = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,