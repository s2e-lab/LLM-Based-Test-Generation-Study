// ExtBoolArrayTest1.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArrayTest1 {

	/**
	* Test case for {@link ExtBoolArray#left()} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return 10.
	*/
	@Test
	void testLeft1() {
		ExtBoolArray eba = new ExtBoolArray(10);
		assertEquals(10, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return 9.
	*/
	@Test
	void testLeft2() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 0);
		assertEquals(9, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return 8.
	*/
	@Test
	void testLeft3() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 1);
		assertEquals(8, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return 7.
	*/
	@Test
	void testLeft4() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 2);
		assertEquals(7, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return 6.
	*/
	@Test
	void testLeft5() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 3);
		assertEquals(6, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return 5.
	*/
	@Test
	void testLeft6() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 4);
		assertEquals(5, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return 4.
	*/
	@Test
	void testLeft7() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 5);
		assertEquals(4, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return 3.
	*/
	@Test
	void testLeft8() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 6);
		assertEquals(3, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return 2.
	*/
	@Test
	void testLeft9() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 7);
		assertEquals(2, eba.left());
	}
	
	/**
	* Test case for {@link ExtBoolArray#left()} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return 1.
	*/
	@Test
	void testLeft10() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 8);
		assertEquals(1, eba.left());
	}
	
}

// ExtBoolArrayTest2.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArrayTest2 {
		
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return true.
	*/
	@Test
	void testIsFalse1() {
		ExtBoolArray eba = new ExtBoolArray(10);
		assertTrue(eba.isFalse(0, 9));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return false.
	*/
	@Test
	void testIsFalse2() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 0);
		assertFalse(eba.isFalse(0, 9));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return false.
	*/
	@Test
	void testIsFalse3() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 1);
		assertFalse(eba.isFalse(0, 9));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return false.
	*/
	@Test
	void testIsFalse4() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 2);
		assertFalse(eba.isFalse(0, 9));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return false.
	*/
	@Test
	void testIsFalse5() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 3);
		assertFalse(eba.isFalse(0, 9));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return false.
	*/
	@Test
	void testIsFalse6() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 4);
		assertFalse(eba.isFalse(0, 9));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)} method.
	* It tests the method with a ExtBoolArray of length 10.
	* The method should return false.
	*/
	@Test
	void testIsFalse7() {
		ExtBoolArray eba = new ExtBoolArray(10);
		eba.setTrue(0, 5);
		assertFalse(