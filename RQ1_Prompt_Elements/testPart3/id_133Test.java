class SumSquaresTest {
    @Test
    void testSumSquares() {
        assertEquals(14, SumSquares.sumSquares(Arrays.asList(1, 2, 3)));
        assertEquals(14, SumSquares.sumSquares(Arrays.asList(1.0, 2, 3)));
        assertEquals(84, SumSquares.sumSquares(Arrays.asList(1, 3, 5, 7)));
        assertEquals(29, SumSquares.sumSquares(Arrays.asList(1.4, 4.2, 0)));
        assertEquals(6, SumSquares.sumSquares(Arrays.asList(-2.4, 1, 1)));
        assertEquals(10230, SumSquares.sumSquares(Arrays.asList(100, 1, 15, 2)));
        assertEquals(200000000, SumSquares.sumSquares(Arrays.asList(10000, 10000)));
        assertEquals(75, SumSquares.sumSquares(Arrays.asList(-1.4, 4.6, 6.3)));
        assertEquals(1086, SumSquares.sumSquares(Arrays.asList(-1.4, 17.9, 18.9, 19.9)));
        assertEquals(0, SumSquares.sumSquares(Arrays.asList(0)));
        assertEquals(1, SumSquares.sumSquares(Arrays.asList(-1)));
        assertEquals(2, SumSquares.sumSquares(Arrays.asList(-1, 1, 0)));
    }
}