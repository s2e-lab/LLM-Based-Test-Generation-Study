// GetRowTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains ten unit test cases for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {

	@Test
	void testGetRow() {
		List<Object> lst = new ArrayList<>();
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<Integer>());
		lst.add(new ArrayList<