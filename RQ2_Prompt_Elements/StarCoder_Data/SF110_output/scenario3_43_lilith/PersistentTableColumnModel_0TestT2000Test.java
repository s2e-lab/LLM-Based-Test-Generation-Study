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
     *
     * @param aColumn column to check
     * @param expectedVisibility expected visibility of specified column
     */
    @Test
    void testIsColumnVisible(TableColumn aColumn, boolean expectedVisibility) {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        assertEquals(expectedVisibility, model.isColumnVisible(aColumn));
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_0() {
        testIsColumnVisible(null, false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_1() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_2() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_3() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_4() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_5() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_6() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_7() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_8() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_9() {
        testIsColumnVisible(new TableColumn(0), false);
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
     *
     * @param aColumn column to check
     * @param expectedVisibility expected visibility of specified column
     */
    @Test
    void testIsColumnVisible(TableColumn aColumn, boolean expectedVisibility) {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(aColumn);
        assertEquals(expectedVisibility, model.isColumnVisible(aColumn));
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_0() {
        testIsColumnVisible(null, false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_1() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_2() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_3() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_4() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_5() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_6() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_7() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_8() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_9() {
        testIsColumnVisible(new TableColumn(0), false);
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_2Test {
		
    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     *
     * @param aColumn column to check
     * @param expectedVisibility expected visibility of specified column
     */
    @Test
    void testIsColumnVisible(TableColumn aColumn, boolean expectedVisibility) {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        model.addColumn(aColumn);
        model.addColumn(new TableColumn(0));
        assertEquals(expectedVisibility, model.isColumnVisible(aColumn));
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_0() {
        testIsColumnVisible(null, false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_1() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_2() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_3() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_4() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_5() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_6() {
        testIsColumnVisible(new TableColumn(0), false);
    }

    /**
     * Test case for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}
     */
    @Test
    void testIsColumnVisible_7() {
        testIsColumnVisible(new TableColumn