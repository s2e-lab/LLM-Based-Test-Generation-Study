package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumToNTest {

    @Test
    public void test() throws Exception {

        assertEquals(15, scenario2.SumToN.sumToN(5));
        assertEquals(55, scenario2.SumToN.sumToN(10));
        assertEquals(1, scenario2.SumToN.sumToN(1));
        assertEquals(21, scenario2.SumToN.sumToN(6));
        assertEquals(66, scenario2.SumToN.sumToN(11));
        assertEquals(465, scenario2.SumToN.sumToN(30));
        assertEquals(5050, scenario2.SumToN.sumToN(100));

    }

}