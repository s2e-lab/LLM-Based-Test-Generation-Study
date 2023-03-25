package scenario1;

import java.util.ArrayList;
import java.util.List;
import original.ParseNestedParens;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParseNestedParensTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList(2, 3, 1, 3), scenario1.ParseNestedParens.parseNestedParens("(()()) ((())) () ((())()())"));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList(1, 2, 3, 4), scenario1.ParseNestedParens.parseNestedParens("() (()) ((())) (((())))"));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList(4), scenario1.ParseNestedParens.parseNestedParens("(()(())((())))"));
	}

	
}