// DotConnector_0Test.java
package net.sourceforge.schemaspy.view;

import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.Dot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DotConnector}.
* It contains ten unit test cases for the {@link DotConnector#pointsTo(Table)} method.
*/
class DotConnector_0Test {

	/**
	 * Test case for {@link DotConnector#pointsTo(Table)} method.
	 * This test case checks if the method returns true if the specified table is the parent table.
	 */
	@Test
	void testPointsTo_0() {
		TableColumn parentColumn = new TableColumn("parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "parentColumn", "