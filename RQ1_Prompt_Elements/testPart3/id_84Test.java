class Solve1Test {
    @Test
    void testSolve() {
        assertEquals("1", Solve1.solve(1000));
        assertEquals("110", Solve1.solve(150));
        assertEquals("1100", Solve1.solve(147));
        assertEquals("1001", Solve1.solve(333));
        assertEquals("10010", Solve1.solve(963));
        assertEquals("11", Solve1.solve(3));
        assertEquals("11", Solve1.solve(11));
        assertEquals("11", Solve1.solve(111));
        assertEquals("11", Solve1.solve(1111));
        assertEquals("11", Solve1.solve(11111));
    }
}