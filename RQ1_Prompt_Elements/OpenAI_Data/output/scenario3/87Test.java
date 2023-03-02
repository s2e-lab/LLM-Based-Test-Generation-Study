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
/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list is empty.
	*/
	@Test
	void testGetRow_EmptyList() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one row.
	*/
	@Test
	void testGetRow_OneRowList() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		lst.add(row);
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(1);
		expected.add(coordinate);
		List<Object> actual = GetRow.getRow(lst, 2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one row.
	*/
	@Test
	void testGetRow_OneRowList_NoElement() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		lst.add(row);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 4);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one row.
	*/
	@Test
	void testGetRow_OneRowList_MultipleElements() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(4);
		expected.add(coordinate);
		List<Object> actual = GetRow.getRow(lst, 2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains multiple rows.
	*/
	@Test
	void testGetRow_MultipleRowsList() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(4);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(1);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(1);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(1);
		coordinate.add(4);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(2);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(2);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(2);
		coordinate.add(4);
		expected.add(coordinate);
		List<Object> actual = GetRow.getRow(lst, 2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains multiple rows.
	*/
	@Test
	void testGetRow_MultipleRowsList_NoElement() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 4);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains multiple rows.
	*/
	@Test
	void testGetRow_MultipleRowsList_MultipleElements() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(4);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(1);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(1);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(1);
		coordinate.add(4);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(2);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(2);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(2);
		coordinate.add(4);
		expected.add(coordinate);
		List<Object> actual = GetRow.getRow(lst, 2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains multiple rows.
	*/
	@Test
	void testGetRow_MultipleRowsList_MultipleElements_DifferentRows() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(4);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(1);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(1);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(1);
		coordinate.add(4);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(2);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(2);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(2);
		coordinate.add(4);
		expected.add(coordinate);
		List<Object> actual = GetRow.getRow(lst, 2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains multiple rows.
	*/
	@Test
	void testGetRow_MultipleRowsList_MultipleElements_DifferentRows_DifferentColumns() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		row = new ArrayList<Object>();
		row.add(1);
		row.add(2);
		row.add(3);
		row.add(2);
		row.add(1);
		lst.add(row);
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(1);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(3);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(0);
		coordinate.add(4);
		expected.add(coordinate);
		coordinate = new ArrayList<Object>();
		coordinate.add(1);
		coordinate.add(1);