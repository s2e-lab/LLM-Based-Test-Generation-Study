package scenario4;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    @Test
	public void test1() throws Exception {
		assertEquals("lm", scenario4.Encrypt.encrypt("hi"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("ewhjklnop", scenario4.Encrypt.encrypt("asdfghjkl"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("kj", scenario4.Encrypt.encrypt("gf"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("ix", scenario4.Encrypt.encrypt("et"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("jeiajeaijeiak", scenario4.Encrypt.encrypt("faewfawefaewg"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("lippsqcjvmirh", scenario4.Encrypt.encrypt("hellomyfriend"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", scenario4.Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("e", scenario4.Encrypt.encrypt("a"));
	}

	
}