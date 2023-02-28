package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketingTest {

    @Test
    public void test() throws Exception{

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