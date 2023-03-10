package scenario3;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountUpToTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(2, 3), scenario3.CountUpTo.countUpTo(5));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(2, 3, 5), scenario3.CountUpTo.countUpTo(6));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(2, 3, 5), scenario3.CountUpTo.countUpTo(7));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(2, 3, 5, 7), scenario3.CountUpTo.countUpTo(10));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList(), scenario3.CountUpTo.countUpTo(0));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19), scenario3.CountUpTo.countUpTo(22));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(Arrays.asList(), scenario3.CountUpTo.countUpTo(1));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17), scenario3.CountUpTo.countUpTo(18));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43), scenario3.CountUpTo.countUpTo(47));
	}

	@Test
	public void test10() throws Exception {
		assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97), scenario3.CountUpTo.countUpTo(101));
	}

	
}