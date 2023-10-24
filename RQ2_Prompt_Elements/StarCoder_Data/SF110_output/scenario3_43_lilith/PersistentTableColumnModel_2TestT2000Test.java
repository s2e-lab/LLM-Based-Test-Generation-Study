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
    void testGetColumns_onlyVisible_true() {
        // Arrange
        final PersistentTableColumnModel model = new PersistentTableColumnModel();
        final List<TableColumn> columns = new ArrayList<TableColumn>();
        columns.add(new TableColumn(0));
        columns.add(new TableColumn(1));
        columns.add(new TableColumn(2));
        columns.add(new TableColumn(3));
        columns.add(new TableColumn(4));
        columns.add(new TableColumn(5));
        columns.add(new TableColumn(6));
        columns.add(new TableColumn(7));
        columns.add(new TableColumn(8));
        columns.add(new TableColumn(9));
        model.setColumns(columns);
        // Act
        final Iterator<TableColumn> iterator = model.getColumns(true);
        // Assert
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(4, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(5, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(6, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(7, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(8, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(9, iterator.next().getModelIndex());
        assertFalse(iterator.hasNext());
    }

    /**
    * Test case for {@link PersistentTableColumnModel#getColumns(boolean)} with onlyVisible set to false.
    */
    @Test
    void testGetColumns_onlyVisible_false() {
        // Arrange
        final PersistentTableColumnModel model = new PersistentTableColumnModel();
        final List<TableColumn> columns = new ArrayList<TableColumn>();
        columns.add(new TableColumn(0));
        columns.add(new TableColumn(1));
        columns.add(new TableColumn(2));
        columns.add(new TableColumn(3));
        columns.add(new TableColumn(4));
        columns.add(new TableColumn(5));
        columns.add(new TableColumn(6));
        columns.add(new TableColumn(7));
        columns.add(new TableColumn(8));
        columns.add(new TableColumn(9));
        model.setColumns(columns);
        // Act
        final Iterator<TableColumn> iterator = model.getColumns(false);
        // Assert
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(4, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(5, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(6, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(7, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(8, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(9, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(4, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(5, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(6, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(7, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(8, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(9, iterator.next().getModelIndex());
        assertFalse(iterator.hasNext());
    }
}

// PersistentTableColumnModel_1.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;

/**
* This class is based on code and ideas from Stephen Kelvin (mail at StephenKelvin.de) and Thomas Darimont.
*/
public class PersistentTableColumnModel extends DefaultTableColumnModel {

    /**
    * Returns an <code>Enumeration</code> of all the columns in the model.
    *
    * @param onlyVisible if set all invisible columns will be missing from the enumeration.
    * @return an <code>Enumeration</code> of the columns in the model
    */
    public Iterator<TableColumn> getColumns(boolean onlyVisible) {
        final List<TableColumn> columns = new ArrayList<TableColumn>();
        for (int i = 0; i < getColumnCount(); i++) {
            final TableColumn column = getColumn(i);
            if (!onlyVisible || column.isVisible()) {
                columns.add(column);
            }
        }
        return columns.iterator();
    }
}

// PersistentTableColumnModel_1Test.java
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
class PersistentTableColumnModel_1Test {
		
    /**
    * Test case for {@link PersistentTableColumnModel#getColumns(boolean)} with onlyVisible set to true.
    */
    @Test
    void testGetColumns_onlyVisible_true() {
        // Arrange
        final PersistentTableColumnModel model = new PersistentTableColumnModel();
        final List<TableColumn> columns = new ArrayList<TableColumn>();
        columns.add(new TableColumn(0));
        columns.add(new TableColumn(1));
        columns.add(new TableColumn(2));
        columns.add(new TableColumn(3));
        columns.add(new TableColumn(4));
        columns.add(new TableColumn(5));
        columns.add(new TableColumn(6));
        columns.add(new TableColumn(7));
        columns.add(new TableColumn(8));
        columns.add(new TableColumn(9));
        model.setColumns(columns);
        // Act
        final Iterator<TableColumn> iterator = model.getColumns(true);
        // Assert
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(2, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(3, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(4, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(5, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(6, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(7, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(8, iterator.next().getModelIndex());
        assertTrue(iterator.hasNext());
        assertEquals(9, iterator.next().getModelIndex());
        assertFalse(iterator.hasNext());
    }

    /**
    * Test case for {@link PersistentTableColumnModel#getColumns(boolean)} with onlyVisible set to false.
    */
    @Test
    void testGetColumns_onlyVisible_false() {
        // Arrange
        final PersistentTableColumnModel model = new PersistentTableColumnModel();
        final List<TableColumn> columns = new ArrayList<TableColumn>();
        columns.add(new TableColumn(0));
        columns.add(new TableColumn(1));
        columns.add(new TableColumn(2));
        columns.add(new TableColumn(3));
        columns.add(new TableColumn(4));
        columns.add(new TableColumn(5));
        columns.add(new TableColumn(6));
        columns.add