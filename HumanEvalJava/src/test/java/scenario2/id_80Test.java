package scenario2;


import original.IsHappy;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsHappyTest {
    @Test
	public void test1() throws Exception {
		assertEquals(false, scenario2.IsHappy.isHappy("a"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(false, scenario2.IsHappy.isHappy("aa"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(true, scenario2.IsHappy.isHappy("abcd"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(false, scenario2.IsHappy.isHappy("aabb"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(true, scenario2.IsHappy.isHappy("adb"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(false, scenario2.IsHappy.isHappy("xyy"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(true, scenario2.IsHappy.isHappy("iopaxpoi"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(false, scenario2.IsHappy.isHappy("iopaxioi"));
	}

	
}