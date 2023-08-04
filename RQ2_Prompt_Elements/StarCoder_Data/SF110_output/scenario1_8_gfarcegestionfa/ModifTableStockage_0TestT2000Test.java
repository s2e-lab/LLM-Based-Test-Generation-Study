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

    @Test
    void testAjouterLigne() {
        // test 1
        TableStockage ts = new TableStockage(1, 1);
        ts.setColumnName(0, "test");
        ts.setValueAt("test", 0, 0);
        ModifTableStockage modifTS = new ModifTableStockage(ts);
        TableStockage ts2 = modifTS.ajouterLigne();
        assertEquals(2, ts2.getRowCount());
        assertEquals(1, ts2.getColumnCount());
        assertEquals("test", ts2.getColumnName(0));
        assertEquals("test", ts2.getValueAt(0, 0));
        assertEquals(null, ts2.getValueAt(1, 0));
        // test 2
        ts = new TableStockage(1, 2);
        ts.setColumnName(0, "test");
        ts.setColumnName(1, "test2");
        ts.setValueAt("test", 0, 0);
        ts.setValueAt("test2", 0, 1);
        modifTS = new ModifTableStockage(ts);
        ts2 = modifTS.ajouterLigne();
        assertEquals(2, ts2.getRowCount());
        assertEquals(2, ts2.getColumnCount());
        assertEquals("test", ts2.getColumnName(0));
        assertEquals("test2", ts2.getColumnName(1));
        assertEquals("test", ts2.getValueAt(0, 0));
        assertEquals("test2", ts2.getValueAt(0, 1));
        assertEquals(null, ts2.getValueAt(1, 0));
        assertEquals(null, ts2.getValueAt(1, 1));
        // test 3
        ts = new TableStockage(1, 2);
        ts.setColumnName(0, "test");
        ts.setColumnName(1, "test2");
        ts.setValueAt("test", 0, 0);
        ts.setValueAt("test2", 0, 1);
        modifTS = new ModifTableStockage(ts);
        ts2 = modifTS.ajouterLigne();
        assertEquals(2, ts2.getRowCount());
        assertEquals(2, ts2.getColumnCount());
        assertEquals("test", ts2.getColumnName(0));
        assertEquals("test2", ts2.getColumnName(1));
        assertEquals("test", ts2.getValueAt(0, 0));
        assertEquals("test2", ts2.getValueAt(0, 1));
        assertEquals(null, ts2.getValueAt(1, 0));
        assertEquals(null, ts2.getValueAt(1, 1));
        // test 4
        ts = new TableStockage(1, 2);
        ts.setColumnName(0, "test");
        ts.setColumnName(1, "test2");
        ts.setValueAt("test", 0, 0);
        ts.setValueAt("test2", 0, 1);
        modifTS = new ModifTableStockage(ts);
        ts2 = modifTS.ajouterLigne();
        assertEquals(2, ts2.getRowCount());
        assertEquals(2, ts2.getColumnCount());
        assertEquals("test", ts2.getColumnName(0));
        assertEquals("test2", ts2.getColumnName(1));
        assertEquals("test", ts2.getValueAt(0, 0));
        assertEquals("test2", ts2.getValueAt(0, 1));
        assertEquals(null, ts2.getValueAt(1, 0));
        assertEquals(null, ts2.getValueAt(1, 1));
        // test 5
        ts = new TableStockage(1, 2);
        ts.setColumnName(0, "test");
        ts.setColumnName(1, "test2");
        ts.setValueAt("test", 0, 0);
        ts.setValueAt("test2", 0, 1);
        modifTS = new ModifTableStockage(ts);
        ts2 = modifTS.ajouterLigne();
        assertEquals(2, ts2.getRowCount());
        assertEquals(2, ts2.getColumnCount());
        assertEquals("test", ts2.getColumnName(0));
        assertEquals("test2", ts2.getColumnName(1));
        assertEquals("test", ts2.getValueAt(0, 0));
        assertEquals("test2", ts2.getValueAt(0, 1));
        assertEquals(null, ts2.getValueAt(1, 0));
        assertEquals(null, ts2.getValueAt(1, 1));
        // test 6
        ts = new TableStockage(1, 2);
        ts.setColumnName(0, "test");
        ts.setColumnName(1, "test2");
        ts.setValueAt("test", 0, 0);
        ts.setValueAt("test2", 0, 1);
        modifTS = new ModifTableStockage(ts);
        ts2 = modifTS.ajouterLigne();
        assertEquals(2, ts2.getRowCount());
        assertEquals(2, ts2.getColumnCount());
        assertEquals("test", ts2.getColumnName(0));
        assertEquals("test2", ts2.getColumnName(1));
        assertEquals("test", ts2.getValueAt(0, 0));
        assertEquals("test2", ts2.getValueAt(0, 1));
        assertEquals(null, ts2.getValueAt(1, 0));
        assertEquals(null, ts2.getValueAt(1, 1));
        // test 7
        ts = new TableStockage(1, 2);
        ts.setColumnName(0, "test");
        ts.setColumnName(1, "test2");
        ts.setValueAt("test", 0, 0);
        ts.setValueAt("test2", 0, 1);
        modifTS = new ModifTableStockage(ts);
        ts2 = modifTS.ajouterLigne();
        assertEquals(2, ts2.getRowCount());
        assertEquals(2, ts2.getColumnCount());
        assertEquals("test", ts2.getColumnName(0));
        assertEquals("test2", ts2.getColumnName(1));
        assertEquals("test", ts2.getValueAt(0, 0));
        assertEquals("test2", ts2.getValueAt(0, 1));
        assertEquals(null, ts2.getValueAt(1, 0));
        assertEquals(null, ts2.getValueAt(1, 1));
        // test 8
        ts = new TableStockage(1, 2);
        ts.setColumnName(0, "test");
        ts.setColumnName(1, "test2");
        ts.setValueAt("test", 0, 0);
        ts.setValueAt("test2", 0, 1);
        modifTS = new ModifTableStockage(ts);
        ts2 = modifTS.ajouterLigne();
        assertEquals(2, ts2.getRowCount());
        assertEquals(2, ts2.getColumnCount());
        assertEquals("test", ts2.getColumnName(0));
        assertEquals("test2", ts2.getColumnName(1));
        assertEquals("test", ts2.getValueAt(0, 0));
        assertEquals("test2", ts2.getValueAt(0, 1));
        assertEquals(null, ts2.getValueAt(1, 0));
        assertEquals(null, ts2.getValueAt(1, 1));
        // test 9
        ts = new TableStockage(1, 2);
        ts.setColumnName(0, "test");
        ts.setColumnName(1, "test2");
        ts.setValueAt("test", 0, 0);
        ts.setValueAt("test2", 0, 1);
        modifTS = new ModifTableStockage(ts);
        ts2 = modifTS.ajouterLigne();
        assertEquals(2, ts2.getRowCount());
        assertEquals(2, ts2.getColumnCount());
        assertEquals("test", ts2.getColumnName(0));
        assertEquals("test2", ts2.getColumnName(1));
        assertEquals("test", ts2.getValueAt(0, 0));
        assertEquals("test2", ts2.getValueAt(0, 1));
        assertEquals(null, ts2.getValueAt(1, 0));
        assertEquals(null, ts2.getValueAt(1, 1));
        // test 10
        ts = new TableStockage(1, 2);
        ts.setColumnName(0, "test");
        ts.setColumnName(1, "test2");
        ts.setValueAt("test", 0, 0);
        ts.setValueAt("test2", 0, 1);
        modifTS = new ModifTableStockage(ts);
        ts2 = modifTS.ajouterLigne();
        assertEquals(2, ts2.getRowCount());
        assertEquals(2, ts2.getColumnCount());
        assertEquals("test", ts2.getColumnName(0));
        assertEquals("test2", ts2.getColumnName(1));
        assertEquals("test",