package scenario3;


import original.SpecialFactorial;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpecialFactorialTest {
    @Test
	public void test1() throws Exception {
		assertEquals(288, scenario3.SpecialFactorial.specialFactorial(4));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(34560, scenario3.SpecialFactorial.specialFactorial(5));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(125411328000L, scenario3.SpecialFactorial.specialFactorial(7));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(1, scenario3.SpecialFactorial.specialFactorial(1));
	}

	
}