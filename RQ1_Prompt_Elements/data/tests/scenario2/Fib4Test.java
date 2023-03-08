package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Fib4Test {

    @Test
    public void test() throws Exception {

        assertEquals(4, scenario2.Fib4.fib4(5));
        assertEquals(8, scenario2.Fib4.fib4(6));
        assertEquals(14, scenario2.Fib4.fib4(7));
        assertEquals(4, scenario2.Fib4.fib4(5));
        assertEquals(28, scenario2.Fib4.fib4(8));
        assertEquals(104, scenario2.Fib4.fib4(10));
        assertEquals(386, scenario2.Fib4.fib4(12));

    }

}