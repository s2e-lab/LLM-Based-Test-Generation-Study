// TableOrdererTest.java
package net.sourceforge.schemaspy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableOrderer}.
* It contains ten unit test cases for the {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
*/
class TableOrdererTest {

	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection is empty.
	 */
	@Test
	void testGetTablesOrderedByRI_EmptyCollection() {
		Collection<Table> tables = new ArrayList<Table>();
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(0, orderedTables.size());
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains one table.
	 */
	@Test
	void testGetTablesOrderedByRI_OneTable() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table = new Table("table1");
		tables.add(table);
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(1, orderedTables.size());
		assertEquals(table, orderedTables.get(0));
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains two tables.
	 */
	@Test
	void testGetTablesOrderedByRI_TwoTables() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table1 = new Table("table1");
		Table table2 = new Table("table2");
		tables.add(table1);
		tables.add(table2);
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(2, orderedTables.size());
		assertEquals(table1, orderedTables.get(0));
		assertEquals(table2, orderedTables.get(1));
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains three tables.
	 */
	@Test
	void testGetTablesOrderedByRI_ThreeTables() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table1 = new Table("table1");
		Table table2 = new Table("table2");
		Table table3 = new Table("table3");
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(3, orderedTables.size());
		assertEquals(table1, orderedTables.get(0));
		assertEquals(table2, orderedTables.get(1));
		assertEquals(table3, orderedTables.get(2));
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains three tables and one of them is a child of another.
	 */
	@Test
	void testGetTablesOrderedByRI_ThreeTables_OneChild() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table1 = new Table("table1");
		Table table2 = new Table("table2");
		Table table3 = new Table("table3");
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		table1.addChild(table2);
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(3, orderedTables.size());
		assertEquals(table1, orderedTables.get(0));
		assertEquals(table2, orderedTables.get(1));
		assertEquals(table3, orderedTables.get(2));
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains three tables and one of them is a parent of another.
	 */
	@Test
	void testGetTablesOrderedByRI_ThreeTables_OneParent() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table1 = new Table("table1");
		Table table2 = new Table("table2");
		Table table3 = new Table("table3");
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		table1.addParent(table2);
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(3, orderedTables.size());
		assertEquals(table2, orderedTables.get(0));
		assertEquals(table1, orderedTables.get(1));
		assertEquals(table3, orderedTables.get(2));
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains three tables and one of them is a child of another and the other is a parent of the first.
	 */
	@Test
	void testGetTablesOrderedByRI_ThreeTables_OneChildOneParent() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table1 = new Table("table1");
		Table table2 = new Table("table2");
		Table table3 = new Table("table3");
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		table1.addChild(table2);
		table1.addParent(table2);
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(3, orderedTables.size());
		assertEquals(table2, orderedTables.get(0));
		assertEquals(table1, orderedTables.get(1));
		assertEquals(table3, orderedTables.get(2));
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains three tables and one of them is a child of another and the other is a parent of the first and the third is a child of the second.
	 */
	@Test
	void testGetTablesOrderedByRI_ThreeTables_OneChildOneParentOneChild() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table1 = new Table("table1");
		Table table2 = new Table("table2");
		Table table3 = new Table("table3");
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		table1.addChild(table2);
		table1.addParent(table2);
		table2.addChild(table3);
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(3, orderedTables.size());
		assertEquals(table2, orderedTables.get(0));
		assertEquals(table1, orderedTables.get(1));
		assertEquals(table3, orderedTables.get(2));
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains three tables and one of them is a child of another and the other is a parent of the first and the third is a parent of the second.
	 */
	@Test
	void testGetTablesOrderedByRI_ThreeTables_OneChildOneParentOneParent() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table1 = new Table("table1");
		Table table2 = new Table("table2");
		Table table3 = new Table("table3");
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		table1.addChild(table2);
		table1.addParent(table2);
		table2.addParent(table3);
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(3, orderedTables.size());
		assertEquals(table3, orderedTables.get(0));
		assertEquals(table2, orderedTables.get(1));
		assertEquals(table1, orderedTables.get(2));
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains three tables and one of them is a child of another and the other is a parent of the first and the third is a child of the second and a parent of the first.
	 */
	@Test
	void testGetTablesOrderedByRI_ThreeTables_OneChildOneParentOneChildOneParent() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table1 = new Table("table1");
		Table table2 = new Table("table2");
		Table table3 = new Table("table3");
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		table1.addChild(table2);
		table1.addParent(table2);
		table2.addChild(table3);
		table3.addParent(table1);
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(3, orderedTables.size());
		assertEquals(table2, orderedTables.get(0));
		assertEquals(table3, orderedTables.get(1));
		assertEquals(table1, orderedTables.get(2));
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains three tables and one of them is a child of another and the other is a parent of the first and the third is a child of the second and a parent of the first and the second is a child of the third.
	 */
	@Test
	void testGetTablesOrderedByRI_ThreeTables_OneChildOneParentOneChildOneParentOneChild() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table1 = new Table("table1");
		Table table2 = new Table("table2");
		Table table3 = new Table("table3");
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		table1.addChild(table2);
		table1.addParent(table2);
		table2.addChild(table3);
		table3.addParent(table1);
		table2.addChild(table3);
		Collection<ForeignKeyConstraint> recursiveConstraints = new ArrayList<ForeignKeyConstraint>();
		TableOrderer tableOrderer = new TableOrderer();
		List<Table> orderedTables = tableOrderer.getTablesOrderedByRI(tables, recursiveConstraints);
		assertEquals(3, orderedTables.size());
		assertEquals(table2, orderedTables.get(0));
		assertEquals(table3, orderedTables.get(1));
		assertEquals(table1, orderedTables.get(2));
		assertEquals(0, recursiveConstraints.size());
	}
	
	/**
	 * Test case for {@link TableOrderer#getTablesOrderedByRI(Collection, Collection)} method.
	 * It tests the case when the input collection contains three tables and one of them is a child of another and the other is a parent of the first and the third is a child of the second and a parent of the first and the second is a child of the third and a parent of the first.
	 */
	@Test
	void testGetTablesOrderedByRI_ThreeTables_OneChildOneParentOneChildOneParentOneChildOneParent() {
		Collection<Table> tables = new ArrayList<Table>();
		Table table1 = new Table("table1");
		Table table2 = new Table("table2");
		Table table3 = new Table("table3");
		tables.add(table1);
		tables.add(table2);
		tables.add(table3);
		table1.addChild(table2);
		table1.addParent(table2);
		table2.addChild(table3);
		table3.addParent(table1);
		table2.addChild(table3);
		table2.addParent(table1);
		Collection<ForeignKeyConstraint