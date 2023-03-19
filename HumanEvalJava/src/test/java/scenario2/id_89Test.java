package scenario2;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EncryptTest {
    @Test
	public void test1() throws Exception {
		assertEquals("lm", scenario2.Encrypt.encrypt("hi"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("ewhjklnop", scenario2.Encrypt.encrypt("asdfghjkl"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("kj", scenario2.Encrypt.encrypt("gf"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("ix", scenario2.Encrypt.encrypt("et"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("jeiajeaijeiak", scenario2.Encrypt.encrypt("faewfawefaewg"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("lippsqcjvmirh", scenario2.Encrypt.encrypt("hellomyfriend"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl", scenario2.Encrypt.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals("e", scenario2.Encrypt.encrypt("a"));
	}

	
}