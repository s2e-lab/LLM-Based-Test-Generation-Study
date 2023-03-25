package scenario3;

import java.util.ArrayList;
import java.util.List;
import original.RollingMax;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RollingMaxTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(1, 2, 3, 3, 3, 4, 4), scenario3.RollingMax.rollingMax(Arrays.asList(1, 2, 3, 2, 3, 4, 2)));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(), scenario3.RollingMax.rollingMax(Arrays.asList()));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(1, 2, 3, 4), scenario3.RollingMax.rollingMax(Arrays.asList(1, 2, 3, 4)));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(4, 4, 4, 4), scenario3.RollingMax.rollingMax(Arrays.asList(4, 3, 2, 1)));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList(3, 3, 3, 100, 100), scenario3.RollingMax.rollingMax(Arrays.asList(3, 2, 3, 100, 3)));
	}

	
}