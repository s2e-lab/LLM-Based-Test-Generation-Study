package scenario4;

import java.util.*;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UniqueTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(0, 2, 3, 5, 9, 123), scenario4.Unique.unique(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123)));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(0, 2, 3, 5, 9, 123), scenario4.Unique.unique(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123)));
	}

	
}