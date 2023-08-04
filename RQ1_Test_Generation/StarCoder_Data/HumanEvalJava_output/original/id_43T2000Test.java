// PairsSumToZeroTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {

    /**
    * Test case number: 1
    * Test case values: [1, 3, 5, 0]
    * Expected output (Post-state): false
    */
    @Test
    void testPairsSumToZero1() {
        List<Integer> l = List.of(1, 3, 5, 0);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case number: 2
    * Test case values: [1, 3, -2, 1]
    * Expected output (Post-state): false
    */
    @Test
    void testPairsSumToZero2() {
        List<Integer> l = List.of(1, 3, -2, 1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case number: 3
    * Test case values: [1, 2, 3, 7]
    * Expected output (Post-state): false
    */
    @Test
    void testPairsSumToZero3() {
        List<Integer> l = List.of(1, 2, 3, 7);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case number: 4
    * Test case values: [2, 4, -5, 3, 5, 7]
    * Expected output (Post-state): true
    */
    @Test
    void testPairsSumToZero4() {
        List<Integer> l = List.of(2, 4, -5, 3, 5, 7);
        Boolean expected = true;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case number: 5
    * Test case values: [1]
    * Expected output (Post-state): false
    */
    @Test
    void testPairsSumToZero5() {
        List<Integer> l = List.of(1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case number: 6
    * Test case values: [1, 3, 5, 0]
    * Expected output (Post-state): false
    */
    @Test
    void testPairsSumToZero6() {
        List<Integer> l = List.of(1, 3, 5, 0);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case number: 7
    * Test case values: [1, 3, -2, 1]
    * Expected output (Post-state): false
    */
    @Test
    void testPairsSumToZero7() {
        List<Integer> l = List.of(1, 3, -2, 1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case number: 8
    * Test case values: [1, 2, 3, 7]
    * Expected output (Post-state): false
    */
    @Test
    void testPairsSumToZero8() {
        List<Integer> l = List.of(1, 2, 3, 7);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case number: 9
    * Test case values: [2, 4, -5, 3, 5, 7]
    * Expected output (Post-state): true
    */
    @Test
    void testPairsSumToZero9() {
        List<Integer> l = List.of(2, 4, -5, 3, 5, 7);
        Boolean expected = true;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }

    /**
    * Test case number: 10
    * Test case values: [1]
    * Expected output (Post-state): false
    */
    @Test
    void testPairsSumToZero10() {
        List<Integer> l = List.of(1);
        Boolean expected = false;
        assertEquals(expected, PairsSumToZero.pairsSumToZero(l));
    }
}
