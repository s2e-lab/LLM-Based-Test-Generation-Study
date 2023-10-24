// ModifTableStockage_0Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#ajouterLigne()} method.
*/
class ModifTableStockage_0Test {

    /**
     * Test of {@link ModifTableStockage#ajouterLigne()}
     * with a table with 3 columns and 2 rows.
     */
    @Test
    void testAjouterLigne_0() {
        TableStockage ts = new TableStockage(2, 3);
        ts.setColumnName(0, "col1");
        ts.setColumnName(1, "col2");
        ts.setColumnName(2, "col3");
        ts.setValueAt("val1", 0, 0);
        ts.setValueAt("val2", 0, 1);
        ts.setValueAt("val3", 0, 2);
        ts.setValueAt("val4", 1, 0);
        ts.setValueAt("val5", 1, 1);
        ts.setValueAt("val6", 1, 2);
        ModifTableStockage modifTS = new ModifTableStockage();
        TableStockage ts2 = modifTS.ajouterLigne();
        assertEquals(3, ts2.getColumnCount());
        assertEquals(3, ts2.getRowCount());
        assertEquals("col1", ts2.getColumnName(0));
        assertEquals("col2", ts2.getColumnName(1));
        assertEquals("col3", ts2.getColumnName(2));
        assertEquals("val1", ts2.getValueAt(0, 0));
        assertEquals("val2", ts2.getValueAt(0, 1));
        assertEquals("val3", ts2.getValueAt(0, 2));
        assertEquals("val4", ts2.getValueAt(1, 0));
        assertEquals("val5", ts2.getValueAt(1, 1));
        assertEquals("val6", ts2.getValueAt(1, 2));
        assertEquals(null, ts2.getValueAt(2, 0));
        assertEquals(null, ts2.getValueAt(2, 1));
        assertEquals(null, ts2.getValueAt(2, 2));
    }

    /**
     * Test of {@link ModifTableStockage#ajouterLigne()}
     * with a table with 3 columns and 1 row.
     */
    @Test
    void testAjouterLigne_1() {
        TableStockage ts = new TableStockage(1, 3);
        ts.setColumnName(0, "col1");
        ts.setColumnName(1, "col2");
        ts.setColumnName(2, "col3");
        ts.setValueAt("val1", 0, 0);
        ts.setValueAt("val2", 0, 1);
        ts.setValueAt("val3", 0, 2);
        ModifTableStockage modifTS = new ModifTableStockage();
        TableStockage ts2 = modifTS.ajouterLigne();
        assertEquals(3, ts2.getColumnCount());
        assertEquals(2, ts2.getRowCount());
        assertEquals("col1", ts2.getColumnName(0));
        assertEquals("col2", ts2.getColumnName(1));
        assertEquals("col3", ts2.getColumnName(2));
        assertEquals("val1", ts2.getValueAt(0, 0));
        assertEquals("val2", ts2.getValueAt(0, 1));
        assertEquals("val3", ts2.getValueAt(0, 2));
        assertEquals(null, ts2.getValueAt(1, 0));
        assertEquals(null, ts2.getValueAt(1, 1));
        assertEquals(null, ts2.getValueAt(1, 2));
    }

    /**
     * Test of {@link ModifTableStockage#ajouterLigne()}
     * with a table with 3 columns and 0 row.
     */
    @Test
    void testAjouterLigne_2() {
        TableStockage ts = new TableStockage(0, 3);
        ts.setColumnName(0, "col1");
        ts.setColumnName(1, "col2");
        ts.setColumnName(2, "col3");
        ModifTableStockage modifTS = new ModifTableStockage();
        TableStockage ts2 = modifTS.ajouterLigne();
        assertEquals(3, ts2.getColumnCount());
        assertEquals(1, ts2.getRowCount());
        assertEquals("col1", ts2.getColumnName(0));
        assertEquals("col2", ts2.getColumnName(1));
        assertEquals("col3", ts2.getColumnName(2));
        assertEquals(null, ts2.getValueAt(0, 0));
        assertEquals(null, ts2.getValueAt(0, 1));
        assertEquals(null, ts2.getValueAt(0, 2));
    }

    /**
     * Test of {@link ModifTableStockage#ajouterLigne()}
     * with a table with 0 columns and 0 row.
     */
    @Test
    void testAjouterLigne_3() {
        TableStockage ts = new TableStockage(0, 0);
        ModifTableStockage modifTS = new ModifTableStockage();
        TableStockage ts2 = modifTS.ajouterLigne();
        assertEquals(0, ts2.getColumnCount());
        assertEquals(1, ts2.getRowCount());
        assertEquals(null, ts2.getColumnName(0));
        assertEquals(null, ts2.getValueAt(0, 0));
    }

    /**
     * Test of {@link ModifTableStockage#ajouterLigne()}
     * with a table with 0 columns and 1 row.
     */
    @Test
    void testAjouterLigne_4() {
        TableStockage ts = new TableStockage(1, 0);
        ts.setValueAt("val1", 0, 0);
        ModifTableStockage modifTS = new ModifTableStockage();
        TableStockage ts2 = modifTS.ajouterLigne();
        assertEquals(0, ts2.getColumnCount());
        assertEquals(2, ts2.getRowCount());
        assertEquals(null, ts2.getColumnName(0));
        assertEquals(null, ts2.getValueAt(0, 0));
        assertEquals("val1", ts2.getValueAt(1, 0));
    }

    /**
     * Test of {@link ModifTableStockage#ajouterLigne()}
     * with a table with 0 columns and 2 rows.
     */
    @Test
    void testAjouterLigne_5() {
        TableStockage ts = new TableStockage(2, 0);
        ts.setValueAt("val1", 0, 0);
        ts.setValueAt("val2", 1, 0);
        ModifTableStockage modifTS = new ModifTableStockage();
        TableStockage ts2 = modifTS.ajouterLigne();
        assertEquals(0, ts2.getColumnCount());
        assertEquals(3, ts2.getRowCount());
        assertEquals(null, ts2.getColumnName(0));
        assertEquals(null, ts2.getValueAt(0, 0));
        assertEquals("val1", ts2.getValueAt(1, 0));
        assertEquals("val2", ts2.getValueAt(2, 0));
    }

    /**
     * Test of {@link ModifTableStockage#ajouterLigne()}
     * with a table with 0 columns and 3 rows.
     */
    @Test
    void testAjouterLigne_6() {
        TableStockage ts = new TableStockage(3, 0);
        ts.setValueAt("val1", 0, 0);
        ts.setValueAt("val2", 1, 0);
        ts.setValueAt("val3", 2, 0);
        ModifTableStockage modifTS = new ModifTableStockage();
        TableStockage ts2 = modifTS.ajouterLigne();
        assertEquals(0, ts2.getColumnCount());
        assertEquals(4, ts2.getRowCount());
        assertEquals(null, ts2.getColumnName(0));
        assertEquals(null, ts2.getValueAt(0, 0));
        assertEquals("val1", ts2.getValueAt(1, 0));
        assertEquals("val2", ts2.getValueAt(2, 0));
        assertEquals("val3", ts2.getValueAt(3, 0));
    }

    /**
     * Test of {@link ModifTableStockage#ajouterLigne()}
     * with a table with 0 columns and 4 rows.
     */
    @Test
    void testAjouterLigne_7() {
        TableStockage ts = new TableStockage(4, 0);
        ts.setValueAt("val1", 0, 0);
        ts.setValueAt("val2", 1, 0);
        ts.setValueAt("val3", 2, 0);
        ts.setValueAt("val4", 3, 0);
        ModifTableStockage modifTS = new ModifTableStockage();
        TableStockage ts2 = modifTS.ajouterLigne();
        assertEquals(0, ts2.getColumnCount());
        assertEquals(