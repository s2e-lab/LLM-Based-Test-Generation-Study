package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    @Test
	public void test1() throws Exception {
		assertEquals("lm", scenario3.Encrypt.encrypt("hi"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("ewhjklnop", scenario3.Encrypt.encrypt("asdfghjkl"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("kj", scenario3.Encrypt.encrypt("gf"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("ix", scenario3.Encrypt.encrypt("et"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("jeiajeaijeiak", scenario3.Encrypt.encrypt("faewfawefaewg"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("lippsqcjvmirh", scenario3.Encrypt.encrypt("hellomyfriend"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", scenario3.Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("e", scenario3.Encrypt.encrypt("a"));
	}

	
}