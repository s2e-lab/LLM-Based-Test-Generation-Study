package scenario3;


import original.CompareOne;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CompareOneTest {
    @Test
	public void test1() throws Exception {
		assertEquals(2, scenario3.CompareOne.compareOne(1, 2));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(2.5, scenario3.CompareOne.compareOne(1, 2.5));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(3, scenario3.CompareOne.compareOne(2, 3));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(6, scenario3.CompareOne.compareOne(5, 6));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("2,3", scenario3.CompareOne.compareOne(1, "2,3"));
	}

	@Test
	public void test6() throws Exception {
		assertEquals("6", scenario3.CompareOne.compareOne("5,1", "6"));
	}

	@Test
	public void test7() throws Exception {
		assertEquals("2", scenario3.CompareOne.compareOne("1", "2"));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(null, scenario3.CompareOne.compareOne("1", 1));
	}

	
}