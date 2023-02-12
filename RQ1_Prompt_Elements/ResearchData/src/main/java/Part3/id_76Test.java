package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class IsSimplePowerTest {
    @Test
    void testIsSimplePower() {
        assertEquals(true, IsSimplePower.isSimplePower(1, 4));
        assertEquals(true, IsSimplePower.isSimplePower(2, 2));
        assertEquals(true, IsSimplePower.isSimplePower(8, 2));
        assertEquals(false, IsSimplePower.isSimplePower(3, 2));
        assertEquals(false, IsSimplePower.isSimplePower(3, 1));
        assertEquals(false, IsSimplePower.isSimplePower(5, 3));
        assertEquals(true, IsSimplePower.isSimplePower(16, 2));
        assertEquals(false, IsSimplePower.isSimplePower(143214, 16));
        assertEquals(true, IsSimplePower.isSimplePower(4, 2));
        assertEquals(true, IsSimplePower.isSimplePower(9, 3));
    }
}