// StrangeSortListTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {

	@Test
	void testStrangeSortList() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(4);
		expected.add(2);
		expected.add(3);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = new ArrayList<Object>();
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		expected = new ArrayList<Object>();
		expected.add(5);
		expected.add(9);
		expected.add(6);
		expected.add(8);
		expected.add(7);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(5);
		expected.add(2);
		expected.add(4);
		expected.add(3);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = new ArrayList<Object>();
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		lst.add(1);
		expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(9);
		expected.add(5);
		expected.add(8);
		expected.add(6);
		expected.add(7);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = new ArrayList<Object>();
		lst.add(5);
		lst.add(5);
		lst.add(5);
		lst.add(5);
		expected = new ArrayList<Object>();
		expected.add(5);
		expected.add(5);
		expected.add(5);
		expected.add(5);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = new ArrayList<Object>();
		expected = new ArrayList<Object>();
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = new ArrayList<Object>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(8);
		expected.add(2);
		expected.add(7);
		expected.add(3);
		expected.add(6);
		expected.add(4);
		expected.add(5);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = new ArrayList<Object>();
		lst.add(0);
		lst.add(2);
		lst.add(2);
		lst.add(2);
		lst.add(5);
		lst.add(5);
		lst.add(-5);
		lst.add(-5);
		expected = new ArrayList<Object>();
		expected.add(-5);
		expected.add(5);
		expected.add(-5);
		expected.add(5);
		expected.add(0);
		expected.add(2);
		expected.add(2);
		expected.add(2);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
		
		lst = new ArrayList<Object>();
		lst.add(111111);
		expected = new ArrayList<Object>();
		expected.add(111111);
		assertEquals(expected, StrangeSortList.strangeSortList(lst));
	}
}