class LargestPrimeFactorTest {
    @Test
    void testLargestPrimeFactor() {
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
        assertEquals(7, LargestPrimeFactor.largestPrimeFactor(63));
        assertEquals(11, LargestPrimeFactor.largestPrimeFactor(330));
        assertEquals(29, LargestPrimeFactor.largestPrimeFactor(13195));
        assertEquals(2, LargestPrimeFactor.largestPrimeFactor(2048));
        assertEquals(5, LargestPrimeFactor.largestPrimeFactor(15));
        assertEquals(3, LargestPrimeFactor.largestPrimeFactor(27));
    }
}