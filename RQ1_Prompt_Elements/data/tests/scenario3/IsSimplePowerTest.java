package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsSimplePowerTest {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario3.IsSimplePower.isSimplePower(16, 2));
        assertEquals(false, scenario3.IsSimplePower.isSimplePower(143214, 16));
        assertEquals(true, scenario3.IsSimplePower.isSimplePower(4, 2));
        assertEquals(true, scenario3.IsSimplePower.isSimplePower(9, 3));
        assertEquals(true, scenario3.IsSimplePower.isSimplePower(16, 4));
        assertEquals(false, scenario3.IsSimplePower.isSimplePower(24, 2));
        assertEquals(false, scenario3.IsSimplePower.isSimplePower(128, 4));
        assertEquals(false, scenario3.IsSimplePower.isSimplePower(12, 6));
        assertEquals(true, scenario3.IsSimplePower.isSimplePower(1, 1));
        assertEquals(true, scenario3.IsSimplePower.isSimplePower(1, 12));

    }

}