package scenario3;

import java.util.Arrays;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SortNumbersTest {
    @Test
	public void test1() throws Exception {
		assertEquals("one three five", scenario3.SortNumbers.sortNumbers("three one five"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("", scenario3.SortNumbers.sortNumbers(""));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("three", scenario3.SortNumbers.sortNumbers("three"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("three five nine", scenario3.SortNumbers.sortNumbers("three five nine"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("zero four five seven eight nine", scenario3.SortNumbers.sortNumbers("five zero four seven nine eight"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("zero one two three four five six", scenario3.SortNumbers.sortNumbers("six five four three two one zero"));
	}

	
}