package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FixSpacesTest {
    @Test
	public void test1() throws Exception {
		assertEquals("Example", scenario3.FixSpaces.fixSpaces("Example"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("Mudasir_Hanif_", scenario3.FixSpaces.fixSpaces("Mudasir Hanif "));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("Yellow_Yellow__Dirty__Fellow", scenario3.FixSpaces.fixSpaces("Yellow Yellow  Dirty  Fellow"));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("Exa-mple", scenario3.FixSpaces.fixSpaces("Exa   mple"));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("-Exa_1_2_2_mple", scenario3.FixSpaces.fixSpaces("   Exa 1 2 2 mple"));
	}

	
}