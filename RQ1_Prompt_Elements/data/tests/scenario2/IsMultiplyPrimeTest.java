package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IsMultiplyPrimeTest {

    @Test
    public void test() throws Exception {

        assertEquals(false, scenario2.IsMultiplyPrime.isMultiplyPrime(5));
        assertEquals(true, scenario2.IsMultiplyPrime.isMultiplyPrime(30));
        assertEquals(true, scenario2.IsMultiplyPrime.isMultiplyPrime(8));
        assertEquals(false, scenario2.IsMultiplyPrime.isMultiplyPrime(10));
        assertEquals(true, scenario2.IsMultiplyPrime.isMultiplyPrime(125));
        assertEquals(true, scenario2.IsMultiplyPrime.isMultiplyPrime(105));
        assertEquals(false, scenario2.IsMultiplyPrime.isMultiplyPrime(126));
        assertEquals(false, scenario2.IsMultiplyPrime.isMultiplyPrime(729));
        assertEquals(false, scenario2.IsMultiplyPrime.isMultiplyPrime(891));
        assertEquals(true, scenario2.IsMultiplyPrime.isMultiplyPrime(1001));

    }

}