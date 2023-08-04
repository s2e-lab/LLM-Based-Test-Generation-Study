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
    * Test method for {@link PersistentTableColumnModel#getColumns(boolean)}.
    */
    @Test
    void testGetColumns() {
        final PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        final List<TableColumn> allTableColumns = new ArrayList<TableColumn>();
        allTableColumns.add(new TableColumn(0));
        allTableColumns.add(new TableColumn(1));
        allTableColumns.add(new TableColumn(2));
        allTableColumns.add(new TableColumn(3));
        allTableColumns.add(new TableColumn(4));
        allTableColumns.add(new TableColumn(5));
        allTableColumns.add(new TableColumn(6));
        allTableColumns.add(new TableColumn(7));
        allTableColumns.add(new TableColumn(8));
        allTableColumns.add(new TableColumn(9));
        persistentTableColumnModel.allTableColumns = allTableColumns;
        final List<TableColumn> visibleTableColumns = new ArrayList<TableColumn>();
        visibleTableColumns.add(allTableColumns.get(0));
        visibleTableColumns.add(allTableColumns.get(1));
        visibleTableColumns.add(allTableColumns.get(2));
        visibleTableColumns.add(allTableColumns.get(3));
        visibleTableColumns.add(allTableColumns.get(4));
        visibleTableColumns.add(allTableColumns.get(5));
        visibleTableColumns.add(allTableColumns.get(6));
        visibleTableColumns.add(allTableColumns.get(7));
        visibleTableColumns.add(allTableColumns.get(8));
        visibleTableColumns.add(allTableColumns.get(9));
        persistentTableColumnModel.tableColumns = visibleTableColumns;
        final Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
        int counter = 0;
        while (iterator.hasNext()) {
            final TableColumn tableColumn = iterator.next();
            assertEquals(visibleTableColumns.get(counter), tableColumn);
            counter++;
        }
    }
}
