package scenario1;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketing1Test {

    @Test
    public void test() throws Exception{
        assertEquals(true, scenario1.CorrectBracketing1.correctBracketing("()"));
		assertEquals(true, scenario1.CorrectBracketing1.correctBracketing("(()())"));
		assertEquals(true, scenario1.CorrectBracketing1.correctBracketing("()()(()())()"));
		assertEquals(true, scenario1.CorrectBracketing1.correctBracketing("()()((()()())())(()()(()))"));
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("((()())))"));
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing(")(()"));
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("("));
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("(((("));
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing(")"));
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("(()"));
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("()()(()())())(()"));
		assertEquals(false, scenario1.CorrectBracketing1.correctBracketing("()()(()())()))()"));
		assertEquals(public static Boolean correctBracketing(String brackets) {, scenario1.CorrectBracketing1.*/);
		
    }

}