package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetMaxTriplesTest {

    @Test
    public void test() throws Exception {

        assertEquals(1, scenario2.GetMaxTriples.getMaxTriples(5));
        assertEquals(4, scenario2.GetMaxTriples.getMaxTriples(6));
        assertEquals(36, scenario2.GetMaxTriples.getMaxTriples(10));
        assertEquals(53361, scenario2.GetMaxTriples.getMaxTriples(100));

    }

}