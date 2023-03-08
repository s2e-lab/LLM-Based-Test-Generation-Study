package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyTest {

    @Test
    public void test() throws Exception {

        assertEquals(16, scenario3.Multiply.multiply(148, 412));
        assertEquals(72, scenario3.Multiply.multiply(19, 28));
        assertEquals(0, scenario3.Multiply.multiply(2020, 1851));
        assertEquals(20, scenario3.Multiply.multiply(14, -15));
        assertEquals(42, scenario3.Multiply.multiply(76, 67));
        assertEquals(49, scenario3.Multiply.multiply(17, 27));
        assertEquals(0, scenario3.Multiply.multiply(0, 1));
        assertEquals(0, scenario3.Multiply.multiply(0, 0));

    }

}