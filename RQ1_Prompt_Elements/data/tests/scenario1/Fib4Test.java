package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Fib4Test {

    @Test
    public void test() throws Exception {

        assertEquals(4, scenario1.Fib4.fib4(5));
        assertEquals(8, scenario1.Fib4.fib4(6));
        assertEquals(14, scenario1.Fib4.fib4(7));
        assertEquals(4, scenario1.Fib4.fib4(5));
        assertEquals(28, scenario1.Fib4.fib4(8));
        assertEquals(104, scenario1.Fib4.fib4(10));
        assertEquals(386, scenario1.Fib4.fib4(12));

    }

}