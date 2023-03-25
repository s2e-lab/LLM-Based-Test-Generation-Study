package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import original.FindClosestElements;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindClosestElementsTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(3.9, 4.0), scenario3.FindClosestElements.findClosestElements(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(5.0, 5.9), scenario3.FindClosestElements.findClosestElements(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(2.0, 2.2), scenario3.FindClosestElements.findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.2)));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList(2.0, 2.0), scenario3.FindClosestElements.findClosestElements(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList(2.2, 3.1), scenario3.FindClosestElements.findClosestElements(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)));
	}

	
}