package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsPrimeTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario2.IsPrime.isPrime(6));
        assertEquals(true, scenario2.IsPrime.isPrime(101));
        assertEquals(true, scenario2.IsPrime.isPrime(11));
        assertEquals(true, scenario2.IsPrime.isPrime(13441));
        assertEquals(true, scenario2.IsPrime.isPrime(61));
        assertEquals(false, scenario2.IsPrime.isPrime(4));
        assertEquals(false, scenario2.IsPrime.isPrime(1));
        assertEquals(true, scenario2.IsPrime.isPrime(5));
        assertEquals(true, scenario2.IsPrime.isPrime(11));
        assertEquals(true, scenario2.IsPrime.isPrime(17));
        assertEquals(false, scenario2.IsPrime.isPrime(85));
        assertEquals(false, scenario2.IsPrime.isPrime(77));
        assertEquals(false, scenario2.IsPrime.isPrime(255379));

    }

}