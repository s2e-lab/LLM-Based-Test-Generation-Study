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
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        assertEquals(0, persistentTableColumnModel.getColumnCount(true));
        assertEquals(0, persistentTableColumnModel.getColumnCount(false));
        persistentTableColumnModel.addColumn(new TableColumn(0));
        assertEquals(1, persistentTableColumnModel.getColumnCount(true));
        assertEquals(1, persistentTableColumnModel.getColumnCount(false));
        persistentTableColumnModel.addColumn(new TableColumn(1));
        assertEquals(2, persistentTableColumnModel.getColumnCount(true));
        assertEquals(2, persistentTableColumnModel.getColumnCount(false));
        persistentTableColumnModel.addColumn(new TableColumn(2));
        assertEquals(3, persistentTableColumnModel.getColumnCount(true));
        assertEquals(3, persistentTableColumnModel.getColumnCount(false));
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(2, persistentTableColumnModel.getColumnCount(true));
        assertEquals(3, persistentTableColumnModel.getColumnCount(false));
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(1, persistentTableColumnModel.getColumnCount(true));
        assertEquals(3, persistentTableColumnModel.getColumnCount(false));
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(0, persistentTableColumnModel.getColumnCount(true));
        assertEquals(3, persistentTableColumnModel.getColumnCount(false));
    }
}

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
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        assertEquals(0, persistentTableColumnModel.getColumns(true).size());
        assertEquals(0, persistentTableColumnModel.getColumns(false).size());
        persistentTableColumnModel.addColumn(new TableColumn(0));
        assertEquals(1, persistentTableColumnModel.getColumns(true).size());
        assertEquals(1, persistentTableColumnModel.getColumns(false).size());
        persistentTableColumnModel.addColumn(new TableColumn(1));
        assertEquals(2, persistentTableColumnModel.getColumns(true).size());
        assertEquals(2, persistentTableColumnModel.getColumns(false).size());
        persistentTableColumnModel.addColumn(new TableColumn(2));
        assertEquals(3, persistentTableColumnModel.getColumns(true).size());
        assertEquals(3, persistentTableColumnModel.getColumns(false).size());
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(2, persistentTableColumnModel.getColumns(true).size());
        assertEquals(3, persistentTableColumnModel.getColumns(false).size());
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(1, persistentTableColumnModel.getColumns(true).size());
        assertEquals(3, persistentTableColumnModel.getColumns(false).size());
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(0, persistentTableColumnModel.getColumns(true).size());
        assertEquals(3, persistentTableColumnModel.getColumns(false).size());
    }
}

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
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        assertEquals(-1, persistentTableColumnModel.getColumnIndex(new Integer(0), true));
        assertEquals(-1, persistentTableColumnModel.getColumnIndex(new Integer(0), false));
        persistentTableColumnModel.addColumn(new TableColumn(0));
        assertEquals(0, persistentTableColumnModel.getColumnIndex(new Integer(0), true));
        assertEquals(0, persistentTableColumnModel.getColumnIndex(new Integer(0), false));
        persistentTableColumnModel.addColumn(new TableColumn(1));
        assertEquals(0, persistentTableColumnModel.getColumnIndex(new Integer(0), true));
        assertEquals(0, persistentTableColumnModel.getColumnIndex(new Integer(0), false));
        persistentTableColumnModel.addColumn(new TableColumn(2));
        assertEquals(0, persistentTableColumnModel.getColumnIndex(new Integer(0), true));
        assertEquals(0, persistentTableColumnModel.getColumnIndex(new Integer(0), false));
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(1, persistentTableColumnModel.getColumnIndex(new Integer(0), true));
        assertEquals(0, persistentTableColumnModel.getColumnIndex(new Integer(0), false));
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(1, persistentTableColumnModel.getColumnIndex(new Integer(0), true));
        assertEquals(0, persistentTableColumnModel.getColumnIndex(new Integer(0), false));
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(-1, persistentTableColumnModel.getColumnIndex(new Integer(0), true));
        assertEquals(0, persistentTableColumnModel.getColumnIndex(new Integer(0), false));
    }
}

// PersistentTableColumnModel_4Test.java
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumn(int)} method.
*/
class PersistentTableColumnModel_4Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#getColumn(int)}.
    */
    @Test
    void testGetColumn() {
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        assertNull(persistentTableColumnModel.getColumn(0));
        persistentTableColumnModel.addColumn(new TableColumn(0));
        assertEquals(persistentTableColumnModel.getColumn(0), persistentTableColumnModel.getColumn(0));
        persistentTableColumnModel.addColumn(new TableColumn(1));
        assertEquals(persistentTableColumnModel.getColumn(0), persistentTableColumnModel.getColumn(0));
        persistentTableColumnModel.addColumn(new TableColumn(2));
        assertEquals(persistentTableColumnModel.getColumn(0), persistentTableColumnModel.getColumn(0));
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(persistentTableColumnModel.getColumn(0), persistentTableColumnModel.getColumn(0));
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertEquals(persistentTableColumnModel.getColumn(0), persistentTableColumnModel.getColumn(0));
        persistentTableColumnModel.removeColumn(persistentTableColumnModel.getColumn(0));
        assertNull(persistentTableColumnModel.getColumn(0));
    }
}

// PersistentTableColumnModel_5Test.java
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#setColumnVisible(TableColumn, boolean)} method.
*/
class PersistentTableColumnModel_5Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#setColumnVisible(TableColumn, boolean)}.
    */
    @Test
    void testSetColumnVisible() {
        PersistentTableColumnModel persistentTableColumnModel =