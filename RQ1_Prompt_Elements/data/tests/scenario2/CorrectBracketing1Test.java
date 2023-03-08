package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrectBracketing1Test {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario2.CorrectBracketing1.correctBracketing("()"));
        assertEquals(true, scenario2.CorrectBracketing1.correctBracketing("(()())"));
        assertEquals(true, scenario2.CorrectBracketing1.correctBracketing("()()(()())()"));
        assertEquals(true, scenario2.CorrectBracketing1.correctBracketing("()()((()()())())(()()(()))"));
        assertEquals(false, scenario2.CorrectBracketing1.correctBracketing("((()())))"));
        assertEquals(false, scenario2.CorrectBracketing1.correctBracketing(")(()"));
        assertEquals(false, scenario2.CorrectBracketing1.correctBracketing("("));
        assertEquals(false, scenario2.CorrectBracketing1.correctBracketing("(((("));
        assertEquals(false, scenario2.CorrectBracketing1.correctBracketing(")"));
        assertEquals(false, scenario2.CorrectBracketing1.correctBracketing("(()"));
        assertEquals(false, scenario2.CorrectBracketing1.correctBracketing("()()(()())())(()"));
        assertEquals(false, scenario2.CorrectBracketing1.correctBracketing("()()(()())()))()"));

    }

}