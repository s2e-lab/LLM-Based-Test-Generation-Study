// BelowZeroTest.java
package original;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link BelowZero}.
 * It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
 */
class BelowZeroTest {

    @Test
    void testEmptyList() {
        assertFalse(BelowZero.belowZero(Collections.emptyList()));
    }

    @Test
    void testPositiveOperations() {
        assertFalse(BelowZero.belowZero(Arrays.asList(1, 2, 3)));
    }

    @Test
    void testNegativeOperations() {
        assertTrue(BelowZero.belowZero(Arrays.asList(1, 2, -4, 5)));
    }

    @Test
    void testMixedOperations() {
        assertFalse(BelowZero.belowZero(Arrays.asList(1, 2, -3, 1, 2, -3)));
    }

    @Test
    void testPositiveOperationsAfterNegative() {
        assertTrue(BelowZero.belowZero(Arrays.asList(1, 2, -4, 5, 6)));
    }

    @Test
    void testNoNegativeBalance() {
        assertFalse(BelowZero.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -4)));
    }

    @Test
    void testNegativeBalanceAtEnd() {
        assertTrue(BelowZero.belowZero(Arrays.asList(1, -1, 2, -2, 5, -5, 4, -5)));
    }

    @Test
    void testNegativeBalanceAtStart() {
        assertTrue(BelowZero.belowZero(Arrays.asList(1, -2, 2, -2, 5, -5, 4, -4)));
    }

    @Test
    void testDoubleOperations() {
        assertTrue(BelowZero.belowZero(Arrays.asList(1.0, -2.5, 2.5, -2.5, 5.0, -5.0, 4.0, -4.0)));
    }

    @Test
    void testInvalidOperationType() {
        assertThrows(IllegalArgumentException.class, () -> BelowZero.belowZero(Arrays.asList("1", "2", "3")));
    }

    @Test
    void testNullList() {
        assertThrows(NullPointerException.class, () -> BelowZero.belowZero(null));
    }
}