// GetMaxTriplesTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {

    /**
     * Test case for n = 1.
     */
    @Test
    void testGetMaxTriples1() {
        assertEquals(0, GetMaxTriples.getMaxTriples(1));
    }

    /**
     * Test case for n = 2.
     */
    @Test
    void testGetMaxTriples2() {
        assertEquals(0, GetMaxTriples.getMaxTriples(2));
    }

    /**
     * Test case for n = 3.
     */
    @Test
    void testGetMaxTriples3() {
        assertEquals(1, GetMaxTriples.getMaxTriples(3));
    }

    /**
     * Test case for n = 4.
     */
    @Test
    void testGetMaxTriples4() {
        assertEquals(0, GetMaxTriples.getMaxTriples(4));
    }

    /**
     * Test case for n = 5.
     */
    @Test
    void testGetMaxTriples5() {
        assertEquals(1, GetMaxTriples.getMaxTriples(5));
    }

    /**
     * Test case for n = 6.
     */
    @Test
    void testGetMaxTriples6() {
        assertEquals(0, GetMaxTriples.getMaxTriples(6));
    }

    /**
     * Test case for n = 7.
     */
    @Test
    void testGetMaxTriples7() {
        assertEquals(1, GetMaxTriples.getMaxTriples(7));
    }

    /**
     * Test case for n = 8.
     */
    @Test
    void testGetMaxTriples8() {
        assertEquals(0, GetMaxTriples.getMaxTriples(8));
    }

    /**
     * Test case for n = 9.
     */
    @Test
    void testGetMaxTriples9() {
        assertEquals(1, GetMaxTriples.getMaxTriples(9));
    }

    /**
     * Test case for n = 10.
     */
    @Test
    void testGetMaxTriples10() {
        assertEquals(0, GetMaxTriples.getMaxTriples(10));
    }
}
