// PairsSumToZeroTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero() {
        List<Integer> l = List.of(1, 0);
        Boolean expected = true;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_2() {
        List<Integer> l = List.of(0, 1);
        Boolean expected = true;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_3() {
        List<Integer> l = List.of(-1, 0);
        Boolean expected = true;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_4() {
        List<Integer> l = List.of(0, -1);
        Boolean expected = true;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_5() {
        List<Integer> l = List.of(1, -1);
        Boolean expected = true;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_6() {
        List<Integer> l = List.of(-1, 1);
        Boolean expected = true;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_7() {
        List<Integer> l = List.of(1, 1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_8() {
        List<Integer> l = List.of(0, 0);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_9() {
        List<Integer> l = List.of(-1, -1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_10() {
        List<Integer> l = List.of(1, 2);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_11() {
        List<Integer> l = List.of(2, 1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_12() {
        List<Integer> l = List.of(1, 3);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_13() {
        List<Integer> l = List.of(3, 1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_14() {
        List<Integer> l = List.of(1, 5);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_15() {
        List<Integer> l = List.of(5, 1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_16() {
        List<Integer> l = List.of(1, 0);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_17() {
        List<Integer> l = List.of(0, 1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_18() {
        List<Integer> l = List.of(-1, 0);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_19() {
        List<Integer> l = List.of(0, -1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero_20() {
        List<Integer> l = List.of(1, -1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero