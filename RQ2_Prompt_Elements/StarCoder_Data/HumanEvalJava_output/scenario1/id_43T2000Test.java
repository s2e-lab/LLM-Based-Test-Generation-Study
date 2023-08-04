// PairsSumToZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list is empty.
    */
    @Test
    void testPairsSumToZero_emptyList() {
        List<Integer> l = List.of();
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains one element.
    */
    @Test
    void testPairsSumToZero_listWithOneElement() {
        List<Integer> l = List.of(1);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains two elements.
    */
    @Test
    void testPairsSumToZero_listWithTwoElements() {
        List<Integer> l = List.of(1, 2);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains three elements.
    */
    @Test
    void testPairsSumToZero_listWithThreeElements() {
        List<Integer> l = List.of(1, 2, 3);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains four elements.
    */
    @Test
    void testPairsSumToZero_listWithFourElements() {
        List<Integer> l = List.of(1, 2, 3, 4);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains five elements.
    */
    @Test
    void testPairsSumToZero_listWithFiveElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains six elements.
    */
    @Test
    void testPairsSumToZero_listWithSixElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains seven elements.
    */
    @Test
    void testPairsSumToZero_listWithSevenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains eight elements.
    */
    @Test
    void testPairsSumToZero_listWithEightElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains nine elements.
    */
    @Test
    void testPairsSumToZero_listWithNineElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains ten elements.
    */
    @Test
    void testPairsSumToZero_listWithTenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains eleven elements.
    */
    @Test
    void testPairsSumToZero_listWithElevenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains twelve elements.
    */
    @Test
    void testPairsSumToZero_listWithTwelveElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains thirteen elements.
    */
    @Test
    void testPairsSumToZero_listWithThirteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains fourteen elements.
    */
    @Test
    void testPairsSumToZero_listWithFourteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains fifteen elements.
    */
    @Test
    void testPairsSumToZero_listWithFifteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains sixteen elements.
    */
    @Test
    void testPairsSumToZero_listWithSixteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains seventeen elements.
    */
    @Test
    void testPairsSumToZero_listWithSeventeenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        assertEquals(false, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains eighteen elements.
    */
    @Test
    void testPairsSumToZero_listWithEighteenElements() {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6