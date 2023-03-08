package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClosestIntegerTest {

    @Test
    public void test() throws Exception {

        assertEquals(10, scenario3.ClosestInteger.closestInteger("10"));
        assertEquals(15, scenario3.ClosestInteger.closestInteger("14.5"));
        assertEquals(-16, scenario3.ClosestInteger.closestInteger("-15.5"));
        assertEquals(15, scenario3.ClosestInteger.closestInteger("15.3"));
        assertEquals(0, scenario3.ClosestInteger.closestInteger("0"));

    }

}