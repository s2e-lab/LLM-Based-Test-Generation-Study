package scenario3;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketingTest {

    @Test
    public void test() throws Exception{
        assertEquals(true, scenario3.CorrectBracketing.correctBracketing("<>"));
		assertEquals(true, scenario3.CorrectBracketing.correctBracketing("<<><>>"));
		assertEquals(true, scenario3.CorrectBracketing.correctBracketing("<><><<><>><>"));
		assertEquals(true, scenario3.CorrectBracketing.correctBracketing("<><><<<><><>><>><<><><<>>>"));
		assertEquals(false, scenario3.CorrectBracketing.correctBracketing("<<<><>>>>"));
		assertEquals(false, scenario3.CorrectBracketing.correctBracketing("><<>"));
		assertEquals(false, scenario3.CorrectBracketing.correctBracketing("<"));
		assertEquals(false, scenario3.CorrectBracketing.correctBracketing("<<<<"));
		assertEquals(false, scenario3.CorrectBracketing.correctBracketing(">"));
		assertEquals(false, scenario3.CorrectBracketing.correctBracketing("<<>"));
		assertEquals(false, scenario3.CorrectBracketing.correctBracketing("<><><<><>><>><<>"));
		assertEquals(false, scenario3.CorrectBracketing.correctBracketing("<><><<><>><>>><>"));
		assertEquals(public static Boolean correctBracketing(String brackets) {, scenario3.CorrectBracketing.*/);
		
    }

}