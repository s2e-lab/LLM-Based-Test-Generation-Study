// ModifTableStockage_0Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#ajouterColonne(String, Class)} method.
*/
class ModifTableStockage_0Test {

	/**
	 * Test case for the {@link ModifTableStockage#ajouterColonne(String, Class)} method.
	 * It tests the case where the table is empty.
	 */
	@Test
	void testAjouterColonne_0() {
		TableStockage ts = new TableStockage(0, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterColonne("Nom", String.class);
		assertEquals(1, tableS.getColumnCount());
		assertEquals(1, tableS.getRowCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals(String.class, tableS.getColumnClass(0));
		assertEquals(null, tableS.getValueAt(0, 0));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#ajouterColonne(String, Class)} method.
	 * It tests the case where the table has one column.
	 */
	@Test
	void testAjouterColonne_1() {
		TableStockage ts = new TableStockage(1, 1);
		ts.setColumnName(0, "Nom");
		ts.setValueAt("Jean", 0, 0);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterColonne("Prenom", String.class);
		assertEquals(2, tableS.getColumnCount());
		assertEquals(1, tableS.getRowCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.getColumnName(1));
		assertEquals(String.class, tableS.getColumnClass(0));
		assertEquals(String.class, tableS.getColumnClass(1));
		assertEquals("Jean", tableS.getValueAt(0, 0));
		assertEquals(null, tableS.getValueAt(0, 1));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#ajouterColonne(String, Class)} method.
	 * It tests the case where the table has two columns.
	 */
	@Test
	void testAjouterColonne_2() {
		TableStockage ts = new TableStockage(1, 2);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setValueAt("Jean", 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterColonne("Age", Integer.class);
		assertEquals(3, tableS.getColumnCount());
		assertEquals(1, tableS.getRowCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.getColumnName(1));
		assertEquals("Age", tableS.getColumnName(2));
		assertEquals(String.class, tableS.getColumnClass(0));
		assertEquals(String.class, tableS.getColumnClass(1));
		assertEquals(Integer.class, tableS.getColumnClass(2));
		assertEquals("Jean", tableS.getValueAt(0, 0));
		assertEquals("Dupont", tableS.getValueAt(0, 1));
		assertEquals(null, tableS.getValueAt(0, 2));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#ajouterColonne(String, Class)} method.
	 * It tests the case where the table has three columns.
	 */
	@Test
	void testAjouterColonne_3() {
		TableStockage ts = new TableStockage(1, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Age");
		ts.setValueAt("Jean", 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(new Integer(20), 0, 2);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterColonne("Adresse", String.class);
		assertEquals(4, tableS.getColumnCount());
		assertEquals(1, tableS.getRowCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.getColumnName(1));
		assertEquals("Age", tableS.getColumnName(2));
		assertEquals("Adresse", tableS.getColumnName(3));
		assertEquals(String.class, tableS.getColumnClass(0));
		assertEquals(String.class, tableS.getColumnClass(1));
		assertEquals(Integer.class, tableS.getColumnClass(2));
		assertEquals(String.class, tableS.getColumnClass(3));
		assertEquals("Jean", tableS.getValueAt(0, 0));
		assertEquals("Dupont", tableS.getValueAt(0, 1));
		assertEquals(new Integer(20), tableS.getValueAt(0, 2));
		assertEquals(null, tableS.getValueAt(0, 3));
	}
	
	/**
	 * Test case for the {@link ModifTableStockage#ajouterColonne(String, Class)} method.
	 * It tests the case where the table has four columns.
	 */
	@Test
	void testAjouterColonne_4() {
		TableStockage ts = new TableStockage(1, 4);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Age");
		ts.setColumnName(3, "Adresse");
		ts.setValueAt("Jean", 0, 0);
		ts.setValueAt("Dupont", 0, 1);
		ts.setValueAt(new Integer(20), 0, 2);
		ts.setValueAt("1 rue de la paix", 0, 3);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.ajouterColonne("Telephone", String.class);
		assertEquals(5, tableS.getColumnCount());
		assertEquals(1, tableS.getRowCount());
		assertEquals("Nom", tableS.getColumnName(0));
		assertEquals("Prenom", tableS.getColumnName(1));
		assertEquals("Age", tableS.getColumnName(2));
		assertEquals("Adresse", tableS.getColumnName(3));
		assertEquals("Telephone", tableS.getColumnName(4));
		assertEquals(String.class, tableS.getColumnClass(0));
		assertEquals(String.class, tableS.getColumnClass(1));
		assertEquals(Integer.class, tableS.getColumnClass(2));
		assertEquals(String.class, tableS.getColumnClass(3));
		assertEquals(String.class, tableS.getColumnClass(4));
		assertEquals("Jean", tableS.getValueAt(0, 0));
		assertEquals("Dupont", tableS.getValueAt(0, 1));
		assertEquals(new Integer(20), tableS.getValueAt(0, 2));
		assertEquals("1 rue de la paix", tableS.getValueAt(0, 3