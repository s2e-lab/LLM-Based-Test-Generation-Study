// Here's a possible implementation of the isPrime method:

public static Boolean isPrime(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

// And here's a possible implementation of the IsPrimeTest class:

class IsPrimeTest {
    @Test
    void testIsPrimeWithCompositeNumbers() {
        assertFalse(IsPrime.isPrime(6));
        assertFalse(IsPrime.isPrime(4));
        assertFalse(IsPrime.isPrime(1));
        assertFalse(IsPrime.isPrime(85));
        assertFalse(IsPrime.isPrime(77));
        assertFalse(IsPrime.isPrime(255379));
    }

    @Test
    void testIsPrimeWithPrimeNumbers() {
        assertTrue(IsPrime.isPrime(101));
        assertTrue(IsPrime.isPrime(11));
        assertTrue(IsPrime.isPrime(13441));
        assertTrue(IsPrime.isPrime(61));
        assertTrue(IsPrime.isPrime(5));
        assertTrue(IsPrime.isPrime(11));
        assertTrue(IsPrime.isPrime(17));
    }
}