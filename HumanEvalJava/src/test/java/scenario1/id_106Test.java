package scenario1;

import java.util.ArrayList;
import java.util.List;
import original.F;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(1, 2, 6, 24, 15), scenario1.F.f(5));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(1, 2, 6, 24, 15, 720, 28), scenario1.F.f(7));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(1), scenario1.F.f(1));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(1, 2, 6), scenario1.F.f(3));
	}

	
}