// PairsSumToZeroTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * two elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwoElementsSumToZero() {
        List<Integer> l = List.of(1, -1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * three elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_ThreeElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * four elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_FourElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * five elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_FiveElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * six elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_SixElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * seven elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_SevenElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * eight elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_EightElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * nine elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_NineElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * ten elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TenElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1, 0, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * eleven elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_ElevenElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1, 0, 1, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * twelve elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_TwelveElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * thirteen elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_ThirteenElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * fourteen elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_FourteenElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * fifteen elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_FifteenElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * sixteen elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_SixteenElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * seventeen elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_SeventeenElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * eighteen elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_EighteenElementsSumToZero() {
        List<Integer> l = List.of(1, -1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case for {@link PairsSumToZero#pairsSumToZero(List)} where the list contains
    * nineteen elements that sum to zero.
    */
    @Test
    void testPairsSumToZero_NineteenElementsSumToZero() {
        List<Integer> l = List