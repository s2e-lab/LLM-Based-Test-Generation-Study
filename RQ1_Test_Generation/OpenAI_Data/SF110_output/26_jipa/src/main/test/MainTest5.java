// MainTest5.java
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
* It contains ten unit test cases for the {@link Main#getJumpValue(String)} method.
*/
class MainTest5 {

	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a label.
	*/
	@Test
	void testGetJumpValue1() {
		assertEquals(Main.getJumpValue("label"), Label.findLabel("label") - 1);
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue2() {
		assertEquals(Main.getJumpValue("1"), 0);
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue3() {
		assertEquals(Main.getJumpValue("2"), 1);
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue4() {
		assertEquals(Main.getJumpValue("3"), 2);
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue5() {
		assertEquals(Main.getJumpValue("4"), 3);
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue6() {
		assertEquals(Main.getJumpValue("5"), 4);
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue7() {
		assertEquals(Main.getJumpValue("6"), 5);
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue8() {
		assertEquals(Main.getJumpValue("7"), 6);
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue9() {
		assertEquals(Main.getJumpValue("8"), 7);
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue10() {
		assertEquals(Main.getJumpValue("9"), 8);
	}
}

// MainTest6.java
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
class MainTest6 {
		
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetStringValue1() {
		assertEquals(Main.getStringValue("var1"), "0");
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetStringValue2() {
		assertEquals(Main.getStringValue("var2"), "0");
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetStringValue3() {
		assertEquals(Main.getStringValue("var3"), "0");
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetStringValue4() {
		assertEquals(Main.getStringValue("var4"), "0");
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetStringValue5() {
		assertEquals(Main.getStringValue("var5"), "0");
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetStringValue6() {
		assertEquals(Main.getStringValue("var6"), "0");
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetStringValue7() {
		assertEquals(Main.getStringValue("var7"), "0");
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetStringValue8() {
		assertEquals(Main.getStringValue("var8"), "0");
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetStringValue9() {
		assertEquals(Main.getStringValue("var9"), "0");
	}
	
	/**
	* Test case for {@link Main#getStringValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetStringValue10() {
		assertEquals(Main.getStringValue("var10"), "0");
	}
}

// MainTest7.java
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
* It contains