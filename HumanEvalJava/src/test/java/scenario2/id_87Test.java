package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import original.GetRow;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GetRowTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(), scenario2.GetRow.getRow(Arrays.asList(), 1));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(), scenario2.GetRow.getRow(Arrays.asList(Arrays.asList(1)), 2));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(Arrays.asList(2, 2)), scenario2.GetRow.getRow(Arrays.asList(Arrays.asList(), Arrays.asList(1), Arrays.asList(1, 2, 3)), 3));
	}

	
}