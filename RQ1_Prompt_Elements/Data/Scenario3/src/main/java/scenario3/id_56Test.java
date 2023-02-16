package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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