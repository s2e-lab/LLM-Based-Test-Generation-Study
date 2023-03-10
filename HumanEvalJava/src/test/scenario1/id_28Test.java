package scenario1;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConcatenateTest {
    @Test
	public void test1() throws Exception {
		assertEquals("", scenario1.Concatenate.concatenate(Arrays.asList()));
	}

	@Test
	public void test2() throws Exception {
		assertEquals("abc", scenario1.Concatenate.concatenate(Arrays.asList("a", "b", "c")));
	}

	@Test
	public void test3() throws Exception {
		assertEquals("", scenario1.Concatenate.concatenate(Arrays.asList()));
	}

	@Test
	public void test4() throws Exception {
		assertEquals("xyz", scenario1.Concatenate.concatenate(Arrays.asList("x", "y", "z")));
	}

	@Test
	public void test5() throws Exception {
		assertEquals("xyzwk", scenario1.Concatenate.concatenate(Arrays.asList("x", "y", "z", "w", "k")));
	}

	
}