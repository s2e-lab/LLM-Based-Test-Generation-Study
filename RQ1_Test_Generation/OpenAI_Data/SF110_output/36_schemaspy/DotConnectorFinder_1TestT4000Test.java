// DotConnectorFinder_1Test.java
package net.sourceforge.schemaspy.view;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DotConnectorFinder}.
* It contains ten unit test cases for the {@link DotConnectorFinder#getRelatedConnectors(Table, boolean)} method.
*/
class DotConnectorFinder_1Test {

	/**
	 * Test case for {@link DotConnectorFinder#getRelatedConnectors(Table, boolean)}
	 * <p>
	 * Test if the method returns the correct set of {@link DotConnector}s for a table with no relationships.
	 * </p>
	 */
	@Test
	void testGetRelatedConnectors_1() {
		Table table = new Table("testTable", "testSchema");
		table.addColumn(new TableColumn("testColumn1", "testTable", "testSchema"));
		table.addColumn(new TableColumn("testColumn2", "testTable", "testSchema"));
		table.addColumn(new TableColumn("testColumn3", "testTable", "testSchema"));
		Set<DotConnector> expected = new HashSet<DotConnector>();
		Set<DotConnector> actual = DotConnectorFinder.getInstance().getRelatedConnectors(table, false);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DotConnectorFinder#getRelatedConnectors(Table, boolean)}
	 * <p>
	 * Test if the method returns the correct set of {@link DotConnector}s for a table with one relationship.
	 * </p>
	 */
	@Test
	void testGetRelatedConnectors_2() {
		Table table = new Table("testTable", "testSchema");
		TableColumn column1 = new TableColumn("testColumn1", "testTable", "testSchema");
		TableColumn column2 = new TableColumn("testColumn2", "testTable", "testSchema");
		TableColumn column3 = new TableColumn("testColumn3", "testTable", "testSchema");
		table.addColumn(column1);
		table.addColumn(column2);
		table.addColumn(column3);
		column1.addParent(column2);
		Set<DotConnector> expected = new HashSet<DotConnector>();
		expected.add(new DotConnector(column2, column1, false));
		Set<DotConnector> actual = DotConnectorFinder.getInstance().getRelatedConnectors(table, false);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DotConnectorFinder#getRelatedConnectors(Table, boolean)}
	 * <p>
	 * Test if the method returns the correct set of {@link DotConnector}s for a table with two relationships.
	 * </p>
	 */
	@Test
	void testGetRelatedConnectors_3() {
		Table table = new Table("testTable", "testSchema");
		TableColumn column1 = new TableColumn("testColumn1", "testTable", "testSchema");
		TableColumn column2 = new TableColumn("testColumn2", "testTable", "testSchema");
		TableColumn column3 = new TableColumn("testColumn3", "testTable", "testSchema");
		table.addColumn(column1);
		table.addColumn(column2);
		table.addColumn(column3);
		column1.addParent(column2);
		column1.addParent(column3);
		Set<DotConnector> expected = new HashSet<DotConnector>();
		expected.add(new DotConnector(column2, column1, false));
		expected.add(new DotConnector(column3, column1, false));
		Set<DotConnector> actual = DotConnectorFinder.getInstance().getRelatedConnectors(table, false);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DotConnectorFinder#getRelatedConnectors(Table, boolean)}
	 * <p>
	 * Test if the method returns the correct set of {@link DotConnector}s for a table with three relationships.
	 * </p>
	 */
	@Test
	void testGetRelatedConnectors_4() {
		Table table = new Table("testTable", "testSchema");
		TableColumn column1 = new TableColumn("testColumn1", "testTable", "testSchema");
		TableColumn column2 = new TableColumn("testColumn2", "testTable", "testSchema");
		TableColumn column3 = new TableColumn("testColumn3", "testTable", "testSchema");
		TableColumn column4 = new TableColumn("testColumn4", "testTable", "testSchema");
		table.addColumn(column1);
		table.addColumn(column2);
		table.addColumn(column3);
		table.addColumn(column4);
		column1.addParent(column2);
		column1.addParent(column3);
		column1.addParent(column4);
		Set<DotConnector> expected = new HashSet<DotConnector>();
		expected.add(new DotConnector(column2, column1, false));
		expected.add(new DotConnector(column3, column1, false));
		expected.add(new DotConnector(column4, column1, false));
		Set<DotConnector> actual = DotConnectorFinder.getInstance().getRelatedConnectors(table, false);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DotConnectorFinder#getRelatedConnectors(Table, boolean)}
	 * <p>
	 * Test if the method returns the correct set of {@link DotConnector}s for a table with four relationships.
	 * </p>
	 */
	@Test
	void testGetRelatedConnectors_5() {
		Table table = new Table("testTable", "testSchema");
		TableColumn column1 = new TableColumn("testColumn1", "testTable", "testSchema");
		TableColumn column2 = new TableColumn("testColumn2", "testTable", "testSchema");
		TableColumn column3 = new TableColumn("testColumn3", "testTable", "testSchema");
		TableColumn column4 = new TableColumn("testColumn4", "testTable", "testSchema");
		TableColumn column5 = new TableColumn("testColumn5", "testTable", "testSchema");
		table.addColumn(column1);
		table.addColumn(column2);
		table.addColumn(column3);
		table.addColumn(column4);
		table.addColumn(column5);
		column1.addParent(column2);
		column1.addParent(column3);
		column1.addParent(column4);
		column1.addParent(column5);
		Set<DotConnector> expected = new HashSet<DotConnector>();
		expected.add(new DotConnector(column2, column1, false));
		expected.add(new DotConnector(column3, column1, false));
		expected.add(new DotConnector(column4, column1, false));
		expected.add(new DotConnector(column5, column1, false));
		Set<DotConnector> actual = DotConnectorFinder.getInstance().getRelatedConnectors(table, false);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DotConnectorFinder#getRelatedConnectors(Table, boolean)}
	 * <p>
	 * Test if the method returns the correct set of {@link DotConnector}s for a table with five relationships.
	 * </p>
	 */
	@Test
	void testGetRelatedConnectors_6() {
		Table table = new Table("testTable", "testSchema");
		TableColumn column1 = new TableColumn("testColumn1", "testTable", "testSchema");
		TableColumn column2 = new TableColumn("testColumn2", "testTable", "testSchema");
		TableColumn column3 = new TableColumn("testColumn3", "testTable", "testSchema");
		TableColumn column4 = new TableColumn("testColumn4", "testTable", "testSchema");
		TableColumn column5 = new TableColumn("testColumn5", "testTable", "testSchema");
		TableColumn column6 = new TableColumn("testColumn6", "testTable", "testSchema");
		table.addColumn(column1);
		table.addColumn(column2);
		table.addColumn(column3);
		table.addColumn(column4);
		table.addColumn(column5);
		table.addColumn(column6);
		column1.addParent(column2);
		column1.addParent(column3);
		column1.addParent(column4);
		column1.addParent(column5);
		column1.addParent(column6);
		Set<DotConnector> expected = new HashSet<DotConnector>();
		expected.add(new DotConnector(column2, column1, false));
		expected.add(new DotConnector(column3, column1, false));
		expected.add(new DotConnector(column4, column1, false));
		expected.add(new DotConnector(column5, column1, false));
		expected.add(new DotConnector(column6, column1, false));
		Set<DotConnector> actual = DotConnectorFinder.getInstance().getRelatedConnectors(table, false);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DotConnectorFinder#getRelatedConnectors(Table, boolean)}
	 * <p>
	 * Test if the method returns the correct set of {@link DotConnector}s for a table with six relationships.
	 * </p>
	 */
	@Test
	void testGetRelatedConnectors_7() {
		Table table = new Table("testTable", "testSchema");
		TableColumn column1 = new TableColumn("testColumn1", "testTable", "testSchema");
		TableColumn column2 = new TableColumn("testColumn2", "testTable", "testSchema");
		TableColumn column3 = new TableColumn("testColumn3", "testTable", "testSchema");
		TableColumn column4 = new TableColumn("testColumn4", "testTable", "testSchema");
		TableColumn column5 = new TableColumn("testColumn5", "testTable", "testSchema");
		TableColumn column6 = new TableColumn("testColumn6", "testTable", "testSchema");
		TableColumn column7 = new TableColumn("testColumn7", "testTable", "testSchema");
		table.addColumn(column1);
		table.addColumn(column2);
		table.addColumn(column3);
		table.addColumn(column4);
		table.addColumn(column5);
		table.addColumn(column6);
		table.addColumn(column7);
		column1.addParent(column2);
		column1.addParent(column3);
		column1.addParent(column4);
		column1.addParent(column5);
		column1.addParent(column6);
		column1.addParent(column7);
		Set<DotConnector> expected = new HashSet<DotConnector>();
		expected.add(new DotConnector(column2, column1, false));
		expected.add(new DotConnector(column3, column1, false));
		expected.add(new DotConnector(column4, column1, false));
		expected.add(new DotConnector(column5, column1, false));
		expected.add(new DotConnector(column6, column1, false));
		expected.add(new DotConnector(column7, column1, false));
		Set<DotConnector> actual = DotConnectorFinder.getInstance().getRelatedConnectors(table, false);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DotConnectorFinder#getRelatedConnectors(Table, boolean)}
	 * <p>
	 * Test if the method returns the correct set of {@link DotConnector}s for a table with seven relationships.
	 * </p>
	 */
	@Test
	void testGetRelatedConnectors_8() {
		Table table = new Table("testTable", "testSchema");
		TableColumn column1 = new TableColumn("testColumn1", "testTable", "testSchema");
		TableColumn column2 = new TableColumn("testColumn2", "testTable", "testSchema");
		TableColumn column3 = new TableColumn("testColumn3", "testTable", "testSchema");
		TableColumn column4 = new TableColumn("testColumn4", "testTable", "testSchema");
		TableColumn column5 = new TableColumn("testColumn5", "testTable", "testSchema");
		TableColumn column6 = new TableColumn("testColumn6", "testTable", "testSchema");
		TableColumn column7 = new TableColumn("testColumn7", "testTable", "testSchema");
		TableColumn column8 = new TableColumn("testColumn8", "testTable", "testSchema");
		table.addColumn(column1);
		table.addColumn(column2);
		table.addColumn(column3);
		table.addColumn(column4);
		table.addColumn(column5);
		table.addColumn(column6);
		table.addColumn(column7);
		table.addColumn(column8);
		column1.addParent(column2);
		column1.addParent(column3);
		column1.addParent(column4);
		column1.addParent(column5);
		column1.addParent(column6);
		column1.addParent(column7);
		column1.addParent(column8);
		Set<DotConnector> expected = new HashSet<DotConnector>();
		expected.add(new DotConnector(column2, column1, false));
		expected.add(new DotConnector(column3, column1, false));
		expected.add(new DotConnector(column4, column1, false));
		expected.add(new DotConnector(column5, column1, false));
		expected.add(new DotConnector(column6, column1, false));
		expected.add(new DotConnector(column7, column1, false));
		expected.add(new DotConnector(column8, column1, false));
		Set<DotConnector> actual = DotConnectorFinder.getInstance().getRelatedConnectors(table, false);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case for {@link DotConnectorFinder#getRelatedConnectors(Table, boolean)}
	 * <p>
	 * Test if the method returns the correct set of {@link DotConnector}s for a table with eight relationships.
	 * </p>
	 */
	@Test
	void testGetRelatedConnectors_9() {
		Table table = new Table("testTable", "testSchema");
		TableColumn column1 = new TableColumn("testColumn1", "testTable", "testSchema");
		TableColumn column2 = new TableColumn("testColumn2", "testTable", "testSchema");
		TableColumn column3 = new TableColumn("testColumn3", "testTable", "testSchema");
		TableColumn column4 = new TableColumn("testColumn4", "testTable", "testSchema");
		TableColumn column5 = new TableColumn("testColumn5", "testTable", "testSchema");
		TableColumn column6 = new TableColumn("testColumn6", "testTable", "testSchema");
		TableColumn column7 = new TableColumn("testColumn7", "testTable", "testSchema");
		TableColumn column8 = new TableColumn("testColumn8", "testTable", "testSchema");
		TableColumn column9 = new TableColumn("testColumn9", "testTable", "testSchema");
		table.addColumn(column1);
		table.addColumn(column2);
		table.addColumn(column3);
		table.addColumn(column4);
		table.addColumn(column5);
		table.addColumn(column6);
		table.addColumn(column7);
		table.addColumn(column8);
		table.addColumn(column9);
		column1.addParent(column2);
		column1.addParent(column