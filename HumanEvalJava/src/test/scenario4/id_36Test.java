package scenario4;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
	public void test1() throws Exception {
		assertEquals(0, scenario4.FizzBuzz.fizzBuzz(50));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(2, scenario4.FizzBuzz.fizzBuzz(78));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(3, scenario4.FizzBuzz.fizzBuzz(79));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(0, scenario4.FizzBuzz.fizzBuzz(50));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(2, scenario4.FizzBuzz.fizzBuzz(78));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(3, scenario4.FizzBuzz.fizzBuzz(79));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(3, scenario4.FizzBuzz.fizzBuzz(100));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(6, scenario4.FizzBuzz.fizzBuzz(200));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(192, scenario4.FizzBuzz.fizzBuzz(4000));
	}

	@Test
	public void test10() throws Exception {
		assertEquals(639, scenario4.FizzBuzz.fizzBuzz(10000));
	}

	@Test
	public void test11() throws Exception {
		assertEquals(8026, scenario4.FizzBuzz.fizzBuzz(100000));
	}

	
}