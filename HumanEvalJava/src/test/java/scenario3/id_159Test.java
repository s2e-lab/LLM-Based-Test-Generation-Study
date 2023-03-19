package scenario3;

import java.util.Arrays;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EatTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(11, 4), scenario3.Eat.eat(5, 6, 10));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(12, 1), scenario3.Eat.eat(4, 8, 9));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(11, 0), scenario3.Eat.eat(1, 10, 10));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(7, 0), scenario3.Eat.eat(2, 11, 5));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList(9, 2), scenario3.Eat.eat(4, 5, 7));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList(5, 0), scenario3.Eat.eat(4, 5, 1));
	}

	
}