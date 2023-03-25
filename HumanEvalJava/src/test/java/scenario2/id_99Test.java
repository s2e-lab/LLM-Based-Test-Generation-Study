package scenario2;


import original.ClosestInteger;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClosestIntegerTest {
    @Test
	public void test1() throws Exception {
		assertEquals(10, scenario2.ClosestInteger.closestInteger("10"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(15, scenario2.ClosestInteger.closestInteger("14.5"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(-16, scenario2.ClosestInteger.closestInteger("-15.5"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(15, scenario2.ClosestInteger.closestInteger("15.3"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(0, scenario2.ClosestInteger.closestInteger("0"));
	}

	
}