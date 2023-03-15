// ModifTableStockage_2Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#supprimerColonne(int)} method.
*/
class ModifTableStockage_2Test {

	/**
	* Test case for the {@link ModifTableStockage#supprimerColonne(int)} method.
	* It tests if the method returns the expected TableStockage when the given index is 0.
	*/
	@Test
	void testSupprimerColonne_0() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setValueAt("valeur1", 0, 0);
		ts.setValueAt("valeur2", 0, 1);
		ts.setValueAt("valeur3", 1, 0);
		ts.setValueAt("valeur4", 1, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage ts2 = mt.supprimerColonne(0);
		assertEquals(ts2.getColumnName(0), "colonne2");
		assertEquals(ts2.getValueAt(0, 0), "valeur2");
		assertEquals(ts2.getValueAt(1, 0), "valeur4");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerColonne(int)} method.
	* It tests if the method returns the expected TableStockage when the given index is 1.
	*/
	@Test
	void testSupprimerColonne_1() {
		TableStockage ts = new TableStockage(2, 2);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setValueAt("valeur1", 0, 0);
		ts.setValueAt("valeur2", 0, 1);
		ts.setValueAt("valeur3", 1, 0);
		ts.setValueAt("valeur4", 1, 1);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage ts2 = mt.supprimerColonne(1);
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getValueAt(0, 0), "valeur1");
		assertEquals(ts2.getValueAt(1, 0), "valeur3");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerColonne(int)} method.
	* It tests if the method returns the expected TableStockage when the given index is 2.
	*/
	@Test
	void testSupprimerColonne_2() {
		TableStockage ts = new TableStockage(2, 3);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ts.setValueAt("valeur1", 0, 0);
		ts.setValueAt("valeur2", 0, 1);
		ts.setValueAt("valeur3", 0, 2);
		ts.setValueAt("valeur4", 1, 0);
		ts.setValueAt("valeur5", 1, 1);
		ts.setValueAt("valeur6", 1, 2);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage ts2 = mt.supprimerColonne(2);
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getValueAt(0, 0), "valeur1");
		assertEquals(ts2.getValueAt(0, 1), "valeur2");
		assertEquals(ts2.getValueAt(1, 0), "valeur4");
		assertEquals(ts2.getValueAt(1, 1), "valeur5");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerColonne(int)} method.
	* It tests if the method returns the expected TableStockage when the given index is 3.
	*/
	@Test
	void testSupprimerColonne_3() {
		TableStockage ts = new TableStockage(2, 4);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ts.setColumnName(3, "colonne4");
		ts.setValueAt("valeur1", 0, 0);
		ts.setValueAt("valeur2", 0, 1);
		ts.setValueAt("valeur3", 0, 2);
		ts.setValueAt("valeur4", 0, 3);
		ts.setValueAt("valeur5", 1, 0);
		ts.setValueAt("valeur6", 1, 1);
		ts.setValueAt("valeur7", 1, 2);
		ts.setValueAt("valeur8", 1, 3);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage ts2 = mt.supprimerColonne(3);
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getColumnName(2), "colonne3");
		assertEquals(ts2.getValueAt(0, 0), "valeur1");
		assertEquals(ts2.getValueAt(0, 1), "valeur2");
		assertEquals(ts2.getValueAt(0, 2), "valeur3");
		assertEquals(ts2.getValueAt(1, 0), "valeur5");
		assertEquals(ts2.getValueAt(1, 1), "valeur6");
		assertEquals(ts2.getValueAt(1, 2), "valeur7");
	}
	
	/**
	* Test case for the {@link ModifTableStockage#supprimerColonne(int)} method.
	* It tests if the method returns the expected TableStockage when the given index is 4.
	*/
	@Test
	void testSupprimerColonne_4() {
		TableStockage ts = new TableStockage(2, 5);
		ts.setColumnName(0, "colonne1");
		ts.setColumnName(1, "colonne2");
		ts.setColumnName(2, "colonne3");
		ts.setColumnName(3, "colonne4");
		ts.setColumnName(4, "colonne5");
		ts.setValueAt("valeur1", 0, 0);
		ts.setValueAt("valeur2", 0, 1);
		ts.setValueAt("valeur3", 0, 2);
		ts.setValueAt("valeur4", 0, 3);
		ts.setValueAt("valeur5", 0, 4);
		ts.setValueAt("valeur6", 1, 0);
		ts.setValueAt("valeur7", 1, 1);
		ts.setValueAt("valeur8", 1, 2);
		ts.setValueAt("valeur9", 1, 3);
		ts.setValueAt("valeur10", 1, 4);
		ModifTableStockage mt = new ModifTableStockage(ts);
		TableStockage ts2 = mt.supprimerColonne(4);
		assertEquals(ts2.getColumnName(0), "colonne1");
		assertEquals(ts2.getColumnName(1), "colonne2");
		assertEquals(ts2.getColumnName(2), "colonne3");
		assertEquals(ts2.getColumnName(3), "colonne4");
	