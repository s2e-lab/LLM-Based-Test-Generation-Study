package scenario3;


import original.StringXor;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringXorTest {
    @Test
	public void test1() throws Exception {
		assertEquals("100", scenario3.StringXor.stringXor("010", "110"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("010010", scenario3.StringXor.stringXor("111000", "101010"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("0", scenario3.StringXor.stringXor("1", "1"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("0101", scenario3.StringXor.stringXor("0101", "0000"));
	}

	
}