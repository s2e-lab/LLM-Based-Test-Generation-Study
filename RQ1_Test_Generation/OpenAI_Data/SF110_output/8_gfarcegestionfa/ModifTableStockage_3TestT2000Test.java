// ModifTableStockage_3Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#supprimerLigne(int)} method.
*/
class ModifTableStockage_3Test {

		/**
		 * Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
		 * It tests if the method returns the expected TableStockage.
		 */
		@Test
		void testSupprimerLigne() {
				TableStockage ts = new TableStockage(3, 3);
				ts.setColumnName(0, "Nom");
				ts.setColumnName(1, "Prenom");
				ts.setColumnName(2, "Age");
				ts.setValueAt("Dupont", 0, 0);
				ts.setValueAt("Jean", 0, 1);
				ts.setValueAt(new Integer(20), 0, 2);
				ts.setValueAt("Durand", 1, 0);
				ts.setValueAt("Pierre", 1, 1);
				ts.setValueAt(new Integer(30), 1, 2);
				ts.setValueAt("Martin", 2, 0);
				ts.setValueAt("Paul", 2, 1);
				ts.setValueAt(new Integer(40), 2, 2);
				ModifTableStockage mt = new ModifTableStockage(ts);
				TableStockage ts2 = mt.supprimerLigne(1);
				assertEquals(ts2.getValueAt(0, 0), "Dupont");
				assertEquals(ts2.getValueAt(0, 1), "Jean");
				assertEquals(ts2.getValueAt(0, 2), new Integer(20));
				assertEquals(ts2.getValueAt(1, 0), "Martin");
				assertEquals(ts2.getValueAt(1, 1), "Paul");
				assertEquals(ts2.getValueAt(1, 2), new Integer(40));
		}
		
		/**
		 * Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
		 * It tests if the method returns the expected TableStockage.
		 */
		@Test
		void testSupprimerLigne2() {
				TableStockage ts = new TableStockage(3, 3);
				ts.setColumnName(0, "Nom");
				ts.setColumnName(1, "Prenom");
				ts.setColumnName(2, "Age");
				ts.setValueAt("Dupont", 0, 0);
				ts.setValueAt("Jean", 0, 1);
				ts.setValueAt(new Integer(20), 0, 2);
				ts.setValueAt("Durand", 1, 0);
				ts.setValueAt("Pierre", 1, 1);
				ts.setValueAt(new Integer(30), 1, 2);
				ts.setValueAt("Martin", 2, 0);
				ts.setValueAt("Paul", 2, 1);
				ts.setValueAt(new Integer(40), 2, 2);
				ModifTableStockage mt = new ModifTableStockage(ts);
				TableStockage ts2 = mt.supprimerLigne(0);
				assertEquals(ts2.getValueAt(0, 0), "Durand");
				assertEquals(ts2.getValueAt(0, 1), "Pierre");
				assertEquals(ts2.getValueAt(0, 2), new Integer(30));
				assertEquals(ts2.getValueAt(1, 0), "Martin");
				assertEquals(ts2.getValueAt(1, 1), "Paul");
				assertEquals(ts2.getValueAt(1, 2), new Integer(40));
		}
		
		/**
		 * Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
		 * It tests if the method returns the expected TableStockage.
		 */
		@Test
		void testSupprimerLigne3() {
				TableStockage ts = new TableStockage(3, 3);
				ts.setColumnName(0, "Nom");
				ts.setColumnName(1, "Prenom");
				ts.setColumnName(2, "Age");
				ts.setValueAt("Dupont", 0, 0);
				ts.setValueAt("Jean", 0, 1);
				ts.setValueAt(new Integer(20), 0, 2);
				ts.setValueAt("Durand", 1, 0);
				ts.setValueAt("Pierre", 1, 1);
				ts.setValueAt(new Integer(30), 1, 2);
				ts.setValueAt("Martin", 2, 0);
				ts.setValueAt("Paul", 2, 1);
				ts.setValueAt(new Integer(40), 2, 2);
				ModifTableStockage mt = new ModifTableStockage(ts);
				TableStockage ts2 = mt.supprimerLigne(2);
				assertEquals(ts2.getValueAt(0, 0), "Dupont");
				assertEquals(ts2.getValueAt(0, 1), "Jean");
				assertEquals(ts2.getValueAt(0, 2), new Integer(20));
				assertEquals(ts2.getValueAt(1, 0), "Durand");
				assertEquals(ts2.getValueAt(1, 1), "Pierre");
				assertEquals(ts2.getValueAt(1, 2), new Integer(30));
		}
		
		/**
		 * Test case for the {@link ModifTableStockage#supprimerLigne(int)} method.
		 * It tests if the method returns the expected TableStockage.
		 */
		@Test
		void testSupprimerLigne4() {
				TableStockage ts = new TableStockage(3, 3);
				ts.setColumnName(0, "Nom");
				ts.setColumnName(1, "Prenom");
				ts.setColumnName(2, "Age");
				ts.setValueAt("Dupont", 0, 0);
				ts.setValueAt("Jean", 0, 1);
				ts.setValueAt(new Integer(20), 0, 2);
				ts.setValueAt("Durand", 1, 0);
				ts.setValueAt("Pierre", 1, 1);
				ts.setValueAt(new Integer(30), 1, 2);
				ts.setValueAt("Martin", 2, 0);
				ts.setValueAt("Paul", 2, 1);
				ts.setValueAt(new Integer(40), 2, 2);
				ModifTableStockage mt = new ModifTableStockage(ts);
				TableStockage ts2 = mt.supprimerLigne(1);
				assertEquals(ts2.getValueAt(0, 0), "Dupont");
				assertEquals(ts2.getValueAt(0, 1), "Jean");
				assertEquals(ts2.getValueAt(0, 2), new Integer(20));
				assertEquals(ts2.getValueAt(1, 0), "Martin");
				assertEquals(ts2.getValueAt(1, 1), "Paul");
				assertEquals(ts2.getValueAt(1, 2), new Integer(40));
		}
		
		/**
		 * Test case for the {