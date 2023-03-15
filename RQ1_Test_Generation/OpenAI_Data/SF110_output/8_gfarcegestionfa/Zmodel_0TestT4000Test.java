// Zmodel_0Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.table.AbstractTableModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Zmodel}.
* It contains ten unit test cases for the {@link Zmodel#getColumnName(int)} method.
*/
class Zmodel_0Test {

	/**
	 * Test case for {@link Zmodel#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value.
	 */
	@Test
	void testGetColumnName_0() {
		// Initialize the inputs
		Object[][] data = new Object[][] {
			new Object[] { "a", "b", "c" },
			new Object[] { "d", "e", "f" },
			new Object[] { "g", "h", "i" }
		};
		String[] title = new String[] { "a", "b", "c" };
		Zmodel zmodel = new Zmodel(data, title);
		
		// Execute the tested method
		String result = zmodel.getColumnName(0);
		
		// Verify the result
		assertEquals("a", result);
	}
	
	/**
	 * Test case for {@link Zmodel#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value.
	 */
	@Test
	void testGetColumnName_1() {
		// Initialize the inputs
		Object[][] data = new Object[][] {
			new Object[] { "a", "b", "c" },
			new Object[] { "d", "e", "f" },
			new Object[] { "g", "h", "i" }
		};
		String[] title = new String[] { "a", "b", "c" };
		Zmodel zmodel = new Zmodel(data, title);
		
		// Execute the tested method
		String result = zmodel.getColumnName(1);
		
		// Verify the result
		assertEquals("b", result);
	}
	
	/**
	 * Test case for {@link Zmodel#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value.
	 */
	@Test
	void testGetColumnName_2() {
		// Initialize the inputs
		Object[][] data = new Object[][] {
			new Object[] { "a", "b", "c" },
			new Object[] { "d", "e", "f" },
			new Object[] { "g", "h", "i" }
		};
		String[] title = new String[] { "a", "b", "c" };
		Zmodel zmodel = new Zmodel(data, title);
		
		// Execute the tested method
		String result = zmodel.getColumnName(2);
		
		// Verify the result
		assertEquals("c", result);
	}
	
	/**
	 * Test case for {@link Zmodel#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value.
	 */
	@Test
	void testGetColumnName_3() {
		// Initialize the inputs
		Object[][] data = new Object[][] {
			new Object[] { "a", "b", "c" },
			new Object[] { "d", "e", "f" },
			new Object[] { "g", "h", "i" }
		};
		String[] title = new String[] { "a", "b", "c" };
		Zmodel zmodel = new Zmodel(data, title);
		
		// Execute the tested method
		String result = zmodel.getColumnName(3);
		
		// Verify the result
		assertEquals("c", result);
	}
	
	/**
	 * Test case for {@link Zmodel#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value.
	 */
	@Test
	void testGetColumnName_4() {
		// Initialize the inputs
		Object[][] data = new Object[][] {
			new Object[] { "a", "b", "c" },
			new Object[] { "d", "e", "f" },
			new Object[] { "g", "h", "i" }
		};
		String[] title = new String[] { "a", "b", "c" };
		Zmodel zmodel = new Zmodel(data, title);
		
		// Execute the tested method
		String result = zmodel.getColumnName(4);
		
		// Verify the result
		assertEquals("c", result);
	}
	
	/**
	 * Test case for {@link Zmodel#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value.
	 */
	@Test
	void testGetColumnName_5() {
		// Initialize the inputs
		Object[][] data = new Object[][] {
			new Object[] { "a", "b", "c" },
			new Object[] { "d", "e", "f" },
			new Object[] { "g", "h", "i" }
		};
		String[] title = new String[] { "a", "b", "c" };
		Zmodel zmodel = new Zmodel(data, title);
		
		// Execute the tested method
		String result = zmodel.getColumnName(5);
		
		// Verify the result
		assertEquals("c", result);
	}
	
	/**
	 * Test case for {@link Zmodel#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value.
	 */
	@Test
	void testGetColumnName_6() {
		// Initialize the inputs
		Object[][] data = new Object[][] {
			new Object[] { "a", "b", "c" },
			new Object[] { "d", "e", "f" },
			new Object[] { "g", "h", "i" }
		};
		String[] title = new String[] { "a", "b", "c" };
		Zmodel zmodel = new Zmodel(data, title);
		
		// Execute the tested method
		String result = zmodel.getColumnName(6);
		
		// Verify the result
		assertEquals("c", result);
	}
	
	/**
	 * Test case for {@link Zmodel#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value.
	 */
	@Test
	void testGetColumnName_7() {
		// Initialize the inputs
		Object[][] data = new Object[][] {
			new Object[] { "a", "b", "c" },
			new Object[] { "d", "e", "f" },
			new Object[] { "g", "h", "i" }
		};
		String[] title = new String[] { "a", "b", "c" };
		Zmodel zmodel = new Zmodel(data, title);
		
		// Execute the tested method
		String result = zmodel.getColumnName(7);
		
		// Verify the result
		assertEquals("c", result);
	}
	
	/**
	 * Test case for {@link Zmodel#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value.
	 */
	@Test
	void testGetColumnName_8() {
		// Initialize the inputs
		Object[][] data = new Object[][] {
			new Object[] { "a", "b", "c" },
			new Object[] { "d", "e", "f" },
			new Object[] { "g", "h", "i" }
		};
		String[] title = new String[] { "a", "b", "c" };
		Zmodel zmodel = new Zmodel(data, title);
		
		// Execute the tested method
		String result = zmodel.getColumnName(8);
		
		// Verify the result
		assertEquals("c", result);
	}
	
	/**
	 * Test case for {@link Zmodel#getColumnName(int)}.
	 * This test case is used to check if the method returns the correct value.
	 */
	@Test
	void testGetColumnName_9() {
		// Initialize the inputs
		Object[][] data = new Object[][] {
			new Object[] { "a", "b", "c" },
			new Object[] { "d", "e", "f" },
			new Object[] { "g", "h", "i" }
		};
		String[] title = new String[] { "a", "b", "c" };
		Zmodel zmodel = new Zmodel(data, title);
		
		// Execute the tested method
		String result = zmodel.getColumnName(9);
		
		// Verify the result
		assertEquals("c", result);
	}
	
}