// PairsSumToZeroTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PairsSumToZero}.
* It contains ten unit test cases for the {@link PairsSumToZero#pairsSumToZero(List)} method.
*/
class PairsSumToZeroTest {
    
    @Test
    void testPairsSumToZeroWithEmptyList() {
        List<Integer> l = Arrays.asList();
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }
    
    @Test
    void testPairsSumToZeroWithOneElement() {
        List<Integer> l = Arrays.asList(1);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }
    
    @Test
    void testPairsSumToZeroWithTwoElementsSummingToZero() {
        List<Integer> l = Arrays.asList(1, -1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }
    
    @Test
    void testPairsSumToZeroWithTwoElementsNotSummingToZero() {
        List<Integer> l = Arrays.asList(1, 2);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }
    
    @Test
    void testPairsSumToZeroWithThreeElementsSummingToZero() {
        List<Integer> l = Arrays.asList(1, -2, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }
    
    @Test
    void testPairsSumToZeroWithThreeElementsNotSummingToZero() {
        List<Integer> l = Arrays.asList(1, 2, 3);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }
    
    @Test
    void testPairsSumToZeroWithFourElementsSummingToZero() {
        List<Integer> l = Arrays.asList(1, -2, 1, 0);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }
    
    @Test
    void testPairsSumToZeroWithFourElementsNotSummingToZero() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }
    
    @Test
    void testPairsSumToZeroWithSixElementsSummingToZero() {
        List<Integer> l = Arrays.asList(1, -2, 1, 0, 3, -3);
        assertTrue(PairsSumToZero.pairsSumToZero(l));
    }
    
    @Test
    void testPairsSumToZeroWithSixElementsNotSummingToZero() {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertFalse(PairsSumToZero.pairsSumToZero(l));
    }
}