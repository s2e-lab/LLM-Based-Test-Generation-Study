class CorrectBracketingTest {
    @Test
    void testCorrectBracketing() {
        assertEquals(CorrectBracketing.correctBracketing("<"), false);
        assertEquals(CorrectBracketing.correctBracketing("<>"), true);
        assertEquals(CorrectBracketing.correctBracketing("<<><>>"), true);
        assertEquals(CorrectBracketing.correctBracketing("><<>"), false);
        assertEquals(CorrectBracketing.correctBracketing("<><><<><>><>"), true);
        assertEquals(CorrectBracketing.correctBracketing("<><><<<><><>><>><<><><<>>>"), true);
        assertEquals(CorrectBracketing.correctBracketing("<<<><>>>>"), false);
        assertEquals(CorrectBracketing.correctBracketing("<"), false);
        assertEquals(CorrectBracketing.correctBracketing("<<<<"), false);
        assertEquals(CorrectBracketing.correctBracketing(">"), false);
        assertEquals(CorrectBracketing.correctBracketing("<<>"), false);
        assertEquals(CorrectBracketing.correctBracketing("<><><<><>><>><<>"), false);
        assertEquals(CorrectBracketing.correctBracketing("<><><<><>><>>><>"), false);
    }
}