// GetMaxTriplesTest.java
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link GetMaxTriples}.
 * It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
 */
class GetMaxTriplesTest {

    @Test
    void testGetMaxTriplesWithNEqualOne() {
        int result = GetMaxTriples.getMaxTriples(1);
        assertEquals(0, result);
    }

    @Test
    void testGetMaxTriplesWithNEqualTwo() {
        int result = GetMaxTriples.getMaxTriples(2);
        assertEquals(0, result);
    }

    @Test
    void testGetMaxTriplesWithNEqualThree() {
        int result = GetMaxTriples.getMaxTriples(3);
        assertEquals(1, result);
    }

    @Test
    void testGetMaxTriplesWithNEqualFour() {
        int result = GetMaxTriples.getMaxTriples(4);
        assertEquals(1, result);
    }

    @Test
    void testGetMaxTriplesWithNEqualFive() {
        int result = GetMaxTriples.getMaxTriples(5);
        assertEquals(2, result);
    }

    @Test
    void testGetMaxTriplesWithNEqualSix() {
        int result = GetMaxTriples.getMaxTriples(6);
        assertEquals(3, result);
    }

    @Test
    void testGetMaxTriplesWithNEqualSeven() {
        int result = GetMaxTriples.getMaxTriples(7);
        assertEquals(4, result);
    }

    @Test
    void testGetMaxTriplesWithNEqualEight() {
        int result = GetMaxTriples.getMaxTriples(8);
        assertEquals(4, result);
    }

    @Test
    void testGetMaxTriplesWithNEqualNine() {
        int result = GetMaxTriples.getMaxTriples(9);
        assertEquals(6, result);
    }

    @Test
    void testGetMaxTriplesWithNEqualTen() {
        int result = GetMaxTriples.getMaxTriples(10);
        assertEquals(7, result);
    }
}