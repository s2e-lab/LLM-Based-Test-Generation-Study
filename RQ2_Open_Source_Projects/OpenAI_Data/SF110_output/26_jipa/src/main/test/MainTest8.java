// MainTest8.java
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License                          *
// *******************************************
package jipa;

/**
 * Class Name: Main
 * Class Use: This class is the core of the interpreter, handling
 *            the processing and interpreting of the code.
 * @author Dominic Charley-Roy
 */
import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#isNumeric(String)} method.
*/
class MainTest8 {

	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns true when the string is a number.
	*/
	@Test
	void testIsNumericTrue() {
		assertTrue(Main.isNumeric("1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse() {
		assertFalse(Main.isNumeric("a"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse2() {
		assertFalse(Main.isNumeric("1a"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse3() {
		assertFalse(Main.isNumeric("a1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse4() {
		assertFalse(Main.isNumeric("1.1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse5() {
		assertFalse(Main.isNumeric("1,1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse6() {
		assertFalse(Main.isNumeric("1.1.1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse7() {
		assertFalse(Main.isNumeric("1,1,1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse8() {
		assertFalse(Main.isNumeric("1.1,1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse9() {
		assertFalse(Main.isNumeric("1,1.1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse10() {
		assertFalse(Main.isNumeric("1.1.1.1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse11() {
		assertFalse(Main.isNumeric("1,1,1,1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse12() {
		assertFalse(Main.isNumeric("1.1,1,1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse13() {
		assertFalse(Main.isNumeric("1,1.1,1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse14() {
		assertFalse(Main.isNumeric("1,1,1.1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse15() {
		assertFalse(Main.isNumeric("1.1.1,1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse16() {
		assertFalse(Main.isNumeric("1.1,1.1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse17() {
		assertFalse(Main.isNumeric("1,1.1.1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse18() {
		assertFalse(Main.isNumeric("1,1,1.1.1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse19() {
		assertFalse(Main.isNumeric("1.1.1.1.1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse20() {
		assertFalse(Main.isNumeric("1,1,1,1,1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse21() {
		assertFalse(Main.isNumeric("1.1.1.1,1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse22() {
		assertFalse(Main.isNumeric("1.1,1.1,1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse23() {
		assertFalse(Main.isNumeric("1,1.1.1.1"));
	}
	
	/**
	* Test case for {@link Main#isNumeric(String)} method.
	* It checks if the method returns false when the string is not a number.
	*/
	@Test
	void testIsNumericFalse24() {
		