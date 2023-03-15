// DefaultChartDataModel_1Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import de.progra.charting.ChartUtilities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultChartDataModel}.
* It contains ten unit test cases for the {@link DefaultChartDataModel#getDataSetName(int)} method.
*/
class DefaultChartDataModel_1Test {

	/**
	* Test case for the {@link DefaultChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_1() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		String result = defaultChartDataModel.getDataSetName(0);
		assertEquals("0", result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_2() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		String result = defaultChartDataModel.getDataSetName(1);
		assertEquals("1", result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_3() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		String result = defaultChartDataModel.getDataSetName(2);
		assertEquals("2", result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_4() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		String result = defaultChartDataModel.getDataSetName(3);
		assertEquals("3", result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_5() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		String result = defaultChartDataModel.getDataSetName(4);
		assertEquals("4", result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_6() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		String result = defaultChartDataModel.getDataSetName(5);
		assertEquals("5", result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_7() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		String result = defaultChartDataModel.getDataSetName(6);
		assertEquals("6", result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_8() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		String result = defaultChartDataModel.getDataSetName(7);
		assertEquals("7", result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_9() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		String result = defaultChartDataModel.getDataSetName(8);
		assertEquals("8", result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getDataSetName(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetDataSetName_10() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		String result = defaultChartDataModel.getDataSetName(9);
		assertEquals("9", result);
	}
	
}

// DefaultChartDataModel_2Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import de.progra.charting.ChartUtilities;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.Set;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultChartDataModel}.
* It contains ten unit test cases for the {@link DefaultChartDataModel#getAxisBinding(int)} method.
*/
class DefaultChartDataModel_2Test {
		
	/**
	* Test case for the {@link DefaultChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_1() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		int result = defaultChartDataModel.getAxisBinding(0);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_2() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		int result = defaultChartDataModel.getAxisBinding(1);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_3() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		int result = defaultChartDataModel.getAxisBinding(2);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_4() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		int result = defaultChartDataModel.getAxisBinding(3);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGetAxisBinding_5() {
		DefaultChartDataModel defaultChartDataModel = new DefaultChartDataModel();
		int result = defaultChartDataModel.getAxisBinding(4);
		assertEquals(CoordSystem.FIRST_YAXIS, result);
	}
	
	/**
	* Test case for the {@link DefaultChartDataModel#getAxisBinding(int)} method.
	* The test case tests if the method returns the correct value.
	*/
	@Test
	void testGet