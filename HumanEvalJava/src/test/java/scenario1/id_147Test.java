package scenario1;


import original.GetMaxTriples;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetMaxTriplesTest {
    @Test
	public void test1() throws Exception {
		assertEquals(1, scenario1.GetMaxTriples.getMaxTriples(5));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(4, scenario1.GetMaxTriples.getMaxTriples(6));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(36, scenario1.GetMaxTriples.getMaxTriples(10));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(53361, scenario1.GetMaxTriples.getMaxTriples(100));
	}

	
}