// ExtBoolArray_0Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_0Test {

	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * <p>
	 * Test if the method returns true if the array contains only false values.
	 */
	@Test
	void testIsFalse_0() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		assertTrue(extBoolArray.isFalse(0, 4));
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * <p>
	 * Test if the method returns false if the array contains only true values.
	 */
	@Test
	void testIsFalse_1() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertFalse(extBoolArray.isFalse(0, 4));
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * <p>
	 * Test if the method returns false if the array contains only true values.
	 */
	@Test
	void testIsFalse_2() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertFalse(extBoolArray.isFalse(0, 4));
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * <p>
	 * Test if the method returns false if the array contains only true values.
	 */
	@Test
	void testIsFalse_3() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertFalse(extBoolArray.isFalse(0, 4));
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * <p>
	 * Test if the method returns false if the array contains only true values.
	 */
	@Test
	void testIsFalse_4() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertFalse(extBoolArray.isFalse(0, 4));
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * <p>
	 * Test if the method returns false if the array contains only true values.
	 */
	@Test
	void testIsFalse_5() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertFalse(extBoolArray.isFalse(0, 4));
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * <p>
	 * Test if the method returns false if the array contains only true values.
	 */
	@Test
	void testIsFalse_6() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertFalse(extBoolArray.isFalse(0, 4));
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * <p>
	 * Test if the method returns false if the array contains only true values.
	 */
	@Test
	void testIsFalse_7() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertFalse(extBoolArray.isFalse(0, 4));
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * <p>
	 * Test if the method returns false if the array contains only true values.
	 */
	@Test
	void testIsFalse_8() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertFalse(extBoolArray.isFalse(0, 4));
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * <p>
	 * Test if the method returns false if the array contains only true values.
	 */
	@Test
	void testIsFalse_9() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertFalse(extBoolArray.isFalse(0, 4));
	}
	
}

// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_1Test {
		
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * <p>
	 * Test if the method returns the correct number of false values.
	 */
	@Test
	void testLeft_0() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		assertEquals(5, extBoolArray.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * <p>
	 * Test if the method returns the correct number of false values.
	 */
	@Test
	void testLeft_1() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertEquals(0, extBoolArray.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * <p>
	 * Test if the method returns the correct number of false values.
	 */
	@Test
	void testLeft_2() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertEquals(0, extBoolArray.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * <p>
	 * Test if the method returns the correct number of false values.
	 */
	@Test
	void testLeft_3() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertEquals(0, extBoolArray.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * <p>
	 * Test if the method returns the correct number of false values.
	 */
	@Test
	void testLeft_4() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertEquals(0, extBoolArray.left());
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * <p>
	 * Test if the method returns the correct number of false values.
	 */
	@Test
	void testLeft_5() {
		ExtBoolArray extBoolArray = new ExtBoolArray(5);
		extBoolArray.setTrue(0, 4);
		assertEquals(0, extBoolArray.left());
	}
	
	/**
	 * Test case for {@link ExtBool