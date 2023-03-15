// Zmodel_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.table.AbstractTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Zmodel}.
* It contains ten unit test cases for the {@link Zmodel#getValueAt(int, int)} method.
*/
class Zmodel_1Test {

	/**
	* Test case for the {@link Zmodel#getValueAt(int, int)} method.
	* This test case checks if the method returns the correct value for the first row and the first column.
	*/
	@Test
	void testGetValueAt_1() {
		Object[][] data = new Object[][] {
			new Object[] { "1", "2", "3" },
			new Object[] { "4", "5", "6" },
			new Object[] { "7", "8", "9" }
		};
		String[] title = new String[] { "A", "B", "C" };
		Zmodel zmodel = new Zmodel(data, title);
		assertEquals("1", zmodel.getValueAt(0, 0));
	}
	
	/**
	* Test case for the {@link Zmodel#getValueAt(int, int)} method.
	* This test case checks if the method returns the correct value for the first row and the second column.
	*/
	@Test
	void testGetValueAt_2() {
		Object[][] data = new Object[][] {
			new Object[] { "1", "2", "3" },
			new Object[] { "4", "5", "6" },
			new Object[] { "7", "8", "9" }
		};
		String[] title = new String[] { "A", "B", "C" };
		Zmodel zmodel = new Zmodel(data, title);
		assertEquals("2", zmodel.getValueAt(0, 1));
	}
	
	/**
	* Test case for the {@link Zmodel#getValueAt(int, int)} method.
	* This test case checks if the method returns the correct value for the first row and the third column.
	*/
	@Test
	void testGetValueAt_3() {
		Object[][] data = new Object[][] {
			new Object[] { "1", "2", "3" },
			new Object[] { "4", "5", "6" },
			new Object[] { "7", "8", "9" }
		};
		String[] title = new String[] { "A", "B", "C" };
		Zmodel zmodel = new Zmodel(data, title);
		assertEquals("3", zmodel.getValueAt(0, 2));
	}
	
	/**
	* Test case for the {@link Zmodel#getValueAt(int, int)} method.
	* This test case checks if the method returns the correct value for the second row and the first column.
	*/
	@Test
	void testGetValueAt_4() {
		Object[][] data = new Object[][] {
			new Object[] { "1", "2", "3" },
			new Object[] { "4", "5", "6" },
			new Object[] { "7", "8", "9" }
		};
		String[] title = new String[] { "A", "B", "C" };
		Zmodel zmodel = new Zmodel(data, title);
		assertEquals("4", zmodel.getValueAt(1, 0));
	}
	
	/**
	* Test case for the {@link Zmodel#getValueAt(int, int)} method.
	* This test case checks if the method returns the correct value for the second row and the second column.
	*/
	@Test
	void testGetValueAt_5() {
		Object[][] data = new Object[][] {
			new Object[] { "1", "2", "3" },
			new Object[] { "4", "5", "6" },
			new Object[] { "7", "8", "9" }
		};
		String[] title = new String[] { "A", "B", "C" };
		Zmodel zmodel = new Zmodel(data, title);
		assertEquals("5", zmodel.getValueAt(1, 1));
	}
	
	/**
	* Test case for the {@link Zmodel#getValueAt(int, int)} method.
	* This test case checks if the method returns the correct value for the second row and the third column.
	*/
	@Test
	void testGetValueAt_6() {
		Object[][] data = new Object[][] {
			new Object[] { "1", "2", "3" },
			new Object[] { "4", "5", "6" },
			new Object[] { "7", "8", "9" }
		};
		String[] title = new String[] { "A", "B", "C" };
		Zmodel zmodel = new Zmodel(data, title);
		assertEquals("6", zmodel.getValueAt(1, 2));
	}
	
	/**
	* Test case for the {@link Zmodel#getValueAt(int, int)} method.
	* This test case checks if the method returns the correct value for the third row and the first column.
	*/
	@Test
	void testGetValueAt_7() {
		Object[][] data = new Object[][] {
			new Object[] { "1", "2", "3" },
			new Object[] { "4", "5", "6" },
			new Object[] { "7", "8", "9" }
		};
		String[] title = new String[] { "A", "B", "C" };
		Zmodel zmodel = new Zmodel(data, title);
		assertEquals("7", zmodel.getValueAt(2, 0));
	}
	
	/**
	* Test case for the {@link Zmodel#getValueAt(int, int)} method.
	* This test case checks if the method returns the correct value for the third row and the second column.
	*/
	@Test
	void testGetValueAt_8() {
		Object[][] data = new Object[][] {
			new Object[] { "1", "2", "3" },
			new Object[] { "4", "5", "6" },
			new Object[] { "7", "8", "9" }
		};
		String[] title = new String[] { "A", "B", "C" };
		Zmodel zmodel = new Zmodel(data, title);
		assertEquals("8", zmodel.getValueAt(2, 1));
	}
	
	/**
	* Test case for the {@link Zmodel#getValueAt(int, int)} method.
	* This test case checks if the method returns the correct value for the third row and the third column.
	*/
	@Test
	void testGetValueAt_9() {
		Object[][] data = new Object[][] {
			new Object[] { "1", "2", "3" },
			new Object[] { "4", "5", "6" },
			new Object[] { "7", "8", "9" }
		};
		String[] title = new String[] { "A", "B", "C" };
		Zmodel zmodel = new Zmodel(data, title);
		assertEquals("9", zmodel.getValueAt(2, 2));
	}
	
	/**
	* Test case for the {@link Zmodel#getValueAt(int, int)} method.
	* This test case checks if the method returns the correct value for the first row and the first column.
	*/
	@Test
	void testGetValueAt_10() {
		Object[][] data = new Object[][] {
			new Object[] { "1", "2", "3" },
			new Object[] { "4", "5", "6" },
			new Object[] { "7", "8", "9" }
		};
		String[] title = new String[] { "A", "B", "C" };
		Zmodel zmodel = new Zmodel(data, title);
		assertEquals("1", zmodel.getValueAt(0, 0));
	}
	
}