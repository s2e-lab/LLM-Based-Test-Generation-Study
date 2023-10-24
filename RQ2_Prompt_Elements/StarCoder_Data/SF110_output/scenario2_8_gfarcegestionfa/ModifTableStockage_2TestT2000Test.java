// ModifTableStockage_2Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#selectMail()} method.
*/
class ModifTableStockage_2Test {

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the case where the E-Mail column does not exist.
     */
    @Test
    void selectMail_1() {
        TableStockage ts = new TableStockage(10, 10);
        ModifTableStockage modifTableStockage = new ModifTableStockage();
        TableStockage tableS = modifTableStockage.selectMail();
        assertEquals(ts, tableS);
    }

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the case where the E-Mail column exists but is empty.
     */
    @Test
    void selectMail_2() {
        TableStockage ts = new TableStockage(10, 10);
        ts.setColumnName(0, "Envoyer E-Mail a:");
        ModifTableStockage modifTableStockage = new ModifTableStockage();
        TableStockage tableS = modifTableStockage.selectMail();
        assertEquals(ts, tableS);
    }

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the case where the E-Mail column exists and is not empty.
     */
    @Test
    void selectMail_3() {
        TableStockage ts = new TableStockage(10, 10);
        ts.setColumnName(0, "Envoyer E-Mail a:");
        ts.setValueAt(true, 0, 0);
        ModifTableStockage modifTableStockage = new ModifTableStockage();
        TableStockage tableS = modifTableStockage.selectMail();
        assertEquals(ts, tableS);
    }

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the case where the E-Mail column exists and is not empty.
     */
    @Test
    void selectMail_4() {
        TableStockage ts = new TableStockage(10, 10);
        ts.setColumnName(0, "Envoyer E-Mail a:");
        ts.setValueAt(true, 0, 0);
        ts.setValueAt(false, 1, 0);
        ModifTableStockage modifTableStockage = new ModifTableStockage();
        TableStockage tableS = modifTableStockage.selectMail();
        assertEquals(ts, tableS);
    }

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the case where the E-Mail column exists and is not empty.
     */
    @Test
    void selectMail_5() {
        TableStockage ts = new TableStockage(10, 10);
        ts.setColumnName(0, "Envoyer E-Mail a:");
        ts.setValueAt(true, 0, 0);
        ts.setValueAt(false, 1, 0);
        ts.setValueAt(true, 2, 0);
        ModifTableStockage modifTableStockage = new ModifTableStockage();
        TableStockage tableS = modifTableStockage.selectMail();
        assertEquals(ts, tableS);
    }

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the case where the E-Mail column exists and is not empty.
     */
    @Test
    void selectMail_6() {
        TableStockage ts = new TableStockage(10, 10);
        ts.setColumnName(0, "Envoyer E-Mail a:");
        ts.setValueAt(true, 0, 0);
        ts.setValueAt(false, 1, 0);
        ts.setValueAt(true, 2, 0);
        ts.setValueAt(false, 3, 0);
        ModifTableStockage modifTableStockage = new ModifTableStockage();
        TableStockage tableS = modifTableStockage.selectMail();
        assertEquals(ts, tableS);
    }

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the case where the E-Mail column exists and is not empty.
     */
    @Test
    void selectMail_7() {
        TableStockage ts = new TableStockage(10, 10);
        ts.setColumnName(0, "Envoyer E-Mail a:");
        ts.setValueAt(true, 0, 0);
        ts.setValueAt(false, 1, 0);
        ts.setValueAt(true, 2, 0);
        ts.setValueAt(false, 3, 0);
        ts.setValueAt(true, 4, 0);
        ModifTableStockage modifTableStockage = new ModifTableStockage();
        TableStockage tableS = modifTableStockage.selectMail();
        assertEquals(ts, tableS);
    }

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the case where the E-Mail column exists and is not empty.
     */
    @Test
    void selectMail_8() {
        TableStockage ts = new TableStockage(10, 10);
        ts.setColumnName(0, "Envoyer E-Mail a:");
        ts.setValueAt(true, 0, 0);
        ts.setValueAt(false, 1, 0);
        ts.setValueAt(true, 2, 0);
        ts.setValueAt(false, 3, 0);
        ts.setValueAt(true, 4, 0);
        ts.setValueAt(false, 5, 0);
        ModifTableStockage modifTableStockage = new ModifTableStockage();
        TableStockage tableS = modifTableStockage.selectMail();
        assertEquals(ts, tableS);
    }

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the case where the E-Mail column exists and is not empty.
     */
    @Test
    void selectMail_9() {
        TableStockage ts = new TableStockage(10, 10);
        ts.setColumnName(0, "Envoyer E-Mail a:");
        ts.setValueAt(true, 0, 0);
        ts.setValueAt(false, 1, 0);
        ts.setValueAt(true, 2, 0);
        ts.setValueAt(false, 3, 0);
        ts.setValueAt(true, 4, 0);
        ts.setValueAt(false, 5, 0);
        ts.setValueAt(true, 6, 0);
        ModifTableStockage modifTableStockage = new ModifTableStockage();
        TableStockage tableS = modifTableStockage.selectMail();
        assertEquals(ts, tableS);
    }

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the case where the E-Mail column exists and is not empty.
     */
    @Test
    void selectMail_10() {
        TableStockage ts = new TableStockage(10, 10);
        ts.setColumnName(0, "Envoyer E-Mail a:");
        ts.setValueAt(true, 0, 0);
        ts.setValueAt(false, 1, 0);
        ts.setValueAt(true, 2, 0);
        ts.setValueAt(false, 3, 0);
        ts.setValueAt(true, 4, 0);
        ts.setValueAt(false, 5, 0);
        ts.setValueAt(true, 6, 0);
        ts.setValueAt(false, 7, 0);
        ModifTableStockage modifTableStockage = new ModifTableStockage();
        TableStockage tableS = modifTableStockage.selectMail();
        assertEquals(ts, tableS);
    }
}
