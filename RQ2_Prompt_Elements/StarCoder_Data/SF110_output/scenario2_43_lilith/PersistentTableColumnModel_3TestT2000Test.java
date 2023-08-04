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
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        TableColumn column3 = new TableColumn(2);
        TableColumn column4 = new TableColumn(3);
        TableColumn column5 = new TableColumn(4);
        TableColumn column6 = new TableColumn(5);
        TableColumn column7 = new TableColumn(6);
        TableColumn column8 = new TableColumn(7);
        TableColumn column9 = new TableColumn(8);
        TableColumn column10 = new TableColumn(9);
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
        model.addColumn(column4);
        model.addColumn(column5);
        model.addColumn(column6);
        model.addColumn(column7);
        model.addColumn(column8);
        model.addColumn(column9);
        model.addColumn(column10);
        assertEquals(0, model.getColumnIndex(column1, true));
        assertEquals(0, model.getColumnIndex(column1, false));
        assertEquals(1, model.getColumnIndex(column2, true));
        assertEquals(1, model.getColumnIndex(column2, false));
        assertEquals(2, model.getColumnIndex(column3, true));
        assertEquals(2, model.getColumnIndex(column3, false));
        assertEquals(3, model.getColumnIndex(column4, true));
        assertEquals(3, model.getColumnIndex(column4, false));
        assertEquals(4, model.getColumnIndex(column5, true));
        assertEquals(4, model.getColumnIndex(column5, false));
        assertEquals(5, model.getColumnIndex(column6, true));
        assertEquals(5, model.getColumnIndex(column6, false));
        assertEquals(6, model.getColumnIndex(column7, true));
        assertEquals(6, model.getColumnIndex(column7, false));
        assertEquals(7, model.getColumnIndex(column8, true));
        assertEquals(7, model.getColumnIndex(column8, false));
        assertEquals(8, model.getColumnIndex(column9, true));
        assertEquals(8, model.getColumnIndex(column9, false));
        assertEquals(9, model.getColumnIndex(column10, true));
        assertEquals(9, model.getColumnIndex(column10, false));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModel_2Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}.
    */
    @Test
    void testGetColumnIndex() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        TableColumn column3 = new TableColumn(2);
        TableColumn column4 = new TableColumn(3);
        TableColumn column5 = new TableColumn(4);
        TableColumn column6 = new TableColumn(5);
        TableColumn column7 = new TableColumn(6);
        TableColumn column8 = new TableColumn(7);
        TableColumn column9 = new TableColumn(8);
        TableColumn column10 = new TableColumn(9);
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
        model.addColumn(column4);
        model.addColumn(column5);
        model.addColumn(column6);
        model.addColumn(column7);
        model.addColumn(column8);
        model.addColumn(column9);
        model.addColumn(column10);
        assertEquals(0, model.getColumnIndex(column1, true));
        assertEquals(0, model.getColumnIndex(column1, false));
        assertEquals(1, model.getColumnIndex(column2, true));
        assertEquals(1, model.getColumnIndex(column2, false));
        assertEquals(2, model.getColumnIndex(column3, true));
        assertEquals(2, model.getColumnIndex(column3, false));
        assertEquals(3, model.getColumnIndex(column4, true));
        assertEquals(3, model.getColumnIndex(column4, false));
        assertEquals(4, model.getColumnIndex(column5, true));
        assertEquals(4, model.getColumnIndex(column5, false));
        assertEquals(5, model.getColumnIndex(column6, true));
        assertEquals(5, model.getColumnIndex(column6, false));
        assertEquals(6, model.getColumnIndex(column7, true));
        assertEquals(6, model.getColumnIndex(column7, false));
        assertEquals(7, model.getColumnIndex(column8, true));
        assertEquals(7, model.getColumnIndex(column8, false));
        assertEquals(8, model.getColumnIndex(column9, true));
        assertEquals(8, model.getColumnIndex(column9, false));
        assertEquals(9, model.getColumnIndex(column10, true));
        assertEquals(9, model.getColumnIndex(column10, false));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModel_1Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}.
    */
    @Test
    void testGetColumnIndex() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column1 = new TableColumn(0);
        TableColumn column2 = new TableColumn(1);
        TableColumn column3 = new TableColumn(2);
        TableColumn column4 = new TableColumn(3);
        TableColumn column5 = new TableColumn(4);
        TableColumn column6 = new TableColumn(5);
        TableColumn column7 = new TableColumn(6);
        TableColumn column8 = new TableColumn(7);
        TableColumn column9 = new TableColumn(8);
        TableColumn column10 = new TableColumn(9);
        model.addColumn(column1);
        model.addColumn(column2);
        model.addColumn(column3);
        model.addColumn(column4);
        model.addColumn(column5);
        model.addColumn(column6);
        model.addColumn(column7);
        model.addColumn(column8);
        model.addColumn(column9);
        model.addColumn(column10);
        assertEquals(0, model.getColumnIndex(column1, true));
        assertEquals(0, model.getColumnIndex(column1, false));
        assertEquals(1, model.getColumnIndex(column2, true));
        assertEquals(1, model.getColumnIndex(column2, false));
        assertEquals(2, model.getColumnIndex(column3, true));
        assertEquals(2, model.getColumnIndex(column3, false));
        assertEquals(3, model.getColumnIndex(column4, true));
        assertEquals(3, model.getColumnIndex(column4, false));
        assertEquals(4, model.getColumnIndex(column5, true));
        assertEquals(4, model.getColumnIndex(column5, false));
        assertEquals(5, model.getColumnIndex(column6, true));
        assertEquals(5, model.getColumnIndex(column6, false));
        assertEquals(6, model.getColumnIndex(column7, true));
        assertEquals(6, model.getColumnIndex(column7, false));
        assertEquals(7, model.getColumnIndex(column8, true));
        assertEquals(7, model.getColumnIndex(column8, false));
        assertEquals(8, model.getColumnIndex(column9, true));
        assertEquals(8, model.getColumnIndex(column9, false));
        assertEquals(9, model.getColumnIndex(column10, true));
        assertEquals(9, model.getColumnIndex(column10, false));
    }
}

// PersistentTableColumnModel_0Test.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import org.junit.jupiter.