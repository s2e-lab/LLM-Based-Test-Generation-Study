package scenario1;


import original.StartsOneEnds;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StartsOneEndsTest {
    @Test
	public void test1() throws Exception {
		assertEquals(1, scenario1.StartsOneEnds.startsOneEnds(1));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(18, scenario1.StartsOneEnds.startsOneEnds(2));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(180, scenario1.StartsOneEnds.startsOneEnds(3));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(1800, scenario1.StartsOneEnds.startsOneEnds(4));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(18000, scenario1.StartsOneEnds.startsOneEnds(5));
	}

	
}