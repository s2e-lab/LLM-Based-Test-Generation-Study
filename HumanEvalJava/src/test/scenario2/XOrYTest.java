package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class XOrYTest {

    @Test
    public void test() throws Exception {

        assertEquals(34, scenario2.XOrY.xOrY(7, 34, 12));
        assertEquals(5, scenario2.XOrY.xOrY(15, 8, 5));
        assertEquals(33, scenario2.XOrY.xOrY(3, 33, 5212));
        assertEquals(3, scenario2.XOrY.xOrY(1259, 3, 52));
        assertEquals(-1, scenario2.XOrY.xOrY(7919, -1, 12));
        assertEquals(583, scenario2.XOrY.xOrY(3609, 1245, 583));
        assertEquals(129, scenario2.XOrY.xOrY(91, 56, 129));
        assertEquals(1234, scenario2.XOrY.xOrY(6, 34, 1234));
        assertEquals(0, scenario2.XOrY.xOrY(1, 2, 0));
        assertEquals(2, scenario2.XOrY.xOrY(2, 2, 0));

    }

}