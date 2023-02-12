class IsEqualToSumEvenTest {
    @Test
    void testIsEqualToSumEven() {
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(4));
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(6));
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(8));
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(10));
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(11));
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(12));
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(13));
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(16));
        assertEquals(false, IsEqualToSumEven.isEqualToSumEven(17));
        assertEquals(true, IsEqualToSumEven.isEqualToSumEven(18));
    }
}