// TableStockage_3Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.table.AbstractTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableStockage}.
* It contains ten unit test cases for the {@link TableStockage#isCellEditable(int, int)} method.
*/
class TableStockage_3Test {

	/**
	* Test case for the {@link TableStockage#isCellEditable(int, int)} method.
	* This test case is used to check if the method returns true when the rowIndex is 0 and the columnIndex is 0.
	*/
	@Test
	void testIsCellEditable_1() {
		TableStockage tableStockage = new TableStockage();
		assertTrue(tableStockage.isCellEditable(0, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#isCellEditable(int, int)} method.
	* This test case is used to check if the method returns true when the rowIndex is 0 and the columnIndex is 1.
	*/
	@Test
	void testIsCellEditable_2() {
		TableStockage tableStockage = new TableStockage();
		assertTrue(tableStockage.isCellEditable(0, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#isCellEditable(int, int)} method.
	* This test case is used to check if the method returns true when the rowIndex is 1 and the columnIndex is 0.
	*/
	@Test
	void testIsCellEditable_3() {
		TableStockage tableStockage = new TableStockage();
		assertTrue(tableStockage.isCellEditable(1, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#isCellEditable(int, int)} method.
	* This test case is used to check if the method returns true when the rowIndex is 1 and the columnIndex is 1.
	*/
	@Test
	void testIsCellEditable_4() {
		TableStockage tableStockage = new TableStockage();
		assertTrue(tableStockage.isCellEditable(1, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#isCellEditable(int, int)} method.
	* This test case is used to check if the method returns true when the rowIndex is 2 and the columnIndex is 0.
	*/
	@Test
	void testIsCellEditable_5() {
		TableStockage tableStockage = new TableStockage();
		assertTrue(tableStockage.isCellEditable(2, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#isCellEditable(int, int)} method.
	* This test case is used to check if the method returns true when the rowIndex is 2 and the columnIndex is 1.
	*/
	@Test
	void testIsCellEditable_6() {
		TableStockage tableStockage = new TableStockage();
		assertTrue(tableStockage.isCellEditable(2, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#isCellEditable(int, int)} method.
	* This test case is used to check if the method returns true when the rowIndex is 3 and the columnIndex is 0.
	*/
	@Test
	void testIsCellEditable_7() {
		TableStockage tableStockage = new TableStockage();
		assertTrue(tableStockage.isCellEditable(3, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#isCellEditable(int, int)} method.
	* This test case is used to check if the method returns true when the rowIndex is 3 and the columnIndex is 1.
	*/
	@Test
	void testIsCellEditable_8() {
		TableStockage tableStockage = new TableStockage();
		assertTrue(tableStockage.isCellEditable(3, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#isCellEditable(int, int)} method.
	* This test case is used to check if the method returns true when the rowIndex is 4 and the columnIndex is 0.
	*/
	@Test
	void testIsCellEditable_9() {
		TableStockage tableStockage = new TableStockage();
		assertTrue(tableStockage.isCellEditable(4, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#isCellEditable(int, int)} method.
	* This test case is used to check if the method returns true when the rowIndex is 4 and the columnIndex is 1.
	*/
	@Test
	void testIsCellEditable_10() {
		TableStockage tableStockage = new TableStockage();
		assertTrue(tableStockage.isCellEditable(4, 1));
	}
}

// TableStockage_4Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.table.AbstractTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableStockage}.
* It contains ten unit test cases for the {@link TableStockage#setValueAt(Object, int, int)} method.
*/
class TableStockage_4Test {
		
	/**
	* Test case for the {@link TableStockage#setValueAt(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 0 and the columnIndex 0.
	*/
	@Test
	void testSetValueAt_1() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.setValueAt("test", 0, 0);
		assertEquals("test", tableStockage.getValueAt(0, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#setValueAt(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 0 and the columnIndex 1.
	*/
	@Test
	void testSetValueAt_2() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.setValueAt("test", 0, 1);
		assertEquals("test", tableStockage.getValueAt(0, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#setValueAt(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 1 and the columnIndex 0.
	*/
	@Test
	void testSetValueAt_3() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.setValueAt("test", 1, 0);
		assertEquals("test", tableStockage.getValueAt(1, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#setValueAt(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 1 and the columnIndex 1.
	*/
	@Test
	void testSetValueAt_4() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.setValueAt("test", 1, 1);
		assertEquals("test", tableStockage.getValueAt(1, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#setValueAt(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 2 and the columnIndex 0.
	*/
	@Test
	void testSetValueAt_5() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.setValueAt("test", 2, 0);
		assertEquals("test", tableStockage.getValueAt(2, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#setValueAt(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 2 and the columnIndex 1.
	*/
	@Test
	void testSetValueAt_6() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.setValueAt("test", 2, 1);
		assertEquals("test", tableStockage.getValueAt(2, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#setValueAt(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 3 and the columnIndex 0.
	*/
	@Test
	void testSetValueAt_7() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.setValueAt("test", 3, 0);
		assertEquals("test", tableStockage.getValueAt(3, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#setValueAt(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 3 and the columnIndex 1.
	*/
	@Test
	void testSetValueAt_8() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.setValueAt("test", 3, 1);
		assertEquals("test", tableStockage.getValueAt(3, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#setValueAt(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 4 and the columnIndex 0.
	*/
	@Test
	void testSetValueAt_9() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.setValueAt("test", 4, 0);
		assertEquals("test", tableStockage.getValueAt(4, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#setValueAt(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 4 and the columnIndex 1.
	*/
	@Test
	void testSetValueAt_10() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.setValueAt("test", 4, 1);
		assertEquals("test", tableStockage.getValueAt(4, 1));
	}
}

// TableStockage_5Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.table.AbstractTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableStockage}.
* It contains ten unit test cases for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
*/
class TableStockage_5Test {
		
	/**
	* Test case for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 0 and the columnIndex 0.
	*/
	@Test
	void testRemplirMatrice_1() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.remplirMatrice("test", 0, 0);
		assertEquals("test", tableStockage.getColumnName(0));
	}
	
	/**
	* Test case for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 0 and the columnIndex 1.
	*/
	@Test
	void testRemplirMatrice_2() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.remplirMatrice("test", 0, 1);
		assertEquals("test", tableStockage.getColumnName(1));
	}
	
	/**
	* Test case for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 1 and the columnIndex 0.
	*/
	@Test
	void testRemplirMatrice_3() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.remplirMatrice("test", 1, 0);
		assertEquals("test", tableStockage.getValueAt(0, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 1 and the columnIndex 1.
	*/
	@Test
	void testRemplirMatrice_4() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.remplirMatrice("test", 1, 1);
		assertEquals("test", tableStockage.getValueAt(0, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 2 and the columnIndex 0.
	*/
	@Test
	void testRemplirMatrice_5() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.remplirMatrice("test", 2, 0);
		assertEquals("test", tableStockage.getValueAt(1, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 2 and the columnIndex 1.
	*/
	@Test
	void testRemplirMatrice_6() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.remplirMatrice("test", 2, 1);
		assertEquals("test", tableStockage.getValueAt(1, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 3 and the columnIndex 0.
	*/
	@Test
	void testRemplirMatrice_7() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.remplirMatrice("test", 3, 0);
		assertEquals("test", tableStockage.getValueAt(2, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 3 and the columnIndex 1.
	*/
	@Test
	void testRemplirMatrice_8() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.remplirMatrice("test", 3, 1);
		assertEquals("test", tableStockage.getValueAt(2, 1));
	}
	
	/**
	* Test case for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
	* This test case is used to check if the method sets the value at the rowIndex 4 and the columnIndex 0.
	*/
	@Test
	void testRemplirMatrice_9() {
		TableStockage tableStockage = new TableStockage();
		tableStockage.remplirMatrice("test", 4, 0);
		assertEquals("test", tableStockage.getValueAt(3, 0));
	}
	
	/**
	* Test case for the {@link TableStockage#remplirMatrice(Object, int, int)} method.
	* This test case is used to