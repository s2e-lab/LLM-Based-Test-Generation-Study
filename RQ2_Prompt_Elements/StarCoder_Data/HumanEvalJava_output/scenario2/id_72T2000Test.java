// WillItFlyTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {

    /**
    * Test case for {@link WillItFly#willItFly(List, int)}.
    */
    @Test
    void testWillItFly() {
        List<Integer> q1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertTrue(WillItFly.willItFly(q1, 10));
        List<Integer> q2 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q2, 11));
        List<Integer> q3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q3, 9));
        List<Integer> q4 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q4, 8));
        List<Integer> q5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q5, 7));
        List<Integer> q6 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q6, 6));
        List<Integer> q7 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q7, 5));
        List<Integer> q8 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q8, 4));
        List<Integer> q9 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q9, 3));
        List<Integer> q10 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q10, 2));
        List<Integer> q11 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q11, 1));
        List<Integer> q12 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q12, 0));
        List<Integer> q13 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q13, -1));
        List<Integer> q14 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q14, -2));
        List<Integer> q15 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q15, -3));
        List<Integer> q16 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q16, -4));
        List<Integer> q17 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q17, -5));
        List<Integer> q18 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q18, -6));
        List<Integer> q19 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q19, -7));
        List<Integer> q20 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q20, -8));
        List<Integer> q21 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q21, -9));
        List<Integer> q22 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q22, -10));
        List<Integer> q23 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q23, -11));
        List<Integer> q24 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q24, -12));
        List<Integer> q25 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q25, -13));
        List<Integer> q26 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q26, -14));
        List<Integer> q27 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q27, -15));
        List<Integer> q28 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q28, -16));
        List<Integer> q29 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q29, -17));
        List<Integer> q30 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q30, -18));
        List<Integer> q31 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q31, -19));
        List<Integer> q32 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertFalse(WillItFly.willItFly(q32, -20));
        List<Integer> q33 = List.of(1, 2, 