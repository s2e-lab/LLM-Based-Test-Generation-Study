package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecimalToBinaryTest {

    @Test
    public void test() throws Exception {

        assertEquals("db0db", scenario1.DecimalToBinary.decimalToBinary(0));
        assertEquals("db100000db", scenario1.DecimalToBinary.decimalToBinary(32));
        assertEquals("db1100111db", scenario1.DecimalToBinary.decimalToBinary(103));
        assertEquals("db1111db", scenario1.DecimalToBinary.decimalToBinary(15));

    }

}