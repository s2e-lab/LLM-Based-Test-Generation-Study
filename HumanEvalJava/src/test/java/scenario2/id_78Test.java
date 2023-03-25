package scenario2;


import original.HexKey;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HexKeyTest {
    @Test
	public void test1() throws Exception {
		assertEquals(1, scenario2.HexKey.hexKey("AB"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(2, scenario2.HexKey.hexKey("1077E"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(4, scenario2.HexKey.hexKey("ABED1A33"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(2, scenario2.HexKey.hexKey("2020"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(6, scenario2.HexKey.hexKey("123456789ABCDEF0"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(12, scenario2.HexKey.hexKey("112233445566778899AABBCCDDEEFF00"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(0, scenario2.HexKey.hexKey(Arrays.asList()));
	}

	
}