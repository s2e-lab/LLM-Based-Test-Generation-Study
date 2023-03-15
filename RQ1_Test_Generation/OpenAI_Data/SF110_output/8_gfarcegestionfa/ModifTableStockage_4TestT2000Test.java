// ModifTableStockage_4Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#separerColonne(int)} method.
*/
class ModifTableStockage_4Test {

	/**
	 * Test case for {@link ModifTableStockage#separerColonne(int)} method.
	 * Test data:
	 * <ul>
	 * <li>TableStockage:
	 * <table border="1">
	 * <tr><td>Nom</td><td>Prenom</td><td>Age</td></tr>
	 * <tr><td>Dupont</td><td>Jean</td><td>25</td></tr>
	 * <tr><td>Durand</td><td>Pierre</td><td>30</td></tr>
	 * <tr><td>Dupont</td><td>Jean</td><td>25</td></tr>
	 * <tr><td>Durand</td><td>Pierre</td><td>30</td></tr>
	 * </table>
	 * </li>
	 * <li>indice: 0</li>
	 * </ul>
	 * Expected result:
	 * <ul>
	 * <li>TableStockage:
	 * <table border="1">
	 * <tr><td>Nom</td><td>Prenom</td><td>Age</td></tr>
	 * <tr><td>Dupont</td><td>Jean</td><td>25</td></tr>
	 * <tr><td>Durand</td><td>Pierre</td><td>30</td></tr>
	 * <tr><td>Dupont</td><td>Jean</td><td>25</td></tr>
	 * <tr><td>Durand</td><td>Pierre</td><td>30</td></tr>
	 * </table>
	 * </li>
	 * </ul>
	 */
	@Test
	void testSeparerColonne_1() {
		TableStockage ts = new TableStockage(5, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Age");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(25, 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(30, 1, 2);
		ts.setValueAt("Dupont", 2, 0);
		ts.setValueAt("Jean", 2, 1);
		ts.setValueAt(25, 2, 2);
		ts.setValueAt("Durand", 3, 0);
		ts.setValueAt("Pierre", 3, 1);
		ts.setValueAt(30, 3, 2);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.separerColonne(0);
		assertEquals(ts.getColumnName(0), tableS.getColumnName(0));
		assertEquals(ts.getColumnName(1), tableS.getColumnName(1));
		assertEquals(ts.getColumnName(2), tableS.getColumnName(2));
		assertEquals(ts.getValueAt(0, 0), tableS.getValueAt(0, 0));
		assertEquals(ts.getValueAt(0, 1), tableS.getValueAt(0, 1));
		assertEquals(ts.getValueAt(0, 2), tableS.getValueAt(0, 2));
		assertEquals(ts.getValueAt(1, 0), tableS.getValueAt(1, 0));
		assertEquals(ts.getValueAt(1, 1), tableS.getValueAt(1, 1));
		assertEquals(ts.getValueAt(1, 2), tableS.getValueAt(1, 2));
		assertEquals(ts.getValueAt(2, 0), tableS.getValueAt(2, 0));
		assertEquals(ts.getValueAt(2, 1), tableS.getValueAt(2, 1));
		assertEquals(ts.getValueAt(2, 2), tableS.getValueAt(2, 2));
		assertEquals(ts.getValueAt(3, 0), tableS.getValueAt(3, 0));
		assertEquals(ts.getValueAt(3, 1), tableS.getValueAt(3, 1));
		assertEquals(ts.getValueAt(3, 2), tableS.getValueAt(3, 2));
	}
	
	/**
	 * Test case for {@link ModifTableStockage#separerColonne(int)} method.
	 * Test data:
	 * <ul>
	 * <li>TableStockage:
	 * <table border="1">
	 * <tr><td>Nom</td><td>Prenom</td><td>Age</td></tr>
	 * <tr><td>Dupont</td><td>Jean</td><td>25</td></tr>
	 * <tr><td>Durand</td><td>Pierre</td><td>30</td></tr>
	 * <tr><td>Dupont</td><td>Jean</td><td>25</td></tr>
	 * <tr><td>Durand</td><td>Pierre</td><td>30</td></tr>
	 * </table>
	 * </li>
	 * <li>indice: 1</li>
	 * </ul>
	 * Expected result:
	 * <ul>
	 * <li>TableStockage:
	 * <table border="1">
	 * <tr><td>Nom</td><td>Prenom</td><td>Age</td></tr>
	 * <tr><td>Dupont</td><td>Jean</td><td>25</td></tr>
	 * <tr><td>Durand</td><td>Pierre</td><td>30</td></tr>
	 * <tr><td>Dupont</td><td>Jean</td><td>25</td></tr>
	 * <tr><td>Durand</td><td>Pierre</td><td>30</td></tr>
	 * </table>
	 * </li>
	 * </ul>
	 */
	@Test
	void testSeparerColonne_2() {
		TableStockage ts = new TableStockage(5, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Age");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(25, 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(30, 1, 2);
		ts.setValueAt("Dupont", 2, 0);
		ts.setValueAt("Jean", 2, 1);
		ts.setValueAt(25, 2, 2);
		ts.setValueAt("Durand", 3, 0);
		ts.setValueAt("Pierre", 3, 1);
		ts.setValueAt(30, 3, 2);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage tableS = mt.separerColonne(1);
		assertEquals(ts.getColumnName(0), tableS.getColumnName(0));
		assertEquals(ts.getColumnName(1), tableS.getColumnName(1));
		assertEquals(ts.getColumnName(2), tableS.getColumnName(2));
		assertEquals(ts.getValueAt(0, 0), tableS.getValueAt(0, 0));
		assertEquals(ts.getValueAt(0, 1), tableS.getValueAt(0, 1));
		assertEquals(ts.getValueAt(