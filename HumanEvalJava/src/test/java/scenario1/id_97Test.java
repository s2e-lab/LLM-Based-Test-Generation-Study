package scenario1;


import original.Multiply;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplyTest {
    @Test
	public void test1() throws Exception {
		assertEquals(16, scenario1.Multiply.multiply(148, 412));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(72, scenario1.Multiply.multiply(19, 28));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(0, scenario1.Multiply.multiply(2020, 1851));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(20, scenario1.Multiply.multiply(14, -15));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(42, scenario1.Multiply.multiply(76, 67));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(49, scenario1.Multiply.multiply(17, 27));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(0, scenario1.Multiply.multiply(0, 1));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(0, scenario1.Multiply.multiply(0, 0));
	}

	
}