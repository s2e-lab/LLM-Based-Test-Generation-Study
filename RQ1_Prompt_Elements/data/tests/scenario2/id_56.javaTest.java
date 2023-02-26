package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketingTest {

    @Test
    public void test() throws Exception{

        assertEquals(true, scenario2.CorrectBracketing.correctBracketing("<>"));
		assertEquals(true, scenario2.CorrectBracketing.correctBracketing("<<><>>"));
		assertEquals(true, scenario2.CorrectBracketing.correctBracketing("<><><<><>><>"));
		assertEquals(true, scenario2.CorrectBracketing.correctBracketing("<><><<<><><>><>><<><><<>>>"));
		assertEquals(false, scenario2.CorrectBracketing.correctBracketing("<<<><>>>>"));
		assertEquals(false, scenario2.CorrectBracketing.correctBracketing("><<>"));
		assertEquals(false, scenario2.CorrectBracketing.correctBracketing("<"));
		assertEquals(false, scenario2.CorrectBracketing.correctBracketing("<<<<"));
		assertEquals(false, scenario2.CorrectBracketing.correctBracketing(">"));
		assertEquals(false, scenario2.CorrectBracketing.correctBracketing("<<>"));
		assertEquals(false, scenario2.CorrectBracketing.correctBracketing("<><><<><>><>><<>"));
		assertEquals(false, scenario2.CorrectBracketing.correctBracketing("<><><<><>><>>><>"));
		
    }

}