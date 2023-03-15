// TableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.table.AbstractTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableStockage}.
* It contains ten unit test cases for the {@link TableStockage#getColumnClass(int)} method.
*/
class TableStockage_1Test {

	/**
	 * Test case for {@link TableStockage#getColumnClass(int)}
	 * <p>
	 * Test if the method returns the correct class for a column.
	 * </p>
	 */
	@Test
	void testGetColumnClass_1() {
		TableStockage table = new TableStockage(2, 2);
		table.setValueAt("test", 0, 0);
		table.setValueAt(true, 0, 1);
		table.setValueAt(1.0, 1, 0);
		table.setValueAt(1.0, 1, 1);
		assertEquals(String.class, table.getColumnClass(0));
		assertEquals(Boolean.class, table.getColumnClass(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnClass(int)}
	 * <p>
	 * Test if the method returns the correct class for a column.
	 * </p>
	 */
	@Test
	void testGetColumnClass_2() {
		TableStockage table = new TableStockage(2, 2);
		table.setValueAt("test", 0, 0);
		table.setValueAt(true, 0, 1);
		table.setValueAt(1.0, 1, 0);
		table.setValueAt(1.0, 1, 1);
		assertEquals(String.class, table.getColumnClass(0));
		assertEquals(Boolean.class, table.getColumnClass(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnClass(int)}
	 * <p>
	 * Test if the method returns the correct class for a column.
	 * </p>
	 */
	@Test
	void testGetColumnClass_3() {
		TableStockage table = new TableStockage(2, 2);
		table.setValueAt("test", 0, 0);
		table.setValueAt(true, 0, 1);
		table.setValueAt(1.0, 1, 0);
		table.setValueAt(1.0, 1, 1);
		assertEquals(String.class, table.getColumnClass(0));
		assertEquals(Boolean.class, table.getColumnClass(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnClass(int)}
	 * <p>
	 * Test if the method returns the correct class for a column.
	 * </p>
	 */
	@Test
	void testGetColumnClass_4() {
		TableStockage table = new TableStockage(2, 2);
		table.setValueAt("test", 0, 0);
		table.setValueAt(true, 0, 1);
		table.setValueAt(1.0, 1, 0);
		table.setValueAt(1.0, 1, 1);
		assertEquals(String.class, table.getColumnClass(0));
		assertEquals(Boolean.class, table.getColumnClass(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnClass(int)}
	 * <p>
	 * Test if the method returns the correct class for a column.
	 * </p>
	 */
	@Test
	void testGetColumnClass_5() {
		TableStockage table = new TableStockage(2, 2);
		table.setValueAt("test", 0, 0);
		table.setValueAt(true, 0, 1);
		table.setValueAt(1.0, 1, 0);
		table.setValueAt(1.0, 1, 1);
		assertEquals(String.class, table.getColumnClass(0));
		assertEquals(Boolean.class, table.getColumnClass(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnClass(int)}
	 * <p>
	 * Test if the method returns the correct class for a column.
	 * </p>
	 */
	@Test
	void testGetColumnClass_6() {
		TableStockage table = new TableStockage(2, 2);
		table.setValueAt("test", 0, 0);
		table.setValueAt(true, 0, 1);
		table.setValueAt(1.0, 1, 0);
		table.setValueAt(1.0, 1, 1);
		assertEquals(String.class, table.getColumnClass(0));
		assertEquals(Boolean.class, table.getColumnClass(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnClass(int)}
	 * <p>
	 * Test if the method returns the correct class for a column.
	 * </p>
	 */
	@Test
	void testGetColumnClass_7() {
		TableStockage table = new TableStockage(2, 2);
		table.setValueAt("test", 0, 0);
		table.setValueAt(true, 0, 1);
		table.setValueAt(1.0, 1, 0);
		table.setValueAt(1.0, 1, 1);
		assertEquals(String.class, table.getColumnClass(0));
		assertEquals(Boolean.class, table.getColumnClass(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnClass(int)}
	 * <p>
	 * Test if the method returns the correct class for a column.
	 * </p>
	 */
	@Test
	void testGetColumnClass_8() {
		TableStockage table = new TableStockage(2, 2);
		table.setValueAt("test", 0, 0);
		table.setValueAt(true, 0, 1);
		table.setValueAt(1.0, 1, 0);
		table.setValueAt(1.0, 1, 1);
		assertEquals(String.class, table.getColumnClass(0));
		assertEquals(Boolean.class, table.getColumnClass(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnClass(int)}
	 * <p>
	 * Test if the method returns the correct class for a column.
	 * </p>
	 */
	@Test
	void testGetColumnClass_9() {
		TableStockage table = new TableStockage(2, 2);
		table.setValueAt("test", 0, 0);
		table.setValueAt(true, 0, 1);
		table.setValueAt(1.0, 1, 0);
		table.setValueAt(1.0, 1, 1);
		assertEquals(String.class, table.getColumnClass(0));
		assertEquals(Boolean.class, table.getColumnClass(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnClass(int)}
	 * <p>
	 * Test if the method returns the correct class for a column.
	 * </p>
	 */
	@Test
	void testGetColumnClass_10() {
		TableStockage table = new TableStockage(2, 2);
		table.setValueAt("test", 0, 0);
		table.setValueAt(true, 0, 1);
		table.setValueAt(1.0, 1, 0);
		table.setValueAt(1.0, 1, 1);
		assertEquals(String.class, table.getColumnClass(0));
		assertEquals(Boolean.class, table.getColumnClass(1));
	}
}

// TableStockage_2Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.table.AbstractTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableStockage}.
* It contains ten unit test cases for the {@link TableStockage#getColumnName(int)} method.
*/
class TableStockage_2Test {
		
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}
	 * <p>
	 * Test if the method returns the correct name for a column.
	 * </p>
	 */
	@Test
	void testGetColumnName_1() {
		TableStockage table = new TableStockage(2, 2);
		table.setColumnName(0, "test");
		table.setColumnName(1, "test2");
		assertEquals("test", table.getColumnName(0));
		assertEquals("test2", table.getColumnName(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}
	 * <p>
	 * Test if the method returns the correct name for a column.
	 * </p>
	 */
	@Test
	void testGetColumnName_2() {
		TableStockage table = new TableStockage(2, 2);
		table.setColumnName(0, "test");
		table.setColumnName(1, "test2");
		assertEquals("test", table.getColumnName(0));
		assertEquals("test2", table.getColumnName(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}
	 * <p>
	 * Test if the method returns the correct name for a column.
	 * </p>
	 */
	@Test
	void testGetColumnName_3() {
		TableStockage table = new TableStockage(2, 2);
		table.setColumnName(0, "test");
		table.setColumnName(1, "test2");
		assertEquals("test", table.getColumnName(0));
		assertEquals("test2", table.getColumnName(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}
	 * <p>
	 * Test if the method returns the correct name for a column.
	 * </p>
	 */
	@Test
	void testGetColumnName_4() {
		TableStockage table = new TableStockage(2, 2);
		table.setColumnName(0, "test");
		table.setColumnName(1, "test2");
		assertEquals("test", table.getColumnName(0));
		assertEquals("test2", table.getColumnName(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}
	 * <p>
	 * Test if the method returns the correct name for a column.
	 * </p>
	 */
	@Test
	void testGetColumnName_5() {
		TableStockage table = new TableStockage(2, 2);
		table.setColumnName(0, "test");
		table.setColumnName(1, "test2");
		assertEquals("test", table.getColumnName(0));
		assertEquals("test2", table.getColumnName(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}
	 * <p>
	 * Test if the method returns the correct name for a column.
	 * </p>
	 */
	@Test
	void testGetColumnName_6() {
		TableStockage table = new TableStockage(2, 2);
		table.setColumnName(0, "test");
		table.setColumnName(1, "test2");
		assertEquals("test", table.getColumnName(0));
		assertEquals("test2", table.getColumnName(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}
	 * <p>
	 * Test if the method returns the correct name for a column.
	 * </p>
	 */
	@Test
	void testGetColumnName_7() {
		TableStockage table = new TableStockage(2, 2);
		table.setColumnName(0, "test");
		table.setColumnName(1, "test2");
		assertEquals("test", table.getColumnName(0));
		assertEquals("test2", table.getColumnName(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}
	 * <p>
	 * Test if the method returns the correct name for a column.
	 * </p>
	 */
	@Test
	void testGetColumnName_8() {
		TableStockage table = new TableStockage(2, 2);
		table.setColumnName(0, "test");
		table.setColumnName(1, "test2");
		assertEquals("test", table.getColumnName(0));
		assertEquals("test2", table.getColumnName(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}
	 * <p>
	 * Test if the method returns the correct name for a column.
	 * </p>
	 */
	@Test
	void testGetColumnName_9() {
		TableStockage table = new TableStockage(2, 2);
		table.setColumnName(0, "test");
		table.setColumnName(1, "test2");
		assertEquals("test", table.getColumnName(0));
		assertEquals("test2", table.getColumnName(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}
	 * <p>
	 * Test if the method returns the correct name for a column.
	 * </p>
	 */
	@Test
	void testGetColumnName_10() {
		TableStockage table = new TableStockage(2, 2);
		table.setColumnName(0, "test");
		table.setColumnName(1, "test2");
		assertEquals("test", table.getColumnName(0));
		assertEquals("test2", table.getColumnName(1));
	}
}

// TableStockage_3Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.table.AbstractTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableStockage}.
* It contains ten unit test cases for the {@link TableStockage#getRowCount()} method.
*/
class TableStockage_3Test {
		
	/**
	 * Test case for {@link TableStockage#getRowCount()}
	 * <p>
	 * Test if the method returns the correct number of rows.
	 * </p>
	 */
	@Test
	void testGetRowCount_1() {
		TableStockage table = new TableStockage(2, 2);
		assertEquals(1, table.getRowCount());
	}
	
	/**
	 * Test case for {@link TableStockage#getRowCount()}
	 * <p>
	 * Test if the method returns the correct number of rows.
	 * </p>
	 */
	@Test
	void testGetRowCount_2() {
		TableStockage table = new TableStockage(2, 2);
		assertEquals(1, table.getRowCount());
	}
	
	/**
	 * Test case for {@link TableStockage#getRowCount()}
	 * <p>
	 * Test if the method returns the correct number of rows.
	 * </p>
	 */
	@Test
	void testGetRowCount_3() {
		TableStockage table = new TableStockage(2, 2);
		assertEquals(1, table.getRow