package scenario3;


import original.IsBored;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IsBoredTest {
    @Test
	public void test1() throws Exception {
		assertEquals(0, scenario3.IsBored.isBored("Hello world"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(0, scenario3.IsBored.isBored("Is the sky blue?"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(1, scenario3.IsBored.isBored("I love It !"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(0, scenario3.IsBored.isBored("bIt"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(2, scenario3.IsBored.isBored("I feel good today. I will be productive. will kill It"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(0, scenario3.IsBored.isBored("You and I are going for a walk"));
	}

	
}