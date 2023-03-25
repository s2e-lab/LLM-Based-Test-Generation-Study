package scenario1;

import java.util.ArrayList;
import java.util.List;
import original.Compare;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompareTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(0, 0, 0, 0, 3, 3), scenario1.Compare.compare(Arrays.asList(1, 2, 3, 4, 5, 1), Arrays.asList(1, 2, 3, 4, 2, -2)));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(0, 0, 0, 0, 0, 0), scenario1.Compare.compare(Arrays.asList(0, 0, 0, 0, 0, 0), Arrays.asList(0, 0, 0, 0, 0, 0)));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(2, 4, 6), scenario1.Compare.compare(Arrays.asList(1, 2, 3), Arrays.asList(-1, -2, -3)));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(2, 0, 0, 1), scenario1.Compare.compare(Arrays.asList(1, 2, 3, 5), Arrays.asList(-1, 2, 3, 4)));
	}

	
}