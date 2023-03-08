package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CorrectBracketingTest {

    @Test
    public void test() throws Exception {

        assertEquals(true, scenario1.CorrectBracketing.correctBracketing("<>"));
        assertEquals(true, scenario1.CorrectBracketing.correctBracketing("<<><>>"));
        assertEquals(true, scenario1.CorrectBracketing.correctBracketing("<><><<><>><>"));
        assertEquals(true, scenario1.CorrectBracketing.correctBracketing("<><><<<><><>><>><<><><<>>>"));
        assertEquals(false, scenario1.CorrectBracketing.correctBracketing("<<<><>>>>"));
        assertEquals(false, scenario1.CorrectBracketing.correctBracketing("><<>"));
        assertEquals(false, scenario1.CorrectBracketing.correctBracketing("<"));
        assertEquals(false, scenario1.CorrectBracketing.correctBracketing("<<<<"));
        assertEquals(false, scenario1.CorrectBracketing.correctBracketing(">"));
        assertEquals(false, scenario1.CorrectBracketing.correctBracketing("<<>"));
        assertEquals(false, scenario1.CorrectBracketing.correctBracketing("<><><<><>><>><<>"));
        assertEquals(false, scenario1.CorrectBracketing.correctBracketing("<><><<><>><>>><>"));

    }

}