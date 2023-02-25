package scenario3;


import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CycpatternCheckTest {

    @Test
    public void test() throws Exception{
        assertEquals(false, scenario3.CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
		assertEquals(true, scenario3.CycpatternCheck.cycpatternCheck("yello", "ell"));
		assertEquals(false, scenario3.CycpatternCheck.cycpatternCheck("whattup", "ptut"));
		assertEquals(true, scenario3.CycpatternCheck.cycpatternCheck("efef", "fee"));
		assertEquals(false, scenario3.CycpatternCheck.cycpatternCheck("abab", "aabb"));
		assertEquals(true, scenario3.CycpatternCheck.cycpatternCheck("winemtt", "tinem"));
		assertEquals(public static Boolean cycpatternCheck(String a, String b) {, scenario3.CycpatternCheck.*/);
		
    }

}