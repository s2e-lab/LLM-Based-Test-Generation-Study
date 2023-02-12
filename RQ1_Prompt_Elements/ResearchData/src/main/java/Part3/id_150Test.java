package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class XOrYTest {
    @Test
    void testXOrY() {
        assertEquals(34, XOrY.xOrY(7, 34, 12));
        assertEquals(5, XOrY.xOrY(15, 8, 5));
        assertEquals(33, XOrY.xOrY(3, 33, 5212));
        assertEquals(3, XOrY.xOrY(1259, 3, 52));
        assertEquals(-1, XOrY.xOrY(7919, -1, 12));
        assertEquals(583, XOrY.xOrY(3609, 1245, 583));
        assertEquals(129, XOrY.xOrY(91, 56, 129));
        assertEquals(1234, XOrY.xOrY(6, 34, 1234));
        assertEquals(0, XOrY.xOrY(1, 2, 0));
        assertEquals(2, XOrY.xOrY(2, 2, 0));
    }
}