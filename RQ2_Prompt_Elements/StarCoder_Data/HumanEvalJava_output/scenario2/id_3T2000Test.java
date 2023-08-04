// BelowZeroTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is zero.
    */
    @Test
    void testBelowZero_zeroBalance() {
        List<Object> operations = List.of(0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is positive.
    */
    @Test
    void testBelowZero_positiveBalance() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is negative.
    */
    @Test
    void testBelowZero_negativeBalance() {
        List<Object> operations = List.of(-1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is zero.
    */
    @Test
    void testBelowZero_zeroBalance_withWithdrawals() {
        List<Object> operations = List.of(0.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is positive.
    */
    @Test
    void testBelowZero_positiveBalance_withWithdrawals() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is negative.
    */
    @Test
    void testBelowZero_negativeBalance_withWithdrawals() {
        List<Object> operations = List.of(-1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is zero.
    */
    @Test
    void testBelowZero_zeroBalance_withDeposits() {
        List<Object> operations = List.of(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is positive.
    */
    @Test
    void testBelowZero_positiveBalance_withDeposits() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is negative.
    */
    @Test
    void testBelowZero_negativeBalance_withDeposits() {
        List<Object> operations = List.of(-1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is zero.
    */
    @Test
    void testBelowZero_zeroBalance_withDepositsAndWithdrawals() {
        List<Object> operations = List.of(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is positive.
    */
    @Test
    void testBelowZero_positiveBalance_withDepositsAndWithdrawals() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    /**
    * Test case for {@link BelowZero#belowZero(List)} where the balance of account is negative.
    */
    @Test
    void testBelowZero_negativeBalance_withDepositsAndWithdrawals() {
        List<Object> operations = List.of(-1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0, 0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        assertTrue(BelowZero.belowZero(operations));
    }
}
