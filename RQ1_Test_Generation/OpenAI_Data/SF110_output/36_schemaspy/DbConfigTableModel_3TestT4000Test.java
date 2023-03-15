// DbConfigTableModel_3Test.java
package net.sourceforge.schemaspy.ui;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.Config.MissingRequiredParameterException;
import net.sourceforge.schemaspy.util.DbSpecificConfig;
import net.sourceforge.schemaspy.util.DbSpecificOption;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DbConfigTableModel}.
* It contains ten unit test cases for the {@link DbConfigTableModel#getClass(int)} method.
*/
class DbConfigTableModel_3Test {

	/**
	* Test case for the {@link DbConfigTableModel#getClass(int)} method.
	*/
	@Test
	void testGetClass_0() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		Class<?> class0 = dbConfigTableModel0.getClass(0);
		assertEquals(class0, String.class);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getClass(int)} method.
	*/
	@Test
	void testGetClass_1() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		Class<?> class0 = dbConfigTableModel0.getClass(1);
		assertEquals(class0, String.class);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getClass(int)} method.
	*/
	@Test
	void testGetClass_2() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		Class<?> class0 = dbConfigTableModel0.getClass(2);
		assertEquals(class0, String.class);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getClass(int)} method.
	*/
	@Test
	void testGetClass_3() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		Class<?> class0 = dbConfigTableModel0.getClass(3);
		assertEquals(class0, String.class);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getClass(int)} method.
	*/
	@Test
	void testGetClass_4() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		Class<?> class0 = dbConfigTableModel0.getClass(4);
		assertEquals(class0, Boolean.class);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getClass(int)} method.
	*/
	@Test
	void testGetClass_5() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		Class<?> class0 = dbConfigTableModel0.getClass(5);
		assertEquals(class0, String.class);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getClass(int)} method.
	*/
	@Test
	void testGetClass_6() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		Class<?> class0 = dbConfigTableModel0.getClass(6);
		assertEquals(class0, String.class);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getClass(int)} method.
	*/
	@Test
	void testGetClass_7() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		Class<?> class0 = dbConfigTableModel0.getClass(7);
		assertEquals(class0, String.class);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getClass(int)} method.
	*/
	@Test
	void testGetClass_8() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		Class<?> class0 = dbConfigTableModel0.getClass(8);
		assertEquals(class0, String.class);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getClass(int)} method.
	*/
	@Test
	void testGetClass_9() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		Class<?> class0 = dbConfigTableModel0.getClass(9);
		assertEquals(class0, Boolean.class);
	}
}

// DbConfigTableModel_4Test.java
package net.sourceforge.schemaspy.ui;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.Config.MissingRequiredParameterException;
import net.sourceforge.schemaspy.util.DbSpecificConfig;
import net.sourceforge.schemaspy.util.DbSpecificOption;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DbConfigTableModel}.
* It contains ten unit test cases for the {@link DbConfigTableModel#getDescription(int)} method.
*/
class DbConfigTableModel_4Test {
		
	/**
	* Test case for the {@link DbConfigTableModel#getDescription(int)} method.
	*/
	@Test
	void testGetDescription_0() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		String string0 = dbConfigTableModel0.getDescription(0);
		assertEquals(string0, "Directory to generate HTML output to");
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getDescription(int)} method.
	*/
	@Test
	void testGetDescription_1() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		String string0 = dbConfigTableModel0.getDescription(1);
		assertEquals(string0, "Schema to evaluate");
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getDescription(int)} method.
	*/
	@Test
	void testGetDescription_2() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		String string0 = dbConfigTableModel0.getDescription(2);
		assertEquals(string0, "User ID to connect with");
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getDescription(int)} method.
	*/
	@Test
	void testGetDescription_3() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		String string0 = dbConfigTableModel0.getDescription(3);
		assertEquals(string0, "Password associated with user id");
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getDescription(int)} method.
	*/
	@Test
	void testGetDescription_4() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		String string0 = dbConfigTableModel0.getDescription(4);
		assertEquals(string0, "XXXX");
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getDescription(int)} method.
	*/
	@Test
	void testGetDescription_5() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		String string0 = dbConfigTableModel0.getDescription(5);
		assertEquals(string0, "Directory to generate HTML output to");
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getDescription(int)} method.
	*/
	@Test
	void testGetDescription_6() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		String string0 = dbConfigTableModel0.getDescription(6);
		assertEquals(string0, "Schema to evaluate");
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getDescription(int)} method.
	*/
	@Test
	void testGetDescription_7() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		String string0 = dbConfigTableModel0.getDescription(7);
		assertEquals(string0, "User ID to connect with");
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getDescription(int)} method.
	*/
	@Test
	void testGetDescription_8() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		String string0 = dbConfigTableModel0.getDescription(8);
		assertEquals(string0, "Password associated with user id");
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#getDescription(int)} method.
	*/
	@Test
	void testGetDescription_9() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		String string0 = dbConfigTableModel0.getDescription(9);
		assertEquals(string0, "XXXX");
	}
}

// DbConfigTableModel_5Test.java
package net.sourceforge.schemaspy.ui;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.Config.MissingRequiredParameterException;
import net.sourceforge.schemaspy.util.DbSpecificConfig;
import net.sourceforge.schemaspy.util.DbSpecificOption;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DbConfigTableModel}.
* It contains ten unit test cases for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
*/
class DbConfigTableModel_5Test {
		
	/**
	* Test case for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
	*/
	@Test
	void testIsCellEditable_0() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		boolean boolean0 = dbConfigTableModel0.isCellEditable(0, 0);
		assertFalse(boolean0);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
	*/
	@Test
	void testIsCellEditable_1() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		boolean boolean0 = dbConfigTableModel0.isCellEditable(0, 1);
		assertTrue(boolean0);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
	*/
	@Test
	void testIsCellEditable_2() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		boolean boolean0 = dbConfigTableModel0.isCellEditable(1, 0);
		assertFalse(boolean0);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
	*/
	@Test
	void testIsCellEditable_3() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		boolean boolean0 = dbConfigTableModel0.isCellEditable(1, 1);
		assertTrue(boolean0);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
	*/
	@Test
	void testIsCellEditable_4() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		boolean boolean0 = dbConfigTableModel0.isCellEditable(2, 0);
		assertFalse(boolean0);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
	*/
	@Test
	void testIsCellEditable_5() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		boolean boolean0 = dbConfigTableModel0.isCellEditable(2, 1);
		assertTrue(boolean0);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
	*/
	@Test
	void testIsCellEditable_6() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		boolean boolean0 = dbConfigTableModel0.isCellEditable(3, 0);
		assertFalse(boolean0);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
	*/
	@Test
	void testIsCellEditable_7() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		boolean boolean0 = dbConfigTableModel0.isCellEditable(3, 1);
		assertTrue(boolean0);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
	*/
	@Test
	void testIsCellEditable_8() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		boolean boolean0 = dbConfigTableModel0.isCellEditable(4, 0);
		assertFalse(boolean0);
	}
	
	/**
	* Test case for the {@link DbConfigTableModel#isCellEditable(int, int)} method.
	*/
	@Test
	void testIsCellEditable_9() {
		DbConfigTableModel dbConfigTableModel0 = new DbConfigTableModel();
		boolean boolean0 = dbConfigTableModel0.isCellEditable(4, 1);
		assertTrue(boolean0);
	}
}

// DbConfigTableModel_6Test.java
package net.sourceforge.schemaspy.ui;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.Config.MissingRequiredParameterException;
import net.sourceforge.schemaspy.util.DbSpecificConfig;
import net.sourceforge.schemaspy.util.DbSpecificOption;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DbConfigTableModel}.
* It contains ten unit test cases for the {@link DbConfigTableModel#setValueAt(Object, int, int)} method.
*/
class DbConfigTableModel_6Test {
		
	/**
	* Test case for the {@link DbConfigTableModel#setValueAt(Object, int, int)} method