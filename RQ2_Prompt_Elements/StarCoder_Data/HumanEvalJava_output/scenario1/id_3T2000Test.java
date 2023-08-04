// BelowZeroTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BelowZero}.
* It contains ten unit test cases for the {@link BelowZero#belowZero(List)} method.
*/
class BelowZeroTest {

    @Test
    void testBelowZero() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero2() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero3() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero4() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero5() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero6() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero7() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero8() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero9() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero10() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero11() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero12() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0, 1.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero13() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0, 1.0, 2.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero14() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0, 1.0, 2.0, 3.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero15() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0, 1.0, 2.0, 3.0, 4.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero16() {
        List<Object> operations = List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0, -1.0, -2.0, -3.0, -4.0, -5.0, -6.0, -7.0, -8.0, -9.0, -10.0, 1.0, 2.0, 3.0, 4.0, 5.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testBelowZero17() {
        List<Object> operations = List.of(1.0, 