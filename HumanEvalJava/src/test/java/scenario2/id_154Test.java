package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CycpatternCheckTest {
    @Test
	public void test1() throws Exception {
		assertEquals(false, scenario2.CycpatternCheck.cycpatternCheck("xyzw", "xyw"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(true, scenario2.CycpatternCheck.cycpatternCheck("yello", "ell"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(false, scenario2.CycpatternCheck.cycpatternCheck("whattup", "ptut"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(true, scenario2.CycpatternCheck.cycpatternCheck("efef", "fee"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(false, scenario2.CycpatternCheck.cycpatternCheck("abab", "aabb"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(true, scenario2.CycpatternCheck.cycpatternCheck("winemtt", "tinem"));
	}

	
}