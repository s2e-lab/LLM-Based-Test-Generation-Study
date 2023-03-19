package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateIntegersTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(2, 4, 6, 8), scenario1.GenerateIntegers.generateIntegers(2, 10));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(2, 4, 6, 8), scenario1.GenerateIntegers.generateIntegers(10, 2));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(2, 4, 6, 8), scenario1.GenerateIntegers.generateIntegers(132, 2));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(), scenario1.GenerateIntegers.generateIntegers(17, 89));
	}

	
}