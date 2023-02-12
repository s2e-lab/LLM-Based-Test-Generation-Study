class IsMultiplyPrimeTest {
    @Test
    void testIsMultiplyPrime() {
        assertEquals(false, IsMultiplyPrime.isMultiplyPrime(5));
        assertEquals(true, IsMultiplyPrime.isMultiplyPrime(30));
        assertEquals(true, IsMultiplyPrime.isMultiplyPrime(8));
        assertEquals(false, IsMultiplyPrime.isMultiplyPrime(10));
        assertEquals(true, IsMultiplyPrime.isMultiplyPrime(125));
        assertEquals(true, IsMultiplyPrime.isMultiplyPrime(105));
        assertEquals(false, IsMultiplyPrime.isMultiplyPrime(126));
        assertEquals(false, IsMultiplyPrime.isMultiplyPrime(729));
        assertEquals(false, IsMultiplyPrime.isMultiplyPrime(891));
        assertEquals(true, IsMultiplyPrime.isMultiplyPrime(1001));
    }
}