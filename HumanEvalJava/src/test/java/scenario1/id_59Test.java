package scenario1;


import original.LargestPrimeFactor;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LargestPrimeFactorTest {
    @Test
	public void test1() throws Exception {
		assertEquals(2, scenario1.LargestPrimeFactor.largestPrimeFactor(2048));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(5, scenario1.LargestPrimeFactor.largestPrimeFactor(15));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(3, scenario1.LargestPrimeFactor.largestPrimeFactor(27));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(7, scenario1.LargestPrimeFactor.largestPrimeFactor(63));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(11, scenario1.LargestPrimeFactor.largestPrimeFactor(330));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(29, scenario1.LargestPrimeFactor.largestPrimeFactor(13195));
	}

	
}