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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_1Test {

    /**
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        model.addColumn(new TableColumn(3));
        model.addColumn(new TableColumn(4));
        model.addColumn(new TableColumn(5));
        model.addColumn(new TableColumn(6));
        model.addColumn(new TableColumn(7));
        model.addColumn(new TableColumn(8));
        model.addColumn(new TableColumn(9));
        assertEquals(10, model.getColumnCount(false));
        assertEquals(10, model.getColumnCount(true));
    }

    /**
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount_2() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        model.addColumn(new TableColumn(3));
        model.addColumn(new TableColumn(4));
        model.addColumn(new TableColumn(5));
        model.addColumn(new TableColumn(6));
        model.addColumn(new TableColumn(7));
        model.addColumn(new TableColumn(8));
        model.addColumn(new TableColumn(9));
        model.setColumnVisible(model.getColumn(0), false);
        model.setColumnVisible(model.getColumn(1), false);
        model.setColumnVisible(model.getColumn(2), false);
        model.setColumnVisible(model.getColumn(3), false);
        model.setColumnVisible(model.getColumn(4), false);
        model.setColumnVisible(model.getColumn(5), false);
        model.setColumnVisible(model.getColumn(6), false);
        model.setColumnVisible(model.getColumn(7), false);
        model.setColumnVisible(model.getColumn(8), false);
        model.setColumnVisible(model.getColumn(9), false);
        assertEquals(10, model.getColumnCount(false));
        assertEquals(0, model.getColumnCount(true));
    }

    /**
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount_3() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        model.addColumn(new TableColumn(3));
        model.addColumn(new TableColumn(4));
        model.addColumn(new TableColumn(5));
        model.addColumn(new TableColumn(6));
        model.addColumn(new TableColumn(7));
        model.addColumn(new TableColumn(8));
        model.addColumn(new TableColumn(9));
        model.setColumnVisible(model.getColumn(0), false);
        model.setColumnVisible(model.getColumn(1), false);
        model.setColumnVisible(model.getColumn(2), false);
        model.setColumnVisible(model.getColumn(3), false);
        model.setColumnVisible(model.getColumn(4), false);
        model.setColumnVisible(model.getColumn(5), false);
        model.setColumnVisible(model.getColumn(6), false);
        model.setColumnVisible(model.getColumn(7), false);
        model.setColumnVisible(model.getColumn(8), false);
        model.setColumnVisible(model.getColumn(9), false);
        model.setColumnVisible(model.getColumn(0), true);
        model.setColumnVisible(model.getColumn(1), true);
        model.setColumnVisible(model.getColumn(2), true);
        model.setColumnVisible(model.getColumn(3), true);
        model.setColumnVisible(model.getColumn(4), true);
        model.setColumnVisible(model.getColumn(5), true);
        model.setColumnVisible(model.getColumn(6), true);
        model.setColumnVisible(model.getColumn(7), true);
        model.setColumnVisible(model.getColumn(8), true);
        model.setColumnVisible(model.getColumn(9), true);
        assertEquals(10, model.getColumnCount(false));
        assertEquals(10, model.getColumnCount(true));
    }

    /**
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount_4() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        model.addColumn(new TableColumn(3));
        model.addColumn(new TableColumn(4));
        model.addColumn(new TableColumn(5));
        model.addColumn(new TableColumn(6));
        model.addColumn(new TableColumn(7));
        model.addColumn(new TableColumn(8));
        model.addColumn(new TableColumn(9));
        model.setColumnVisible(model.getColumn(0), false);
        model.setColumnVisible(model.getColumn(1), false);
        model.setColumnVisible(model.getColumn(2), false);
        model.setColumnVisible(model.getColumn(3), false);
        model.setColumnVisible(model.getColumn(4), false);
        model.setColumnVisible(model.getColumn(5), false);
        model.setColumnVisible(model.getColumn(6), false);
        model.setColumnVisible(model.getColumn(7), false);
        model.setColumnVisible(model.getColumn(8), false);
        model.setColumnVisible(model.getColumn(9), false);
        model.setColumnVisible(model.getColumn(0), true);
        model.setColumnVisible(model.getColumn(1), true);
        model.setColumnVisible(model.getColumn(2), true);
        model.setColumnVisible(model.getColumn(3), true);
        model.setColumnVisible(model.getColumn(4), true);
        model.setColumnVisible(model.getColumn(5), true);
        model.setColumnVisible(model.getColumn(6), true);
        model.setColumnVisible(model.getColumn(7), true);
        model.setColumnVisible(model.getColumn(8), true);
        model.setColumnVisible(model.getColumn(9), true);
        model.setColumnVisible(model.getColumn(0), false);
        model.setColumnVisible(model.getColumn(1), false);
        model.setColumnVisible(model.getColumn(2), false);
        model.setColumnVisible(model.getColumn(3), false);
        model.setColumnVisible(model.getColumn(4), false);
        model.setColumnVisible(model.getColumn(5), false);
        model.setColumnVisible(model.getColumn(6), false);
        model.setColumnVisible(model.getColumn(7), false);
        model.setColumnVisible(model.getColumn(8), false);
        model.setColumnVisible(model.getColumn(9), false);
        assertEquals(10, model.getColumnCount(false));
        assertEquals(0, model.getColumnCount(true));
    }

    /**
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount_5() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        model.addColumn(new TableColumn(3));
        model.addColumn(new TableColumn(4));
        model.addColumn(new TableColumn(5));
        model.addColumn(new TableColumn(6));
        model.addColumn(new TableColumn(7));
        model.addColumn(new TableColumn(8));
        model.addColumn(new TableColumn(9));
        model.setColumnVisible(model.getColumn(0), false);
        model.setColumnVisible(model.getColumn(1), false);
        model.setColumnVisible(model.getColumn(2), false);
        model.setColumnVisible(model.getColumn(3), false);
        model.setColumnVisible(model.getColumn(4), false);
        model.setColumnVisible(model.getColumn(5), false);
        model.setColumnVisible(model.getColumn(6), false);
        model.setColumnVisible(model.getColumn(7), false);
        model.setColumnVisible(model.getColumn(8), false);
        model.setColumnVisible(model.getColumn(9), false);
        model.setColumnVisible(model.getColumn(0), true);
        model.setColumnVisible(model.getColumn(1), true);
        model.setColumnVisible(model.getColumn(2), true);
        model.setColumnVisible(model.getColumn(3), true);
        model.setColumnVisible(model.getColumn(4), true);
        model