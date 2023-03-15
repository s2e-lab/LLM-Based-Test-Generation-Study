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
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 0</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_0() {
		// initialize input arguments
		int a = 0;
		int b = 0;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(1);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(true, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 0</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = false</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_1() {
		// initialize input arguments
		int a = 0;
		int b = 0;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(1);
		testSubject.setTrue(0, 0);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(false, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 1</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_2() {
		// initialize input arguments
		int a = 0;
		int b = 1;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(2);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(true, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 1</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = false</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_3() {
		// initialize input arguments
		int a = 0;
		int b = 1;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(2);
		testSubject.setTrue(0, 0);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(false, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 1</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = false</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_4() {
		// initialize input arguments
		int a = 0;
		int b = 1;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(2);
		testSubject.setTrue(1, 1);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(false, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 1</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = false</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_5() {
		// initialize input arguments
		int a = 0;
		int b = 1;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(2);
		testSubject.setTrue(0, 1);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(false, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 2</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = true</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_6() {
		// initialize input arguments
		int a = 0;
		int b = 2;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(3);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(true, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 2</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = false</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_7() {
		// initialize input arguments
		int a = 0;
		int b = 2;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(3);
		testSubject.setTrue(0, 0);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(false, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 2</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = false</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_8() {
		// initialize input arguments
		int a = 0;
		int b = 2;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(3);
		testSubject.setTrue(1, 1);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(false, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 2</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = false</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_9() {
		// initialize input arguments
		int a = 0;
		int b = 2;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(3);
		testSubject.setTrue(2, 2);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(false, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#isFalse(int, int)}
	 * with the following input:
	 * <ul>
	 * <li>a = 0</li>
	 * <li>b = 2</li>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = false</li>
	 * </ul>
	 */
	@Test
	public void testIsFalse_10() {
		// initialize input arguments
		int a = 0;
		int b = 2;
		
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(3);
		testSubject.setTrue(0, 2);
		
		// invoke method on class to test
		boolean result = testSubject.isFalse(a, b);
		
		// assert return value
		assertEquals(false, result);
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
	 * with the following input:
	 * <ul>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = 1</li>
	 * </ul>
	 */
	@Test
	public void testLeft_0() {
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(1);
		
		// invoke method on class to test
		int result = testSubject.left();
		
		// assert return value
		assertEquals(1, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * with the following input:
	 * <ul>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = 0</li>
	 * </ul>
	 */
	@Test
	public void testLeft_1() {
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(1);
		testSubject.setTrue(0, 0);
		
		// invoke method on class to test
		int result = testSubject.left();
		
		// assert return value
		assertEquals(0, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * with the following input:
	 * <ul>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = 2</li>
	 * </ul>
	 */
	@Test
	public void testLeft_2() {
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(2);
		
		// invoke method on class to test
		int result = testSubject.left();
		
		// assert return value
		assertEquals(2, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * with the following input:
	 * <ul>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = 1</li>
	 * </ul>
	 */
	@Test
	public void testLeft_3() {
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(2);
		testSubject.setTrue(0, 0);
		
		// invoke method on class to test
		int result = testSubject.left();
		
		// assert return value
		assertEquals(1, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * with the following input:
	 * <ul>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = 1</li>
	 * </ul>
	 */
	@Test
	public void testLeft_4() {
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(2);
		testSubject.setTrue(1, 1);
		
		// invoke method on class to test
		int result = testSubject.left();
		
		// assert return value
		assertEquals(1, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * with the following input:
	 * <ul>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = 0</li>
	 * </ul>
	 */
	@Test
	public void testLeft_5() {
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(2);
		testSubject.setTrue(0, 1);
		
		// invoke method on class to test
		int result = testSubject.left();
		
		// assert return value
		assertEquals(0, result);
	}
	
	/**
	 * Test case for {@link ExtBoolArray#left()}
	 * with the following input:
	 * <ul>
	 * </ul>
	 * and the following expected output:
	 * <ul>
	 * <li>expected = 3</li>
	 * </ul>
	 */
	@Test
	public void testLeft_6() {
		// initialize class to test
		ExtBoolArray testSubject;
		testSubject = new ExtBoolArray(3);
		
		// invoke method on