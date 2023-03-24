// BelowZeroTest.java
package original;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link BelowZero}.
 * It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
 */
class BelowZeroTest {

    @Test
    void testBelowZero_emptyList() {
        List<Object> operations = Arrays.asList();
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero_positiveOperations() {
        List<Object> operations = Arrays.asList(1, 2, 3);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero_negativeOperations() {
        List<Object> operations = Arrays.asList(1, 2, -4, 5);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero_mixedOperations() {
        List<Object> operations = Arrays.asList(1, 2, -3, 1, 2, -3);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero_positiveOperationsWithPositiveResult() {
        List<Object> operations = Arrays.asList(1, 2, -4, 5, 6);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero_mixedOperationsWithNegativeResult() {
        List<Object> operations = Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero_mixedOperationsWithPositiveResult() {
        List<Object> operations = Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero_mixedOperationsWithPositiveResult2() {
        List<Object> operations = Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero_invalidOperationType() {
        List<Object> operations = Arrays.asList(1, "2", -4, 5);
        assertThrows(IllegalArgumentException.class, () -> BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero_nullList() {
        List<Object> operations = null;
        assertThrows(NullPointerException.class, () -> BelowZero.belowZero(operations));
    }
}