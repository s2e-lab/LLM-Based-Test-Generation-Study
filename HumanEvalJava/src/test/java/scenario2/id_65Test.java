package scenario2;


import original.CircularShift;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CircularShiftTest {
    @Test
	public void test1() throws Exception {
		assertEquals("001", scenario2.CircularShift.circularShift(100, 2));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("12", scenario2.CircularShift.circularShift(12, 2));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("79", scenario2.CircularShift.circularShift(97, 8));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("21", scenario2.CircularShift.circularShift(12, 1));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("11", scenario2.CircularShift.circularShift(11, 101));
	}

	
}