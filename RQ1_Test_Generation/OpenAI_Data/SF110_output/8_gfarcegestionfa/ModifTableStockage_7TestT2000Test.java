// ModifTableStockage_7Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#selectMail()} method.
*/
class ModifTableStockage_7Test {

	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one column.
	*/
	@Test
	void testSelectMail_1() {
		TableStockage ts = new TableStockage(2, 1);
		ts.setColumnName(0, "Nom");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(2, tableS.getRowCount());
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Elsa", tableS.getValueAt(0, 0));
		assertEquals("Rol", tableS.getValueAt(1, 0));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one column and one row.
	*/
	@Test
	void testSelectMail_2() {
		TableStockage ts = new TableStockage(1, 1);
		ts.setColumnName(0, "Nom");
		ts.setValueAt("Elsa", 0, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(1, tableS.getRowCount());
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Elsa", tableS.getValueAt(0, 0));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one column and no row.
	*/
	@Test
	void testSelectMail_3() {
		TableStockage ts = new TableStockage(0, 1);
		ts.setColumnName(0, "Nom");
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(0, tableS.getRowCount());
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one column and no row.
	*/
	@Test
	void testSelectMail_4() {
		TableStockage ts = new TableStockage(2, 1);
		ts.setColumnName(0, "Nom");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(2, tableS.getRowCount());
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Elsa", tableS.getValueAt(0, 0));
		assertEquals("Rol", tableS.getValueAt(1, 0));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one column and no row.
	*/
	@Test
	void testSelectMail_5() {
		TableStockage ts = new TableStockage(2, 1);
		ts.setColumnName(0, "Nom");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(2, tableS.getRowCount());
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Elsa", tableS.getValueAt(0, 0));
		assertEquals("Rol", tableS.getValueAt(1, 0));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one column and no row.
	*/
	@Test
	void testSelectMail_6() {
		TableStockage ts = new TableStockage(2, 1);
		ts.setColumnName(0, "Nom");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(2, tableS.getRowCount());
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Elsa", tableS.getValueAt(0, 0));
		assertEquals("Rol", tableS.getValueAt(1, 0));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one column and no row.
	*/
	@Test
	void testSelectMail_7() {
		TableStockage ts = new TableStockage(2, 1);
		ts.setColumnName(0, "Nom");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(2, tableS.getRowCount());
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Elsa", tableS.getValueAt(0, 0));
		assertEquals("Rol", tableS.getValueAt(1, 0));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one column and no row.
	*/
	@Test
	void testSelectMail_8() {
		TableStockage ts = new TableStockage(2, 1);
		ts.setColumnName(0, "Nom");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.selectMail();
		assertEquals(2, tableS.getRowCount());
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Elsa", tableS.getValueAt(0, 0));
		assertEquals("Rol", tableS.getValueAt(1, 0));
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* It tests the case where the table contains only one column and no row.
	*/
	@Test
	void testSelectMail_9() {
		TableStockage ts = new TableStockage(2, 1);
		ts.setColumnName(0,