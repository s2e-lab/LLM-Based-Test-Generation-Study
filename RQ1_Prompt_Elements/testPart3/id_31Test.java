class IsPrimeTest {
    @Test
    void testIsPrime() {
        assertEquals(false, IsPrime.isPrime(6));
        assertEquals(true, IsPrime.isPrime(101));
        assertEquals(true, IsPrime.isPrime(11));
        assertEquals(true, IsPrime.isPrime(13441));
        assertEquals(true, IsPrime.isPrime(61));
        assertEquals(false, IsPrime.isPrime(4));
        assertEquals(false, IsPrime.isPrime(1));
        assertEquals(true, IsPrime.isPrime(5));
        assertEquals(true, IsPrime.isPrime(11));
        assertEquals(true, IsPrime.isPrime(17));
        assertEquals(false, IsPrime.isPrime(85));
        assertEquals(false, IsPrime.isPrime(77));
        assertEquals(false, IsPrime.isPrime(255379));
    }
}