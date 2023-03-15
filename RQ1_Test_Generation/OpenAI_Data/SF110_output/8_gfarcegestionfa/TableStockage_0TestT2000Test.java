// TableStockage_0Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.table.AbstractTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TableStockage}.
* It contains ten unit test cases for the {@link TableStockage#getColumnName(int)} method.
*/
class TableStockage_0Test {

	/**
	 * Test case for {@link TableStockage#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value when the column index is 0.
	 */
	@Test
	void testGetColumnName_0() {
		TableStockage tableStockage = new TableStockage();
		String[] nomColonnes = new String[1];
		nomColonnes[0] = "nomColonne";
		tableStockage.setNomColonnes(nomColonnes);
		assertEquals("nomColonne", tableStockage.getColumnName(0));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value when the column index is 1.
	 */
	@Test
	void testGetColumnName_1() {
		TableStockage tableStockage = new TableStockage();
		String[] nomColonnes = new String[2];
		nomColonnes[0] = "nomColonne";
		nomColonnes[1] = "nomColonne";
		tableStockage.setNomColonnes(nomColonnes);
		assertEquals("nomColonne", tableStockage.getColumnName(1));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value when the column index is 2.
	 */
	@Test
	void testGetColumnName_2() {
		TableStockage tableStockage = new TableStockage();
		String[] nomColonnes = new String[3];
		nomColonnes[0] = "nomColonne";
		nomColonnes[1] = "nomColonne";
		nomColonnes[2] = "nomColonne";
		tableStockage.setNomColonnes(nomColonnes);
		assertEquals("nomColonne", tableStockage.getColumnName(2));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value when the column index is 3.
	 */
	@Test
	void testGetColumnName_3() {
		TableStockage tableStockage = new TableStockage();
		String[] nomColonnes = new String[4];
		nomColonnes[0] = "nomColonne";
		nomColonnes[1] = "nomColonne";
		nomColonnes[2] = "nomColonne";
		nomColonnes[3] = "nomColonne";
		tableStockage.setNomColonnes(nomColonnes);
		assertEquals("nomColonne", tableStockage.getColumnName(3));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value when the column index is 4.
	 */
	@Test
	void testGetColumnName_4() {
		TableStockage tableStockage = new TableStockage();
		String[] nomColonnes = new String[5];
		nomColonnes[0] = "nomColonne";
		nomColonnes[1] = "nomColonne";
		nomColonnes[2] = "nomColonne";
		nomColonnes[3] = "nomColonne";
		nomColonnes[4] = "nomColonne";
		tableStockage.setNomColonnes(nomColonnes);
		assertEquals("nomColonne", tableStockage.getColumnName(4));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value when the column index is 5.
	 */
	@Test
	void testGetColumnName_5() {
		TableStockage tableStockage = new TableStockage();
		String[] nomColonnes = new String[6];
		nomColonnes[0] = "nomColonne";
		nomColonnes[1] = "nomColonne";
		nomColonnes[2] = "nomColonne";
		nomColonnes[3] = "nomColonne";
		nomColonnes[4] = "nomColonne";
		nomColonnes[5] = "nomColonne";
		tableStockage.setNomColonnes(nomColonnes);
		assertEquals("nomColonne", tableStockage.getColumnName(5));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value when the column index is 6.
	 */
	@Test
	void testGetColumnName_6() {
		TableStockage tableStockage = new TableStockage();
		String[] nomColonnes = new String[7];
		nomColonnes[0] = "nomColonne";
		nomColonnes[1] = "nomColonne";
		nomColonnes[2] = "nomColonne";
		nomColonnes[3] = "nomColonne";
		nomColonnes[4] = "nomColonne";
		nomColonnes[5] = "nomColonne";
		nomColonnes[6] = "nomColonne";
		tableStockage.setNomColonnes(nomColonnes);
		assertEquals("nomColonne", tableStockage.getColumnName(6));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value when the column index is 7.
	 */
	@Test
	void testGetColumnName_7() {
		TableStockage tableStockage = new TableStockage();
		String[] nomColonnes = new String[8];
		nomColonnes[0] = "nomColonne";
		nomColonnes[1] = "nomColonne";
		nomColonnes[2] = "nomColonne";
		nomColonnes[3] = "nomColonne";
		nomColonnes[4] = "nomColonne";
		nomColonnes[5] = "nomColonne";
		nomColonnes[6] = "nomColonne";
		nomColonnes[7] = "nomColonne";
		tableStockage.setNomColonnes(nomColonnes);
		assertEquals("nomColonne", tableStockage.getColumnName(7));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value when the column index is 8.
	 */
	@Test
	void testGetColumnName_8() {
		TableStockage tableStockage = new TableStockage();
		String[] nomColonnes = new String[9];
		nomColonnes[0] = "nomColonne";
		nomColonnes[1] = "nomColonne";
		nomColonnes[2] = "nomColonne";
		nomColonnes[3] = "nomColonne";
		nomColonnes[4] = "nomColonne";
		nomColonnes[5] = "nomColonne";
		nomColonnes[6] = "nomColonne";
		nomColonnes[7] = "nomColonne";
		nomColonnes[8] = "nomColonne";
		tableStockage.setNomColonnes(nomColonnes);
		assertEquals("nomColonne", tableStockage.getColumnName(8));
	}
	
	/**
	 * Test case for {@link TableStockage#getColumnName(