// PersistentTableColumnModel_3Test.java
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModel_3Test {

    /**
    * Test method for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}.
    */
    @Test
    void testGetColumnIndex() {
        final PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        final List<TableColumn> allTableColumns = persistentTableColumnModel.allTableColumns;
        final List<TableColumn> tableColumns = persistentTableColumnModel.tableColumns;
        final TableColumn column1 = new TableColumn(0);
        final TableColumn column2 = new TableColumn(1);
        final TableColumn column3 = new TableColumn(2);
        final TableColumn column4 = new TableColumn(3);
        final TableColumn column5 = new TableColumn(4);
        final TableColumn column6 = new TableColumn(5);
        final TableColumn column7 = new TableColumn(6);
        final TableColumn column8 = new TableColumn(7);
        final TableColumn column9 = new TableColumn(8);
        final TableColumn column10 = new TableColumn(9);
        allTableColumns.add(column1);
        allTableColumns.add(column2);
        allTableColumns.add(column3);
        allTableColumns.add(column4);
        allTableColumns.add(column5);
        allTableColumns.add(column6);
        allTableColumns.add(column7);
        allTableColumns.add(column8);
        allTableColumns.add(column9);
        allTableColumns.add(column10);
        tableColumns.add(column1);
        tableColumns.add(column2);
        tableColumns.add(column3);
        tableColumns.add(column4);
        tableColumns.add(column5);
        tableColumns.add(column6);
        tableColumns.add(column7);
        tableColumns.add(column8);
        tableColumns.add(column9);
        tableColumns.add(column10);
        assertEquals(0, persistentTableColumnModel.getColumnIndex(column1, true));
        assertEquals(1, persistentTableColumnModel.getColumnIndex(column2, true));
        assertEquals(2, persistentTableColumnModel.getColumnIndex(column3, true));
        assertEquals(3, persistentTableColumnModel.getColumnIndex(column4, true));
        assertEquals(4, persistentTableColumnModel.getColumnIndex(column5, true));
        assertEquals(5, persistentTableColumnModel.getColumnIndex(column6, true));
        assertEquals(6, persistentTableColumnModel.getColumnIndex(column7, true));
        assertEquals(7, persistentTableColumnModel.getColumnIndex(column8, true));
        assertEquals(8, persistentTableColumnModel.getColumnIndex(column9, true));
        assertEquals(9, persistentTableColumnModel.getColumnIndex(column10, true));
        assertEquals(0, persistentTableColumnModel.getColumnIndex(column1, false));
        assertEquals(1, persistentTableColumnModel.getColumnIndex(column2, false));
        assertEquals(2, persistentTableColumnModel.getColumnIndex(column3, false));
        assertEquals(3, persistentTableColumnModel.getColumnIndex(column4, false));
        assertEquals(4, persistentTableColumnModel.getColumnIndex(column5, false));
        assertEquals(5, persistentTableColumnModel.getColumnIndex(column6, false));
        assertEquals(6, persistentTableColumnModel.getColumnIndex(column7, false));
        assertEquals(7, persistentTableColumnModel.getColumnIndex(column8, false));
        assertEquals(8, persistentTableColumnModel.getColumnIndex(column9, false));
        assertEquals(9, persistentTableColumnModel.getColumnIndex(column10, false));
    }
}
