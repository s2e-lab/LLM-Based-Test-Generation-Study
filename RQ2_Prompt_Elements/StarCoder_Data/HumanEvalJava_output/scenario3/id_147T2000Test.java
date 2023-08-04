// GetMaxTriplesTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {

    /**
    * Test case for {@link GetMaxTriples#getMaxTriples(int)}.
    */
    @Test
    void testGetMaxTriples() {
        assertEquals(1, GetMaxTriples.getMaxTriples(5));
        assertEquals(4, GetMaxTriples.getMaxTriples(6));
        assertEquals(36, GetMaxTriples.getMaxTriples(10));
        assertEquals(53361, GetMaxTriples.getMaxTriples(100));
    }
}
