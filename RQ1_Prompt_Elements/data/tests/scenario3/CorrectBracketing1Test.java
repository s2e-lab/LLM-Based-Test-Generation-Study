package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrectBracketing1Test {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario3.CorrectBracketing1.correctBracketing("()"));
        assertEquals(true, scenario3.CorrectBracketing1.correctBracketing("(()())"));
        assertEquals(true, scenario3.CorrectBracketing1.correctBracketing("()()(()())()"));
        assertEquals(true, scenario3.CorrectBracketing1.correctBracketing("()()((()()())())(()()(()))"));
        assertEquals(false, scenario3.CorrectBracketing1.correctBracketing("((()())))"));
        assertEquals(false, scenario3.CorrectBracketing1.correctBracketing(")(()"));
        assertEquals(false, scenario3.CorrectBracketing1.correctBracketing("("));
        assertEquals(false, scenario3.CorrectBracketing1.correctBracketing("(((("));
        assertEquals(false, scenario3.CorrectBracketing1.correctBracketing(")"));
        assertEquals(false, scenario3.CorrectBracketing1.correctBracketing("(()"));
        assertEquals(false, scenario3.CorrectBracketing1.correctBracketing("()()(()())())(()"));
        assertEquals(false, scenario3.CorrectBracketing1.correctBracketing("()()(()())()))()"));

    }

}