package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class GetMaxTriplesTest {
    @Test
    public void testGetMaxTriples() {
        assertEquals(1, GetMaxTriples.getMaxTriples(5));
        assertEquals(4, GetMaxTriples.getMaxTriples(6));
        assertEquals(36, GetMaxTriples.getMaxTriples(10));
        assertEquals(53361, GetMaxTriples.getMaxTriples(100));
        assertEquals(0, GetMaxTriples.getMaxTriples(1));
        assertEquals(0, GetMaxTriples.getMaxTriples(2));
        assertEquals(0, GetMaxTriples.getMaxTriples(3));
        assertEquals(0, GetMaxTriples.getMaxTriples(4));
        assertEquals(0, GetMaxTriples.getMaxTriples(0));
        assertEquals(0, GetMaxTriples.getMaxTriples(-1));
    }
}