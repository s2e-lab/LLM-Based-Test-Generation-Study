// TriplesSumToZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list is empty.
    */
    @Test
    void testTriplesSumToZeroEmptyList() {
        List<Integer> l = List.of();
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains one element.
    */
    @Test
    void testTriplesSumToZeroOneElementList() {
        List<Integer> l = List.of(1);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains two elements.
    */
    @Test
    void testTriplesSumToZeroTwoElementList() {
        List<Integer> l = List.of(1, 3);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains three elements.
    */
    @Test
    void testTriplesSumToZeroThreeElementList() {
        List<Integer> l = List.of(1, 3, 5);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains four elements.
    */
    @Test
    void testTriplesSumToZeroFourElementList() {
        List<Integer> l = List.of(1, 3, 5, 0);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains five elements.
    */
    @Test
    void testTriplesSumToZeroFiveElementList() {
        List<Integer> l = List.of(1, 3, 5, -1);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains six elements.
    */
    @Test
    void testTriplesSumToZeroSixElementList() {
        List<Integer> l = List.of(1, 3, -2, 1);
        assertEquals(true, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains seven elements.
    */
    @Test
    void testTriplesSumToZeroSevenElementList() {
        List<Integer> l = List.of(1, 2, 3, 7);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains eight elements.
    */
    @Test
    void testTriplesSumToZeroEightElementList() {
        List<Integer> l = List.of(1, 2, 5, 7);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains nine elements.
    */
    @Test
    void testTriplesSumToZeroNineElementList() {
        List<Integer> l = List.of(2, 4, -5, 3, 9, 7);
        assertEquals(true, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains ten elements.
    */
    @Test
    void testTriplesSumToZeroTenElementList() {
        List<Integer> l = List.of(1);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains eleven elements.
    */
    @Test
    void testTriplesSumToZeroElevenElementList() {
        List<Integer> l = List.of(1, 3, 5, -100);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }

    /**
    * Test case for {@link TriplesSumToZero#triplesSumToZero(List)} where the input list contains twelve elements.
    */
    @Test
    void testTriplesSumToZeroTwelveElementList() {
        List<Integer> l = List.of(100, 3, 5, -100);
        assertEquals(false, TriplesSumToZero.triplesSumToZero(l));
    }
}
