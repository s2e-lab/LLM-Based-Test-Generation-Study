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
	* Test case for {@link ExtBoolArray#left()} method.
	* Test if the method returns the correct number of false values.
	*/
	@Test
	void testLeft() {
		ExtBoolArray array = new ExtBoolArray(10);
		array.setTrue(0, 9);
		assertEquals(0, array.left());
		array.setTrue(0, 8);
		assertEquals(1, array.left());
		array.setTrue(0, 7);
		assertEquals(2, array.left());
		array.setTrue(0, 6);
		assertEquals(3, array.left());
		array.setTrue(0, 5);
		assertEquals(4, array.left());
		array.setTrue(0, 4);
		assertEquals(5, array.left());
		array.setTrue(0, 3);
		assertEquals(6, array.left());
		array.setTrue(0, 2);
		assertEquals(7, array.left());
		array.setTrue(0, 1);
		assertEquals(8, array.left());
		array.setTrue(0, 0);
		assertEquals(9, array.left());
	}
}

// ExtBoolArray_2Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_2Test {
		
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testIsFalse() {
		ExtBoolArray array = new ExtBoolArray(10);
		array.setTrue(0, 9);
		assertFalse(array.isFalse(0, 9));
		array.setTrue(0, 8);
		assertFalse(array.isFalse(0, 8));
		assertTrue(array.isFalse(9, 9));
		array.setTrue(0, 7);
		assertFalse(array.isFalse(0, 7));
		assertTrue(array.isFalse(8, 8));
		assertTrue(array.isFalse(9, 9));
		array.setTrue(0, 6);
		assertFalse(array.isFalse(0, 6));
		assertTrue(array.isFalse(7, 7));
		assertTrue(array.isFalse(8, 8));
		assertTrue(array.isFalse(9, 9));
		array.setTrue(0, 5);
		assertFalse(array.isFalse(0, 5));
		assertTrue(array.isFalse(6, 6));
		assertTrue(array.isFalse(7, 7));
		assertTrue(array.isFalse(8, 8));
		assertTrue(array.isFalse(9, 9));
		array.setTrue(0, 4);
		assertFalse(array.isFalse(0, 4));
		assertTrue(array.isFalse(5, 5));
		assertTrue(array.isFalse(6, 6));
		assertTrue(array.isFalse(7, 7));
		assertTrue(array.isFalse(8, 8));
		assertTrue(array.isFalse(9, 9));
		array.setTrue(0, 3);
		assertFalse(array.isFalse(0, 3));
		assertTrue(array.isFalse(4, 4));
		assertTrue(array.isFalse(5, 5));
		assertTrue(array.isFalse(6, 6));
		assertTrue(array.isFalse(7, 7));
		assertTrue(array.isFalse(8, 8));
		assertTrue(array.isFalse(9, 9));
		array.setTrue(0, 2);
		assertFalse(array.isFalse(0, 2));
		assertTrue(array.isFalse(3, 3));
		assertTrue(array.isFalse(4, 4));
		assertTrue(array.isFalse(5, 5));
		assertTrue(array.isFalse(6, 6));
		assertTrue(array.isFalse(7, 7));
		assertTrue(array.isFalse(8, 8));
		assertTrue(array.isFalse(9, 9));
		array.setTrue(0, 1);
		assertFalse(array.isFalse(0, 1));
		assertTrue(array.isFalse(2, 2));
		assertTrue(array.isFalse(3, 3));
		assertTrue(array.isFalse(4, 4));
		assertTrue(array.isFalse(5, 5));
		assertTrue(array.isFalse(6, 6));
		assertTrue(array.isFalse(7, 7));
		assertTrue(array.isFalse(8, 8));
		assertTrue(array.isFalse(9, 9));
		array.setTrue(0, 0);
		assertFalse(array.isFalse(0, 0));
		assertTrue(array.isFalse(1, 1));
		assertTrue(array.isFalse(2, 2));
		assertTrue(array.isFalse(3, 3));
		assertTrue(array.isFalse(4, 4));
		assertTrue(array.isFalse(5, 5));
		assertTrue(array.isFalse(6, 6));
		assertTrue(array.isFalse(7, 7));
		assertTrue(array.isFalse(8, 8));
		assertTrue(array.isFalse(9, 9));
	}
}

// ExtBoolArray_3Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#setTrue(int, int)} method.
*/
class ExtBoolArray_3Test {
		
	/**
	* Test case for {@link ExtBoolArray#setTrue(int, int)} method.
	* Test if the method sets the correct values to true.
	*/
	@Test
	void testSetTrue() {
		ExtBoolArray array = new ExtBoolArray(10);
		array.setTrue(0, 9);
		assertTrue(array.isFalse(0, 0));
		assertTrue(array.isFalse(1, 1));
		assertTrue(array.isFalse(2, 2));
		assertTrue(array.isFalse(3, 3));
		assertTrue(array.isFalse(4, 4));
		assertTrue(array.isFalse(5, 5));
		assertTrue(array.isFalse(6, 6));
		assertTrue(array.isFalse(7, 7));
		assertTrue(array.isFalse(8, 8));
		assertTrue(array.isFalse(9, 9));
		array.setTrue(0, 8);
		assertTrue(array.isFalse(0, 0));
		assertTrue(array.isFalse(1, 1));
		assertTrue(array.isFalse(2, 2));
		assertTrue(array.isFalse(3, 3));
		assertTrue(array.isFalse(4, 4));
		assertTrue(array.isFalse(5, 5));
		assertTrue(array.isFalse(6, 6));
		assertTrue(array.isFalse(7, 7));
		assertTrue(array.isFalse(8, 8));
		assertFalse(array.isFalse(9, 9));
		array.setTrue(0, 7);
		assertTrue(array.isFalse(0, 0));
		assertTrue(array.isFalse(1, 1));
		assertTrue(array.isFalse(2, 2));
		assertTrue(array.isFalse(3, 3));
		assertTrue(array.isFalse(4, 4));
		assertTrue(array.isFalse(5, 5));
		assertTrue(array.isFalse(6, 6));
		assertTrue(array.isFalse(7, 7));
		assertFalse(array.isFalse(8, 8));
		assertFalse(array.isFalse(9, 9));
		array.setTrue(0, 6);
		assertTrue(array.isFalse(0, 0));
		assertTrue(array.isFalse(1, 1));
		assertTrue(array.isFalse(2, 2));
		assertTrue(array.isFalse(3, 3));
		assertTrue(array.isFalse(4, 4));
		assertTrue(array.isFalse(5, 5));
		assertTrue(array.isFalse(6, 6));
		assertFalse(array.isFalse(7, 7));
		assertFalse(array.isFalse(8, 8));
		assertFalse(array.isFalse(9, 9));
		array.setTrue(0, 5);
		assertTrue(array.isFalse(0, 0));
		assertTrue(array.isFalse(1, 1));
		assertTrue(array.isFalse(2, 2));
		assertTrue(array.isFalse(3, 3));
		assertTrue(array.isFalse(4, 4));
		assertTrue(array.isFalse(5, 5));
		assertFalse(array.isFalse(6, 6));
		assertFalse(array.isFalse(7, 7));
		assertFalse(array.isFalse(8, 8));
		assertFalse(array.isFalse(9, 9));
		array.setTrue(0, 4);
		assertTrue(array.isFalse(0, 0));
		assertTrue(array.isFalse(1, 1));
		assertTrue(array.isFalse(2, 2));
		assertTrue(array.isFalse(3, 3));
		assertTrue(array.isFalse(4, 4));
		assertFalse(array.isFalse(5, 5));
		assertFalse(array.isFalse(6, 6));
		assertFalse(array.isFalse(7, 7));
		assertFalse(array.isFalse(8, 8));
		assertFalse(array.isFalse(9, 9));
		array.setTrue(0, 3);
		assertTrue(array.isFalse(0, 0));
		assertTrue(array.isFalse(1, 1));
		assertTrue(array.isFalse(2, 2));
		assertTrue(array.isFalse(3, 3));
		assertFalse(array.isFalse(4, 4));
		assertFalse(array.isFalse(5, 5));
		assertFalse(array.isFalse(6, 6));
		assertFalse(array.isFalse(7, 7));
		assertFalse(array.isFalse(8, 8));
		assertFalse(array.isFalse(9, 9));
		array.setTrue(0, 2);
		assertTrue(array.isFalse(0, 0));
		assertTrue(array.isFalse(1, 1));
		assertTrue(array.isFalse(2, 2));
		assertFalse(array.isFalse(3, 3));
		assertFalse(array.isFalse(4, 4));
		assertFalse(array.isFalse(5, 5));
		assertFalse(array.isFalse(6, 6));
		assertFalse(array.isFalse(7, 7));
		assertFalse(array.isFalse(8, 8));
		assertFalse(array.isFalse(9, 9));
		array.setTrue(0, 1);
		assertTrue(array.isFalse(0, 0));
		assertTrue(array.isFalse(1, 1));
		assertFalse(array.isFalse(2, 2));
		assertFalse(array.isFalse(3, 3));
		assertFalse(array.isFalse(4, 4));
		assertFalse(array.isFalse(5, 5));
		assertFalse(array.isFalse(6, 6));
		assertFalse(array.isFalse(7, 7));
		assertFalse(array.isFalse(8, 8));
		assertFalse(array.isFalse(9, 9));
		array.setTrue(0, 0);
		assertFalse(array.isFalse(0, 0));
		assertFalse(array.isFalse(1, 1));
		assertFalse(array.isFalse(2, 2));
		assertFalse(array.isFalse(3, 3));
		assertFalse(array.isFalse(4, 4));
		assertFalse(array.isFalse(5, 5));
		assertFalse(array.isFalse(6, 6));
		assertFalse(array.isFalse(7, 7));
		assertFalse(array.isFalse(8, 8));
		assertFalse(array.isFalse(9, 9));
	}
}

// ExtBoolArray_4Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#ExtBoolArray(int)} constructor.
*/
class ExtBoolArray_4Test {
		
	/**
	* Test case for {@link ExtBoolArray#ExtBoolArray(int)} constructor.
	* Test if the constructor creates an array with the correct length.
	*/
	@Test
	void testExtBoolArray() {
		ExtBoolArray array = new ExtBoolArray(10);
		assertEquals(10, array.left());
		array = new ExtBoolArray(9);
		assertEquals(9, array.left());
		array = new ExtBoolArray(8);
		assertEquals(8, array.left());
		array = new ExtBoolArray(7);
		assertEquals(7, array.left());
		array = new ExtBoolArray(6);
		assertEquals(6, array.left());
		array = new ExtBoolArray(5);
		assertEquals(5, array.left());
		array = new ExtBoolArray(4);
		assertEquals(4, array.left());
		array = new ExtBoolArray(3);
		assertEquals(3, array.left());
		array = new ExtBoolArray(2);
		assertEquals(2, array.left());
		array = new ExtBoolArray(1);
		assertEquals(1, array.left());
	}
}

// ExtBoolArray_5Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#ExtBoolArray(int)} constructor.
*/
class ExtBoolArray_5Test {
		
	/**
	* Test case for {@link ExtBoolArray#ExtBoolArray(int)} constructor.
	* Test if the constructor creates an array with the correct length.
	*/
	@Test
	void testExtBoolArray() {
		ExtBoolArray array = new ExtBoolArray(10);
		assertEquals(10, array.left());
		array = new ExtBoolArray(9);
		assertEquals(9, array.left());
		array = new ExtBoolArray(8);
		assertEquals(8, array.left());
		array = new ExtBoolArray(7);
		assert