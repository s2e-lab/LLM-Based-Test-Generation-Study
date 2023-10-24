// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_1Test {

    private TableStockage ts;
    private int nbLignes;
    private int nbColonnes;

    /**
    * Default constructor.
    */
    public ModifTableStockage_1Test() {
        this.ts = new TableStockage(10, 10);
        this.nbLignes = 10;
        this.nbColonnes = 10;
    }

    /**
    * Test case for the {@link ModifTableStockage#colonneMail()} method.
    */
    @Test
    public void testColonneMail() {
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        assertEquals(tableS.getValueAt(0, 0), "Envoyer E-Mail a:");
        assertEquals(tableS.getValueAt(0, 1), "Valeur");
        assertEquals(tableS.getValueAt(0, 2), "Valeur");
        assertEquals(tableS.getValueAt(0, 3), "Valeur");
        assertEquals(tableS.getValueAt(0, 4), "Valeur");
        assertEquals(tableS.getValueAt(0, 5), "Valeur");
        assertEquals(tableS.getValueAt(0, 6), "Valeur");
        assertEquals(tableS.getValueAt(0, 7), "Valeur");
        assertEquals(tableS.getValueAt(0, 8), "Valeur");
        assertEquals(tableS.getValueAt(0, 9), "Valeur");
        assertEquals(tableS.getValueAt(1, 0), "Valeur");
        assertEquals(tableS.getValueAt(1, 1), "Valeur");
        assertEquals(tableS.getValueAt(1, 2), "Valeur");
        assertEquals(tableS.getValueAt(1, 3), "Valeur");
        assertEquals(tableS.getValueAt(1, 4), "Valeur");
        assertEquals(tableS.getValueAt(1, 5), "Valeur");
        assertEquals(tableS.getValueAt(1, 6), "Valeur");
        assertEquals(tableS.getValueAt(1, 7), "Valeur");
        assertEquals(tableS.getValueAt(1, 8), "Valeur");
        assertEquals(tableS.getValueAt(1, 9), "Valeur");
        assertEquals(tableS.getValueAt(2, 0), "Valeur");
        assertEquals(tableS.getValueAt(2, 1), "Valeur");
        assertEquals(tableS.getValueAt(2, 2), "Valeur");
        assertEquals(tableS.getValueAt(2, 3), "Valeur");
        assertEquals(tableS.getValueAt(2, 4), "Valeur");
        assertEquals(tableS.getValueAt(2, 5), "Valeur");
        assertEquals(tableS.getValueAt(2, 6), "Valeur");
        assertEquals(tableS.getValueAt(2, 7), "Valeur");
        assertEquals(tableS.getValueAt(2, 8), "Valeur");
        assertEquals(tableS.getValueAt(2, 9), "Valeur");
        assertEquals(tableS.getValueAt(3, 0), "Valeur");
        assertEquals(tableS.getValueAt(3, 1), "Valeur");
        assertEquals(tableS.getValueAt(3, 2), "Valeur");
        assertEquals(tableS.getValueAt(3, 3), "Valeur");
        assertEquals(tableS.getValueAt(3, 4), "Valeur");
        assertEquals(tableS.getValueAt(3, 5), "Valeur");
        assertEquals(tableS.getValueAt(3, 6), "Valeur");
        assertEquals(tableS.getValueAt(3, 7), "Valeur");
        assertEquals(tableS.getValueAt(3, 8), "Valeur");
        assertEquals(tableS.getValueAt(3, 9), "Valeur");
        assertEquals(tableS.getValueAt(4, 0), "Valeur");
        assertEquals(tableS.getValueAt(4, 1), "Valeur");
        assertEquals(tableS.getValueAt(4, 2), "Valeur");
        assertEquals(tableS.getValueAt(4, 3), "Valeur");
        assertEquals(tableS.getValueAt(4, 4), "Valeur");
        assertEquals(tableS.getValueAt(4, 5), "Valeur");
        assertEquals(tableS.getValueAt(4, 6), "Valeur");
        assertEquals(tableS.getValueAt(4, 7), "Valeur");
        assertEquals(tableS.getValueAt(4, 8), "Valeur");
        assertEquals(tableS.getValueAt(4, 9), "Valeur");
        assertEquals(tableS.getValueAt(5, 0), "Valeur");
        assertEquals(tableS.getValueAt(5, 1), "Valeur");
        assertEquals(tableS.getValueAt(5, 2), "Valeur");
        assertEquals(tableS.getValueAt(5, 3), "Valeur");
        assertEquals(tableS.getValueAt(5, 4), "Valeur");
        assertEquals(tableS.getValueAt(5, 5), "Valeur");
        assertEquals(tableS.getValueAt(5, 6), "Valeur");
        assertEquals(tableS.getValueAt(5, 7), "Valeur");
        assertEquals(tableS.getValueAt(5, 8), "Valeur");
        assertEquals(tableS.getValueAt(5, 9), "Valeur");
        assertEquals(tableS.getValueAt(6, 0), "Valeur");
        assertEquals(tableS.getValueAt(6, 1), "Valeur");
        assertEquals(tableS.getValueAt(6, 2), "Valeur");
        assertEquals(tableS.getValueAt(6, 3), "Valeur");
        assertEquals(tableS.getValueAt(6, 4), "Valeur");
        assertEquals(tableS.getValueAt(6, 5), "Valeur");
        assertEquals(tableS.getValueAt(6, 6), "Valeur");
        assertEquals(tableS.getValueAt(6, 7), "Valeur");
        assertEquals(tableS.getValueAt(6, 8), "Valeur");
        assertEquals(tableS.getValueAt(6, 9), "Valeur");
        assertEquals(tableS.getValueAt(7, 0), "Valeur");
        assertEquals(tableS.getValueAt(7, 1), "Valeur");
        assertEquals(tableS.getValueAt(7, 2), "Valeur");
        assertEquals(tableS.getValueAt(7, 3), "Valeur");
        assertEquals(tableS.getValueAt(7, 4), "Valeur");
        assertEquals(tableS.getValueAt(7, 5), "Valeur");
        assertEquals(tableS.getValueAt(7, 6), "Valeur");
        assertEquals(tableS.getValueAt(7, 7), "Valeur");
        assertEquals(tableS.getValueAt(7, 8), "Valeur");
        assertEquals(tableS.getValueAt(7, 9), "Valeur");
        assertEquals(tableS.getValueAt(8, 0), "Valeur");
        assertEquals(tableS.getValueAt(8, 1), "Valeur");
        assertEquals(tableS.getValueAt(8, 2), "Valeur");
        assertEquals(tableS.getValueAt(8, 3), "Valeur");
        assertEquals(tableS.getValueAt(8, 4), "Valeur");
        assertEquals(tableS.getValueAt(8, 5), "Valeur");
        assertEquals(tableS.getValueAt(8, 6), "Valeur");
        assertEquals(tableS.getValueAt(8, 7), "Valeur");
        assertEquals(tableS.getValueAt(8, 8), "Valeur");
        assertEquals(tableS.getValueAt(8, 9), "Valeur");
        assertEquals(tableS.getValueAt(9, 0), "Valeur");
        assertEquals(tableS.getValueAt(9, 1), "Valeur");
        assertEquals(tableS.getValueAt(9, 2), "Valeur");
        assertEquals(tableS.getValueAt(9, 3), "Valeur");
        assertEquals(tableS.getValueAt(9, 4), "Valeur");
        assertEquals(tableS.getValueAt(9, 5), "Valeur");
        assertEquals(tableS.getValueAt(9, 6), "Valeur");
        assertEquals