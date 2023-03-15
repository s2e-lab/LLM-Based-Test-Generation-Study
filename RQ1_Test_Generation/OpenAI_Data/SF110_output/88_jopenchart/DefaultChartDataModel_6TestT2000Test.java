// DefaultChartDataModel_6Test.java
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
* It contains ten unit test cases for the {@link DefaultChartDataModel#getChartDataModelConstraints(int)} method.
*/
class DefaultChartDataModel_6Test {

	/**
	 * Test case for {@link DefaultChartDataModel#getChartDataModelConstraints(int)}
	 * with the following input:
	 * <ul>
	 * <li>axis = {@link CoordSystem#FIRST_YAXIS}</li>
	 * </ul>
	 * <p>Expected:
	 * <ul>
	 * <li>result = {@link DefaultChartDataModelConstraints}</li>
	 * </ul>
	 */
	@Test
	public void testGetChartDataModelConstraints_1() {
		DefaultChartDataModel fixture = new DefaultChartDataModel();
		fixture.setChartDataModelConstraints(CoordSystem.FIRST_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.FIRST_YAXIS));
		int axis = CoordSystem.FIRST_YAXIS;
		DefaultChartDataModelConstraints result = fixture.getChartDataModelConstraints(axis);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link DefaultChartDataModel#getChartDataModelConstraints(int)}
	 * with the following input:
	 * <ul>
	 * <li>axis = {@link CoordSystem#SECOND_YAXIS}</li>
	 * </ul>
	 * <p>Expected:
	 * <ul>
	 * <li>result = {@link DefaultChartDataModelConstraints}</li>
	 * </ul>
	 */
	@Test
	public void testGetChartDataModelConstraints_2() {
		DefaultChartDataModel fixture = new DefaultChartDataModel();
		fixture.setChartDataModelConstraints(CoordSystem.SECOND_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.SECOND_YAXIS));
		int axis = CoordSystem.SECOND_YAXIS;
		DefaultChartDataModelConstraints result = fixture.getChartDataModelConstraints(axis);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link DefaultChartDataModel#getChartDataModelConstraints(int)}
	 * with the following input:
	 * <ul>
	 * <li>axis = {@link CoordSystem#FIRST_YAXIS}</li>
	 * </ul>
	 * <p>Expected:
	 * <ul>
	 * <li>result = {@link DefaultChartDataModelConstraints}</li>
	 * </ul>
	 */
	@Test
	public void testGetChartDataModelConstraints_3() {
		DefaultChartDataModel fixture = new DefaultChartDataModel();
		fixture.setChartDataModelConstraints(CoordSystem.FIRST_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.FIRST_YAXIS));
		int axis = CoordSystem.FIRST_YAXIS;
		DefaultChartDataModelConstraints result = fixture.getChartDataModelConstraints(axis);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link DefaultChartDataModel#getChartDataModelConstraints(int)}
	 * with the following input:
	 * <ul>
	 * <li>axis = {@link CoordSystem#SECOND_YAXIS}</li>
	 * </ul>
	 * <p>Expected:
	 * <ul>
	 * <li>result = {@link DefaultChartDataModelConstraints}</li>
	 * </ul>
	 */
	@Test
	public void testGetChartDataModelConstraints_4() {
		DefaultChartDataModel fixture = new DefaultChartDataModel();
		fixture.setChartDataModelConstraints(CoordSystem.SECOND_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.SECOND_YAXIS));
		int axis = CoordSystem.SECOND_YAXIS;
		DefaultChartDataModelConstraints result = fixture.getChartDataModelConstraints(axis);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link DefaultChartDataModel#getChartDataModelConstraints(int)}
	 * with the following input:
	 * <ul>
	 * <li>axis = {@link CoordSystem#FIRST_YAXIS}</li>
	 * </ul>
	 * <p>Expected:
	 * <ul>
	 * <li>result = {@link DefaultChartDataModelConstraints}</li>
	 * </ul>
	 */
	@Test
	public void testGetChartDataModelConstraints_5() {
		DefaultChartDataModel fixture = new DefaultChartDataModel();
		fixture.setChartDataModelConstraints(CoordSystem.FIRST_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.FIRST_YAXIS));
		int axis = CoordSystem.FIRST_YAXIS;
		DefaultChartDataModelConstraints result = fixture.getChartDataModelConstraints(axis);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link DefaultChartDataModel#getChartDataModelConstraints(int)}
	 * with the following input:
	 * <ul>
	 * <li>axis = {@link CoordSystem#SECOND_YAXIS}</li>
	 * </ul>
	 * <p>Expected:
	 * <ul>
	 * <li>result = {@link DefaultChartDataModelConstraints}</li>
	 * </ul>
	 */
	@Test
	public void testGetChartDataModelConstraints_6() {
		DefaultChartDataModel fixture = new DefaultChartDataModel();
		fixture.setChartDataModelConstraints(CoordSystem.SECOND_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.SECOND_YAXIS));
		int axis = CoordSystem.SECOND_YAXIS;
		DefaultChartDataModelConstraints result = fixture.getChartDataModelConstraints(axis);
		assertNotNull(result);
	}
	
}

// DefaultChartDataModel_7Test.java
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
* It contains ten unit test cases for the {@link DefaultChartDataModel#getChartDataModelConstraints(int)} method.
*/
class DefaultChartDataModel_7Test {
		
	/**
	 * Test case for {@link DefaultChartDataModel#getChartDataModelConstraints(int)}
	 * with the following input:
	 * <ul>
	 * <li>axis = {@link CoordSystem#FIRST_YAXIS}</li>
	 * </ul>
	 * <p>Expected:
	 * <ul>
	 * <li>result = {@link DefaultChartDataModelConstraints}</li>
	 * </ul>
	 */
	@Test
	public void testGetChartDataModelConstraints_1() {
		DefaultChartDataModel fixture = new DefaultChartDataModel();
		fixture.setChartDataModelConstraints(CoordSystem.FIRST_YAXIS, new DefaultChartDataModelConstraints(fixture, CoordSystem.FIRST_YAXIS));
		int axis = CoordSystem.FIRST_YAXIS;
		DefaultChartDataModelConstraints result = fixture.getChartDataModelConstraints(axis);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link DefaultChartDataModel#getChartDataModelConstraints(int)}
	 * with the following input:
	