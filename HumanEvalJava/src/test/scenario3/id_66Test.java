package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsumTest {
    @Test
	public void test1() throws Exception {
		assertEquals(0, scenario3.Digitsum.digitSum(""));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(131, scenario3.Digitsum.digitSum("abAB"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(67, scenario3.Digitsum.digitSum("abcCd"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(69, scenario3.Digitsum.digitSum("helloE"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(131, scenario3.Digitsum.digitSum("woArBld"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(153, scenario3.Digitsum.digitSum("aAaaaXa"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(151, scenario3.Digitsum.digitSum(" How are yOu?"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(327, scenario3.Digitsum.digitSum("You arE Very Smart"));
	}

	
}