package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DerivativeTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(1, 4, 12, 20), scenario1.Derivative.derivative(Arrays.asList(3, 1, 2, 4, 5)));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(2, 6), scenario1.Derivative.derivative(Arrays.asList(1, 2, 3)));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(2, 2), scenario1.Derivative.derivative(Arrays.asList(3, 2, 1)));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(2, 2, 0, 16), scenario1.Derivative.derivative(Arrays.asList(3, 2, 1, 0, 4)));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList(), scenario1.Derivative.derivative(Arrays.asList(1)));
	}

	
}