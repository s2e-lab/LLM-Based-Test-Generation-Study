package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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