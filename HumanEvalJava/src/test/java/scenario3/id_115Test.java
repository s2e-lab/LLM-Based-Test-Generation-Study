package scenario3;

import java.util.List;
import original.MaxFill;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaxFillTest {
    @Test
	public void test1() throws Exception {
		assertEquals(6, scenario3.MaxFill.maxFill(Arrays.asList(Arrays.asList(0, 0, 1, 0), Arrays.asList(0, 1, 0, 0), Arrays.asList(1, 1, 1, 1)), 1));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(5, scenario3.MaxFill.maxFill(Arrays.asList(Arrays.asList(0, 0, 1, 1), Arrays.asList(0, 0, 0, 0), Arrays.asList(1, 1, 1, 1), Arrays.asList(0, 1, 1, 1)), 2));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(0, scenario3.MaxFill.maxFill(Arrays.asList(Arrays.asList(0, 0, 0), Arrays.asList(0, 0, 0)), 5));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(4, scenario3.MaxFill.maxFill(Arrays.asList(Arrays.asList(1, 1, 1, 1), Arrays.asList(1, 1, 1, 1)), 2));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(2, scenario3.MaxFill.maxFill(Arrays.asList(Arrays.asList(1, 1, 1, 1), Arrays.asList(1, 1, 1, 1)), 9));
	}

	
}