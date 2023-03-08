package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibTest {

    @Test
    public void test() throws Exception {

        assertEquals(55, scenario3.Fib.fib(10));
        assertEquals(1, scenario3.Fib.fib(1));
        assertEquals(21, scenario3.Fib.fib(8));
        assertEquals(89, scenario3.Fib.fib(11));
        assertEquals(144, scenario3.Fib.fib(12));

    }

}