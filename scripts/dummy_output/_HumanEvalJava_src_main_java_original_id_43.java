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
    void testPairsSumToZero() {
        List<Integer> l1 = Arrays.asList(1, 3, 5, 0);
        assertFalse(PairsSumToZero.pairsSumToZero(l1));
        
        List<Integer> l2 = Arrays.asList(1, 3, -2, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l2));
        
        List<Integer> l3 = Arrays.asList(1, 2, 3, 7);
        assertFalse(PairsSumToZero.pairsSumToZero(l3));
        
        List<Integer> l4 = Arrays.asList(2, 4, -5, 3, 5, 7);
        assertTrue(PairsSumToZero.pairsSumToZero(l4));
        
        List<Integer> l5 = Arrays.asList(1);
        assertFalse(PairsSumToZero.pairsSumToZero(l5));
        
        List<Integer> l6 = Arrays.asList(1, 3, 5, 0);
        assertFalse(PairsSumToZero.pairsSumToZero(l6));
        
        List<Integer> l7 = Arrays.asList(1, 3, -2, 1);
        assertTrue(PairsSumToZero.pairsSumToZero(l7));
        
        List<Integer> l8 = Arrays.asList(1, 2, 3, 7);
        assertFalse(PairsSumToZero.pairsSumToZero(l8));
        
        List<Integer> l9 = Arrays.asList(2, 4, -5, 3, 5, 7);
        assertTrue(PairsSumToZero.pairsSumToZero(l9));
        
        List<Integer> l10 = Arrays.asList(-3, 9, -1, 3, 2, 30);
        assertTrue(PairsSumToZero.pairsSumToZero(l10));
        
        List<Integer> l11 = Arrays.asList(-3, 9, -1, 3, 2, 31);
        assertTrue(PairsSumToZero.pairsSumToZero(l11));
        
        List<Integer> l12 = Arrays.asList(-3, 9, -1, 4, 2, 30);
        assertFalse(PairsSumToZero.pairsSumToZero(l12));
        
        List<Integer> l13 = Arrays.asList(-3, 9, -1, 4, 2, 31);
        assertFalse(PairsSumToZero.pairsSumToZero(l13));
    }
}