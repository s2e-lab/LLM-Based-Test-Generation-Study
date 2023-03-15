// ObjectChartDataModel_6Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import de.progra.charting.ChartUtilities;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectChartDataModel}.
* It contains ten unit test cases for the {@link ObjectChartDataModel#getColumnValueAt(int, int)} method.
*/
class ObjectChartDataModel_6Test {

	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int, int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_1() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(0, 0);
		assertEquals("a", result);
	}
	
	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int, int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_2() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(0, 1);
		assertEquals("b", result);
	}
	
	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int, int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_3() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(1, 0);
		assertEquals("a", result);
	}
	
	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int, int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_4() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(1, 1);
		assertEquals("b", result);
	}
	
	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int, int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_5() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(2, 0);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int, int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_6() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(2, 1);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int, int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_7() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(0, 2);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int, int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_8() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(1, 2);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int, int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_9() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(2, 2);
		assertEquals(null, result);
	}
	
	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int, int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_10() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(0, -1);
		assertEquals(null, result);
	}
	
}

// ObjectChartDataModel_7Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import de.progra.charting.ChartUtilities;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectChartDataModel}.
* It contains ten unit test cases for the {@link ObjectChartDataModel#getColumnValueAt(int)} method.
*/
class ObjectChartDataModel_7Test {
		
	/**
	* Test case for {@link ObjectChartDataModel#getColumnValueAt(int)}.
	* The test case tests if the method returns the correct column value.
	*/
	@Test
	void testGetColumnValueAt_1() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Object[] columns = new Object[2];
		columns[0] = "a";
		columns[1] = "b";
		objectChartDataModel.columns = columns;
		Object result = objectChartDataModel.getColumnValueAt(0);
		assertEquals("a", result);
	}
	
	/**
	* Test case for {@link ObjectChartDataModel#