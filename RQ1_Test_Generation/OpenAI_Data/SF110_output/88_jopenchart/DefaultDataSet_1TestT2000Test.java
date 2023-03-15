// DefaultDataSet_1Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#getColumnValueAt(int)} method.
*/
class DefaultDataSet_1Test {

	/**
	* Test case for {@link DefaultDataSet#getColumnValueAt(int)}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetColumnValueAt_1() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setColumnValueAt(0, "test");
		assertEquals("test", dataSet.getColumnValueAt(0));
	}
	
	/**
	* Test case for {@link DefaultDataSet#getColumnValueAt(int)}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetColumnValueAt_2() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setColumnValueAt(1, "test");
		assertEquals("test", dataSet.getColumnValueAt(1));
	}
	
	/**
	* Test case for {@link DefaultDataSet#getColumnValueAt(int)}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetColumnValueAt_3() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setColumnValueAt(2, "test");
		assertEquals("test", dataSet.getColumnValueAt(2));
	}
	
	/**
	* Test case for {@link DefaultDataSet#getColumnValueAt(int)}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetColumnValueAt_4() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setColumnValueAt(3, "test");
		assertEquals("test", dataSet.getColumnValueAt(3));
	}
	
	/**
	* Test case for {@link DefaultDataSet#getColumnValueAt(int)}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetColumnValueAt_5() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setColumnValueAt(4, "test");
		assertEquals("test", dataSet.getColumnValueAt(4));
	}
	
	/**
	* Test case for {@link DefaultDataSet#getColumnValueAt(int)}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetColumnValueAt_6() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setColumnValueAt(5, "test");
		assertEquals("test", dataSet.getColumnValueAt(5));
	}
	
	/**
	* Test case for {@link DefaultDataSet#getColumnValueAt(int)}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetColumnValueAt_7() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setColumnValueAt(6, "test");
		assertEquals("test", dataSet.getColumnValueAt(6));
	}
	
	/**
	* Test case for {@link DefaultDataSet#getColumnValueAt(int)}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetColumnValueAt_8() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setColumnValueAt(7, "test");
		assertEquals("test", dataSet.getColumnValueAt(7));
	}
	
	/**
	* Test case for {@link DefaultDataSet#getColumnValueAt(int)}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetColumnValueAt_9() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setColumnValueAt(8, "test");
		assertEquals("test", dataSet.getColumnValueAt(8));
	}
	
	/**
	* Test case for {@link DefaultDataSet#getColumnValueAt(int)}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetColumnValueAt_10() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setColumnValueAt(9, "test");
		assertEquals("test", dataSet.getColumnValueAt(9));
	}
}

// DefaultDataSet_2Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#getDataSetLength()} method.
*/
class DefaultDataSet_2Test {
		
	/**
	* Test case for {@link DefaultDataSet#getDataSetLength()}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetDataSetLength_1() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		assertEquals(0, dataSet.getDataSetLength());
	}
	
	/**
	* Test case for {@link DefaultDataSet#getDataSetLength()}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetDataSetLength_2() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setValueAt(0, "test");
		assertEquals(1, dataSet.getDataSetLength());
	}
	
	/**
	* Test case for {@link DefaultDataSet#getDataSetLength()}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetDataSetLength_3() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setValueAt(1, "test");
		assertEquals(2, dataSet.getDataSetLength());
	}
	
	/**
	* Test case for {@link DefaultDataSet#getDataSetLength()}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetDataSetLength_4() {
		DefaultDataSet dataSet = new DefaultDataSet(new Object[] {}, new Object[] {}, CoordSystem.FIRST_YAXIS);
		dataSet.setValueAt(2, "test");
		assertEquals(3, dataSet.getDataSetLength());
	}
	
	/**
	* Test case for {@link DefaultDataSet#getDataSetLength()}.
	* The test case tests the method with a valid index.
	*/
	@Test
	void testGetDataSetLength_5() {
		Default