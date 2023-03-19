package scenario2;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EvenOddCountTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(0, 1), scenario2.EvenOddCount.evenOddCount(7));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(1, 1), scenario2.EvenOddCount.evenOddCount(-78));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(2, 2), scenario2.EvenOddCount.evenOddCount(3452));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(3, 3), scenario2.EvenOddCount.evenOddCount(346211));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList(3, 3), scenario2.EvenOddCount.evenOddCount(-345821));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList(1, 0), scenario2.EvenOddCount.evenOddCount(-2));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(Arrays.asList(2, 3), scenario2.EvenOddCount.evenOddCount(-45347));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(Arrays.asList(1, 0), scenario2.EvenOddCount.evenOddCount(0));
	}

	
}