// PersistentTableColumnModel_2Test.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PersistentTableColumnModel}.
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
*/
class PersistentTableColumnModel_2Test {

	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an empty iterator if the table column model is empty.
	*/
	@Test
	public void testGetColumns_1() {
		PersistentTableColumnModel tableColumnModel = new PersistentTableColumnModel();
		Iterator<TableColumn> iterator = tableColumnModel.getColumns(true);
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with one element if the table column model contains one column.
	*/
	@Test
	public void testGetColumns_2() {
		PersistentTableColumnModel tableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn = new TableColumn();
		tableColumnModel.addColumn(tableColumn);
		Iterator<TableColumn> iterator = tableColumnModel.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn, iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with two elements if the table column model contains two columns.
	*/
	@Test
	public void testGetColumns_3() {
		PersistentTableColumnModel tableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		tableColumnModel.addColumn(tableColumn1);
		tableColumnModel.addColumn(tableColumn2);
		Iterator<TableColumn> iterator = tableColumnModel.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn1, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn2, iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with three elements if the table column model contains three columns.
	*/
	@Test
	public void testGetColumns_4() {
		PersistentTableColumnModel tableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		TableColumn tableColumn3 = new TableColumn();
		tableColumnModel.addColumn(tableColumn1);
		tableColumnModel.addColumn(tableColumn2);
		tableColumnModel.addColumn(tableColumn3);
		Iterator<TableColumn> iterator = tableColumnModel.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn1, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn2, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn3, iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with four elements if the table column model contains four columns.
	*/
	@Test
	public void testGetColumns_5() {
		PersistentTableColumnModel tableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		TableColumn tableColumn3 = new TableColumn();
		TableColumn tableColumn4 = new TableColumn();
		tableColumnModel.addColumn(tableColumn1);
		tableColumnModel.addColumn(tableColumn2);
		tableColumnModel.addColumn(tableColumn3);
		tableColumnModel.addColumn(tableColumn4);
		Iterator<TableColumn> iterator = tableColumnModel.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn1, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn2, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn3, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn4, iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with five elements if the table column model contains five columns.
	*/
	@Test
	public void testGetColumns_6() {
		PersistentTableColumnModel tableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		TableColumn tableColumn3 = new TableColumn();
		TableColumn tableColumn4 = new TableColumn();
		TableColumn tableColumn5 = new TableColumn();
		tableColumnModel.addColumn(tableColumn1);
		tableColumnModel.addColumn(tableColumn2);
		tableColumnModel.addColumn(tableColumn3);
		tableColumnModel.addColumn(tableColumn4);
		tableColumnModel.addColumn(tableColumn5);
		Iterator<TableColumn> iterator = tableColumnModel.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn1, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn2, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn3, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn4, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn5, iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests if the method returns an iterator with six elements if the table column model contains six columns.
	*/
	@Test
	public void testGetColumns_7() {
		PersistentTableColumnModel tableColumnModel = new PersistentTableColumnModel();
		TableColumn tableColumn1 = new TableColumn();
		TableColumn tableColumn2 = new TableColumn();
		TableColumn tableColumn3 = new TableColumn();
		TableColumn tableColumn4 = new TableColumn();
		TableColumn tableColumn5 = new TableColumn();
		TableColumn tableColumn6 = new TableColumn();
		tableColumnModel.addColumn(tableColumn1);
		tableColumnModel.addColumn(tableColumn2);
		tableColumnModel.addColumn(tableColumn3);
		tableColumnModel.addColumn(tableColumn4);
		tableColumnModel.addColumn(tableColumn5);
		tableColumnModel.addColumn(tableColumn6);
		Iterator<TableColumn> iterator = tableColumnModel.getColumns(true);
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn1, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn2, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn3, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn4, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn5, iterator.next());
		assertTrue(iterator.hasNext());
		assertEquals(tableColumn6, iterator.next());
		assertFalse(iterator.hasNext());
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)}