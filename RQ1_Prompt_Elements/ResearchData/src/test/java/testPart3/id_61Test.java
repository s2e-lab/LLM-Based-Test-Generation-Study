class CorrectBracketing1Test {
    @Test
    void testCorrectBracketing() {
        assertEquals(CorrectBracketing1.correctBracketing("()"), true);
        assertEquals(CorrectBracketing1.correctBracketing("(()())"), true);
        assertEquals(CorrectBracketing1.correctBracketing("()()(()())()"), true);
        assertEquals(CorrectBracketing1.correctBracketing("()()((()()())())(()()(()))"), true);
        assertEquals(CorrectBracketing1.correctBracketing("((()())))"), false);
        assertEquals(CorrectBracketing1.correctBracketing(")(()"), false);
        assertEquals(CorrectBracketing1.correctBracketing("("), false);
        assertEquals(CorrectBracketing1.correctBracketing("(((("), false);
        assertEquals(CorrectBracketing1.correctBracketing(")"), false);
        assertEquals(CorrectBracketing1.correctBracketing("(()"), false);
        assertEquals(CorrectBracketing1.correctBracketing("()()(()())())(()"), false);
        assertEquals(CorrectBracketing1.correctBracketing("()()(()())()))()"), false);
    }
}