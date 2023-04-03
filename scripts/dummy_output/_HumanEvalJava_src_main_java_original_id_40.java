// TriplesSumToZeroTest.java
package original;


import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TriplesSumToZero}.
* It contains ten unit test cases for the {@link TriplesSumToZero#triplesSumToZero(List)} method.
*/
class TriplesSumToZeroTest {
    
    @Test
    void testNullList() {
        assertFalse(TriplesSumToZero.triplesSumToZero(null));
    }
    
    @Test
    void testEmptyList() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList()));
    }
    
    @Test
    void testListWithOneElement() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList(1)));
    }
    
    @Test
    void testListWithTwoElements() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 2)));
    }
    
    @Test
    void testListWithThreeElementsSummingToZero() {
        assertTrue(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, -1, 0)));
    }
    
    @Test
    void testListWithThreeElementsNotSummingToZero() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 2, 3)));
    }
    
    @Test
    void testListWithFourElementsSummingToZero() {
        assertTrue(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, -1, 2, -2)));
    }
    
    @Test
    void testListWithFourElementsNotSummingToZero() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 2, 3, 4)));
    }
    
    @Test
    void testListWithSixElementsSummingToZero() {
        assertTrue(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, -1, 2, -2, 3, -3)));
    }
    
    @Test
    void testListWithSixElementsNotSummingToZero() {
        assertFalse(TriplesSumToZero.triplesSumToZero(Arrays.asList(1, 2, 3, 4, 5, 6)));
    }
}