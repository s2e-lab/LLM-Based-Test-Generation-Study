package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFibTest {

    @Test
    public void test() throws Exception {

        assertEquals(2, scenario2.PrimeFib.primeFib(1));
        assertEquals(3, scenario2.PrimeFib.primeFib(2));
        assertEquals(5, scenario2.PrimeFib.primeFib(3));
        assertEquals(13, scenario2.PrimeFib.primeFib(4));
        assertEquals(89, scenario2.PrimeFib.primeFib(5));
        assertEquals(2, scenario2.PrimeFib.primeFib(1));
        assertEquals(3, scenario2.PrimeFib.primeFib(2));
        assertEquals(5, scenario2.PrimeFib.primeFib(3));
        assertEquals(13, scenario2.PrimeFib.primeFib(4));
        assertEquals(89, scenario2.PrimeFib.primeFib(5));
        assertEquals(233, scenario2.PrimeFib.primeFib(6));
        assertEquals(1597, scenario2.PrimeFib.primeFib(7));
        assertEquals(28657, scenario2.PrimeFib.primeFib(8));
        assertEquals(514229, scenario2.PrimeFib.primeFib(9));
        assertEquals(433494437, scenario2.PrimeFib.primeFib(10));

    }

}