// ModifTableStockage_5Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#fusionnerColonnes(int)} method.
*/
class ModifTableStockage_5Test {

	/**
	 * Test case for the {@link ModifTableStockage#fusionnerColonnes(int)} method.
	 * It tests the method with a table with one column.
	 */
	@Test
	void testFusionnerColonnes_1() {
		TableStockage ts = new TableStockage(2, 1);
		ts.setColumnName(0, "Nom");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.fusionnerColonnes(0);
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Elsa", tableS.getValueAt(0, 0));
		assertEquals("Rol", tableS.getValueAt(1, 0));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#fusionnerColonnes(int)} method.
	 * It tests the method with a table with two columns.
	 */
	@Test
	void testFusionnerColonnes_2() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ts.setValueAt("Rol", 0, 1);
		ts.setValueAt("Elsa", 1, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.fusionnerColonnes(0);
		assertEquals(1, tableS.getColumnCount());
		assertEquals("Nom Prenom", tableS.getColumnName(0));
		assertEquals("Elsa Rol", tableS.getValueAt(0, 0));
		assertEquals("Rol Elsa", tableS.getValueAt(1, 0));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#fusionnerColonnes(int)} method.
	 * It tests the method with a table with three columns.
	 */
	@Test
	void testFusionnerColonnes_3() {
		TableStockage ts = new TableStockage(2, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Age");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ts.setValueAt("Rol", 0, 1);
		ts.setValueAt("Elsa", 1, 1);
		ts.setValueAt("20", 0, 2);
		ts.setValueAt("20", 1, 2);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.fusionnerColonnes(0);
		assertEquals(2, tableS.getColumnCount());
		assertEquals("Nom Prenom", tableS.getColumnName(0));
		assertEquals("Age", tableS.getColumnName(1));
		assertEquals("Elsa Rol", tableS.getValueAt(0, 0));
		assertEquals("Rol Elsa", tableS.getValueAt(1, 0));
		assertEquals("20", tableS.getValueAt(0, 1));
		assertEquals("20", tableS.getValueAt(1, 1));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#fusionnerColonnes(int)} method.
	 * It tests the method with a table with four columns.
	 */
	@Test
	void testFusionnerColonnes_4() {
		TableStockage ts = new TableStockage(2, 4);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Age");
		ts.setColumnName(3, "Sexe");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ts.setValueAt("Rol", 0, 1);
		ts.setValueAt("Elsa", 1, 1);
		ts.setValueAt("20", 0, 2);
		ts.setValueAt("20", 1, 2);
		ts.setValueAt("F", 0, 3);
		ts.setValueAt("F", 1, 3);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.fusionnerColonnes(0);
		assertEquals(3, tableS.getColumnCount());
		assertEquals("Nom Prenom", tableS.getColumnName(0));
		assertEquals("Age", tableS.getColumnName(1));
		assertEquals("Sexe", tableS.getColumnName(2));
		assertEquals("Elsa Rol", tableS.getValueAt(0, 0));
		assertEquals("Rol Elsa", tableS.getValueAt(1, 0));
		assertEquals("20", tableS.getValueAt(0, 1));
		assertEquals("20", tableS.getValueAt(1, 1));
		assertEquals("F", tableS.getValueAt(0, 2));
		assertEquals("F", tableS.getValueAt(1, 2));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#fusionnerColonnes(int)} method.
	 * It tests the method with a table with five columns.
	 */
	@Test
	void testFusionnerColonnes_5() {
		TableStockage ts = new TableStockage(2, 5);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Age");
		ts.setColumnName(3, "Sexe");
		ts.setColumnName(4, "Adresse");
		ts.setValueAt("Elsa", 0, 0);
		ts.setValueAt("Rol", 1, 0);
		ts.setValueAt("Rol", 0, 1);
		ts.setValueAt("Elsa", 1, 1);
		ts.setValueAt("20", 0, 2);
		ts.setValueAt("20", 1, 2);
		ts.setValueAt("F", 0, 3);
		ts.setValueAt("F", 1, 3);
		ts.setValueAt("Nice", 0, 4);
		ts.setValueAt("Nice", 1, 4);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.fusionnerColonnes(0);
		assertEquals(4, tableS.getColumnCount());
		assertEquals("Nom Prenom", tableS.getColumnName(0));
		assertEquals("Age", tableS.getColumnName(1));
		assertEquals("Sexe", tableS.getColumnName(2));
		assertEquals("Adresse", tableS.getColumnName(3));
		assertEquals("Elsa Rol", tableS.getValueAt(0, 0));
		assertEquals("Rol Elsa", tableS.getValueAt(1, 0));
		assertEquals("20", tableS.getValueAt(0, 1));
		assertEquals("20", tableS.getValueAt(1, 1));
		assertEquals("F", tableS.get