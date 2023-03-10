package scenario4;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {
    @Test
	public void test1() throws Exception {
		assertEquals(5, scenario4.Digits.digits(5));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(5, scenario4.Digits.digits(54));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(1, scenario4.Digits.digits(120));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(5, scenario4.Digits.digits(5014));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(315, scenario4.Digits.digits(98765));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(2625, scenario4.Digits.digits(5576543));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(0, scenario4.Digits.digits(2468));
	}

	
}