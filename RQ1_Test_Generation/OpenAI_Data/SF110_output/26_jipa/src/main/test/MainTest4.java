// MainTest4.java
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
* It contains ten unit test cases for the {@link Main#getValue(String)} method.
*/
class MainTest4 {

	/**
	* Test case for {@link Main#getValue(String)} method.
	* It tests if the method returns the correct value when the operand is a variable.
	*/
	@Test
	void testGetValue1() {
		Variable.addVariable("var1");
		Variable.setVariableValue("var1", 5);
		assertEquals(5, Main.getValue("var1"));
	}
	
	/**
	* Test case for {@link Main#getValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetValue2() {
		assertEquals(5, Main.getValue("5"));
	}
	
	/**
	* Test case for {@link Main#getValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetValue3() {
		assertEquals(5, Main.getValue("5"));
	}
	
	/**
	* Test case for {@link Main#getValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetValue4() {
		assertEquals(5, Main.getValue("5"));
	}
	
	/**
	* Test case for {@link Main#getValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetValue5() {
		assertEquals(5, Main.getValue("5"));
	}
	
	/**
	* Test case for {@link Main#getValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetValue6() {
		assertEquals(5, Main.getValue("5"));
	}
	
	/**
	* Test case for {@link Main#getValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetValue7() {
		assertEquals(5, Main.getValue("5"));
	}
	
	/**
	* Test case for {@link Main#getValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetValue8() {
		assertEquals(5, Main.getValue("5"));
	}
	
	/**
	* Test case for {@link Main#getValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetValue9() {
		assertEquals(5, Main.getValue("5"));
	}
	
	/**
	* Test case for {@link Main#getValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetValue10() {
		assertEquals(5, Main.getValue("5"));
	}
}

// MainTest5.java
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
* It contains ten unit test cases for the {@link Main#getJumpValue(String)} method.
*/
class MainTest5 {
		
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue1() {
		assertEquals(5, Main.getJumpValue("5"));
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue2() {
		assertEquals(5, Main.getJumpValue("5"));
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue3() {
		assertEquals(5, Main.getJumpValue("5"));
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue4() {
		assertEquals(5, Main.getJumpValue("5"));
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue5() {
		assertEquals(5, Main.getJumpValue("5"));
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue6() {
		assertEquals(5, Main.getJumpValue("5"));
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue7() {
		assertEquals(5, Main.getJumpValue("5"));
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue8() {
		assertEquals(5, Main.getJumpValue("5"));
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue9() {
		assertEquals(5, Main.getJumpValue("5"));
	}
	
	/**
	* Test case for {@link Main#getJumpValue(String)} method.
	* It tests if the method returns the correct value when the operand is a number.
	*/
	@Test
	void testGetJumpValue10() {
		assertEquals(5, Main.getJumpValue("5"));
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
* It contains ten unit test cases for the {@link Main#get