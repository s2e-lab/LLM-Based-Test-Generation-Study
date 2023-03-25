package scenario3;

import java.util.ArrayList;
import java.util.List;
import original.MakeAPile;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MakeAPileTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(3, 5, 7), scenario3.MakeAPile.makeAPile(3));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(4, 6, 8, 10), scenario3.MakeAPile.makeAPile(4));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(5, 7, 9, 11, 13), scenario3.MakeAPile.makeAPile(5));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(6, 8, 10, 12, 14, 16), scenario3.MakeAPile.makeAPile(6));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList(8, 10, 12, 14, 16, 18, 20, 22), scenario3.MakeAPile.makeAPile(8));
	}

	
}