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

    @Test
    void test_getColumnIndex_1() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_2() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_3() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_4() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_5() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_6() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_7() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_8() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_9() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_10() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
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
		
    @Test
    void test_getColumnIndex_1() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_2() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_3() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
        assertEquals(1, model.getColumnIndex(1, true));
        assertEquals(2, model.getColumnIndex(2, true));
        assertEquals(0, model.getColumnIndex(0, false));
        assertEquals(1, model.getColumnIndex(1, false));
        assertEquals(2, model.getColumnIndex(2, false));
    }

    @Test
    void test_getColumnIndex_4() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(new TableColumn(0));
        model.addColumn(new TableColumn(1));
        model.addColumn(new TableColumn(2));
        assertEquals(0, model.getColumnIndex(0, true));
       