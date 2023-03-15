// ObjectChartDataModel_1Test.java
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
* It contains ten unit test cases for the {@link ObjectChartDataModel#getDataSetName(int)} method.
*/
class ObjectChartDataModel_1Test {

	/**
	* Test case for the {@link ObjectChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_1() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		String result = objectChartDataModel.getDataSetName(0);
		assertEquals("0", result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_2() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		String result = objectChartDataModel.getDataSetName(1);
		assertEquals("1", result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_3() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		String result = objectChartDataModel.getDataSetName(2);
		assertEquals("2", result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_4() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		String result = objectChartDataModel.getDataSetName(3);
		assertEquals("3", result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_5() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		String result = objectChartDataModel.getDataSetName(4);
		assertEquals("4", result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_6() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		String result = objectChartDataModel.getDataSetName(5);
		assertEquals("5", result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_7() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		String result = objectChartDataModel.getDataSetName(6);
		assertEquals("6", result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_8() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		String result = objectChartDataModel.getDataSetName(7);
		assertEquals("7", result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_9() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		String result = objectChartDataModel.getDataSetName(8);
		assertEquals("8", result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_10() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		String result = objectChartDataModel.getDataSetName(9);
		assertEquals("9", result);
	}
	
}

// ObjectChartDataModel_2Test.java
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
* It contains ten unit test cases for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
*/
class ObjectChartDataModel_2Test {
		
	/**
	* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_1() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		int result = objectChartDataModel.getAxisBinding(0);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_2() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		int result = objectChartDataModel.getAxisBinding(1);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_3() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		int result = objectChartDataModel.getAxisBinding(2);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_4() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		int result = objectChartDataModel.getAxisBinding(3);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_5() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		int result = objectChartDataModel.getAxisBinding(4);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_6() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		int result = objectChartDataModel.getAxisBinding(5);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_7() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		int result = objectChartDataModel.getAxisBinding(6);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_8() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		int result = objectChartDataModel.getAxisBinding(7);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_9() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		int result = objectChartDataModel.getAxisBinding(8);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_10() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		int result = objectChartDataModel.getAxisBinding(9);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
}

// ObjectChartDataModel_3Test.java
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
* It contains ten unit test cases for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
*/
class ObjectChartDataModel_3Test {
		
	/**
	* Test case for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetValueAt_1() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Number result = objectChartDataModel.getValueAt(0, 0);
		assertEquals(0.0, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetValueAt_2() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Number result = objectChartDataModel.getValueAt(1, 1);
		assertEquals(0.0, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetValueAt_3() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Number result = objectChartDataModel.getValueAt(2, 2);
		assertEquals(0.0, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetValueAt_4() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Number result = objectChartDataModel.getValueAt(3, 3);
		assertEquals(0.0, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetValueAt_5() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Number result = objectChartDataModel.getValueAt(4, 4);
		assertEquals(0.0, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetValueAt_6() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Number result = objectChartDataModel.getValueAt(5, 5);
		assertEquals(0.0, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetValueAt_7() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Number result = objectChartDataModel.getValueAt(6, 6);
		assertEquals(0.0, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetValueAt_8() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Number result = objectChartDataModel.getValueAt(7, 7);
		assertEquals(0.0, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetValueAt_9() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Number result = objectChartDataModel.getValueAt(8, 8);
		assertEquals(0.0, result);
	}
	
	/**
	* Test case for the {@link ObjectChartDataModel#getValueAt(int, int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetValueAt_10() {
		ObjectChartDataModel objectChartDataModel = new ObjectChartDataModel();
		Number result = objectChartDataModel.getValueAt(9, 9);
		assertEquals(0.0, result);
	}
	
}

// ObjectChartDataModel_4Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import de.progra.charting.ChartUtilities;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**