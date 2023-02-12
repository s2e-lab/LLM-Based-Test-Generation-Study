class SumToNTest {
    @Test
    void testSumToN() {
        assertEquals(1, SumToN.sumToN(1));
        assertEquals(21, SumToN.sumToN(6));
        assertEquals(66, SumToN.sumToN(11));
        assertEquals(465, SumToN.sumToN(30));
        assertEquals(5050, SumToN.sumToN(100));
    }
}