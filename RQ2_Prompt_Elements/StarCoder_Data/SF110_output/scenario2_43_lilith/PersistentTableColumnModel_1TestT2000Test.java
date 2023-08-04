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
    * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} with <code>onlyVisible</code> set to <code>true</code>.
    */
    @Test
    void testGetColumnCount_1() {
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
        assertEquals(10, model.getColumnCount(true));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} with <code>onlyVisible</code> set to <code>false</code>.
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
        assertEquals(10, model.getColumnCount(false));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_2Test {
		
    /**
    * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} with <code>onlyVisible</code> set to <code>true</code>.
    */
    @Test
    void testGetColumnCount_1() {
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
        model.removeColumn(model.getColumn(0));
        assertEquals(9, model.getColumnCount(true));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} with <code>onlyVisible</code> set to <code>false</code>.
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
        model.removeColumn(model.getColumn(0));
        assertEquals(10, model.getColumnCount(false));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_3Test {
		
    /**
    * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} with <code>onlyVisible</code> set to <code>true</code>.
    */
    @Test
    void testGetColumnCount_1() {
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
        model.removeColumn(model.getColumn(0));
        model.removeColumn(model.getColumn(0));
        assertEquals(8, model.getColumnCount(true));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} with <code>onlyVisible</code> set to <code>false</code>.
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
        model.removeColumn(model.getColumn(0));
        model.removeColumn(model.getColumn(0));
        assertEquals(10, model.getColumnCount(false));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_4Test {
		
    /**
    * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} with <code>onlyVisible</code> set to <code>true</code>.
    */
    @Test
    void testGetColumnCount_1() {
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
        model.removeColumn(model.getColumn(0));
        model.removeColumn(model.getColumn(0));
        model.removeColumn(model.getColumn(0));
        assertEquals(7, model.getColumnCount(true));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#getColumnCount(boolean)} with <code>onlyVisible</code> set to <code>false</code>.
    */
    @Test
    void testGetColumnCount_2() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        model.addColumn(new TableColumn(3));
        model.addColumn(new TableColumn