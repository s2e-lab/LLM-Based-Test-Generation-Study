// MainTest7.java
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
* It contains ten unit test cases for the {@link Main#getStringValue(String)} method.
*/
class MainTest7 {

	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable.
	*/
	@Test
	void testGetStringValue1() {
		String original = "var1";
		String expected = "0";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue2() {
		String original = "var1,5";
		String expected = "05";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue3() {
		String original = "var1,5,var2";
		String expected = "050";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue4() {
		String original = "var1,5,var2,var3";
		String expected = "0500";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue5() {
		String original = "var1,5,var2,var3,var4";
		String expected = "05000";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue6() {
		String original = "var1,5,var2,var3,var4,var5";
		String expected = "050000";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue7() {
		String original = "var1,5,var2,var3,var4,var5,var6";
		String expected = "0500000";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue8() {
		String original = "var1,5,var2,var3,var4,var5,var6,var7";
		String expected = "05000000";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue9() {
		String original = "var1,5,var2,var3,var4,var5,var6,var7,var8";
		String expected = "050000000";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue10() {
		String original = "var1,5,var2,var3,var4,var5,var6,var7,var8,var9";
		String expected = "0500000000";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
}

// MainTest8.java
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License forbids *
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
* It contains ten unit test cases for the {@link Main#getStringValue(String)} method.
*/
class MainTest8 {
		
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable.
	*/
	@Test
	void testGetStringValue1() {
		String original = "var1";
		String expected = "0";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue2() {
		String original = "var1,5";
		String expected = "05";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue3() {
		String original = "var1,5,var2";
		String expected = "050";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue4() {
		String original = "var1,5,var2,var3";
		String expected = "0500";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue5() {
		String original = "var1,5,var2,var3,var4";
		String expected = "05000";
		String actual = Main.getStringValue(original);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests the method with a string containing a variable and a number.
	*/
	@Test
	void testGetStringValue6() {
		String original = "var1,5,var2,var3,var4,var5";
		String expected = "050000";
		String actual = Main.getStringValue