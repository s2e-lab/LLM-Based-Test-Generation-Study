package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountUpperTest {
    @Test
	public void test1() throws Exception {
		assertEquals(0, scenario1.CountUpper.countUpper("abcdefg"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(0, scenario1.CountUpper.countUpper("dBBE"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(0, scenario1.CountUpper.countUpper(""));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(2, scenario1.CountUpper.countUpper("EEEE"));
	}

	
}