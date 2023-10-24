// PersistentTableColumnModel_0Test.java
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_0Test {

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is not contained in the model.
    */
    @Test
    void testIsColumnVisible_0() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        assertFalse(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model.
    */
    @Test
    void testIsColumnVisible_1() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        assertTrue(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_2() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        assertFalse(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_3() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        assertFalse(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_4() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        assertTrue(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_5() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        column.setVisible(false);
        assertFalse(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_6() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        assertFalse(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_7() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        assertTrue(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_8() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        column.setVisible(false);
        assertFalse(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_9() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        assertFalse(model.isColumnVisible(column));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_1Test {
		
    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is not contained in the model.
    */
    @Test
    void testIsColumnVisible_0() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        assertFalse(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model.
    */
    @Test
    void testIsColumnVisible_1() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        assertTrue(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_2() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        assertFalse(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_3() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        assertFalse(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_4() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        assertTrue(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_5() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(false);
        model.removeColumn(column);
        model.addColumn(column);
        column.setVisible(false);
        assertFalse(model.isColumnVisible(column));
    }

    /**
    * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
    * with a column that is contained in the model and invisible.
    */
    @Test
    void testIsColumnVisible_6() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn(0);
        model.addColumn(column);
        column.setVisible(