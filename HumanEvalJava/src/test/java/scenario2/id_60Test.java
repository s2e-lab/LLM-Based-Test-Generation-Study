package scenario2;


import original.SumToN;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumToNTest {
    @Test
	public void test1() throws Exception {
		assertEquals(15, scenario2.SumToN.sumToN(5));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(55, scenario2.SumToN.sumToN(10));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(1, scenario2.SumToN.sumToN(1));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(21, scenario2.SumToN.sumToN(6));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(66, scenario2.SumToN.sumToN(11));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(465, scenario2.SumToN.sumToN(30));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(5050, scenario2.SumToN.sumToN(100));
	}

	
}