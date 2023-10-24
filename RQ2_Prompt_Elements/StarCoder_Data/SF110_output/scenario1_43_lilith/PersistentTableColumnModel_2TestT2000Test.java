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

    @Test
    void testGetColumns_01() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<TableColumn>();
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
        Iterator<TableColumn> iterator = model.getColumns(true);
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next().getModelIndex());
        assertEquals(1, iterator.next().getModelIndex());
        assertEquals(2, iterator.next().getModelIndex());
        assertEquals(3, iterator.next().getModelIndex());
        assertEquals(4, iterator.next().getModelIndex());
        assertEquals(5, iterator.next().getModelIndex());
        assertEquals(6, iterator.next().getModelIndex());
        assertEquals(7, iterator.next().getModelIndex());
        assertEquals(8, iterator.next().getModelIndex());
        assertEquals(9, iterator.next().getModelIndex());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testGetColumns_02() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<TableColumn>();
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
        Iterator<TableColumn> iterator = model.getColumns(false);
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next().getModelIndex());
        assertEquals(1, iterator.next().getModelIndex());
        assertEquals(2, iterator.next().getModelIndex());
        assertEquals(3, iterator.next().getModelIndex());
        assertEquals(4, iterator.next().getModelIndex());
        assertEquals(5, iterator.next().getModelIndex());
        assertEquals(6, iterator.next().getModelIndex());
        assertEquals(7, iterator.next().getModelIndex());
        assertEquals(8, iterator.next().getModelIndex());
        assertEquals(9, iterator.next().getModelIndex());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testGetColumns_03() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<TableColumn>();
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
        Iterator<TableColumn> iterator = model.getColumns(true);
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next().getModelIndex());
        assertEquals(1, iterator.next().getModelIndex());
        assertEquals(2, iterator.next().getModelIndex());
        assertEquals(3, iterator.next().getModelIndex());
        assertEquals(4, iterator.next().getModelIndex());
        assertEquals(5, iterator.next().getModelIndex());
        assertEquals(6, iterator.next().getModelIndex());
        assertEquals(7, iterator.next().getModelIndex());
        assertEquals(8, iterator.next().getModelIndex());
        assertEquals(9, iterator.next().getModelIndex());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testGetColumns_04() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<TableColumn>();
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
        Iterator<TableColumn> iterator = model.getColumns(false);
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next().getModelIndex());
        assertEquals(1, iterator.next().getModelIndex());
        assertEquals(2, iterator.next().getModelIndex());
        assertEquals(3, iterator.next().getModelIndex());
        assertEquals(4, iterator.next().getModelIndex());
        assertEquals(5, iterator.next().getModelIndex());
        assertEquals(6, iterator.next().getModelIndex());
        assertEquals(7, iterator.next().getModelIndex());
        assertEquals(8, iterator.next().getModelIndex());
        assertEquals(9, iterator.next().getModelIndex());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testGetColumns_05() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<TableColumn>();
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
        Iterator<TableColumn> iterator = model.getColumns(true);
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next().getModelIndex());
        assertEquals(1, iterator.next().getModelIndex());
        assertEquals(2, iterator.next().getModelIndex());
        assertEquals(3, iterator.next().getModelIndex());
        assertEquals(4, iterator.next().getModelIndex());
        assertEquals(5, iterator.next().getModelIndex());
        assertEquals(6, iterator.next().getModelIndex());
        assertEquals(7, iterator.next().getModelIndex());
        assertEquals(8, iterator.next().getModelIndex());
        assertEquals(9, iterator.next().getModelIndex());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testGetColumns_06() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<TableColumn>();
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
        Iterator<TableColumn> iterator = model.getColumns(false);
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next().getModelIndex());
        assertEquals(1, iterator.next().getModelIndex());
        assertEquals(2, iterator.next().getModelIndex());
        assertEquals(3, iterator.next().getModelIndex());
        assertEquals(4, iterator.next().getModelIndex());
        assertEquals(5, iterator.next().getModelIndex());
        assertEquals(6, iterator.next().getModelIndex());
        assertEquals(7, iterator.next().getModelIndex());
        assertEquals(8, iterator.next().getModelIndex());
        assertEquals(9, iterator.next().getModelIndex());
        assertFalse(iterator.hasNext());
    }

    @Test
    void testGetColumns_07() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        List<TableColumn> columns = new ArrayList<TableColumn>();
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
        Iterator<TableColumn> iterator = model.getColumns(true);
        assertTrue(iterator.hasNext());
        assertEquals(0, iterator.next