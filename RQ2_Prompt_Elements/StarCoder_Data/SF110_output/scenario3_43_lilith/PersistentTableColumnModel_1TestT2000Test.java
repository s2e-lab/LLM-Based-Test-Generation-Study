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
        assertEquals(0, model.getColumnCount(false));
        assertEquals(0, model.getColumnCount(true));
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
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        model.addColumn(column);
        assertEquals(1, model.getColumnCount(false));
        assertEquals(1, model.getColumnCount(true));
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
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        column.setVisible(false);
        model.addColumn(column);
        assertEquals(0, model.getColumnCount(false));
        assertEquals(1, model.getColumnCount(true));
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
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        column.setVisible(false);
        model.addColumn(column);
        column.setVisible(true);
        assertEquals(1, model.getColumnCount(false));
        assertEquals(1, model.getColumnCount(true));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_5Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        column.setVisible(false);
        model.addColumn(column);
        column.setVisible(true);
        TableColumn column2 = new TableColumn();
        model.addColumn(column2);
        assertEquals(2, model.getColumnCount(false));
        assertEquals(2, model.getColumnCount(true));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_6Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        column.setVisible(false);
        model.addColumn(column);
        column.setVisible(true);
        TableColumn column2 = new TableColumn();
        column2.setVisible(false);
        model.addColumn(column2);
        assertEquals(1, model.getColumnCount(false));
        assertEquals(2, model.getColumnCount(true));
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_7Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        column.setVisible(false);
        model.addColumn(column);
        column.setVisible(true);
        TableColumn column2 = new TableColumn();
        column2.setVisible(false);
        model.addColumn(column2);
        column2.setVisible(true);
        assertEquals(2, model.getColumnCount(false));
        assertEquals(2, model.getColumnCount(true));
    }
}

// PersistentTableColumnModel_8Test.java
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
class PersistentTableColumnModel_8Test {
		
    /**
    * Test method for {@link PersistentTableColumnModel#getColumnCount(boolean)}.
    */
    @Test
    void testGetColumnCount() {
        PersistentTableColumnModel model = new PersistentTableColumnModel();
        TableColumn column = new TableColumn();
        column.setVisible(false);
        model.addColumn(column);
        column.setVisible(true);
        TableColumn column2 = new TableColumn();
        column2.setVisible(false);
        model.addColumn(column2);
        column2.setVisible(true);
        TableColumn column3 = new TableColumn();
        model.addColumn(column3);
        assertEquals(3, model.getColumnCount(false));
        assertEquals(3, model.getColumnCount(true));
    }
}

// PersistentTableColumnModel_9Test.java
package de.huxhorn.lilith.