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
        column1.setHeaderValue("Column 1");
        TableColumn column2 = new TableColumn(1);
        column2.setHeaderValue("Column 2");
        TableColumn column3 = new TableColumn(2);
        column3.setHeaderValue("Column 3");
        TableColumn column4 = new TableColumn(3);
        column4.setHeaderValue("Column 4");
        TableColumn column5 = new TableColumn(4);
        column5.setHeaderValue("Column 5");
        TableColumn column6 = new TableColumn(5);
        column6.setHeaderValue("Column 6");
        TableColumn column7 = new TableColumn(6);
        column7.setHeaderValue("Column 7");
        TableColumn column8 = new TableColumn(7);
        column8.setHeaderValue("Column 8");
        TableColumn column9 = new TableColumn(8);
        column9.setHeaderValue("Column 9");
        TableColumn column10 = new TableColumn(9);
        column10.setHeaderValue("Column 10");
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
        assertEquals(0, model.getColumnIndex("Column 1", true));
        assertEquals(1, model.getColumnIndex("Column 2", true));
        assertEquals(2, model.getColumnIndex("Column 3", true));
        assertEquals(3, model.getColumnIndex("Column 4", true));
        assertEquals(4, model.getColumnIndex("Column 5", true));
        assertEquals(5, model.getColumnIndex("Column 6", true));
        assertEquals(6, model.getColumnIndex("Column 7", true));
        assertEquals(7, model.getColumnIndex("Column 8", true));
        assertEquals(8, model.getColumnIndex("Column 9", true));
        assertEquals(9, model.getColumnIndex("Column 10", true));
        assertEquals(0, model.getColumnIndex("Column 1", false));
        assertEquals(1, model.getColumnIndex("Column 2", false));
        assertEquals(2, model.getColumnIndex("Column 3", false));
        assertEquals(3, model.getColumnIndex("Column 4", false));
        assertEquals(4, model.getColumnIndex("Column 5", false));
        assertEquals(5, model.getColumnIndex("Column 6", false));
        assertEquals(6, model.getColumnIndex("Column 7", false));
        assertEquals(7, model.getColumnIndex("Column 8", false));
        assertEquals(8, model.getColumnIndex("Column 9", false));
        assertEquals(9, model.getColumnIndex("Column 10", false));
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
        column1.setHeaderValue("Column 1");
        TableColumn column2 = new TableColumn(1);
        column2.setHeaderValue("Column 2");
        TableColumn column3 = new TableColumn(2);
        column3.setHeaderValue("Column 3");
        TableColumn column4 = new TableColumn(3);
        column4.setHeaderValue("Column 4");
        TableColumn column5 = new TableColumn(4);
        column5.setHeaderValue("Column 5");
        TableColumn column6 = new TableColumn(5);
        column6.setHeaderValue("Column 6");
        TableColumn column7 = new TableColumn(6);
        column7.setHeaderValue("Column 7");
        TableColumn column8 = new TableColumn(7);
        column8.setHeaderValue("Column 8");
        TableColumn column9 = new TableColumn(8);
        column9.setHeaderValue("Column 9");
        TableColumn column10 = new TableColumn(9);
        column10.setHeaderValue("Column 10");
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
        assertEquals(0, model.getColumnIndex("Column 1", true));
        assertEquals(1, model.getColumnIndex("Column 2", true));
        assertEquals(2, model.getColumnIndex("Column 3", true));
        assertEquals(3, model.getColumnIndex("Column 4", true));
        assertEquals(4, model.getColumnIndex("Column 5", true));
        assertEquals(5, model.getColumnIndex("Column 6", true));
        assertEquals(6, model.getColumnIndex("Column 7", true));
        assertEquals(7, model.getColumnIndex("Column 8", true));
        assertEquals(8, model.getColumnIndex("Column 9", true));
        assertEquals(9, model.getColumnIndex("Column 10", true));
        assertEquals(0, model.getColumnIndex("Column 1", false));
        assertEquals(1, model.getColumnIndex("Column 2", false));
        assertEquals(2, model.getColumnIndex("Column 3", false));
        assertEquals(3, model.getColumnIndex("Column 4", false));
        assertEquals(4, model.getColumnIndex("Column 5", false));
        assertEquals(5, model.getColumnIndex("Column 6", false));
        assertEquals(6, model.getColumnIndex("Column 7", false));
        assertEquals(7, model.getColumnIndex("Column 8", false));
        assertEquals(8, model.getColumnIndex("Column 9", false));
        assertEquals(9, model.getColumnIndex("Column 10", false));
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
        column1.setHeaderValue("Column 1");
        TableColumn column2 = new TableColumn(1);
        column2.setHeaderValue("Column 2");
        TableColumn column3 = new TableColumn(2);
        column3.setHeaderValue("Column 3");
        TableColumn column4 = new TableColumn(3);
        column4.setHeaderValue("Column 4");
        TableColumn column5 = new TableColumn(4);
        column5.setHeaderValue("Column 5");
        TableColumn column6 = new TableColumn(5);
        column6.setHeaderValue("Column 6");
        TableColumn column7 = new TableColumn(6);
        column7.setHeaderValue("Column 7");
        TableColumn column8 = new TableColumn(7);
        column8.setHeaderValue("Column 8");
        TableColumn column9 = new TableColumn(8);
        column9.setHeaderValue("Column 9");
        TableColumn column10 = new TableColumn(9);
        column10.setHeaderValue("Column 10");
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
        assertEquals