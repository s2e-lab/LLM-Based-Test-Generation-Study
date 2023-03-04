// IsNestedTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {

	@Test
	void testIsNested() {
		assertTrue(IsNested.isNested("[[]]"));
		assertFalse(IsNested.isNested("[]]]]]]][[[[[]"));
		assertFalse(IsNested.isNested("[][]"));
		assertFalse(IsNested.isNested("[]"));
		assertTrue(IsNested.isNested("[[[[]]]]"));
		assertFalse(IsNested.isNested("[]]]]]]]]]]"));
		assertTrue(IsNested.isNested("[][][[]]"));
		assertFalse(IsNested.isNested("[[]"));
		assertFalse(IsNested.isNested("[]]"));
		assertTrue(IsNested.isNested("[[]][["));
		assertTrue(IsNested.isNested("[[][]]"));
		assertFalse(IsNested.isNested(""));
		assertFalse(IsNested.isNested("[[[[[[["));
		assertFalse(IsNested.isNested("]]]]]]]]"));
	}
}