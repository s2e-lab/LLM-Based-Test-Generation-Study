// PersistentTableColumnModel_2Test.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PersistentTableColumnModel}.
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
*/
class PersistentTableColumnModel_2Test {

    /**
    * Test case for {@link PersistentTableColumnModel#getColumns(boolean)} with onlyVisible set to true.
    */
    @Test
    void testGetColumns_onlyVisible() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<TableColumn>();
        for (int i = 0; i < 10; i++) {
            TableColumn column = new TableColumn(i);
            columns.add(column);
            model.addColumn(column);
        }
        for (int i = 0; i < 10; i++) {
            columns.get(i).setVisible(false);
        }
        Iterator<TableColumn> iterator = model.getColumns(true);
        for (int i = 0; i < 10; i++) {
            assertTrue(iterator.hasNext());
            assertEquals(columns.get(i), iterator.next());
        }
        assertFalse(iterator.hasNext());
    }

    /**
    * Test case for {@link PersistentTableColumnModel#getColumns(boolean)} with onlyVisible set to false.
    */
    @Test
    void testGetColumns_all() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<TableColumn>();
        for (int i = 0; i < 10; i++) {
            TableColumn column = new TableColumn(i);
            columns.add(column);
            model.addColumn(column);
        }
        for (int i = 0; i < 10; i++) {
            columns.get(i).setVisible(false);
        }
        Iterator<TableColumn> iterator = model.getColumns(false);
        for (int i = 0; i < 10; i++) {
            assertTrue(iterator.hasNext());
            assertEquals(columns.get(i), iterator.next());
        }
        assertFalse(iterator.hasNext());
    }
}
