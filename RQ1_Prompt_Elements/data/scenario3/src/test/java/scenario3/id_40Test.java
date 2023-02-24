package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class TriplesSumToZeroTest {
    @Test
    void testTriplesSumToZero() {
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(0);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l1));

        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(3);
        l2.add(-2);
        l2.add(1);
        assertEquals(true, TriplesSumToZero.triplesSumToZero(l2));

        List<Integer> l3 = new ArrayList<Integer>();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(7);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l3));

        List<Integer> l4 = new ArrayList<Integer>();
        l4.add(2);
        l4.add(4);
        l4.add(-5);
        l4.add(3);
        l4.add(9);
        l4.add(7);
        assertEquals(true, TriplesSumToZero.triplesSumToZero(l4));

        List<Integer> l5 = new ArrayList<Integer>();
        l5.add(1);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l5));

        List<Integer> l6 = new ArrayList<Integer>();
        l6.add(1);
        l6.add(3);
        l6.add(5);
        l6.add(-1);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l6));

        List<Integer> l7 = new ArrayList<Integer>();
        l7.add(1);
        l7.add(2);
        l7.add(5);
        l7.add(7);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l7));

        List<Integer> l8 = new ArrayList<Integer>();
        l8.add(1);
        l8.add(3);
        l8.add(5);
        l8.add(-100);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l8));

        List<Integer> l9 = new ArrayList<Integer>();
        l9.add(100);
        l9.add(3);
        l9.add(5);
        l9.add(-100);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l9));

        List<Integer> l10 = new ArrayList<Integer>();
        l10.add(1);
        l10.add(3);
        l10.add(5);
        l10.add(0);
        l10.add(1);
        l10.add(3);
        l10.add(-2);
        l10.add(1);
        l10.add(1);
        l10.add(2);
        l10.add(3);
        l10.add(7);
        l10.add(2);
        l10.add(4);
        l10.add(-5);
        l10.add(3);
        l10.add(9);
        l10.add(7);
        l10.add(1);
        l10.add(1);
        l10.add(3);
        l10.add(5);
        l10.add(-1);
        l10.add(1);
        l10.add(2);
        l10.add(5);
        l10.add(7);
        l10.add(1);
        l10.add(3);
        l10.add(5);
        l10.add(-100);
        l10.add(100);
        l10.add(3);
        l10.add(5);
        l10.add(-100);
        assertEquals(true, TriplesSumToZero.triplesSumToZero(l10));
    }
}