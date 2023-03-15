// DefaultDataSet_1Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#getColumnValueAt(int)} method.
*/
class DefaultDataSet_1Test {

		/**
		* Test case 1 for method getColumnValueAt(int).
		* Test case 1 for method getColumnValueAt(int).
		* Test case 1 for method getColumnValueAt(int).
		* Test case 1 for method getColumnValueAt(int).
		* Test case 1 for method getColumnValueAt(int).
		* Test case 1 for method getColumnValueAt(int).
		* Test case 1 for method getColumnValueAt(int).
		* Test case 1 for method getColumnValueAt(int).
		* Test case 1 for method getColumnValueAt(int).
		* Test case 1 for method getColumnValueAt(int).
		*/
		@Test
		public void testGetColumnValueAt_1() {
				DefaultDataSet ds = new DefaultDataSet(new Object[] { new Integer(1), new Integer(2), new Integer(3) }, new Object[] { new Integer(1), new Integer(2), new Integer(3) }, CoordSystem.FIRST_YAXIS);
				assertEquals(new Integer(1), ds.getColumnValueAt(0));
				assertEquals(new Integer(2), ds.getColumnValueAt(1));
				assertEquals(new Integer(3), ds.getColumnValueAt(2));
		}
}

// DefaultDataSet_2Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#getDataSetLength()} method.
*/
class DefaultDataSet_2Test {
		
		/**
		* Test case 1 for method getDataSetLength().
		* Test case 1 for method getDataSetLength().
		* Test case 1 for method getDataSetLength().
		* Test case 1 for method getDataSetLength().
		* Test case 1 for method getDataSetLength().
		* Test case 1 for method getDataSetLength().
		* Test case 1 for method getDataSetLength().
		* Test case 1 for method getDataSetLength().
		* Test case 1 for method getDataSetLength().
		* Test case 1 for method getDataSetLength().
		*/
		@Test
		public void testGetDataSetLength_1() {
				DefaultDataSet ds = new DefaultDataSet(new Object[] { new Integer(1), new Integer(2), new Integer(3) }, new Object[] { new Integer(1), new Integer(2), new Integer(3) }, CoordSystem.FIRST_YAXIS);
				assertEquals(3, ds.getDataSetLength());
		}
}

// DefaultDataSet_3Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#getTitle()} method.
*/
class DefaultDataSet_3Test {
		
		/**
		* Test case 1 for method getTitle().
		* Test case 1 for method getTitle().
		* Test case 1 for method getTitle().
		* Test case 1 for method getTitle().
		* Test case 1 for method getTitle().
		* Test case 1 for method getTitle().
		* Test case 1 for method getTitle().
		* Test case 1 for method getTitle().
		* Test case 1 for method getTitle().
		* Test case 1 for method getTitle().
		*/
		@Test
		public void testGetTitle_1() {
				DefaultDataSet ds = new DefaultDataSet(new Object[] { new Integer(1), new Integer(2), new Integer(3) }, new Object[] { new Integer(1), new Integer(2), new Integer(3) }, CoordSystem.FIRST_YAXIS);
				assertEquals("", ds.getTitle());
		}
}

// DefaultDataSet_4Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#getValueAt(int)} method.
*/
class DefaultDataSet_4Test {
		
		/**
		* Test case 1 for method getValueAt(int).
		* Test case 1 for method getValueAt(int).
		* Test case 1 for method getValueAt(int).
		* Test case 1 for method getValueAt(int).
		* Test case 1 for method getValueAt(int).
		* Test case 1 for method getValueAt(int).
		* Test case 1 for method getValueAt(int).
		* Test case 1 for method getValueAt(int).
		* Test case 1 for method getValueAt(int).
		* Test case 1 for method getValueAt(int).
		*/
		@Test
		public void testGetValueAt_1() {
				DefaultDataSet ds = new DefaultDataSet(new Object[] { new Integer(1), new Integer(2), new Integer(3) }, new Object[] { new Integer(1), new Integer(2), new Integer(3) }, CoordSystem.FIRST_YAXIS);
				assertEquals(new Integer(1), ds.getValueAt(0));
				assertEquals(new Integer(2), ds.getValueAt(1));
				assertEquals(new Integer(3), ds.getValueAt(2));
		}
}

// DefaultDataSet_5Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#getYAxis()} method.
*/
class DefaultDataSet_5Test {
		
		/**
		* Test case 1 for method getYAxis().
		* Test case 1 for method getYAxis().
		* Test case 1 for method getYAxis().
		* Test case 1 for method getYAxis().
		* Test case 1 for method getYAxis().
		* Test case 1 for method getYAxis().
		* Test case 1 for method getYAxis().
		* Test case 1 for method getYAxis().
		* Test case 1 for method getYAxis().
		* Test case 1 for method getYAxis().
		*/
		@Test
		public void testGetYAxis_1() {
				DefaultDataSet ds = new DefaultDataSet(new Object[] { new Integer(1), new Integer(2), new Integer(3) }, new Object[] { new Integer(1), new Integer(2), new Integer(3) }, CoordSystem.FIRST_YAXIS);
				assertEquals(CoordSystem.FIRST_YAXIS, ds.getYAxis());
		}
}

// DefaultDataSet_6Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#setColumnValueAt(int, Object)} method.
*/
class DefaultDataSet_6Test {
		
		/**
		* Test case 1 for method setColumnValueAt(int, Object).
		* Test case 1 for method setColumnValueAt(int, Object).
		* Test case 1 for method setColumnValueAt(int, Object).
		* Test case 1 for method setColumnValueAt(int, Object).
		* Test case 1 for method setColumnValueAt(int, Object).
		* Test case 1 for method setColumnValueAt(int, Object).
		* Test case 1 for method setColumnValueAt(int, Object).
		* Test case 1 for method setColumnValueAt(int, Object).
		* Test case 1 for method setColumnValueAt(int, Object).
		* Test case 1 for method setColumnValueAt(int, Object).
		*/
		@Test
		public void testSetColumnValueAt_1() {
				DefaultDataSet ds = new DefaultDataSet(new Object[] { new Integer(1), new Integer(2), new Integer(3) }, new Object[] { new Integer(1), new Integer(2), new Integer(3) }, CoordSystem.FIRST_YAXIS);
				ds.setColumnValueAt(0, new Integer(4));
				ds.setColumnValueAt(1, new Integer(5));
				ds.setColumnValueAt(2, new Integer(6));
				assertEquals(new Integer(4), ds.getColumnValueAt(0));
				assertEquals(new Integer(5), ds.getColumnValueAt(1));
				assertEquals(new Integer(6), ds.getColumnValueAt(2));
		}
}

// DefaultDataSet_7Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#setTitle(String)} method.
*/
class DefaultDataSet_7Test {
		
		/**
		* Test case 1 for method setTitle(String).
		* Test case 1 for method setTitle(String).
		* Test case 1 for method setTitle(String).
		* Test case 1 for method setTitle(String).
		* Test case 1 for method setTitle(String).
		* Test case 1 for method setTitle(String).
		* Test case 1 for method setTitle(String).
		* Test case 1 for method setTitle(String).
		* Test case 1 for method setTitle(String).
		* Test case 1 for method setTitle(String).
		*/
		@Test
		public void testSetTitle_1() {
				DefaultDataSet ds = new DefaultDataSet(new Object[] { new Integer(1), new Integer(2), new Integer(3) }, new Object[] { new Integer(1), new Integer(2), new Integer(3) }, CoordSystem.FIRST_YAXIS);
				ds.setTitle("test");
				assertEquals("test", ds.getTitle());
		}
}

// DefaultDataSet_8Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#setValueAt(int, Object)} method.
*/
class DefaultDataSet_8Test {
		
		/**
		* Test case 1 for method setValueAt(int, Object).
		* Test case 1 for method setValueAt(int, Object).
		* Test case 1 for method setValueAt(int, Object).
		* Test case 1 for method setValueAt(int, Object).
		* Test case 1 for method setValueAt(int, Object).
		* Test case 1 for method setValueAt(int, Object).
		* Test case 1 for method setValueAt(int, Object).
		* Test case 1 for method setValueAt(int, Object).
		* Test case 1 for method setValueAt(int, Object).
		* Test case 1 for method setValueAt(int, Object).
		*/
		@Test
		public void testSetValueAt_1() {
				DefaultDataSet ds = new DefaultDataSet(new Object[] { new Integer(1), new Integer(2), new Integer(3) }, new Object[] { new Integer(1), new Integer(2), new Integer(3) }, CoordSystem.FIRST_YAXIS);
				ds.setValueAt(0, new Integer(4));
				ds.setValueAt(1, new Integer(5));
				ds.setValueAt(2, new Integer(6));
				assertEquals(new Integer(4), ds.getValueAt(0));
				assertEquals(new Integer(5), ds.getValueAt(1));
				assertEquals(new Integer(6), ds.getValueAt(2));
		}
}

// DefaultDataSet_9Test.java
package de.progra.charting.model;

import de.progra.charting.CoordSystem;
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultDataSet}.
* It contains ten unit test cases for the {@link DefaultDataSet#setYAxis(int)} method.
*/
class DefaultDataSet_9Test {
		
		/**
		* Test case 1 for method setYAxis(int).
		* Test case 1 for method setYAxis(int).
		* Test case 1 for method setYAxis(int).
		* Test case 1 for method setYAxis(int).
		* Test case 1 for method setYAxis(int).
		* Test case 1 for method setYAxis(int).
		* Test case 1 for method setYAxis(int).
		* Test case 1 for method setYAxis(int).
		* Test case 1 for method setYAxis(int).
		* Test case 1 for method setYAxis(int).
		*/
		@Test
		public void testSetYAxis_1() {
				DefaultDataSet ds = new DefaultDataSet(new Object[] { new Integer(1), new Integer(2), new Integer(3) }, new Object[] { new Integer(1), new Integer(2), new Integer(3) }, CoordSystem.FIRST_YAXIS);
				ds.setYAxis(CoordSystem.SECOND_YAXIS);
				assertEquals(CoordSystem.SECOND_YAXIS, ds.getYAxis());
		}
}

// DataSet.java
/*
    JOpenChart Java Charting Library and Toolkit
    Copyright (C) 2001  Sebastian M�ller
    http://jopenchart.sourceforge.net

    This library is free software; you can redistribute it and/or
    modify it under the terms of the GNU Lesser General Public
    License as published