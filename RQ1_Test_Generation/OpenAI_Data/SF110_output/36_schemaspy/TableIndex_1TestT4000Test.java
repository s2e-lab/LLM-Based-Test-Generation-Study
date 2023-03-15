// TableIndex_1Test.java
package net.sourceforge.schemaspy.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableIndex}.
* It contains ten unit test cases for the {@link TableIndex#compareTo(TableIndex)} method.
*/
class TableIndex_1Test {

	/**
	* Test case for {@link TableIndex#compareTo(TableIndex)} method.
	* Test data: primary key index.
	* Expected result: -1.
	*/
	@Test
	void testCompareTo_1() {
		TableIndex index1 = new TableIndex(null);
		index1.setIsPrimaryKey(true);
		TableIndex index2 = new TableIndex(null);
		index2.setIsPrimaryKey(false);
		int result = index1.compareTo(index2);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link TableIndex#compareTo(TableIndex)} method.
	* Test data: non-primary key index.
	* Expected result: 1.
	*/
	@Test
	void testCompareTo_2() {
		TableIndex index1 = new TableIndex(null);
		index1.setIsPrimaryKey(false);
		TableIndex index2 = new TableIndex(null);
		index2.setIsPrimaryKey(true);
		int result = index1.compareTo(index2);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link TableIndex#compareTo(TableIndex)} method.
	* Test data: primary key index and null id.
	* Expected result: 0.
	*/
	@Test
	void testCompareTo_3() {
		TableIndex index1 = new TableIndex(null);
		index1.setIsPrimaryKey(true);
		TableIndex index2 = new TableIndex(null);
		index2.setIsPrimaryKey(true);
		int result = index1.compareTo(index2);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link TableIndex#compareTo(TableIndex)} method.
	* Test data: non-primary key index and null id.
	* Expected result: 0.
	*/
	@Test
	void testCompareTo_4() {
		TableIndex index1 = new TableIndex(null);
		index1.setIsPrimaryKey(false);
		TableIndex index2 = new TableIndex(null);
		index2.setIsPrimaryKey(false);
		int result = index1.compareTo(index2);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link TableIndex#compareTo(TableIndex)} method.
	* Test data: primary key index and non-null id.
	* Expected result: -1.
	*/
	@Test
	void testCompareTo_5() {
		TableIndex index1 = new TableIndex(null);
		index1.setIsPrimaryKey(true);
		index1.setId(1);
		TableIndex index2 = new TableIndex(null);
		index2.setIsPrimaryKey(true);
		index2.setId(2);
		int result = index1.compareTo(index2);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link TableIndex#compareTo(TableIndex)} method.
	* Test data: non-primary key index and non-null id.
	* Expected result: -1.
	*/
	@Test
	void testCompareTo_6() {
		TableIndex index1 = new TableIndex(null);
		index1.setIsPrimaryKey(false);
		index1.setId(1);
		TableIndex index2 = new TableIndex(null);
		index2.setIsPrimaryKey(false);
		index2.setId(2);
		int result = index1.compareTo(index2);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link TableIndex#compareTo(TableIndex)} method.
	* Test data: primary key index and non-null id.
	* Expected result: 1.
	*/
	@Test
	void testCompareTo_7() {
		TableIndex index1 = new TableIndex(null);
		index1.setIsPrimaryKey(true);
		index1.setId(2);
		TableIndex index2 = new TableIndex(null);
		index2.setIsPrimaryKey(true);
		index2.setId(1);
		int result = index1.compareTo(index2);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link TableIndex#compareTo(TableIndex)} method.
	* Test data: non-primary key index and non-null id.
	* Expected result: 1.
	*/
	@Test
	void testCompareTo_8() {
		TableIndex index1 = new TableIndex(null);
		index1.setIsPrimaryKey(false);
		index1.setId(2);
		TableIndex index2 = new TableIndex(null);
		index2.setIsPrimaryKey(false);
		index2.setId(1);
		int result = index1.compareTo(index2);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link TableIndex#compareTo(TableIndex)} method.
	* Test data: primary key index and non-null id.
	* Expected result: 0.
	*/
	@Test
	void testCompareTo_9() {
		TableIndex index1 = new TableIndex(null);
		index1.setIsPrimaryKey(true);
		index1.setId(1);
		TableIndex index2 = new TableIndex(null);
		index2.setIsPrimaryKey(true);
		index2.setId(1);
		int result = index1.compareTo(index2);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link TableIndex#compareTo(TableIndex)} method.
	* Test data: non-primary key index and non-null id.
	* Expected result: 0.
	*/
	@Test
	void testCompareTo_10() {
		TableIndex index1 = new TableIndex(null);
		index1.setIsPrimaryKey(false);
		index1.setId(1);
		TableIndex index2 = new TableIndex(null);
		index2.setIsPrimaryKey(false);
		index2.setId(1);
		int result = index1.compareTo(index2);
		assertEquals(0, result);
	}
}

// TableIndex_2Test.java
package net.sourceforge.schemaspy.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableIndex}.
* It contains ten unit test cases for the {@link TableIndex#isUniqueNullable()} method.
*/
class TableIndex_2Test {
		
	/**
	* Test case for {@link TableIndex#isUniqueNullable()} method.
	* Test data: unique index and nullable column.
	* Expected result: true.
	*/
	@Test
	void testIsUniqueNullable_1() {
		TableIndex index = new TableIndex(null);
		index.setIsPrimaryKey(false);
		index.setId(1);
		TableColumn column = new TableColumn(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null,