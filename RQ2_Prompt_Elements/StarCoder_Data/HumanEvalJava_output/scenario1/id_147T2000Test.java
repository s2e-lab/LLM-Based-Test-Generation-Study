// GetMaxTriplesTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {

    @Test
    void testGetMaxTriples() {
        assertEquals(10, GetMaxTriples.getMaxTriples(10));
        assertEquals(100, GetMaxTriples.getMaxTriples(100));
        assertEquals(1000, GetMaxTriples.getMaxTriples(1000));
        assertEquals(10000, GetMaxTriples.getMaxTriples(10000));
        assertEquals(100000, GetMaxTriples.getMaxTriples(100000));
        assertEquals(1000000, GetMaxTriples.getMaxTriples(1000000));
        assertEquals(10000000, GetMaxTriples.getMaxTriples(10000000));
        assertEquals(100000000, GetMaxTriples.getMaxTriples(100000000));
        assertEquals(1000000000, GetMaxTriples.getMaxTriples(1000000000));
        assertEquals(10000000000L, GetMaxTriples.getMaxTriples(10000000000L));
    }
}
