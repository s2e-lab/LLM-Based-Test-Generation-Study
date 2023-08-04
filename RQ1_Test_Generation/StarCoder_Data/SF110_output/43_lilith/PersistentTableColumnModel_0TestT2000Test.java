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
    * Test method for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}.
    */
    @Test
    void testIsColumnVisible() {
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        TableColumn tableColumn = new TableColumn(0);
        persistentTableColumnModel.addColumn(tableColumn);
        assertTrue(persistentTableColumnModel.isColumnVisible(tableColumn));
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
    * Test method for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}.
    */
    @Test
    void testIsColumnVisible() {
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        TableColumn tableColumn = new TableColumn(0);
        persistentTableColumnModel.addColumn(tableColumn);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn));
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
    * Test method for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}.
    */
    @Test
    void testIsColumnVisible() {
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        TableColumn tableColumn = new TableColumn(0);
        persistentTableColumnModel.addColumn(tableColumn);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        persistentTableColumnModel.setColumnVisible(tableColumn, true);
        assertTrue(persistentTableColumnModel.isColumnVisible(tableColumn));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_3Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}.
    */
    @Test
    void testIsColumnVisible() {
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        TableColumn tableColumn = new TableColumn(0);
        persistentTableColumnModel.addColumn(tableColumn);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        persistentTableColumnModel.setColumnVisible(tableColumn, true);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_4Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}.
    */
    @Test
    void testIsColumnVisible() {
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        TableColumn tableColumn = new TableColumn(0);
        persistentTableColumnModel.addColumn(tableColumn);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        persistentTableColumnModel.setColumnVisible(tableColumn, true);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        persistentTableColumnModel.setColumnVisible(tableColumn, true);
        assertTrue(persistentTableColumnModel.isColumnVisible(tableColumn));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#isColumnVisible(TableColumn)} method.
*/
class PersistentTableColumnModel_5Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}.
    */
    @Test
    void testIsColumnVisible() {
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        TableColumn tableColumn = new TableColumn(0);
        persistentTableColumnModel.addColumn(tableColumn);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        persistentTableColumnModel.setColumnVisible(tableColumn, true);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        persistentTableColumnModel.setColumnVisible(tableColumn, true);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        assertFalse(persistentTableColumnModel.isColumnVisible(tableColumn));
    }
}

// PersistentTableColumnModel_6Test.java
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
class PersistentTableColumnModel_6Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#isColumnVisible(TableColumn)}.
    */
    @Test
    void testIsColumnVisible() {
        PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
        TableColumn tableColumn = new TableColumn(0);
        persistentTableColumnModel.addColumn(tableColumn);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        persistentTableColumnModel.setColumnVisible(tableColumn, true);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        persistentTableColumnModel.setColumnVisible(tableColumn, true);
        persistentTableColumnModel.setColumnVisible(tableColumn, false);
        persistentTableColumnModel.setColumnVisible(tableColumn, true);
        assertTrue(persistentTableColumnModel.isColumnVisible(tableColumn));
    }
}

// PersistentTableColumnModel_7Test.java
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
class PersistentTableColumnModel_7Test