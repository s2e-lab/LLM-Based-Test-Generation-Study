package scenario2;

import java.util.List;
import original.CanArrange;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CanArrangeTest {
    @Test
	public void test1() throws Exception {
		assertEquals(3, scenario2.CanArrange.canArrange(Arrays.asList(1, 2, 4, 3, 5)));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(-1, scenario2.CanArrange.canArrange(Arrays.asList(1, 2, 4, 5)));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(2, scenario2.CanArrange.canArrange(Arrays.asList(1, 4, 2, 5, 6, 7, 8, 9, 10)));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(4, scenario2.CanArrange.canArrange(Arrays.asList(4, 8, 5, 7, 3)));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(-1, scenario2.CanArrange.canArrange(Arrays.asList()));
	}

	
}