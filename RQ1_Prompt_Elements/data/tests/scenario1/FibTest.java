package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibTest {

    @Test
    public void test() throws Exception {

        assertEquals(55, scenario1.Fib.fib(10));
        assertEquals(1, scenario1.Fib.fib(1));
        assertEquals(21, scenario1.Fib.fib(8));
        assertEquals(89, scenario1.Fib.fib(11));
        assertEquals(144, scenario1.Fib.fib(12));

    }

}