package scenario1;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HexKeyTest {
    @Test
	public void test1() throws Exception {
		assertEquals(1, scenario1.HexKey.hexKey("AB"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(2, scenario1.HexKey.hexKey("1077E"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(4, scenario1.HexKey.hexKey("ABED1A33"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(2, scenario1.HexKey.hexKey("2020"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(6, scenario1.HexKey.hexKey("123456789ABCDEF0"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(12, scenario1.HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(0, scenario1.HexKey.hexKey(Arrays.asList()));
	}

	
}